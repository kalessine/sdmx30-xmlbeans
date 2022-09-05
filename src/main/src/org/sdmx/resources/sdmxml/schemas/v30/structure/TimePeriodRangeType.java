/*
 * XML Type:  TimePeriodRangeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


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
public interface TimePeriodRangeType extends org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "timeperiodrangetype46a5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "isInclusive" attribute
     */
    boolean getIsInclusive();

    /**
     * Gets (as xml) the "isInclusive" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsInclusive();

    /**
     * True if has "isInclusive" attribute
     */
    boolean isSetIsInclusive();

    /**
     * Sets the "isInclusive" attribute
     */
    void setIsInclusive(boolean isInclusive);

    /**
     * Sets (as xml) the "isInclusive" attribute
     */
    void xsetIsInclusive(org.apache.xmlbeans.XmlBoolean isInclusive);

    /**
     * Unsets the "isInclusive" attribute
     */
    void unsetIsInclusive();
}
