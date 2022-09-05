/*
 * XML Type:  RegionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RegionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RegionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class RegionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RegionType {
    private static final long serialVersionUID = 1L;

    public RegionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "KeyValue"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Component"),
        new QName("", "include"),
        new QName("", "validFrom"),
        new QName("", "validTo"),
    };


    /**
     * Gets a List of "KeyValue" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType> getKeyValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyValueArray,
                this::setKeyValueArray,
                this::insertNewKeyValue,
                this::removeKeyValue,
                this::sizeOfKeyValueArray
            );
        }
    }

    /**
     * Gets array of all "KeyValue" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType[] getKeyValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType[0]);
    }

    /**
     * Gets ith "KeyValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType getKeyValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyValue" element
     */
    @Override
    public int sizeOfKeyValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "KeyValue" element
     */
    @Override
    public void setKeyValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType keyValue) {
        generatedSetterHelperImpl(keyValue, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType insertNewKeyValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType addNewKeyValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyValue" element
     */
    @Override
    public void removeKeyValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Component" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType> getComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getComponentArray,
                this::setComponentArray,
                this::insertNewComponent,
                this::removeComponent,
                this::sizeOfComponentArray
            );
        }
    }

    /**
     * Gets array of all "Component" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType[] getComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType[0]);
    }

    /**
     * Gets ith "Component" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType getComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Component" element
     */
    @Override
    public int sizeOfComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Component" element
     */
    @Override
    public void setComponentArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType component) {
        generatedSetterHelperImpl(component, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType insertNewComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType addNewComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Component" element
     */
    @Override
    public void removeComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "include" attribute
     */
    @Override
    public boolean getInclude() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "include" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetInclude() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return target;
        }
    }

    /**
     * True if has "include" attribute
     */
    @Override
    public boolean isSetInclude() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "include" attribute
     */
    @Override
    public void setInclude(boolean include) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(include);
        }
    }

    /**
     * Sets (as xml) the "include" attribute
     */
    @Override
    public void xsetInclude(org.apache.xmlbeans.XmlBoolean include) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(include);
        }
    }

    /**
     * Unsets the "include" attribute
     */
    @Override
    public void unsetInclude() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "validFrom" attribute
     */
    @Override
    public java.lang.Object getValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "validFrom" attribute
     */
    @Override
    public boolean isSetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "validFrom" attribute
     */
    @Override
    public void setValidFrom(java.lang.Object validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setObjectValue(validFrom);
        }
    }

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    @Override
    public void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(validFrom);
        }
    }

    /**
     * Unsets the "validFrom" attribute
     */
    @Override
    public void unsetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "validTo" attribute
     */
    @Override
    public java.lang.Object getValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "validTo" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "validTo" attribute
     */
    @Override
    public boolean isSetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "validTo" attribute
     */
    @Override
    public void setValidTo(java.lang.Object validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setObjectValue(validTo);
        }
    }

    /**
     * Sets (as xml) the "validTo" attribute
     */
    @Override
    public void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(validTo);
        }
    }

    /**
     * Unsets the "validTo" attribute
     */
    @Override
    public void unsetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}
