/*
 * An XML document type.
 * Localname: Transformation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Transformation(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface TransformationDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "transformationa1e7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Transformation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType getTransformation();

    /**
     * Sets the "Transformation" element
     */
    void setTransformation(org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType transformation);

    /**
     * Appends and returns a new empty "Transformation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType addNewTransformation();
}
