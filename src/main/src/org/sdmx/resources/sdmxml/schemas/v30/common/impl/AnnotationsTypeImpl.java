/*
 * XML Type:  AnnotationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AnnotationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public class AnnotationsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationsType {
    private static final long serialVersionUID = 1L;

    public AnnotationsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Annotation"),
    };


    /**
     * Gets a List of "Annotation" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType> getAnnotationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAnnotationArray,
                this::setAnnotationArray,
                this::insertNewAnnotation,
                this::removeAnnotation,
                this::sizeOfAnnotationArray
            );
        }
    }

    /**
     * Gets array of all "Annotation" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType[] getAnnotationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType[0]);
    }

    /**
     * Gets ith "Annotation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType getAnnotationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Annotation" element
     */
    @Override
    public int sizeOfAnnotationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Annotation" element
     */
    @Override
    public void setAnnotationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType annotation) {
        generatedSetterHelperImpl(annotation, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Annotation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType insertNewAnnotation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Annotation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType addNewAnnotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Annotation" element
     */
    @Override
    public void removeAnnotation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
