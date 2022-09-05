/*
 * XML Type:  TimePeriodRangeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TimePeriodRangeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlDateTime
 *     org.sdmx.resources.sdmxml.schemas.v30.common.ReportingYearType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.ReportingSemesterType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.ReportingTrimesterType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.ReportingQuarterType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.ReportingMonthType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.ReportingWeekType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.ReportingDayType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.TimeRangeType
 */
public class TimePeriodRangeTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType, org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType, org.sdmx.resources.sdmxml.schemas.v30.common.TimeRangeType {
    private static final long serialVersionUID = 1L;

    public TimePeriodRangeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected TimePeriodRangeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "isInclusive"),
    };


    /**
     * Gets the "isInclusive" attribute
     */
    @Override
    public boolean getIsInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isInclusive" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "isInclusive" attribute
     */
    @Override
    public boolean isSetIsInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "isInclusive" attribute
     */
    @Override
    public void setIsInclusive(boolean isInclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(isInclusive);
        }
    }

    /**
     * Sets (as xml) the "isInclusive" attribute
     */
    @Override
    public void xsetIsInclusive(org.apache.xmlbeans.XmlBoolean isInclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(isInclusive);
        }
    }

    /**
     * Unsets the "isInclusive" attribute
     */
    @Override
    public void unsetIsInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
