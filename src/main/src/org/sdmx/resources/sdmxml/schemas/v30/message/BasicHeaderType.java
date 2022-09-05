/*
 * XML Type:  BasicHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.BasicHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML BasicHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface BasicHeaderType extends org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.BasicHeaderType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "basicheadertypeeda5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Receiver" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.PartyType> getReceiverList();

    /**
     * Gets array of all "Receiver" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType[] getReceiverArray();

    /**
     * Gets ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType getReceiverArray(int i);

    /**
     * Returns number of "Receiver" element
     */
    int sizeOfReceiverArray();

    /**
     * Sets ith "Receiver" element
     */
    void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.PartyType receiver);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType insertNewReceiver(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType addNewReceiver();

    /**
     * Removes the ith "Receiver" element
     */
    void removeReceiver(int i);
}
