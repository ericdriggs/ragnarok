package com.ericdriggs.reportcard.scanner;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 *
 * Gets all request variable values listed in ScannerArgs
 * from the following precedence
 * 1. command-line argument
 * 2. environment variable
 * 3. property file
 * @see ScannerArg
 */
@Component
public class ScannerProperties {

    public static ScannerPostRequest getReportPostPayload(ApplicationArguments applicationArguments) {
        final Properties props = getProperties(applicationArguments);

        Map<ScannerArg, String> argMap = new HashMap<>();
        for (ScannerArg scannerArg : ScannerArg.values()) {
            argMap.put(scannerArg, props.getProperty(scannerArg.name()));
        }

        ScannerPostRequest payload = new ScannerPostRequest(argMap);
        payload.prepare();
        return payload;
    }

    public static Properties getProperties(ApplicationArguments applicationArguments) {
        final Properties fileProperties = getFileProperties(null);
        final Properties envProperties = getEnvProperties(fileProperties);
        return getArgProperties(applicationArguments, envProperties);
    }

    public static Properties getArgProperties(ApplicationArguments args, Properties defaultProperties) {
        Properties properties = new Properties(defaultProperties);
        for (ScannerArg argument : ScannerArg.values()) {
            if (args.getOptionNames().contains(argument.name())) {
                String value = getLastValue(args.getOptionValues(argument.name()));
                if (!StringUtils.isEmpty(value) && !StringUtils.isBlank(value)) {
                    properties.put(argument.name(), value);
                }
            }
        }
        return properties;
    }

    public static Properties getEnvProperties(Properties defaultProperties) {
        Properties properties = new Properties(defaultProperties);
        for (ScannerArg argument : ScannerArg.values()) {
            String value = System.getenv(argument.name());
            if (hasValue(value)) {
                properties.put(argument.name(), value);
            }
        }
        return properties;
    }

    public static Properties getFileProperties(Properties defaultProperties) {
        Properties properties = new Properties(defaultProperties);
        File file = new File("reportcard-scanner.properties");

        if (file.exists()) {
            try {
                properties.load(new FileInputStream(file));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return properties;
    }

    public static String getLastValue(List<String> values) {
        String value = null;
        for (String v : values) {
            if (hasValue(v)) {
                value = v.trim();
            }
        }
        return value;
    }

    public static boolean hasValue(String value) {
        return !StringUtils.isEmpty(value) && !StringUtils.isBlank(value);
    }
}