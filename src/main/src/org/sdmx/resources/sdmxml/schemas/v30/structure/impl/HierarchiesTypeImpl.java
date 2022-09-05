/*
 * XML Type:  HierarchiesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HierarchiesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class HierarchiesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType {
    private static final long serialVersionUID = 1L;

    public HierarchiesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Hierarchy"),
    };


    /**
     * Gets a List of "Hierarchy" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType> getHierarchyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHierarchyArray,
                this::setHierarchyArray,
                this::insertNewHierarchy,
                this::removeHierarchy,
                this::sizeOfHierarchyArray
            );
        }
    }

    /**
     * Gets array of all "Hierarchy" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType[] getHierarchyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType[0]);
    }

    /**
     * Gets ith "Hierarchy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType getHierarchyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Hierarchy" element
     */
    @Override
    public int sizeOfHierarchyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Hierarchy" element
     */
    @Override
    public void setHierarchyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType hierarchy) {
        generatedSetterHelperImpl(hierarchy, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Hierarchy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType insertNewHierarchy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Hierarchy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType addNewHierarchy() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Hierarchy" element
     */
    @Override
    public void removeHierarchy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
