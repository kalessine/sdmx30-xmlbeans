/*
 * XML Type:  DataKeyValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataKeyValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataKeyValueTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.MemberSelectionTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyValueType {
    private static final long serialVersionUID = 1L;

    public DataKeyValueTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Value"),
    };


    /**
     * Gets a List of "Value" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType> getValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueArray,
                this::setValueArray,
                this::insertNewValue,
                this::removeValue,
                this::sizeOfValueArray
            );
        }
    }

    /**
     * Gets array of all "Value" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType[] getValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType[0]);
    }

    /**
     * Gets ith "Value" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType getValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Value" element
     */
    @Override
    public int sizeOfValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Value" element
     */
    @Override
    public void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType value) {
        generatedSetterHelperImpl(value, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType insertNewValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType addNewValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Value" element
     */
    @Override
    public void removeValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
