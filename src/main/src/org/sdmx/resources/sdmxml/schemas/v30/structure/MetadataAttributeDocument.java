/*
 * An XML document type.
 * Localname: MetadataAttribute
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MetadataAttribute(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface MetadataAttributeDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributeb7b9doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType getMetadataAttribute();

    /**
     * Sets the "MetadataAttribute" element
     */
    void setMetadataAttribute(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType metadataAttribute);

    /**
     * Appends and returns a new empty "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType addNewMetadataAttribute();
}
