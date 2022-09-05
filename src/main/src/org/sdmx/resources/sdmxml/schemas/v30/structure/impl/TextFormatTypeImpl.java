/*
 * XML Type:  TextFormatType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TextFormatType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class TextFormatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType {
    private static final long serialVersionUID = 1L;

    public TextFormatTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "SentinelValue"),
        new QName("", "textType"),
        new QName("", "isSequence"),
        new QName("", "interval"),
        new QName("", "startValue"),
        new QName("", "endValue"),
        new QName("", "timeInterval"),
        new QName("", "startTime"),
        new QName("", "endTime"),
        new QName("", "minLength"),
        new QName("", "maxLength"),
        new QName("", "minValue"),
        new QName("", "maxValue"),
        new QName("", "decimals"),
        new QName("", "pattern"),
        new QName("", "isMultiLingual"),
    };


    /**
     * Gets a List of "SentinelValue" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType> getSentinelValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSentinelValueArray,
                this::setSentinelValueArray,
                this::insertNewSentinelValue,
                this::removeSentinelValue,
                this::sizeOfSentinelValueArray
            );
        }
    }

    /**
     * Gets array of all "SentinelValue" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType[] getSentinelValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType[0]);
    }

    /**
     * Gets ith "SentinelValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType getSentinelValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SentinelValue" element
     */
    @Override
    public int sizeOfSentinelValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "SentinelValue" element
     */
    @Override
    public void setSentinelValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType sentinelValue) {
        generatedSetterHelperImpl(sentinelValue, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SentinelValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType insertNewSentinelValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SentinelValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType addNewSentinelValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "SentinelValue" element
     */
    @Override
    public void removeSentinelValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "textType" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getTextType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "textType" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetTextType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return target;
        }
    }

    /**
     * True if has "textType" attribute
     */
    @Override
    public boolean isSetTextType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "textType" attribute
     */
    @Override
    public void setTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum textType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(textType);
        }
    }

    /**
     * Sets (as xml) the "textType" attribute
     */
    @Override
    public void xsetTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType textType) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(textType);
        }
    }

    /**
     * Unsets the "textType" attribute
     */
    @Override
    public void unsetTextType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "isSequence" attribute
     */
    @Override
    public boolean getIsSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isSequence" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "isSequence" attribute
     */
    @Override
    public boolean isSetIsSequence() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "isSequence" attribute
     */
    @Override
    public void setIsSequence(boolean isSequence) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(isSequence);
        }
    }

    /**
     * Sets (as xml) the "isSequence" attribute
     */
    @Override
    public void xsetIsSequence(org.apache.xmlbeans.XmlBoolean isSequence) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(isSequence);
        }
    }

    /**
     * Unsets the "isSequence" attribute
     */
    @Override
    public void unsetIsSequence() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "interval" attribute
     */
    @Override
    public java.math.BigDecimal getInterval() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "interval" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDecimal xgetInterval() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "interval" attribute
     */
    @Override
    public boolean isSetInterval() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "interval" attribute
     */
    @Override
    public void setInterval(java.math.BigDecimal interval) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setBigDecimalValue(interval);
        }
    }

    /**
     * Sets (as xml) the "interval" attribute
     */
    @Override
    public void xsetInterval(org.apache.xmlbeans.XmlDecimal interval) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(interval);
        }
    }

    /**
     * Unsets the "interval" attribute
     */
    @Override
    public void unsetInterval() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "startValue" attribute
     */
    @Override
    public java.math.BigDecimal getStartValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "startValue" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDecimal xgetStartValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "startValue" attribute
     */
    @Override
    public boolean isSetStartValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "startValue" attribute
     */
    @Override
    public void setStartValue(java.math.BigDecimal startValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setBigDecimalValue(startValue);
        }
    }

    /**
     * Sets (as xml) the "startValue" attribute
     */
    @Override
    public void xsetStartValue(org.apache.xmlbeans.XmlDecimal startValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(startValue);
        }
    }

    /**
     * Unsets the "startValue" attribute
     */
    @Override
    public void unsetStartValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "endValue" attribute
     */
    @Override
    public java.math.BigDecimal getEndValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "endValue" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDecimal xgetEndValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "endValue" attribute
     */
    @Override
    public boolean isSetEndValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "endValue" attribute
     */
    @Override
    public void setEndValue(java.math.BigDecimal endValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setBigDecimalValue(endValue);
        }
    }

    /**
     * Sets (as xml) the "endValue" attribute
     */
    @Override
    public void xsetEndValue(org.apache.xmlbeans.XmlDecimal endValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(endValue);
        }
    }

    /**
     * Unsets the "endValue" attribute
     */
    @Override
    public void unsetEndValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "timeInterval" attribute
     */
    @Override
    public org.apache.xmlbeans.GDuration getTimeInterval() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getGDurationValue();
        }
    }

    /**
     * Gets (as xml) the "timeInterval" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDuration xgetTimeInterval() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "timeInterval" attribute
     */
    @Override
    public boolean isSetTimeInterval() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "timeInterval" attribute
     */
    @Override
    public void setTimeInterval(org.apache.xmlbeans.GDuration timeInterval) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setGDurationValue(timeInterval);
        }
    }

    /**
     * Sets (as xml) the "timeInterval" attribute
     */
    @Override
    public void xsetTimeInterval(org.apache.xmlbeans.XmlDuration timeInterval) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(timeInterval);
        }
    }

    /**
     * Unsets the "timeInterval" attribute
     */
    @Override
    public void unsetTimeInterval() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "startTime" attribute
     */
    @Override
    public java.lang.Object getStartTime() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "startTime" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetStartTime() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "startTime" attribute
     */
    @Override
    public boolean isSetStartTime() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "startTime" attribute
     */
    @Override
    public void setStartTime(java.lang.Object startTime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setObjectValue(startTime);
        }
    }

    /**
     * Sets (as xml) the "startTime" attribute
     */
    @Override
    public void xsetStartTime(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType startTime) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(startTime);
        }
    }

    /**
     * Unsets the "startTime" attribute
     */
    @Override
    public void unsetStartTime() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "endTime" attribute
     */
    @Override
    public java.lang.Object getEndTime() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "endTime" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetEndTime() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "endTime" attribute
     */
    @Override
    public boolean isSetEndTime() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "endTime" attribute
     */
    @Override
    public void setEndTime(java.lang.Object endTime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setObjectValue(endTime);
        }
    }

    /**
     * Sets (as xml) the "endTime" attribute
     */
    @Override
    public void xsetEndTime(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType endTime) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(endTime);
        }
    }

    /**
     * Unsets the "endTime" attribute
     */
    @Override
    public void unsetEndTime() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "minLength" attribute
     */
    @Override
    public java.math.BigInteger getMinLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "minLength" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlPositiveInteger xgetMinLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "minLength" attribute
     */
    @Override
    public boolean isSetMinLength() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "minLength" attribute
     */
    @Override
    public void setMinLength(java.math.BigInteger minLength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setBigIntegerValue(minLength);
        }
    }

    /**
     * Sets (as xml) the "minLength" attribute
     */
    @Override
    public void xsetMinLength(org.apache.xmlbeans.XmlPositiveInteger minLength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(minLength);
        }
    }

    /**
     * Unsets the "minLength" attribute
     */
    @Override
    public void unsetMinLength() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "maxLength" attribute
     */
    @Override
    public java.math.BigInteger getMaxLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "maxLength" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlPositiveInteger xgetMaxLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "maxLength" attribute
     */
    @Override
    public boolean isSetMaxLength() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "maxLength" attribute
     */
    @Override
    public void setMaxLength(java.math.BigInteger maxLength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBigIntegerValue(maxLength);
        }
    }

    /**
     * Sets (as xml) the "maxLength" attribute
     */
    @Override
    public void xsetMaxLength(org.apache.xmlbeans.XmlPositiveInteger maxLength) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(maxLength);
        }
    }

    /**
     * Unsets the "maxLength" attribute
     */
    @Override
    public void unsetMaxLength() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "minValue" attribute
     */
    @Override
    public java.math.BigDecimal getMinValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "minValue" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDecimal xgetMinValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "minValue" attribute
     */
    @Override
    public boolean isSetMinValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "minValue" attribute
     */
    @Override
    public void setMinValue(java.math.BigDecimal minValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setBigDecimalValue(minValue);
        }
    }

    /**
     * Sets (as xml) the "minValue" attribute
     */
    @Override
    public void xsetMinValue(org.apache.xmlbeans.XmlDecimal minValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(minValue);
        }
    }

    /**
     * Unsets the "minValue" attribute
     */
    @Override
    public void unsetMinValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "maxValue" attribute
     */
    @Override
    public java.math.BigDecimal getMaxValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "maxValue" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDecimal xgetMaxValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "maxValue" attribute
     */
    @Override
    public boolean isSetMaxValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "maxValue" attribute
     */
    @Override
    public void setMaxValue(java.math.BigDecimal maxValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setBigDecimalValue(maxValue);
        }
    }

    /**
     * Sets (as xml) the "maxValue" attribute
     */
    @Override
    public void xsetMaxValue(org.apache.xmlbeans.XmlDecimal maxValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(maxValue);
        }
    }

    /**
     * Unsets the "maxValue" attribute
     */
    @Override
    public void unsetMaxValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "decimals" attribute
     */
    @Override
    public java.math.BigInteger getDecimals() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "decimals" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlPositiveInteger xgetDecimals() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "decimals" attribute
     */
    @Override
    public boolean isSetDecimals() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "decimals" attribute
     */
    @Override
    public void setDecimals(java.math.BigInteger decimals) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setBigIntegerValue(decimals);
        }
    }

    /**
     * Sets (as xml) the "decimals" attribute
     */
    @Override
    public void xsetDecimals(org.apache.xmlbeans.XmlPositiveInteger decimals) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(decimals);
        }
    }

    /**
     * Unsets the "decimals" attribute
     */
    @Override
    public void unsetDecimals() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "pattern" attribute
     */
    @Override
    public java.lang.String getPattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "pattern" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "pattern" attribute
     */
    @Override
    public boolean isSetPattern() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "pattern" attribute
     */
    @Override
    public void setPattern(java.lang.String pattern) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setStringValue(pattern);
        }
    }

    /**
     * Sets (as xml) the "pattern" attribute
     */
    @Override
    public void xsetPattern(org.apache.xmlbeans.XmlString pattern) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(pattern);
        }
    }

    /**
     * Unsets the "pattern" attribute
     */
    @Override
    public void unsetPattern() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "isMultiLingual" attribute
     */
    @Override
    public boolean getIsMultiLingual() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[15]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isMultiLingual" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsMultiLingual() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[15]);
            }
            return target;
        }
    }

    /**
     * True if has "isMultiLingual" attribute
     */
    @Override
    public boolean isSetIsMultiLingual() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "isMultiLingual" attribute
     */
    @Override
    public void setIsMultiLingual(boolean isMultiLingual) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setBooleanValue(isMultiLingual);
        }
    }

    /**
     * Sets (as xml) the "isMultiLingual" attribute
     */
    @Override
    public void xsetIsMultiLingual(org.apache.xmlbeans.XmlBoolean isMultiLingual) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(isMultiLingual);
        }
    }

    /**
     * Unsets the "isMultiLingual" attribute
     */
    @Override
    public void unsetIsMultiLingual() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }
}
