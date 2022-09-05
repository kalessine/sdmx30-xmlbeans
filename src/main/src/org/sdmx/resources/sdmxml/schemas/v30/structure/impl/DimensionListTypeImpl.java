/*
 * XML Type:  DimensionListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DimensionListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DimensionListTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.DimensionListBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType {
    private static final long serialVersionUID = 1L;

    public DimensionListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dimension"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TimeDimension"),
    };


    /**
     * Gets a List of "Dimension" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType> getDimensionList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType[] getDimensionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType[0]);
    }

    /**
     * Gets ith "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType getDimensionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Dimension" element
     */
    @Override
    public void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType dimension) {
        generatedSetterHelperImpl(dimension, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType insertNewDimension(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType addNewDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "TimeDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType getTimeDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "TimeDimension" element
     */
    @Override
    public boolean isSetTimeDimension() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "TimeDimension" element
     */
    @Override
    public void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType timeDimension) {
        generatedSetterHelperImpl(timeDimension, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType addNewTimeDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "TimeDimension" element
     */
    @Override
    public void unsetTimeDimension() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
