/*
 * XML Type:  CustomTypeSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CustomTypeSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CustomTypeSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.VtlDefinitionSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType {
    private static final long serialVersionUID = 1L;

    public CustomTypeSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CustomType"),
    };


    /**
     * Gets a List of "CustomType" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType> getCustomTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCustomTypeArray,
                this::setCustomTypeArray,
                this::insertNewCustomType,
                this::removeCustomType,
                this::sizeOfCustomTypeArray
            );
        }
    }

    /**
     * Gets array of all "CustomType" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType[] getCustomTypeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType[0]);
    }

    /**
     * Gets ith "CustomType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType getCustomTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CustomType" element
     */
    @Override
    public int sizeOfCustomTypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "CustomType" element
     */
    @Override
    public void setCustomTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType customType) {
        generatedSetterHelperImpl(customType, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CustomType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType insertNewCustomType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CustomType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType addNewCustomType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "CustomType" element
     */
    @Override
    public void removeCustomType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
