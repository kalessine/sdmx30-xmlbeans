/*
 * XML Type:  BasicComponentDataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.BasicComponentDataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML BasicComponentDataType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.common.BasicComponentDataType.
 */
public interface BasicComponentDataType extends org.sdmx.resources.sdmxml.schemas.v30.common.DataType {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.common.BasicComponentDataType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "basiccomponentdatatype8dbdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum STRING = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.STRING;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum ALPHA = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.ALPHA;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum ALPHA_NUMERIC = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.ALPHA_NUMERIC;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum NUMERIC = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.NUMERIC;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum BIG_INTEGER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.BIG_INTEGER;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum INTEGER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INTEGER;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum LONG = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.LONG;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum SHORT = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.SHORT;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum DECIMAL = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.DECIMAL;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum FLOAT = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.FLOAT;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum DOUBLE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.DOUBLE;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum BOOLEAN = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.BOOLEAN;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum URI = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.URI;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum COUNT = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.COUNT;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum INCLUSIVE_VALUE_RANGE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INCLUSIVE_VALUE_RANGE;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum EXCLUSIVE_VALUE_RANGE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.EXCLUSIVE_VALUE_RANGE;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum INCREMENTAL = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INCREMENTAL;
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
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum MONTH = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.MONTH;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum MONTH_DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.MONTH_DAY;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.DAY;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum TIME = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.TIME;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum DURATION = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.DURATION;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum GEOSPATIAL_INFORMATION = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.GEOSPATIAL_INFORMATION;
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum XHTML = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.XHTML;

    int INT_STRING = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_STRING;
    int INT_ALPHA = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_ALPHA;
    int INT_ALPHA_NUMERIC = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_ALPHA_NUMERIC;
    int INT_NUMERIC = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_NUMERIC;
    int INT_BIG_INTEGER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_BIG_INTEGER;
    int INT_INTEGER = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_INTEGER;
    int INT_LONG = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_LONG;
    int INT_SHORT = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_SHORT;
    int INT_DECIMAL = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_DECIMAL;
    int INT_FLOAT = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_FLOAT;
    int INT_DOUBLE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_DOUBLE;
    int INT_BOOLEAN = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_BOOLEAN;
    int INT_URI = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_URI;
    int INT_COUNT = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_COUNT;
    int INT_INCLUSIVE_VALUE_RANGE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_INCLUSIVE_VALUE_RANGE;
    int INT_EXCLUSIVE_VALUE_RANGE = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_EXCLUSIVE_VALUE_RANGE;
    int INT_INCREMENTAL = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_INCREMENTAL;
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
    int INT_MONTH = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_MONTH;
    int INT_MONTH_DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_MONTH_DAY;
    int INT_DAY = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_DAY;
    int INT_TIME = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_TIME;
    int INT_DURATION = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_DURATION;
    int INT_GEOSPATIAL_INFORMATION = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_GEOSPATIAL_INFORMATION;
    int INT_XHTML = org.sdmx.resources.sdmxml.schemas.v30.common.DataType.INT_XHTML;
}
