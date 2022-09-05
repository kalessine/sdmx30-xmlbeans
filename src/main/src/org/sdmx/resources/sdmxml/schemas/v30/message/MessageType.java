/*
 * XML Type:  MessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.MessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface MessageType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.MessageType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "messagetypea3d1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Header" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType getHeader();

    /**
     * Sets the "Header" element
     */
    void setHeader(org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType header);

    /**
     * Appends and returns a new empty "Header" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType addNewHeader();

    /**
     * Gets the "Footer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType getFooter();

    /**
     * True if has "Footer" element
     */
    boolean isSetFooter();

    /**
     * Sets the "Footer" element
     */
    void setFooter(org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType footer);

    /**
     * Appends and returns a new empty "Footer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType addNewFooter();

    /**
     * Unsets the "Footer" element
     */
    void unsetFooter();
}
