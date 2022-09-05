/*
 * XML Type:  TransformationSchemeBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TransformationSchemeBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TransformationSchemeBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "transformationschemebasetype92e7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Transformation" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType> getTransformationList();

    /**
     * Gets array of all "Transformation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType[] getTransformationArray();

    /**
     * Gets ith "Transformation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType getTransformationArray(int i);

    /**
     * Returns number of "Transformation" element
     */
    int sizeOfTransformationArray();

    /**
     * Sets ith "Transformation" element
     */
    void setTransformationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType transformation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transformation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType insertNewTransformation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Transformation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType addNewTransformation();

    /**
     * Removes the ith "Transformation" element
     */
    void removeTransformation(int i);
}
