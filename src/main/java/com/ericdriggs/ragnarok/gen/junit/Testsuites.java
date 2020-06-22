//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.21 at 11:18:04 PM PDT 
//


package com.ericdriggs.ragnarok.gen.junit;

import lombok.*;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testsuite"
})
@XmlRootElement(name = "testsuites")
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderMethodName = "builderForTestsuites")
@Data
public class Testsuites {

    protected List<Testsuite> testsuite;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @NoArgsConstructor
    @AllArgsConstructor
//    @Builder(builderMethodName = "builderForTestsuite")
    @Data
    //TODO: don't extend just combine versions so no static class
    public static class Testsuite
        extends com.ericdriggs.ragnarok.gen.junit.Testsuite
    {

        @XmlAttribute(name = "package", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String _package;
        @XmlAttribute(name = "id", required = true)
        protected int id;
    }
}
