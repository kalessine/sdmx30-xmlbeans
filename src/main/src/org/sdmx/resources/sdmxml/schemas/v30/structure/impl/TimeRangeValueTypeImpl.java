/*
 * XML Type:  TimeRangeValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeRangeValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TimeRangeValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class TimeRangeValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TimeRangeValueType {
    private static final long serialVersionUID = 1L;

    public TimeRangeValueTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "BeforePeriod"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AfterPeriod"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "StartPeriod"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "EndPeriod"),
        new QName("", "validFrom"),
        new QName("", "validTo"),
    };


    /**
     * Gets the "BeforePeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getBeforePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "BeforePeriod" element
     */
    @Override
    public boolean isSetBeforePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "BeforePeriod" element
     */
    @Override
    public void setBeforePeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType beforePeriod) {
        generatedSetterHelperImpl(beforePeriod, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "BeforePeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewBeforePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "BeforePeriod" element
     */
    @Override
    public void unsetBeforePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "AfterPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getAfterPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "AfterPeriod" element
     */
    @Override
    public boolean isSetAfterPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "AfterPeriod" element
     */
    @Override
    public void setAfterPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType afterPeriod) {
        generatedSetterHelperImpl(afterPeriod, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AfterPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewAfterPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "AfterPeriod" element
     */
    @Override
    public void unsetAfterPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "StartPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getStartPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "StartPeriod" element
     */
    @Override
    public boolean isSetStartPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "StartPeriod" element
     */
    @Override
    public void setStartPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType startPeriod) {
        generatedSetterHelperImpl(startPeriod, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StartPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewStartPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "StartPeriod" element
     */
    @Override
    public void unsetStartPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "EndPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getEndPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "EndPeriod" element
     */
    @Override
    public boolean isSetEndPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "EndPeriod" element
     */
    @Override
    public void setEndPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType endPeriod) {
        generatedSetterHelperImpl(endPeriod, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EndPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewEndPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "EndPeriod" element
     */
    @Override
    public void unsetEndPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "validFrom" attribute
     */
    @Override
    public java.lang.Object getValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "validFrom" attribute
     */
    @Override
    public boolean isSetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "validFrom" attribute
     */
    @Override
    public void setValidFrom(java.lang.Object validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setObjectValue(validFrom);
        }
    }

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    @Override
    public void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(validFrom);
        }
    }

    /**
     * Unsets the "validFrom" attribute
     */
    @Override
    public void unsetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "validTo" attribute
     */
    @Override
    public java.lang.Object getValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "validTo" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "validTo" attribute
     */
    @Override
    public boolean isSetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "validTo" attribute
     */
    @Override
    public void setValidTo(java.lang.Object validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setObjectValue(validTo);
        }
    }

    /**
     * Sets (as xml) the "validTo" attribute
     */
    @Override
    public void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(validTo);
        }
    }

    /**
     * Unsets the "validTo" attribute
     */
    @Override
    public void unsetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }
}
