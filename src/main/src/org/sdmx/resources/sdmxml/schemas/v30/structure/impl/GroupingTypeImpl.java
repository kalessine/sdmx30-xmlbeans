/*
 * XML Type:  GroupingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GroupingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GroupingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType {
    private static final long serialVersionUID = 1L;

    public GroupingTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ComponentList"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ComponentList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DimensionList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AttributeList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttributeList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Group"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MeasureList"),
    }),
    };

    /**
     * Gets a List of "ComponentList" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType> getComponentListList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getComponentListArray,
                this::setComponentListArray,
                this::insertNewComponentList,
                this::removeComponentList,
                this::sizeOfComponentListArray
            );
        }
    }

    /**
     * Gets array of all "ComponentList" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType[] getComponentListArray() {
        return getXmlObjectArray(PROPERTY_QSET[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType[0]);
    }

    /**
     * Gets ith "ComponentList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType getComponentListArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ComponentList" element
     */
    @Override
    public int sizeOfComponentListArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QSET[0]);
        }
    }

    /**
     * Sets ith "ComponentList" element
     */
    @Override
    public void setComponentListArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType componentList) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentList);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType insertNewComponentList(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().insert_element_user(PROPERTY_QSET[0], PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType addNewComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ComponentList" element
     */
    @Override
    public void removeComponentList(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QSET[0], i);
        }
    }
}
