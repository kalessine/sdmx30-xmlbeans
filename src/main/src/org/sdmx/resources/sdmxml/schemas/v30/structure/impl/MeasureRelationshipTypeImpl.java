/*
 * XML Type:  MeasureRelationshipType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MeasureRelationshipType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MeasureRelationshipTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType {
    private static final long serialVersionUID = 1L;

    public MeasureRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Measure"),
    };


    /**
     * Gets a List of "Measure" elements
     */
    @Override
    public java.util.List<java.lang.String> getMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMeasureArray,
                this::setMeasureArray,
                this::insertMeasure,
                this::removeMeasure,
                this::sizeOfMeasureArray
            );
        }
    }

    /**
     * Gets array of all "Measure" elements
     */
    @Override
    public java.lang.String[] getMeasureArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Measure" element
     */
    @Override
    public java.lang.String getMeasureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Measure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType> xgetMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMeasureArray,
                this::xsetMeasureArray,
                this::insertNewMeasure,
                this::removeMeasure,
                this::sizeOfMeasureArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Measure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType[] xgetMeasureArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType[]::new);
    }

    /**
     * Gets (as xml) ith "Measure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetMeasureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Measure" element
     */
    @Override
    public int sizeOfMeasureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Measure" element
     */
    @Override
    public void setMeasureArray(int i, java.lang.String measure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(measure);
        }
    }

    /**
     * Sets (as xml) array of all "Measure" element
     */
    @Override
    public void xsetMeasureArray(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType[]measureArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(measureArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "Measure" element
     */
    @Override
    public void xsetMeasureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType measure) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(measure);
        }
    }

    /**
     * Inserts the value as the ith "Measure" element
     */
    @Override
    public void insertMeasure(int i, java.lang.String measure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(measure);
        }
    }

    /**
     * Appends the value as the last "Measure" element
     */
    @Override
    public void addMeasure(java.lang.String measure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(measure);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Measure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType insertNewMeasure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Measure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType addNewMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Measure" element
     */
    @Override
    public void removeMeasure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
