/*
 * XML Type:  HierarchyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HierarchyType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class HierarchyTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.HierarchyBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType {
    private static final long serialVersionUID = 1L;

    public HierarchyTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Level"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "HierarchicalCode"),
        new QName("", "hasFormalLevels"),
    };


    /**
     * Gets the "Level" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType getLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Level" element
     */
    @Override
    public boolean isSetLevel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Level" element
     */
    @Override
    public void setLevel(org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType level) {
        generatedSetterHelperImpl(level, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Level" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType addNewLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "Level" element
     */
    @Override
    public void unsetLevel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
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
     * Gets the "hasFormalLevels" attribute
     */
    @Override
    public boolean getHasFormalLevels() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "hasFormalLevels" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetHasFormalLevels() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "hasFormalLevels" attribute
     */
    @Override
    public void setHasFormalLevels(boolean hasFormalLevels) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(hasFormalLevels);
        }
    }

    /**
     * Sets (as xml) the "hasFormalLevels" attribute
     */
    @Override
    public void xsetHasFormalLevels(org.apache.xmlbeans.XmlBoolean hasFormalLevels) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(hasFormalLevels);
        }
    }
}
