/*
 * An XML document type.
 * Localname: DimensionList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface DimensionListDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dimensionlista9b0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType getDimensionList();

    /**
     * Sets the "DimensionList" element
     */
    void setDimensionList(org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType dimensionList);

    /**
     * Appends and returns a new empty "DimensionList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType addNewDimensionList();
}
