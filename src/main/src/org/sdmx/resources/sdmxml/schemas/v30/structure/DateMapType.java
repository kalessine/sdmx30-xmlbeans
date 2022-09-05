/*
 * XML Type:  DateMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DateMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DateMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DateMapType extends org.sdmx.resources.sdmxml.schemas.v30.common.IdentifiableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DateMapType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datemaptype4584type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Source" elements
     */
    java.util.List<java.lang.String> getSourceList();

    /**
     * Gets array of all "Source" elements
     */
    java.lang.String[] getSourceArray();

    /**
     * Gets ith "Source" element
     */
    java.lang.String getSourceArray(int i);

    /**
     * Gets (as xml) a List of "Source" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetSourceList();

    /**
     * Gets (as xml) array of all "Source" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetSourceArray();

    /**
     * Gets (as xml) ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSourceArray(int i);

    /**
     * Returns number of "Source" element
     */
    int sizeOfSourceArray();

    /**
     * Sets ith "Source" element
     */
    void setSourceArray(int i, java.lang.String source);

    /**
     * Sets (as xml) array of all "Source" element
     */
    void xsetSourceArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] sourceArray);

    /**
     * Sets (as xml) ith "Source" element
     */
    void xsetSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType source);

    /**
     * Inserts the value as the ith "Source" element
     */
    void insertSource(int i, java.lang.String source);

    /**
     * Appends the value as the last "Source" element
     */
    void addSource(java.lang.String source);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewSource();

    /**
     * Removes the ith "Source" element
     */
    void removeSource(int i);

    /**
     * Gets a List of "Target" elements
     */
    java.util.List<java.lang.String> getTargetList();

    /**
     * Gets array of all "Target" elements
     */
    java.lang.String[] getTargetArray();

    /**
     * Gets ith "Target" element
     */
    java.lang.String getTargetArray(int i);

    /**
     * Gets (as xml) a List of "Target" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetTargetList();

    /**
     * Gets (as xml) array of all "Target" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetTargetArray();

    /**
     * Gets (as xml) ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTargetArray(int i);

    /**
     * Returns number of "Target" element
     */
    int sizeOfTargetArray();

    /**
     * Sets ith "Target" element
     */
    void setTargetArray(int i, java.lang.String target);

    /**
     * Sets (as xml) array of all "Target" element
     */
    void xsetTargetArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] targetArray);

    /**
     * Sets (as xml) ith "Target" element
     */
    void xsetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType target);

    /**
     * Inserts the value as the ith "Target" element
     */
    void insertTarget(int i, java.lang.String target);

    /**
     * Appends the value as the last "Target" element
     */
    void addTarget(java.lang.String target);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewTarget(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewTarget();

    /**
     * Removes the ith "Target" element
     */
    void removeTarget(int i);

    /**
     * Gets the "FrequencyDimension" element
     */
    java.lang.String getFrequencyDimension();

    /**
     * Gets (as xml) the "FrequencyDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetFrequencyDimension();

    /**
     * True if has "FrequencyDimension" element
     */
    boolean isSetFrequencyDimension();

    /**
     * Sets the "FrequencyDimension" element
     */
    void setFrequencyDimension(java.lang.String frequencyDimension);

    /**
     * Sets (as xml) the "FrequencyDimension" element
     */
    void xsetFrequencyDimension(org.sdmx.resources.sdmxml.schemas.v30.common.IDType frequencyDimension);

    /**
     * Unsets the "FrequencyDimension" element
     */
    void unsetFrequencyDimension();

    /**
     * Gets a List of "MappedFrequencies" elements
     */
    java.util.List<java.lang.String> getMappedFrequenciesList();

    /**
     * Gets array of all "MappedFrequencies" elements
     */
    java.lang.String[] getMappedFrequenciesArray();

    /**
     * Gets ith "MappedFrequencies" element
     */
    java.lang.String getMappedFrequenciesArray(int i);

    /**
     * Gets (as xml) a List of "MappedFrequencies" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetMappedFrequenciesList();

    /**
     * Gets (as xml) array of all "MappedFrequencies" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetMappedFrequenciesArray();

    /**
     * Gets (as xml) ith "MappedFrequencies" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetMappedFrequenciesArray(int i);

    /**
     * Returns number of "MappedFrequencies" element
     */
    int sizeOfMappedFrequenciesArray();

    /**
     * Sets ith "MappedFrequencies" element
     */
    void setMappedFrequenciesArray(int i, java.lang.String mappedFrequencies);

    /**
     * Sets (as xml) array of all "MappedFrequencies" element
     */
    void xsetMappedFrequenciesArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] mappedFrequenciesArray);

    /**
     * Sets (as xml) ith "MappedFrequencies" element
     */
    void xsetMappedFrequenciesArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType mappedFrequencies);

    /**
     * Inserts the value as the ith "MappedFrequencies" element
     */
    void insertMappedFrequencies(int i, java.lang.String mappedFrequencies);

    /**
     * Appends the value as the last "MappedFrequencies" element
     */
    void addMappedFrequencies(java.lang.String mappedFrequencies);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MappedFrequencies" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewMappedFrequencies(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MappedFrequencies" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewMappedFrequencies();

    /**
     * Removes the ith "MappedFrequencies" element
     */
    void removeMappedFrequencies(int i);

    /**
     * Gets the "TargetFrequencyID" element
     */
    java.lang.String getTargetFrequencyID();

    /**
     * Gets (as xml) the "TargetFrequencyID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTargetFrequencyID();

    /**
     * True if has "TargetFrequencyID" element
     */
    boolean isSetTargetFrequencyID();

    /**
     * Sets the "TargetFrequencyID" element
     */
    void setTargetFrequencyID(java.lang.String targetFrequencyID);

    /**
     * Sets (as xml) the "TargetFrequencyID" element
     */
    void xsetTargetFrequencyID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType targetFrequencyID);

    /**
     * Unsets the "TargetFrequencyID" element
     */
    void unsetTargetFrequencyID();

    /**
     * Gets the "resolvePeriod" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType.Enum getResolvePeriod();

    /**
     * Gets (as xml) the "resolvePeriod" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType xgetResolvePeriod();

    /**
     * True if has "resolvePeriod" attribute
     */
    boolean isSetResolvePeriod();

    /**
     * Sets the "resolvePeriod" attribute
     */
    void setResolvePeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType.Enum resolvePeriod);

    /**
     * Sets (as xml) the "resolvePeriod" attribute
     */
    void xsetResolvePeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType resolvePeriod);

    /**
     * Unsets the "resolvePeriod" attribute
     */
    void unsetResolvePeriod();
}
