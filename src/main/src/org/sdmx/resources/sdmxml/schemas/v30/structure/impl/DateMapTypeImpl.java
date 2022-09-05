/*
 * XML Type:  DateMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DateMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DateMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DateMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.IdentifiableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DateMapType {
    private static final long serialVersionUID = 1L;

    public DateMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Source"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Target"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "FrequencyDimension"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MappedFrequencies"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TargetFrequencyID"),
        new QName("", "resolvePeriod"),
    };


    /**
     * Gets a List of "Source" elements
     */
    @Override
    public java.util.List<java.lang.String> getSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSourceArray,
                this::setSourceArray,
                this::insertSource,
                this::removeSource,
                this::sizeOfSourceArray
            );
        }
    }

    /**
     * Gets array of all "Source" elements
     */
    @Override
    public java.lang.String[] getSourceArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Source" element
     */
    @Override
    public java.lang.String getSourceArray(int i) {
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
     * Gets (as xml) a List of "Source" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSourceArray,
                this::xsetSourceArray,
                this::insertNewSource,
                this::removeSource,
                this::sizeOfSourceArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Source" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetSourceArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]::new);
    }

    /**
     * Gets (as xml) ith "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Source" element
     */
    @Override
    public int sizeOfSourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Source" element
     */
    @Override
    public void setSourceArray(int i, java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(source);
        }
    }

    /**
     * Sets (as xml) array of all "Source" element
     */
    @Override
    public void xsetSourceArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]sourceArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(sourceArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "Source" element
     */
    @Override
    public void xsetSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType source) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }

    /**
     * Inserts the value as the ith "Source" element
     */
    @Override
    public void insertSource(int i, java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(source);
        }
    }

    /**
     * Appends the value as the last "Source" element
     */
    @Override
    public void addSource(java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(source);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Source" element
     */
    @Override
    public void removeSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Target" elements
     */
    @Override
    public java.util.List<java.lang.String> getTargetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTargetArray,
                this::setTargetArray,
                this::insertTarget,
                this::removeTarget,
                this::sizeOfTargetArray
            );
        }
    }

    /**
     * Gets array of all "Target" elements
     */
    @Override
    public java.lang.String[] getTargetArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Target" element
     */
    @Override
    public java.lang.String getTargetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Target" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetTargetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTargetArray,
                this::xsetTargetArray,
                this::insertNewTarget,
                this::removeTarget,
                this::sizeOfTargetArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Target" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetTargetArray() {
        return xgetArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]::new);
    }

    /**
     * Gets (as xml) ith "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTargetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Target" element
     */
    @Override
    public int sizeOfTargetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Target" element
     */
    @Override
    public void setTargetArray(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) array of all "Target" element
     */
    @Override
    public void xsetTargetArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]targetValueArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(targetValueArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "Target" element
     */
    @Override
    public void xsetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }

    /**
     * Inserts the value as the ith "Target" element
     */
    @Override
    public void insertTarget(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Appends the value as the last "Target" element
     */
    @Override
    public void addTarget(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewTarget(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Target" element
     */
    @Override
    public void removeTarget(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "FrequencyDimension" element
     */
    @Override
    public java.lang.String getFrequencyDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "FrequencyDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetFrequencyDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "FrequencyDimension" element
     */
    @Override
    public boolean isSetFrequencyDimension() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "FrequencyDimension" element
     */
    @Override
    public void setFrequencyDimension(java.lang.String frequencyDimension) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(frequencyDimension);
        }
    }

    /**
     * Sets (as xml) the "FrequencyDimension" element
     */
    @Override
    public void xsetFrequencyDimension(org.sdmx.resources.sdmxml.schemas.v30.common.IDType frequencyDimension) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(frequencyDimension);
        }
    }

    /**
     * Unsets the "FrequencyDimension" element
     */
    @Override
    public void unsetFrequencyDimension() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets a List of "MappedFrequencies" elements
     */
    @Override
    public java.util.List<java.lang.String> getMappedFrequenciesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMappedFrequenciesArray,
                this::setMappedFrequenciesArray,
                this::insertMappedFrequencies,
                this::removeMappedFrequencies,
                this::sizeOfMappedFrequenciesArray
            );
        }
    }

    /**
     * Gets array of all "MappedFrequencies" elements
     */
    @Override
    public java.lang.String[] getMappedFrequenciesArray() {
        return getObjectArray(PROPERTY_QNAME[3], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "MappedFrequencies" element
     */
    @Override
    public java.lang.String getMappedFrequenciesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "MappedFrequencies" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetMappedFrequenciesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMappedFrequenciesArray,
                this::xsetMappedFrequenciesArray,
                this::insertNewMappedFrequencies,
                this::removeMappedFrequencies,
                this::sizeOfMappedFrequenciesArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MappedFrequencies" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetMappedFrequenciesArray() {
        return xgetArray(PROPERTY_QNAME[3], org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]::new);
    }

    /**
     * Gets (as xml) ith "MappedFrequencies" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetMappedFrequenciesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MappedFrequencies" element
     */
    @Override
    public int sizeOfMappedFrequenciesArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "MappedFrequencies" element
     */
    @Override
    public void setMappedFrequenciesArray(int i, java.lang.String mappedFrequencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(mappedFrequencies);
        }
    }

    /**
     * Sets (as xml) array of all "MappedFrequencies" element
     */
    @Override
    public void xsetMappedFrequenciesArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]mappedFrequenciesArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(mappedFrequenciesArray, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets (as xml) ith "MappedFrequencies" element
     */
    @Override
    public void xsetMappedFrequenciesArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType mappedFrequencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(mappedFrequencies);
        }
    }

    /**
     * Inserts the value as the ith "MappedFrequencies" element
     */
    @Override
    public void insertMappedFrequencies(int i, java.lang.String mappedFrequencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            target.setStringValue(mappedFrequencies);
        }
    }

    /**
     * Appends the value as the last "MappedFrequencies" element
     */
    @Override
    public void addMappedFrequencies(java.lang.String mappedFrequencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            target.setStringValue(mappedFrequencies);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MappedFrequencies" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewMappedFrequencies(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MappedFrequencies" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewMappedFrequencies() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "MappedFrequencies" element
     */
    @Override
    public void removeMappedFrequencies(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "TargetFrequencyID" element
     */
    @Override
    public java.lang.String getTargetFrequencyID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "TargetFrequencyID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTargetFrequencyID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "TargetFrequencyID" element
     */
    @Override
    public boolean isSetTargetFrequencyID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "TargetFrequencyID" element
     */
    @Override
    public void setTargetFrequencyID(java.lang.String targetFrequencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(targetFrequencyID);
        }
    }

    /**
     * Sets (as xml) the "TargetFrequencyID" element
     */
    @Override
    public void xsetTargetFrequencyID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType targetFrequencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(targetFrequencyID);
        }
    }

    /**
     * Unsets the "TargetFrequencyID" element
     */
    @Override
    public void unsetTargetFrequencyID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "resolvePeriod" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType.Enum getResolvePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "resolvePeriod" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType xgetResolvePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "resolvePeriod" attribute
     */
    @Override
    public boolean isSetResolvePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "resolvePeriod" attribute
     */
    @Override
    public void setResolvePeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType.Enum resolvePeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setEnumValue(resolvePeriod);
        }
    }

    /**
     * Sets (as xml) the "resolvePeriod" attribute
     */
    @Override
    public void xsetResolvePeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType resolvePeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(resolvePeriod);
        }
    }

    /**
     * Unsets the "resolvePeriod" attribute
     */
    @Override
    public void unsetResolvePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }
}
