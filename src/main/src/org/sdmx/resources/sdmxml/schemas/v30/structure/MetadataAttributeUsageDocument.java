/*
 * An XML document type.
 * Localname: MetadataAttributeUsage
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MetadataAttributeUsage(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface MetadataAttributeUsageDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributeusagee8d2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataAttributeUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType getMetadataAttributeUsage();

    /**
     * Sets the "MetadataAttributeUsage" element
     */
    void setMetadataAttributeUsage(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType metadataAttributeUsage);

    /**
     * Appends and returns a new empty "MetadataAttributeUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType addNewMetadataAttributeUsage();
}
