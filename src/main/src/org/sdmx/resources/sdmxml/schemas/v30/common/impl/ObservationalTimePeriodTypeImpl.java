/*
 * XML Type:  ObservationalTimePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ObservationalTimePeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
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
public class ObservationalTimePeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType, org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType, org.sdmx.resources.sdmxml.schemas.v30.common.TimeRangeType {
    private static final long serialVersionUID = 1L;

    public ObservationalTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected ObservationalTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
