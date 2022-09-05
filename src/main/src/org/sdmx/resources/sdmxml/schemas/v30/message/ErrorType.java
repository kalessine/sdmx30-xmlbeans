/*
 * XML Type:  ErrorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ErrorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface ErrorType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "errortype53d2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ErrorMessage" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType> getErrorMessageList();

    /**
     * Gets array of all "ErrorMessage" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType[] getErrorMessageArray();

    /**
     * Gets ith "ErrorMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType getErrorMessageArray(int i);

    /**
     * Returns number of "ErrorMessage" element
     */
    int sizeOfErrorMessageArray();

    /**
     * Sets ith "ErrorMessage" element
     */
    void setErrorMessageArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType errorMessage);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ErrorMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType insertNewErrorMessage(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ErrorMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType addNewErrorMessage();

    /**
     * Removes the ith "ErrorMessage" element
     */
    void removeErrorMessage(int i);
}
