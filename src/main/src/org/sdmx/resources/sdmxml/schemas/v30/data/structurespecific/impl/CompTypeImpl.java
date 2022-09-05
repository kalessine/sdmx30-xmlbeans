/*
 * XML Type:  CompType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CompType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific).
 *
 * This is a complex type.
 */
public class CompTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType {
    private static final long serialVersionUID = 1L;

    public CompTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "Value"),
        new QName("", "id"),
    };


    /**
     * Gets a List of "Value" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ValueType> getValueList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.common.ValueType[] getValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.ValueType[0]);
    }

    /**
     * Gets ith "Value" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ValueType getValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ValueType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
    public void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ValueType value) {
        generatedSetterHelperImpl(value, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ValueType insertNewValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ValueType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ValueType addNewValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ValueType)get_store().add_element_user(PROPERTY_QNAME[0]);
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

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(id);
        }
    }
}
