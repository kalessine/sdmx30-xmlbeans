/*
 * XML Type:  CodedStatusMessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodedStatusMessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface CodedStatusMessageType extends org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "codedstatusmessagetypeefb8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "code" attribute
     */
    java.lang.String getCode();

    /**
     * Gets (as xml) the "code" attribute
     */
    org.apache.xmlbeans.XmlString xgetCode();

    /**
     * True if has "code" attribute
     */
    boolean isSetCode();

    /**
     * Sets the "code" attribute
     */
    void setCode(java.lang.String code);

    /**
     * Sets (as xml) the "code" attribute
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);

    /**
     * Unsets the "code" attribute
     */
    void unsetCode();
}
