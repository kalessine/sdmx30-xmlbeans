/*
 * XML Type:  DataConstraintsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataConstraintsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataConstraintsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType {
    private static final long serialVersionUID = 1L;

    public DataConstraintsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConstraint"),
    };


    /**
     * Gets a List of "DataConstraint" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType> getDataConstraintList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataConstraintArray,
                this::setDataConstraintArray,
                this::insertNewDataConstraint,
                this::removeDataConstraint,
                this::sizeOfDataConstraintArray
            );
        }
    }

    /**
     * Gets array of all "DataConstraint" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType[] getDataConstraintArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType[0]);
    }

    /**
     * Gets ith "DataConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType getDataConstraintArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataConstraint" element
     */
    @Override
    public int sizeOfDataConstraintArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "DataConstraint" element
     */
    @Override
    public void setDataConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType dataConstraint) {
        generatedSetterHelperImpl(dataConstraint, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType insertNewDataConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType addNewDataConstraint() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataConstraint" element
     */
    @Override
    public void removeDataConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
