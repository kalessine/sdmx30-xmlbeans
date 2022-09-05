/*
 * XML Type:  ObservationalTimePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


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
public interface ObservationalTimePeriodType extends org.apache.xmlbeans.XmlAnySimpleType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "observationaltimeperiodtypeec03type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

}
