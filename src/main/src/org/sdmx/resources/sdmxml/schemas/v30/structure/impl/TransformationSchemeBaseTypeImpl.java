/*
 * XML Type:  TransformationSchemeBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TransformationSchemeBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class TransformationSchemeBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.VtlDefinitionSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeBaseType {
    private static final long serialVersionUID = 1L;

    public TransformationSchemeBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Transformation"),
    };


    /**
     * Gets a List of "Transformation" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType> getTransformationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTransformationArray,
                this::setTransformationArray,
                this::insertNewTransformation,
                this::removeTransformation,
                this::sizeOfTransformationArray
            );
        }
    }

    /**
     * Gets array of all "Transformation" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType[] getTransformationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType[0]);
    }

    /**
     * Gets ith "Transformation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType getTransformationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Transformation" element
     */
    @Override
    public int sizeOfTransformationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Transformation" element
     */
    @Override
    public void setTransformationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType transformation) {
        generatedSetterHelperImpl(transformation, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transformation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType insertNewTransformation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Transformation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType addNewTransformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Transformation" element
     */
    @Override
    public void removeTransformation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
