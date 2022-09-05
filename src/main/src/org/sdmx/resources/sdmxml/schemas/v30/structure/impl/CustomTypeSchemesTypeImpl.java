/*
 * XML Type:  CustomTypeSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CustomTypeSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CustomTypeSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType {
    private static final long serialVersionUID = 1L;

    public CustomTypeSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CustomTypeScheme"),
    };


    /**
     * Gets a List of "CustomTypeScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType> getCustomTypeSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCustomTypeSchemeArray,
                this::setCustomTypeSchemeArray,
                this::insertNewCustomTypeScheme,
                this::removeCustomTypeScheme,
                this::sizeOfCustomTypeSchemeArray
            );
        }
    }

    /**
     * Gets array of all "CustomTypeScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType[] getCustomTypeSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType[0]);
    }

    /**
     * Gets ith "CustomTypeScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType getCustomTypeSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CustomTypeScheme" element
     */
    @Override
    public int sizeOfCustomTypeSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "CustomTypeScheme" element
     */
    @Override
    public void setCustomTypeSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType customTypeScheme) {
        generatedSetterHelperImpl(customTypeScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CustomTypeScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType insertNewCustomTypeScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CustomTypeScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType addNewCustomTypeScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "CustomTypeScheme" element
     */
    @Override
    public void removeCustomTypeScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
