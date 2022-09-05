/*
 * XML Type:  StructureMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface StructureMapType extends org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structuremaptypee151type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Source" element
     */
    java.lang.String getSource();

    /**
     * Gets (as xml) the "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType xgetSource();

    /**
     * Sets the "Source" element
     */
    void setSource(java.lang.String source);

    /**
     * Sets (as xml) the "Source" element
     */
    void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType source);

    /**
     * Gets the "Target" element
     */
    java.lang.String getTarget();

    /**
     * Gets (as xml) the "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType xgetTarget();

    /**
     * Sets the "Target" element
     */
    void setTarget(java.lang.String target);

    /**
     * Sets (as xml) the "Target" element
     */
    void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.StructureOrUsageReferenceType target);

    /**
     * Gets a List of "EpochMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType> getEpochMapList();

    /**
     * Gets array of all "EpochMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType[] getEpochMapArray();

    /**
     * Gets ith "EpochMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType getEpochMapArray(int i);

    /**
     * Returns number of "EpochMap" element
     */
    int sizeOfEpochMapArray();

    /**
     * Sets ith "EpochMap" element
     */
    void setEpochMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType epochMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EpochMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType insertNewEpochMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "EpochMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType addNewEpochMap();

    /**
     * Removes the ith "EpochMap" element
     */
    void removeEpochMap(int i);

    /**
     * Gets a List of "DatePatternMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType> getDatePatternMapList();

    /**
     * Gets array of all "DatePatternMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType[] getDatePatternMapArray();

    /**
     * Gets ith "DatePatternMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType getDatePatternMapArray(int i);

    /**
     * Returns number of "DatePatternMap" element
     */
    int sizeOfDatePatternMapArray();

    /**
     * Sets ith "DatePatternMap" element
     */
    void setDatePatternMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType datePatternMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatePatternMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType insertNewDatePatternMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DatePatternMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType addNewDatePatternMap();

    /**
     * Removes the ith "DatePatternMap" element
     */
    void removeDatePatternMap(int i);

    /**
     * Gets a List of "FrequencyFormatMapping" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType> getFrequencyFormatMappingList();

    /**
     * Gets array of all "FrequencyFormatMapping" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType[] getFrequencyFormatMappingArray();

    /**
     * Gets ith "FrequencyFormatMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType getFrequencyFormatMappingArray(int i);

    /**
     * Returns number of "FrequencyFormatMapping" element
     */
    int sizeOfFrequencyFormatMappingArray();

    /**
     * Sets ith "FrequencyFormatMapping" element
     */
    void setFrequencyFormatMappingArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType frequencyFormatMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FrequencyFormatMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType insertNewFrequencyFormatMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "FrequencyFormatMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType addNewFrequencyFormatMapping();

    /**
     * Removes the ith "FrequencyFormatMapping" element
     */
    void removeFrequencyFormatMapping(int i);

    /**
     * Gets a List of "ComponentMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType> getComponentMapList();

    /**
     * Gets array of all "ComponentMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType[] getComponentMapArray();

    /**
     * Gets ith "ComponentMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType getComponentMapArray(int i);

    /**
     * Returns number of "ComponentMap" element
     */
    int sizeOfComponentMapArray();

    /**
     * Sets ith "ComponentMap" element
     */
    void setComponentMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType componentMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType insertNewComponentMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType addNewComponentMap();

    /**
     * Removes the ith "ComponentMap" element
     */
    void removeComponentMap(int i);

    /**
     * Gets a List of "FixedValueMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType> getFixedValueMapList();

    /**
     * Gets array of all "FixedValueMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType[] getFixedValueMapArray();

    /**
     * Gets ith "FixedValueMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType getFixedValueMapArray(int i);

    /**
     * Returns number of "FixedValueMap" element
     */
    int sizeOfFixedValueMapArray();

    /**
     * Sets ith "FixedValueMap" element
     */
    void setFixedValueMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType fixedValueMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FixedValueMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType insertNewFixedValueMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "FixedValueMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType addNewFixedValueMap();

    /**
     * Removes the ith "FixedValueMap" element
     */
    void removeFixedValueMap(int i);
}
