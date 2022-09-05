/*
 * An XML document type.
 * Localname: VtlMapping
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VtlMapping(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface VtlMappingDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "vtlmappingce5edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType getVtlMapping();

    /**
     * Sets the "VtlMapping" element
     */
    void setVtlMapping(org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType vtlMapping);

    /**
     * Appends and returns a new empty "VtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType addNewVtlMapping();
}
