/*
 * An XML document type.
 * Localname: Dimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Dimension(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface DimensionDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dimensione472doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType getDimension();

    /**
     * Sets the "Dimension" element
     */
    void setDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType dimension);

    /**
     * Appends and returns a new empty "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType addNewDimension();
}
