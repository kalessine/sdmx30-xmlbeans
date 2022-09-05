/*
 * An XML document type.
 * Localname: GenericMetadata
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one GenericMetadata(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public interface GenericMetadataDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "genericmetadatabe46doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GenericMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType getGenericMetadata();

    /**
     * Sets the "GenericMetadata" element
     */
    void setGenericMetadata(org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType genericMetadata);

    /**
     * Appends and returns a new empty "GenericMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType addNewGenericMetadata();
}
