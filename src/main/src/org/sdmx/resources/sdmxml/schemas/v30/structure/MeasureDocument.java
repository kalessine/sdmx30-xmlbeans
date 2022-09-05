/*
 * An XML document type.
 * Localname: Measure
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Measure(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface MeasureDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "measure2e2adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType getMeasure();

    /**
     * Sets the "Measure" element
     */
    void setMeasure(org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType measure);

    /**
     * Appends and returns a new empty "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType addNewMeasure();
}
