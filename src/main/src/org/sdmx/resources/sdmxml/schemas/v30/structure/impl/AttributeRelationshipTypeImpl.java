/*
 * XML Type:  AttributeRelationshipType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AttributeRelationshipType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class AttributeRelationshipTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType {
    private static final long serialVersionUID = 1L;

    public AttributeRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dimension"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Group"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Observation"),
    };


    /**
     * Gets the "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Dataflow" element
     */
    @Override
    public boolean isSetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Dataflow" element
     */
    @Override
    public void setDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType dataflow) {
        generatedSetterHelperImpl(dataflow, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "Dataflow" element
     */
    @Override
    public void unsetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "Dimension" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType> getDimensionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionArray,
                this::setDimensionArray,
                this::insertNewDimension,
                this::removeDimension,
                this::sizeOfDimensionArray
            );
        }
    }

    /**
     * Gets array of all "Dimension" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType[] getDimensionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType[0]);
    }

    /**
     * Gets ith "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType getDimensionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Dimension" element
     */
    @Override
    public int sizeOfDimensionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Dimension" element
     */
    @Override
    public void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType dimension) {
        generatedSetterHelperImpl(dimension, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType insertNewDimension(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType addNewDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Dimension" element
     */
    @Override
    public void removeDimension(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "Group" element
     */
    @Override
    public java.lang.String getGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "Group" element
     */
    @Override
    public boolean isSetGroup() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "Group" element
     */
    @Override
    public void setGroup(java.lang.String group) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(group);
        }
    }

    /**
     * Sets (as xml) the "Group" element
     */
    @Override
    public void xsetGroup(org.sdmx.resources.sdmxml.schemas.v30.common.IDType group) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(group);
        }
    }

    /**
     * Unsets the "Group" element
     */
    @Override
    public void unsetGroup() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "Observation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getObservation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Observation" element
     */
    @Override
    public boolean isSetObservation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "Observation" element
     */
    @Override
    public void setObservation(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType observation) {
        generatedSetterHelperImpl(observation, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Observation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewObservation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "Observation" element
     */
    @Override
    public void unsetObservation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}
