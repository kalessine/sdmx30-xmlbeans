/*
 * XML Type:  GroupType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GroupType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GroupTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GroupBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType {
    private static final long serialVersionUID = 1L;

    public GroupTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GroupDimension"),
    };


    /**
     * Gets a List of "GroupDimension" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType> getGroupDimensionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGroupDimensionArray,
                this::setGroupDimensionArray,
                this::insertNewGroupDimension,
                this::removeGroupDimension,
                this::sizeOfGroupDimensionArray
            );
        }
    }

    /**
     * Gets array of all "GroupDimension" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType[] getGroupDimensionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType[0]);
    }

    /**
     * Gets ith "GroupDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType getGroupDimensionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "GroupDimension" element
     */
    @Override
    public int sizeOfGroupDimensionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "GroupDimension" element
     */
    @Override
    public void setGroupDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType groupDimension) {
        generatedSetterHelperImpl(groupDimension, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GroupDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType insertNewGroupDimension(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "GroupDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType addNewGroupDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "GroupDimension" element
     */
    @Override
    public void removeGroupDimension(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
