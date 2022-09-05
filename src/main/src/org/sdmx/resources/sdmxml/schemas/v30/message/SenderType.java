/*
 * XML Type:  SenderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SenderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SenderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface SenderType extends org.sdmx.resources.sdmxml.schemas.v30.message.PartyType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.SenderType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "sendertype7471type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Timezone" element
     */
    java.lang.String getTimezone();

    /**
     * Gets (as xml) the "Timezone" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType xgetTimezone();

    /**
     * True if has "Timezone" element
     */
    boolean isSetTimezone();

    /**
     * Sets the "Timezone" element
     */
    void setTimezone(java.lang.String timezone);

    /**
     * Sets (as xml) the "Timezone" element
     */
    void xsetTimezone(org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType timezone);

    /**
     * Unsets the "Timezone" element
     */
    void unsetTimezone();
}
