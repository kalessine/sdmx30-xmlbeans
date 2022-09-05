/*
 * XML Type:  MemberSelectionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MemberSelectionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MemberSelectionType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "memberselectiontype3bc8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Value" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType> getValueList();

    /**
     * Gets array of all "Value" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType[] getValueArray();

    /**
     * Gets ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType getValueArray(int i);

    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();

    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType value);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType insertNewValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType addNewValue();

    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);

    /**
     * Gets the "TimeRange" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimeRangeValueType getTimeRange();

    /**
     * True if has "TimeRange" element
     */
    boolean isSetTimeRange();

    /**
     * Sets the "TimeRange" element
     */
    void setTimeRange(org.sdmx.resources.sdmxml.schemas.v30.structure.TimeRangeValueType timeRange);

    /**
     * Appends and returns a new empty "TimeRange" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimeRangeValueType addNewTimeRange();

    /**
     * Unsets the "TimeRange" element
     */
    void unsetTimeRange();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType id);

    /**
     * Gets the "include" attribute
     */
    boolean getInclude();

    /**
     * Gets (as xml) the "include" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInclude();

    /**
     * True if has "include" attribute
     */
    boolean isSetInclude();

    /**
     * Sets the "include" attribute
     */
    void setInclude(boolean include);

    /**
     * Sets (as xml) the "include" attribute
     */
    void xsetInclude(org.apache.xmlbeans.XmlBoolean include);

    /**
     * Unsets the "include" attribute
     */
    void unsetInclude();

    /**
     * Gets the "removePrefix" attribute
     */
    boolean getRemovePrefix();

    /**
     * Gets (as xml) the "removePrefix" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRemovePrefix();

    /**
     * True if has "removePrefix" attribute
     */
    boolean isSetRemovePrefix();

    /**
     * Sets the "removePrefix" attribute
     */
    void setRemovePrefix(boolean removePrefix);

    /**
     * Sets (as xml) the "removePrefix" attribute
     */
    void xsetRemovePrefix(org.apache.xmlbeans.XmlBoolean removePrefix);

    /**
     * Unsets the "removePrefix" attribute
     */
    void unsetRemovePrefix();

    /**
     * Gets the "validFrom" attribute
     */
    java.lang.Object getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.lang.Object validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.lang.Object getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.lang.Object validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
