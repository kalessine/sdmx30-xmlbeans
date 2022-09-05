/*
 * XML Type:  HierarchyAssociationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HierarchyAssociationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class HierarchyAssociationsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType {
    private static final long serialVersionUID = 1L;

    public HierarchyAssociationsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "HierarchyAssociation"),
    };


    /**
     * Gets a List of "HierarchyAssociation" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType> getHierarchyAssociationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHierarchyAssociationArray,
                this::setHierarchyAssociationArray,
                this::insertNewHierarchyAssociation,
                this::removeHierarchyAssociation,
                this::sizeOfHierarchyAssociationArray
            );
        }
    }

    /**
     * Gets array of all "HierarchyAssociation" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType[] getHierarchyAssociationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType[0]);
    }

    /**
     * Gets ith "HierarchyAssociation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType getHierarchyAssociationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "HierarchyAssociation" element
     */
    @Override
    public int sizeOfHierarchyAssociationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "HierarchyAssociation" element
     */
    @Override
    public void setHierarchyAssociationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType hierarchyAssociation) {
        generatedSetterHelperImpl(hierarchyAssociation, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchyAssociation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType insertNewHierarchyAssociation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchyAssociation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType addNewHierarchyAssociation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "HierarchyAssociation" element
     */
    @Override
    public void removeHierarchyAssociation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
