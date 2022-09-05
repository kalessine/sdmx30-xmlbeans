/*
 * XML Type:  ValueMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ValueMappingType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "valuemappingtypee885type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SourceValue" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType> getSourceValueList();

    /**
     * Gets array of all "SourceValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType[] getSourceValueArray();

    /**
     * Gets ith "SourceValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType getSourceValueArray(int i);

    /**
     * Returns number of "SourceValue" element
     */
    int sizeOfSourceValueArray();

    /**
     * Sets ith "SourceValue" element
     */
    void setSourceValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType sourceValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SourceValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType insertNewSourceValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SourceValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType addNewSourceValue();

    /**
     * Removes the ith "SourceValue" element
     */
    void removeSourceValue(int i);

    /**
     * Gets a List of "TargetValue" elements
     */
    java.util.List<java.lang.String> getTargetValueList();

    /**
     * Gets array of all "TargetValue" elements
     */
    java.lang.String[] getTargetValueArray();

    /**
     * Gets ith "TargetValue" element
     */
    java.lang.String getTargetValueArray(int i);

    /**
     * Gets (as xml) a List of "TargetValue" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetTargetValueList();

    /**
     * Gets (as xml) array of all "TargetValue" elements
     */
    org.apache.xmlbeans.XmlString[] xgetTargetValueArray();

    /**
     * Gets (as xml) ith "TargetValue" element
     */
    org.apache.xmlbeans.XmlString xgetTargetValueArray(int i);

    /**
     * Returns number of "TargetValue" element
     */
    int sizeOfTargetValueArray();

    /**
     * Sets ith "TargetValue" element
     */
    void setTargetValueArray(int i, java.lang.String targetValue);

    /**
     * Sets (as xml) array of all "TargetValue" element
     */
    void xsetTargetValueArray(org.apache.xmlbeans.XmlString[] targetValueArray);

    /**
     * Sets (as xml) ith "TargetValue" element
     */
    void xsetTargetValueArray(int i, org.apache.xmlbeans.XmlString targetValue);

    /**
     * Inserts the value as the ith "TargetValue" element
     */
    void insertTargetValue(int i, java.lang.String targetValue);

    /**
     * Appends the value as the last "TargetValue" element
     */
    void addTargetValue(java.lang.String targetValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetValue" element
     */
    org.apache.xmlbeans.XmlString insertNewTargetValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "TargetValue" element
     */
    org.apache.xmlbeans.XmlString addNewTargetValue();

    /**
     * Removes the ith "TargetValue" element
     */
    void removeTargetValue(int i);

    /**
     * Gets the "validFrom" attribute
     */
    java.util.Calendar getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.apache.xmlbeans.XmlDate xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.util.Calendar validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.apache.xmlbeans.XmlDate validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.util.Calendar getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.apache.xmlbeans.XmlDate xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.util.Calendar validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.apache.xmlbeans.XmlDate validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
