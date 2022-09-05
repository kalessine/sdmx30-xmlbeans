/*
 * XML Type:  SpaceKeyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SpaceKeyType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class SpaceKeyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType {
    private static final long serialVersionUID = 1L;

    public SpaceKeyTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Key"),
    };


    /**
     * Gets a List of "Key" elements
     */
    @Override
    public java.util.List<java.lang.String> getKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getKeyArray,
                this::setKeyArray,
                this::insertKey,
                this::removeKey,
                this::sizeOfKeyArray
            );
        }
    }

    /**
     * Gets array of all "Key" elements
     */
    @Override
    public java.lang.String[] getKeyArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Key" element
     */
    @Override
    public java.lang.String getKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Key" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType> xgetKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetKeyArray,
                this::xsetKeyArray,
                this::insertNewKey,
                this::removeKey,
                this::sizeOfKeyArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Key" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType[] xgetKeyArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType[]::new);
    }

    /**
     * Gets (as xml) ith "Key" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType xgetKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Key" element
     */
    @Override
    public int sizeOfKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Key" element
     */
    @Override
    public void setKeyArray(int i, java.lang.String key) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(key);
        }
    }

    /**
     * Sets (as xml) array of all "Key" element
     */
    @Override
    public void xsetKeyArray(org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType[]keyArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(keyArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "Key" element
     */
    @Override
    public void xsetKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType key) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(key);
        }
    }

    /**
     * Inserts the value as the ith "Key" element
     */
    @Override
    public void insertKey(int i, java.lang.String key) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(key);
        }
    }

    /**
     * Appends the value as the last "Key" element
     */
    @Override
    public void addKey(java.lang.String key) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(key);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType insertNewKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType addNewKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Key" element
     */
    @Override
    public void removeKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
