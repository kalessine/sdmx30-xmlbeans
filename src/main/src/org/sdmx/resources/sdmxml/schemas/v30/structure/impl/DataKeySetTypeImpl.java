/*
 * XML Type:  DataKeySetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataKeySetType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataKeySetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType {
    private static final long serialVersionUID = 1L;

    public DataKeySetTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Key"),
        new QName("", "isIncluded"),
    };


    /**
     * Gets a List of "Key" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType> getKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyArray,
                this::setKeyArray,
                this::insertNewKey,
                this::removeKey,
                this::sizeOfKeyArray
            );
        }
    }

    /**
     * Gets array of all "Key" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType[] getKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType[0]);
    }

    /**
     * Gets ith "Key" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType getKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
    public void setKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType key) {
        generatedSetterHelperImpl(key, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType insertNewKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType addNewKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType)get_store().add_element_user(PROPERTY_QNAME[0]);
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

    /**
     * Gets the "isIncluded" attribute
     */
    @Override
    public boolean getIsIncluded() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isIncluded" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsIncluded() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "isIncluded" attribute
     */
    @Override
    public void setIsIncluded(boolean isIncluded) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(isIncluded);
        }
    }

    /**
     * Sets (as xml) the "isIncluded" attribute
     */
    @Override
    public void xsetIsIncluded(org.apache.xmlbeans.XmlBoolean isIncluded) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(isIncluded);
        }
    }
}
