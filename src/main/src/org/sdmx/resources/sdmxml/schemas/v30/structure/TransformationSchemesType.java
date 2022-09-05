/*
 * XML Type:  TransformationSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TransformationSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TransformationSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "transformationschemestypeaa9btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "TransformationScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType> getTransformationSchemeList();

    /**
     * Gets array of all "TransformationScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType[] getTransformationSchemeArray();

    /**
     * Gets ith "TransformationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType getTransformationSchemeArray(int i);

    /**
     * Returns number of "TransformationScheme" element
     */
    int sizeOfTransformationSchemeArray();

    /**
     * Sets ith "TransformationScheme" element
     */
    void setTransformationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType transformationScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TransformationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType insertNewTransformationScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "TransformationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType addNewTransformationScheme();

    /**
     * Removes the ith "TransformationScheme" element
     */
    void removeTransformationScheme(int i);
}
