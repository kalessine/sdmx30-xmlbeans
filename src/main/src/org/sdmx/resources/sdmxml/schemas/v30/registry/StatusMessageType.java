/*
 * XML Type:  StatusMessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StatusMessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface StatusMessageType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "statusmessagetype3985type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MessageText" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType> getMessageTextList();

    /**
     * Gets array of all "MessageText" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType[] getMessageTextArray();

    /**
     * Gets ith "MessageText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType getMessageTextArray(int i);

    /**
     * Returns number of "MessageText" element
     */
    int sizeOfMessageTextArray();

    /**
     * Sets ith "MessageText" element
     */
    void setMessageTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType messageText);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MessageText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType insertNewMessageText(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MessageText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType addNewMessageText();

    /**
     * Removes the ith "MessageText" element
     */
    void removeMessageText(int i);

    /**
     * Gets the "status" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType.Enum getStatus();

    /**
     * Gets (as xml) the "status" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType xgetStatus();

    /**
     * Sets the "status" attribute
     */
    void setStatus(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType.Enum status);

    /**
     * Sets (as xml) the "status" attribute
     */
    void xsetStatus(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType status);
}
