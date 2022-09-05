/*
 * XML Type:  AnnotationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AnnotationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface AnnotationType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "annotationtype6e07type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AnnotationTitle" element
     */
    java.lang.String getAnnotationTitle();

    /**
     * Gets (as xml) the "AnnotationTitle" element
     */
    org.apache.xmlbeans.XmlString xgetAnnotationTitle();

    /**
     * True if has "AnnotationTitle" element
     */
    boolean isSetAnnotationTitle();

    /**
     * Sets the "AnnotationTitle" element
     */
    void setAnnotationTitle(java.lang.String annotationTitle);

    /**
     * Sets (as xml) the "AnnotationTitle" element
     */
    void xsetAnnotationTitle(org.apache.xmlbeans.XmlString annotationTitle);

    /**
     * Unsets the "AnnotationTitle" element
     */
    void unsetAnnotationTitle();

    /**
     * Gets the "AnnotationType" element
     */
    java.lang.String getAnnotationType();

    /**
     * Gets (as xml) the "AnnotationType" element
     */
    org.apache.xmlbeans.XmlString xgetAnnotationType();

    /**
     * True if has "AnnotationType" element
     */
    boolean isSetAnnotationType();

    /**
     * Sets the "AnnotationType" element
     */
    void setAnnotationType(java.lang.String annotationType);

    /**
     * Sets (as xml) the "AnnotationType" element
     */
    void xsetAnnotationType(org.apache.xmlbeans.XmlString annotationType);

    /**
     * Unsets the "AnnotationType" element
     */
    void unsetAnnotationType();

    /**
     * Gets a List of "AnnotationURL" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType> getAnnotationURLList();

    /**
     * Gets array of all "AnnotationURL" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType[] getAnnotationURLArray();

    /**
     * Gets ith "AnnotationURL" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType getAnnotationURLArray(int i);

    /**
     * Returns number of "AnnotationURL" element
     */
    int sizeOfAnnotationURLArray();

    /**
     * Sets ith "AnnotationURL" element
     */
    void setAnnotationURLArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType annotationURL);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AnnotationURL" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType insertNewAnnotationURL(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AnnotationURL" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType addNewAnnotationURL();

    /**
     * Removes the ith "AnnotationURL" element
     */
    void removeAnnotationURL(int i);

    /**
     * Gets a List of "AnnotationText" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getAnnotationTextList();

    /**
     * Gets array of all "AnnotationText" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getAnnotationTextArray();

    /**
     * Gets ith "AnnotationText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getAnnotationTextArray(int i);

    /**
     * Returns number of "AnnotationText" element
     */
    int sizeOfAnnotationTextArray();

    /**
     * Sets ith "AnnotationText" element
     */
    void setAnnotationTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType annotationText);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AnnotationText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewAnnotationText(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AnnotationText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewAnnotationText();

    /**
     * Removes the ith "AnnotationText" element
     */
    void removeAnnotationText(int i);

    /**
     * Gets the "AnnotationValue" element
     */
    java.lang.String getAnnotationValue();

    /**
     * Gets (as xml) the "AnnotationValue" element
     */
    org.apache.xmlbeans.XmlString xgetAnnotationValue();

    /**
     * True if has "AnnotationValue" element
     */
    boolean isSetAnnotationValue();

    /**
     * Sets the "AnnotationValue" element
     */
    void setAnnotationValue(java.lang.String annotationValue);

    /**
     * Sets (as xml) the "AnnotationValue" element
     */
    void xsetAnnotationValue(org.apache.xmlbeans.XmlString annotationValue);

    /**
     * Unsets the "AnnotationValue" element
     */
    void unsetAnnotationValue();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();
}
