/*
 * XML Type:  DataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataStructureComponentsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.DataStructureComponentsBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType {
    private static final long serialVersionUID = 1L;

    public DataStructureComponentsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DimensionList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Group"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AttributeList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MeasureList"),
    };


    /**
     * Gets the "DimensionList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType getDimensionList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DimensionList" element
     */
    @Override
    public void setDimensionList(org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType dimensionList) {
        generatedSetterHelperImpl(dimensionList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DimensionList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType addNewDimensionList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets a List of "Group" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType> getGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGroupArray,
                this::setGroupArray,
                this::insertNewGroup,
                this::removeGroup,
                this::sizeOfGroupArray
            );
        }
    }

    /**
     * Gets array of all "Group" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType[] getGroupArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType[0]);
    }

    /**
     * Gets ith "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType getGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Group" element
     */
    @Override
    public int sizeOfGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Group" element
     */
    @Override
    public void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType insertNewGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Group" element
     */
    @Override
    public void removeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "AttributeList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType getAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "AttributeList" element
     */
    @Override
    public boolean isSetAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "AttributeList" element
     */
    @Override
    public void setAttributeList(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType attributeList) {
        generatedSetterHelperImpl(attributeList, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AttributeList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType addNewAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "AttributeList" element
     */
    @Override
    public void unsetAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "MeasureList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType getMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MeasureList" element
     */
    @Override
    public boolean isSetMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "MeasureList" element
     */
    @Override
    public void setMeasureList(org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType measureList) {
        generatedSetterHelperImpl(measureList, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MeasureList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType addNewMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "MeasureList" element
     */
    @Override
    public void unsetMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}
