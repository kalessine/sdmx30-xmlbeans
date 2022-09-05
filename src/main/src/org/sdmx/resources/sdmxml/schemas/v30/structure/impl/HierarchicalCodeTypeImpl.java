/*
 * XML Type:  HierarchicalCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HierarchicalCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class HierarchicalCodeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.HierarchicalCodeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType {
    private static final long serialVersionUID = 1L;

    public HierarchicalCodeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Code"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "HierarchicalCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Level"),
        new QName("", "validFrom"),
        new QName("", "validTo"),
    };


    /**
     * Gets the "Code" element
     */
    @Override
    public java.lang.String getCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Code" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType xgetCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "Code" element
     */
    @Override
    public void setCode(java.lang.String code) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(code);
        }
    }

    /**
     * Sets (as xml) the "Code" element
     */
    @Override
    public void xsetCode(org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType code) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(code);
        }
    }

    /**
     * Gets a List of "HierarchicalCode" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType> getHierarchicalCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHierarchicalCodeArray,
                this::setHierarchicalCodeArray,
                this::insertNewHierarchicalCode,
                this::removeHierarchicalCode,
                this::sizeOfHierarchicalCodeArray
            );
        }
    }

    /**
     * Gets array of all "HierarchicalCode" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType[] getHierarchicalCodeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType[0]);
    }

    /**
     * Gets ith "HierarchicalCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType getHierarchicalCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "HierarchicalCode" element
     */
    @Override
    public int sizeOfHierarchicalCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "HierarchicalCode" element
     */
    @Override
    public void setHierarchicalCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType hierarchicalCode) {
        generatedSetterHelperImpl(hierarchicalCode, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType insertNewHierarchicalCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType addNewHierarchicalCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "HierarchicalCode" element
     */
    @Override
    public void removeHierarchicalCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "Level" element
     */
    @Override
    public java.lang.String getLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Level" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "Level" element
     */
    @Override
    public boolean isSetLevel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "Level" element
     */
    @Override
    public void setLevel(java.lang.String level) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(level);
        }
    }

    /**
     * Sets (as xml) the "Level" element
     */
    @Override
    public void xsetLevel(org.sdmx.resources.sdmxml.schemas.v30.common.IDType level) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(level);
        }
    }

    /**
     * Unsets the "Level" element
     */
    @Override
    public void unsetLevel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "validFrom" attribute
     */
    @Override
    public java.util.Calendar getValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[3]);
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
    public void setValidFrom(java.util.Calendar validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setCalendarValue(validFrom);
        }
    }

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    @Override
    public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[3]);
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
    public java.util.Calendar getValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validTo" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[4]);
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
    public void setValidTo(java.util.Calendar validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setCalendarValue(validTo);
        }
    }

    /**
     * Sets (as xml) the "validTo" attribute
     */
    @Override
    public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[4]);
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
