/*
 * XML Type:  TextFormatType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TextFormatType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TextFormatType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "textformattypee42ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SentinelValue" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType> getSentinelValueList();

    /**
     * Gets array of all "SentinelValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType[] getSentinelValueArray();

    /**
     * Gets ith "SentinelValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType getSentinelValueArray(int i);

    /**
     * Returns number of "SentinelValue" element
     */
    int sizeOfSentinelValueArray();

    /**
     * Sets ith "SentinelValue" element
     */
    void setSentinelValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType sentinelValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SentinelValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType insertNewSentinelValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SentinelValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType addNewSentinelValue();

    /**
     * Removes the ith "SentinelValue" element
     */
    void removeSentinelValue(int i);

    /**
     * Gets the "textType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getTextType();

    /**
     * Gets (as xml) the "textType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetTextType();

    /**
     * True if has "textType" attribute
     */
    boolean isSetTextType();

    /**
     * Sets the "textType" attribute
     */
    void setTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum textType);

    /**
     * Sets (as xml) the "textType" attribute
     */
    void xsetTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType textType);

    /**
     * Unsets the "textType" attribute
     */
    void unsetTextType();

    /**
     * Gets the "isSequence" attribute
     */
    boolean getIsSequence();

    /**
     * Gets (as xml) the "isSequence" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSequence();

    /**
     * True if has "isSequence" attribute
     */
    boolean isSetIsSequence();

    /**
     * Sets the "isSequence" attribute
     */
    void setIsSequence(boolean isSequence);

    /**
     * Sets (as xml) the "isSequence" attribute
     */
    void xsetIsSequence(org.apache.xmlbeans.XmlBoolean isSequence);

    /**
     * Unsets the "isSequence" attribute
     */
    void unsetIsSequence();

    /**
     * Gets the "interval" attribute
     */
    java.math.BigDecimal getInterval();

    /**
     * Gets (as xml) the "interval" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetInterval();

    /**
     * True if has "interval" attribute
     */
    boolean isSetInterval();

    /**
     * Sets the "interval" attribute
     */
    void setInterval(java.math.BigDecimal interval);

    /**
     * Sets (as xml) the "interval" attribute
     */
    void xsetInterval(org.apache.xmlbeans.XmlDecimal interval);

    /**
     * Unsets the "interval" attribute
     */
    void unsetInterval();

    /**
     * Gets the "startValue" attribute
     */
    java.math.BigDecimal getStartValue();

    /**
     * Gets (as xml) the "startValue" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetStartValue();

    /**
     * True if has "startValue" attribute
     */
    boolean isSetStartValue();

    /**
     * Sets the "startValue" attribute
     */
    void setStartValue(java.math.BigDecimal startValue);

    /**
     * Sets (as xml) the "startValue" attribute
     */
    void xsetStartValue(org.apache.xmlbeans.XmlDecimal startValue);

    /**
     * Unsets the "startValue" attribute
     */
    void unsetStartValue();

    /**
     * Gets the "endValue" attribute
     */
    java.math.BigDecimal getEndValue();

    /**
     * Gets (as xml) the "endValue" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetEndValue();

    /**
     * True if has "endValue" attribute
     */
    boolean isSetEndValue();

    /**
     * Sets the "endValue" attribute
     */
    void setEndValue(java.math.BigDecimal endValue);

    /**
     * Sets (as xml) the "endValue" attribute
     */
    void xsetEndValue(org.apache.xmlbeans.XmlDecimal endValue);

    /**
     * Unsets the "endValue" attribute
     */
    void unsetEndValue();

    /**
     * Gets the "timeInterval" attribute
     */
    org.apache.xmlbeans.GDuration getTimeInterval();

    /**
     * Gets (as xml) the "timeInterval" attribute
     */
    org.apache.xmlbeans.XmlDuration xgetTimeInterval();

    /**
     * True if has "timeInterval" attribute
     */
    boolean isSetTimeInterval();

    /**
     * Sets the "timeInterval" attribute
     */
    void setTimeInterval(org.apache.xmlbeans.GDuration timeInterval);

    /**
     * Sets (as xml) the "timeInterval" attribute
     */
    void xsetTimeInterval(org.apache.xmlbeans.XmlDuration timeInterval);

    /**
     * Unsets the "timeInterval" attribute
     */
    void unsetTimeInterval();

    /**
     * Gets the "startTime" attribute
     */
    java.lang.Object getStartTime();

    /**
     * Gets (as xml) the "startTime" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetStartTime();

    /**
     * True if has "startTime" attribute
     */
    boolean isSetStartTime();

    /**
     * Sets the "startTime" attribute
     */
    void setStartTime(java.lang.Object startTime);

    /**
     * Sets (as xml) the "startTime" attribute
     */
    void xsetStartTime(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType startTime);

    /**
     * Unsets the "startTime" attribute
     */
    void unsetStartTime();

    /**
     * Gets the "endTime" attribute
     */
    java.lang.Object getEndTime();

    /**
     * Gets (as xml) the "endTime" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetEndTime();

    /**
     * True if has "endTime" attribute
     */
    boolean isSetEndTime();

    /**
     * Sets the "endTime" attribute
     */
    void setEndTime(java.lang.Object endTime);

    /**
     * Sets (as xml) the "endTime" attribute
     */
    void xsetEndTime(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType endTime);

    /**
     * Unsets the "endTime" attribute
     */
    void unsetEndTime();

    /**
     * Gets the "minLength" attribute
     */
    java.math.BigInteger getMinLength();

    /**
     * Gets (as xml) the "minLength" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetMinLength();

    /**
     * True if has "minLength" attribute
     */
    boolean isSetMinLength();

    /**
     * Sets the "minLength" attribute
     */
    void setMinLength(java.math.BigInteger minLength);

    /**
     * Sets (as xml) the "minLength" attribute
     */
    void xsetMinLength(org.apache.xmlbeans.XmlPositiveInteger minLength);

    /**
     * Unsets the "minLength" attribute
     */
    void unsetMinLength();

    /**
     * Gets the "maxLength" attribute
     */
    java.math.BigInteger getMaxLength();

    /**
     * Gets (as xml) the "maxLength" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetMaxLength();

    /**
     * True if has "maxLength" attribute
     */
    boolean isSetMaxLength();

    /**
     * Sets the "maxLength" attribute
     */
    void setMaxLength(java.math.BigInteger maxLength);

    /**
     * Sets (as xml) the "maxLength" attribute
     */
    void xsetMaxLength(org.apache.xmlbeans.XmlPositiveInteger maxLength);

    /**
     * Unsets the "maxLength" attribute
     */
    void unsetMaxLength();

    /**
     * Gets the "minValue" attribute
     */
    java.math.BigDecimal getMinValue();

    /**
     * Gets (as xml) the "minValue" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetMinValue();

    /**
     * True if has "minValue" attribute
     */
    boolean isSetMinValue();

    /**
     * Sets the "minValue" attribute
     */
    void setMinValue(java.math.BigDecimal minValue);

    /**
     * Sets (as xml) the "minValue" attribute
     */
    void xsetMinValue(org.apache.xmlbeans.XmlDecimal minValue);

    /**
     * Unsets the "minValue" attribute
     */
    void unsetMinValue();

    /**
     * Gets the "maxValue" attribute
     */
    java.math.BigDecimal getMaxValue();

    /**
     * Gets (as xml) the "maxValue" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetMaxValue();

    /**
     * True if has "maxValue" attribute
     */
    boolean isSetMaxValue();

    /**
     * Sets the "maxValue" attribute
     */
    void setMaxValue(java.math.BigDecimal maxValue);

    /**
     * Sets (as xml) the "maxValue" attribute
     */
    void xsetMaxValue(org.apache.xmlbeans.XmlDecimal maxValue);

    /**
     * Unsets the "maxValue" attribute
     */
    void unsetMaxValue();

    /**
     * Gets the "decimals" attribute
     */
    java.math.BigInteger getDecimals();

    /**
     * Gets (as xml) the "decimals" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetDecimals();

    /**
     * True if has "decimals" attribute
     */
    boolean isSetDecimals();

    /**
     * Sets the "decimals" attribute
     */
    void setDecimals(java.math.BigInteger decimals);

    /**
     * Sets (as xml) the "decimals" attribute
     */
    void xsetDecimals(org.apache.xmlbeans.XmlPositiveInteger decimals);

    /**
     * Unsets the "decimals" attribute
     */
    void unsetDecimals();

    /**
     * Gets the "pattern" attribute
     */
    java.lang.String getPattern();

    /**
     * Gets (as xml) the "pattern" attribute
     */
    org.apache.xmlbeans.XmlString xgetPattern();

    /**
     * True if has "pattern" attribute
     */
    boolean isSetPattern();

    /**
     * Sets the "pattern" attribute
     */
    void setPattern(java.lang.String pattern);

    /**
     * Sets (as xml) the "pattern" attribute
     */
    void xsetPattern(org.apache.xmlbeans.XmlString pattern);

    /**
     * Unsets the "pattern" attribute
     */
    void unsetPattern();

    /**
     * Gets the "isMultiLingual" attribute
     */
    boolean getIsMultiLingual();

    /**
     * Gets (as xml) the "isMultiLingual" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsMultiLingual();

    /**
     * True if has "isMultiLingual" attribute
     */
    boolean isSetIsMultiLingual();

    /**
     * Sets the "isMultiLingual" attribute
     */
    void setIsMultiLingual(boolean isMultiLingual);

    /**
     * Sets (as xml) the "isMultiLingual" attribute
     */
    void xsetIsMultiLingual(org.apache.xmlbeans.XmlBoolean isMultiLingual);

    /**
     * Unsets the "isMultiLingual" attribute
     */
    void unsetIsMultiLingual();
}
