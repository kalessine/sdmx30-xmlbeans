/*
 * XML Type:  TimeDataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.TimeDataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TimeDataType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.common.TimeDataType.
 */
public interface TimeDataType extends org.sdmx.resources.sdmxml.schemas.v30.common.SimpleDataType {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.common.TimeDataType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "timedatatypee3dftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum OBSERVATIONAL_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.OBSERVATIONAL_TIME_PERIOD;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum STANDARD_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.STANDARD_TIME_PERIOD;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum BASIC_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.BASIC_TIME_PERIOD;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum GREGORIAN_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.GREGORIAN_TIME_PERIOD;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum GREGORIAN_YEAR = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.GREGORIAN_YEAR;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum GREGORIAN_YEAR_MONTH = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.GREGORIAN_YEAR_MONTH;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum GREGORIAN_DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.GREGORIAN_DAY;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_TIME_PERIOD;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_YEAR = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_YEAR;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_SEMESTER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_SEMESTER;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_TRIMESTER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_TRIMESTER;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_QUARTER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_QUARTER;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_MONTH = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_MONTH;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_WEEK = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_WEEK;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum REPORTING_DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.REPORTING_DAY;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum DATE_TIME = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.DATE_TIME;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum TIME_RANGE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.TIME_RANGE;

    int INT_OBSERVATIONAL_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_OBSERVATIONAL_TIME_PERIOD;
    int INT_STANDARD_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_STANDARD_TIME_PERIOD;
    int INT_BASIC_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_BASIC_TIME_PERIOD;
    int INT_GREGORIAN_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_GREGORIAN_TIME_PERIOD;
    int INT_GREGORIAN_YEAR = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_GREGORIAN_YEAR;
    int INT_GREGORIAN_YEAR_MONTH = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_GREGORIAN_YEAR_MONTH;
    int INT_GREGORIAN_DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_GREGORIAN_DAY;
    int INT_REPORTING_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_TIME_PERIOD;
    int INT_REPORTING_YEAR = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_YEAR;
    int INT_REPORTING_SEMESTER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_SEMESTER;
    int INT_REPORTING_TRIMESTER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_TRIMESTER;
    int INT_REPORTING_QUARTER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_QUARTER;
    int INT_REPORTING_MONTH = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_MONTH;
    int INT_REPORTING_WEEK = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_WEEK;
    int INT_REPORTING_DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_REPORTING_DAY;
    int INT_DATE_TIME = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_DATE_TIME;
    int INT_TIME_RANGE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_TIME_RANGE;
}
