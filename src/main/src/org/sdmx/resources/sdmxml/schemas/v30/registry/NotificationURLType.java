/*
 * XML Type:  NotificationURLType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML NotificationURLType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType.
 */
public interface NotificationURLType extends org.apache.xmlbeans.XmlAnyURI {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "notificationurltypefc96type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "isSOAP" attribute
     */
    boolean getIsSOAP();

    /**
     * Gets (as xml) the "isSOAP" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSOAP();

    /**
     * True if has "isSOAP" attribute
     */
    boolean isSetIsSOAP();

    /**
     * Sets the "isSOAP" attribute
     */
    void setIsSOAP(boolean isSOAP);

    /**
     * Sets (as xml) the "isSOAP" attribute
     */
    void xsetIsSOAP(org.apache.xmlbeans.XmlBoolean isSOAP);

    /**
     * Unsets the "isSOAP" attribute
     */
    void unsetIsSOAP();
}
