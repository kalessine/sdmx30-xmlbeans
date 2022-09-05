/*
 * An XML document type.
 * Localname: MeasureList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MeasureList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface MeasureListDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "measurelist5768doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MeasureList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType getMeasureList();

    /**
     * Sets the "MeasureList" element
     */
    void setMeasureList(org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType measureList);

    /**
     * Appends and returns a new empty "MeasureList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType addNewMeasureList();
}
