/*
 * XML Type:  TransformationSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TransformationSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class TransformationSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType {
    private static final long serialVersionUID = 1L;

    public TransformationSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TransformationScheme"),
    };


    /**
     * Gets a List of "TransformationScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType> getTransformationSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTransformationSchemeArray,
                this::setTransformationSchemeArray,
                this::insertNewTransformationScheme,
                this::removeTransformationScheme,
                this::sizeOfTransformationSchemeArray
            );
        }
    }

    /**
     * Gets array of all "TransformationScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType[] getTransformationSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType[0]);
    }

    /**
     * Gets ith "TransformationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType getTransformationSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TransformationScheme" element
     */
    @Override
    public int sizeOfTransformationSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "TransformationScheme" element
     */
    @Override
    public void setTransformationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType transformationScheme) {
        generatedSetterHelperImpl(transformationScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TransformationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType insertNewTransformationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TransformationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType addNewTransformationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "TransformationScheme" element
     */
    @Override
    public void removeTransformationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
