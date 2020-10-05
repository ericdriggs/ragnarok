package com.ericdriggs.reportcard.scanner;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ReportCardPostClient {

    public static final ReportCardPostClient INSTANCE = new ReportCardPostClient();

    protected static final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    static {
        interceptor.redactHeader("Authorization");
        interceptor.redactHeader("Proxy-Authorization");
    }

    protected static final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(interceptor)

            .build();

    protected final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    protected Response postTestReport(ScannerPostRequest scannerPostRequest) {

        try {
            //TOMAYBE: filter out fields not used by endpoint


            Request request;
            {
                RequestBody body;
                {
                    String bodyString = objectMapper.writeValueAsString(scannerPostRequest);
                    body = RequestBody.create(bodyString, MediaType.parse("application/json; charset=utf-8"));
                }
                MultipartBody.Builder requestBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM)
                        .addPart(body);

                File[] files;
                {
                    File dir = new File(scannerPostRequest.getTestReportPath());
                    FileFilter fileFilter = new RegexFileFilter(scannerPostRequest.getTestReportRegex());
                    files = dir.listFiles(fileFilter);
                    if (files.length == 0) {
                        Map<String, String> validationErrors = new HashMap<>();
                        validationErrors.put(ScannerArg.TEST_REPORT_PATH.name(), "no files found");
                        validationErrors.put(ScannerArg.TEST_REPORT_REGEX.name(), "no files found");
                        throw new BadRequestException(validationErrors);
                    }
                }

                for (File file : files) {
                    requestBuilder.addFormDataPart("file", file.getName(), RequestBody.create(
                            file, MediaType.parse("text/xml")));
                }
                request = new Request.Builder().url(scannerPostRequest.getHost())
                        .post(requestBuilder.build()).build();
            }

            Response response = client.newCall(request).execute();
            //TOMAYBE: return instead of throw
            if (!response.isSuccessful()) {
                throw new ResponseStatusException(HttpStatus.valueOf(response.code()), response.body().string());
            }
            return response;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
