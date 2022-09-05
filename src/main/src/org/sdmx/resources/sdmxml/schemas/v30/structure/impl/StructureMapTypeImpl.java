/*
 * XML Type:  StructureMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class StructureMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.StructureMapBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType {
    private static final long serialVersionUID = 1L;

    public StructureMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Source"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Target"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "EpochMap"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DatePatternMap"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "FrequencyFormatMapping"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ComponentMap"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "FixedValueMap"),
    };


    /**
     * Gets the "Source" element
     */
    @Override
    public java.lang.String getSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType xgetSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "Source" element
     */
    @Override
    public void setSource(java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(source);
        }
    }

    /**
     * Sets (as xml) the "Source" element
     */
    @Override
    public void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType source) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(source);
        }
    }

    /**
     * Gets the "Target" element
     */
    @Override
    public java.lang.String getTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType xgetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "Target" element
     */
    @Override
    public void setTarget(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) the "Target" element
     */
    @Override
    public void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(targetValue);
        }
    }

    /**
     * Gets a List of "EpochMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType> getEpochMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEpochMapArray,
                this::setEpochMapArray,
                this::insertNewEpochMap,
                this::removeEpochMap,
                this::sizeOfEpochMapArray
            );
        }
    }

    /**
     * Gets array of all "EpochMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType[] getEpochMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType[0]);
    }

    /**
     * Gets ith "EpochMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType getEpochMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "EpochMap" element
     */
    @Override
    public int sizeOfEpochMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "EpochMap" element
     */
    @Override
    public void setEpochMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType epochMap) {
        generatedSetterHelperImpl(epochMap, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EpochMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType insertNewEpochMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "EpochMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType addNewEpochMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "EpochMap" element
     */
    @Override
    public void removeEpochMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "DatePatternMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType> getDatePatternMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDatePatternMapArray,
                this::setDatePatternMapArray,
                this::insertNewDatePatternMap,
                this::removeDatePatternMap,
                this::sizeOfDatePatternMapArray
            );
        }
    }

    /**
     * Gets array of all "DatePatternMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType[] getDatePatternMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType[0]);
    }

    /**
     * Gets ith "DatePatternMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType getDatePatternMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DatePatternMap" element
     */
    @Override
    public int sizeOfDatePatternMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "DatePatternMap" element
     */
    @Override
    public void setDatePatternMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType datePatternMap) {
        generatedSetterHelperImpl(datePatternMap, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatePatternMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType insertNewDatePatternMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DatePatternMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType addNewDatePatternMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "DatePatternMap" element
     */
    @Override
    public void removeDatePatternMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "FrequencyFormatMapping" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType> getFrequencyFormatMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFrequencyFormatMappingArray,
                this::setFrequencyFormatMappingArray,
                this::insertNewFrequencyFormatMapping,
                this::removeFrequencyFormatMapping,
                this::sizeOfFrequencyFormatMappingArray
            );
        }
    }

    /**
     * Gets array of all "FrequencyFormatMapping" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType[] getFrequencyFormatMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType[0]);
    }

    /**
     * Gets ith "FrequencyFormatMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType getFrequencyFormatMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FrequencyFormatMapping" element
     */
    @Override
    public int sizeOfFrequencyFormatMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "FrequencyFormatMapping" element
     */
    @Override
    public void setFrequencyFormatMappingArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType frequencyFormatMapping) {
        generatedSetterHelperImpl(frequencyFormatMapping, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FrequencyFormatMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType insertNewFrequencyFormatMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FrequencyFormatMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType addNewFrequencyFormatMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "FrequencyFormatMapping" element
     */
    @Override
    public void removeFrequencyFormatMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "ComponentMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType> getComponentMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getComponentMapArray,
                this::setComponentMapArray,
                this::insertNewComponentMap,
                this::removeComponentMap,
                this::sizeOfComponentMapArray
            );
        }
    }

    /**
     * Gets array of all "ComponentMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType[] getComponentMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType[0]);
    }

    /**
     * Gets ith "ComponentMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType getComponentMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ComponentMap" element
     */
    @Override
    public int sizeOfComponentMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "ComponentMap" element
     */
    @Override
    public void setComponentMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType componentMap) {
        generatedSetterHelperImpl(componentMap, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType insertNewComponentMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType addNewComponentMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "ComponentMap" element
     */
    @Override
    public void removeComponentMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "FixedValueMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType> getFixedValueMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFixedValueMapArray,
                this::setFixedValueMapArray,
                this::insertNewFixedValueMap,
                this::removeFixedValueMap,
                this::sizeOfFixedValueMapArray
            );
        }
    }

    /**
     * Gets array of all "FixedValueMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType[] getFixedValueMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType[0]);
    }

    /**
     * Gets ith "FixedValueMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType getFixedValueMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FixedValueMap" element
     */
    @Override
    public int sizeOfFixedValueMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "FixedValueMap" element
     */
    @Override
    public void setFixedValueMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType fixedValueMap) {
        generatedSetterHelperImpl(fixedValueMap, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FixedValueMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType insertNewFixedValueMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FixedValueMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType addNewFixedValueMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "FixedValueMap" element
     */
    @Override
    public void removeFixedValueMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }
}
