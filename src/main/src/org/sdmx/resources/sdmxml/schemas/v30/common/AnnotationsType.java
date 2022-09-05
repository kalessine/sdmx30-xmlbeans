/*
 * XML Type:  AnnotationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AnnotationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface AnnotationsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "annotationstypec264type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Annotation" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType> getAnnotationList();

    /**
     * Gets array of all "Annotation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType[] getAnnotationArray();

    /**
     * Gets ith "Annotation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType getAnnotationArray(int i);

    /**
     * Returns number of "Annotation" element
     */
    int sizeOfAnnotationArray();

    /**
     * Sets ith "Annotation" element
     */
    void setAnnotationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType annotation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Annotation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType insertNewAnnotation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Annotation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType addNewAnnotation();

    /**
     * Removes the ith "Annotation" element
     */
    void removeAnnotation(int i);
}
