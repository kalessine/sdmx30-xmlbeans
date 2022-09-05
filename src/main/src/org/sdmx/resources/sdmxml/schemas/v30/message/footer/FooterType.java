/*
 * XML Type:  FooterType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.footer;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FooterType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer).
 *
 * This is a complex type.
 */
public interface FooterType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "footertype3553type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Message" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType> getMessageList();

    /**
     * Gets array of all "Message" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType[] getMessageArray();

    /**
     * Gets ith "Message" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType getMessageArray(int i);

    /**
     * Returns number of "Message" element
     */
    int sizeOfMessageArray();

    /**
     * Sets ith "Message" element
     */
    void setMessageArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType message);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Message" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType insertNewMessage(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Message" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType addNewMessage();

    /**
     * Removes the ith "Message" element
     */
    void removeMessage(int i);
}
