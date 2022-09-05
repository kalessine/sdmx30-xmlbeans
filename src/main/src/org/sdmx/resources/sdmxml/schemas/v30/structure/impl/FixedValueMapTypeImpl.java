/*
 * XML Type:  FixedValueMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML FixedValueMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class FixedValueMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType {
    private static final long serialVersionUID = 1L;

    public FixedValueMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Source"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Target"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Value"),
    };


    /**
     * Gets the "Source" element
     */
    @Override
    public java.lang.String getSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Source" element
     */
    @Override
    public boolean isSetSource() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Source" element
     */
    @Override
    public void setSource(java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(source);
        }
    }

    /**
     * Sets (as xml) the "Source" element
     */
    @Override
    public void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.IDType source) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(source);
        }
    }

    /**
     * Unsets the "Source" element
     */
    @Override
    public void unsetSource() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Target" element
     */
    @Override
    public java.lang.String getTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "Target" element
     */
    @Override
    public boolean isSetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Target" element
     */
    @Override
    public void setTarget(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) the "Target" element
     */
    @Override
    public void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.IDType targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(targetValue);
        }
    }

    /**
     * Unsets the "Target" element
     */
    @Override
    public void unsetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "Value" elements
     */
    @Override
    public java.util.List<java.lang.String> getValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getValueArray,
                this::setValueArray,
                this::insertValue,
                this::removeValue,
                this::sizeOfValueArray
            );
        }
    }

    /**
     * Gets array of all "Value" elements
     */
    @Override
    public java.lang.String[] getValueArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Value" element
     */
    @Override
    public java.lang.String getValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Value" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetValueArray,
                this::xsetValueArray,
                this::insertNewValue,
                this::removeValue,
                this::sizeOfValueArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Value" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetValueArray() {
        return xgetArray(PROPERTY_QNAME[2], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "Value" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], i);
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
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "Value" element
     */
    @Override
    public void setValueArray(int i, java.lang.String value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(value);
        }
    }

    /**
     * Sets (as xml) array of all "Value" element
     */
    @Override
    public void xsetValueArray(org.apache.xmlbeans.XmlString[]valueArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(valueArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "Value" element
     */
    @Override
    public void xsetValueArray(int i, org.apache.xmlbeans.XmlString value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }

    /**
     * Inserts the value as the ith "Value" element
     */
    @Override
    public void insertValue(int i, java.lang.String value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(value);
        }
    }

    /**
     * Appends the value as the last "Value" element
     */
    @Override
    public void addValue(java.lang.String value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(value);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }
}
