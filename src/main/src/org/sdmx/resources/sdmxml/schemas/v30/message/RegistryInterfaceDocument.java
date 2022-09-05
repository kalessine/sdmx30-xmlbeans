/*
 * An XML document type.
 * Localname: RegistryInterface
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one RegistryInterface(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public interface RegistryInterfaceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "registryinterface305cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RegistryInterface" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType getRegistryInterface();

    /**
     * Sets the "RegistryInterface" element
     */
    void setRegistryInterface(org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType registryInterface);

    /**
     * Appends and returns a new empty "RegistryInterface" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType addNewRegistryInterface();
}
