/*
 * XML Type:  DataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.DataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.common.DataType.
 */
public interface DataType extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.common.DataType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datatype18actype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum STRING = Enum.forString("String");
    Enum ALPHA = Enum.forString("Alpha");
    Enum ALPHA_NUMERIC = Enum.forString("AlphaNumeric");
    Enum NUMERIC = Enum.forString("Numeric");
    Enum BIG_INTEGER = Enum.forString("BigInteger");
    Enum INTEGER = Enum.forString("Integer");
    Enum LONG = Enum.forString("Long");
    Enum SHORT = Enum.forString("Short");
    Enum DECIMAL = Enum.forString("Decimal");
    Enum FLOAT = Enum.forString("Float");
    Enum DOUBLE = Enum.forString("Double");
    Enum BOOLEAN = Enum.forString("Boolean");
    Enum URI = Enum.forString("URI");
    Enum COUNT = Enum.forString("Count");
    Enum INCLUSIVE_VALUE_RANGE = Enum.forString("InclusiveValueRange");
    Enum EXCLUSIVE_VALUE_RANGE = Enum.forString("ExclusiveValueRange");
    Enum INCREMENTAL = Enum.forString("Incremental");
    Enum OBSERVATIONAL_TIME_PERIOD = Enum.forString("ObservationalTimePeriod");
    Enum STANDARD_TIME_PERIOD = Enum.forString("StandardTimePeriod");
    Enum BASIC_TIME_PERIOD = Enum.forString("BasicTimePeriod");
    Enum GREGORIAN_TIME_PERIOD = Enum.forString("GregorianTimePeriod");
    Enum GREGORIAN_YEAR = Enum.forString("GregorianYear");
    Enum GREGORIAN_YEAR_MONTH = Enum.forString("GregorianYearMonth");
    Enum GREGORIAN_DAY = Enum.forString("GregorianDay");
    Enum REPORTING_TIME_PERIOD = Enum.forString("ReportingTimePeriod");
    Enum REPORTING_YEAR = Enum.forString("ReportingYear");
    Enum REPORTING_SEMESTER = Enum.forString("ReportingSemester");
    Enum REPORTING_TRIMESTER = Enum.forString("ReportingTrimester");
    Enum REPORTING_QUARTER = Enum.forString("ReportingQuarter");
    Enum REPORTING_MONTH = Enum.forString("ReportingMonth");
    Enum REPORTING_WEEK = Enum.forString("ReportingWeek");
    Enum REPORTING_DAY = Enum.forString("ReportingDay");
    Enum DATE_TIME = Enum.forString("DateTime");
    Enum TIME_RANGE = Enum.forString("TimeRange");
    Enum MONTH = Enum.forString("Month");
    Enum MONTH_DAY = Enum.forString("MonthDay");
    Enum DAY = Enum.forString("Day");
    Enum TIME = Enum.forString("Time");
    Enum DURATION = Enum.forString("Duration");
    Enum GEOSPATIAL_INFORMATION = Enum.forString("GeospatialInformation");
    Enum XHTML = Enum.forString("XHTML");
    Enum KEY_VALUES = Enum.forString("KeyValues");
    Enum IDENTIFIABLE_REFERENCE = Enum.forString("IdentifiableReference");
    Enum DATA_SET_REFERENCE = Enum.forString("DataSetReference");

    int INT_STRING = Enum.INT_STRING;
    int INT_ALPHA = Enum.INT_ALPHA;
    int INT_ALPHA_NUMERIC = Enum.INT_ALPHA_NUMERIC;
    int INT_NUMERIC = Enum.INT_NUMERIC;
    int INT_BIG_INTEGER = Enum.INT_BIG_INTEGER;
    int INT_INTEGER = Enum.INT_INTEGER;
    int INT_LONG = Enum.INT_LONG;
    int INT_SHORT = Enum.INT_SHORT;
    int INT_DECIMAL = Enum.INT_DECIMAL;
    int INT_FLOAT = Enum.INT_FLOAT;
    int INT_DOUBLE = Enum.INT_DOUBLE;
    int INT_BOOLEAN = Enum.INT_BOOLEAN;
    int INT_URI = Enum.INT_URI;
    int INT_COUNT = Enum.INT_COUNT;
    int INT_INCLUSIVE_VALUE_RANGE = Enum.INT_INCLUSIVE_VALUE_RANGE;
    int INT_EXCLUSIVE_VALUE_RANGE = Enum.INT_EXCLUSIVE_VALUE_RANGE;
    int INT_INCREMENTAL = Enum.INT_INCREMENTAL;
    int INT_OBSERVATIONAL_TIME_PERIOD = Enum.INT_OBSERVATIONAL_TIME_PERIOD;
    int INT_STANDARD_TIME_PERIOD = Enum.INT_STANDARD_TIME_PERIOD;
    int INT_BASIC_TIME_PERIOD = Enum.INT_BASIC_TIME_PERIOD;
    int INT_GREGORIAN_TIME_PERIOD = Enum.INT_GREGORIAN_TIME_PERIOD;
    int INT_GREGORIAN_YEAR = Enum.INT_GREGORIAN_YEAR;
    int INT_GREGORIAN_YEAR_MONTH = Enum.INT_GREGORIAN_YEAR_MONTH;
    int INT_GREGORIAN_DAY = Enum.INT_GREGORIAN_DAY;
    int INT_REPORTING_TIME_PERIOD = Enum.INT_REPORTING_TIME_PERIOD;
    int INT_REPORTING_YEAR = Enum.INT_REPORTING_YEAR;
    int INT_REPORTING_SEMESTER = Enum.INT_REPORTING_SEMESTER;
    int INT_REPORTING_TRIMESTER = Enum.INT_REPORTING_TRIMESTER;
    int INT_REPORTING_QUARTER = Enum.INT_REPORTING_QUARTER;
    int INT_REPORTING_MONTH = Enum.INT_REPORTING_MONTH;
    int INT_REPORTING_WEEK = Enum.INT_REPORTING_WEEK;
    int INT_REPORTING_DAY = Enum.INT_REPORTING_DAY;
    int INT_DATE_TIME = Enum.INT_DATE_TIME;
    int INT_TIME_RANGE = Enum.INT_TIME_RANGE;
    int INT_MONTH = Enum.INT_MONTH;
    int INT_MONTH_DAY = Enum.INT_MONTH_DAY;
    int INT_DAY = Enum.INT_DAY;
    int INT_TIME = Enum.INT_TIME;
    int INT_DURATION = Enum.INT_DURATION;
    int INT_GEOSPATIAL_INFORMATION = Enum.INT_GEOSPATIAL_INFORMATION;
    int INT_XHTML = Enum.INT_XHTML;
    int INT_KEY_VALUES = Enum.INT_KEY_VALUES;
    int INT_IDENTIFIABLE_REFERENCE = Enum.INT_IDENTIFIABLE_REFERENCE;
    int INT_DATA_SET_REFERENCE = Enum.INT_DATA_SET_REFERENCE;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.common.DataType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_STRING
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s) {
            return (Enum)table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum)table.forInt(i);
        }

        private Enum(java.lang.String s, int i) {
            super(s, i);
        }

        static final int INT_STRING = 1;
        static final int INT_ALPHA = 2;
        static final int INT_ALPHA_NUMERIC = 3;
        static final int INT_NUMERIC = 4;
        static final int INT_BIG_INTEGER = 5;
        static final int INT_INTEGER = 6;
        static final int INT_LONG = 7;
        static final int INT_SHORT = 8;
        static final int INT_DECIMAL = 9;
        static final int INT_FLOAT = 10;
        static final int INT_DOUBLE = 11;
        static final int INT_BOOLEAN = 12;
        static final int INT_URI = 13;
        static final int INT_COUNT = 14;
        static final int INT_INCLUSIVE_VALUE_RANGE = 15;
        static final int INT_EXCLUSIVE_VALUE_RANGE = 16;
        static final int INT_INCREMENTAL = 17;
        static final int INT_OBSERVATIONAL_TIME_PERIOD = 18;
        static final int INT_STANDARD_TIME_PERIOD = 19;
        static final int INT_BASIC_TIME_PERIOD = 20;
        static final int INT_GREGORIAN_TIME_PERIOD = 21;
        static final int INT_GREGORIAN_YEAR = 22;
        static final int INT_GREGORIAN_YEAR_MONTH = 23;
        static final int INT_GREGORIAN_DAY = 24;
        static final int INT_REPORTING_TIME_PERIOD = 25;
        static final int INT_REPORTING_YEAR = 26;
        static final int INT_REPORTING_SEMESTER = 27;
        static final int INT_REPORTING_TRIMESTER = 28;
        static final int INT_REPORTING_QUARTER = 29;
        static final int INT_REPORTING_MONTH = 30;
        static final int INT_REPORTING_WEEK = 31;
        static final int INT_REPORTING_DAY = 32;
        static final int INT_DATE_TIME = 33;
        static final int INT_TIME_RANGE = 34;
        static final int INT_MONTH = 35;
        static final int INT_MONTH_DAY = 36;
        static final int INT_DAY = 37;
        static final int INT_TIME = 38;
        static final int INT_DURATION = 39;
        static final int INT_GEOSPATIAL_INFORMATION = 40;
        static final int INT_XHTML = 41;
        static final int INT_KEY_VALUES = 42;
        static final int INT_IDENTIFIABLE_REFERENCE = 43;
        static final int INT_DATA_SET_REFERENCE = 44;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("String", INT_STRING),
            new Enum("Alpha", INT_ALPHA),
            new Enum("AlphaNumeric", INT_ALPHA_NUMERIC),
            new Enum("Numeric", INT_NUMERIC),
            new Enum("BigInteger", INT_BIG_INTEGER),
            new Enum("Integer", INT_INTEGER),
            new Enum("Long", INT_LONG),
            new Enum("Short", INT_SHORT),
            new Enum("Decimal", INT_DECIMAL),
            new Enum("Float", INT_FLOAT),
            new Enum("Double", INT_DOUBLE),
            new Enum("Boolean", INT_BOOLEAN),
            new Enum("URI", INT_URI),
            new Enum("Count", INT_COUNT),
            new Enum("InclusiveValueRange", INT_INCLUSIVE_VALUE_RANGE),
            new Enum("ExclusiveValueRange", INT_EXCLUSIVE_VALUE_RANGE),
            new Enum("Incremental", INT_INCREMENTAL),
            new Enum("ObservationalTimePeriod", INT_OBSERVATIONAL_TIME_PERIOD),
            new Enum("StandardTimePeriod", INT_STANDARD_TIME_PERIOD),
            new Enum("BasicTimePeriod", INT_BASIC_TIME_PERIOD),
            new Enum("GregorianTimePeriod", INT_GREGORIAN_TIME_PERIOD),
            new Enum("GregorianYear", INT_GREGORIAN_YEAR),
            new Enum("GregorianYearMonth", INT_GREGORIAN_YEAR_MONTH),
            new Enum("GregorianDay", INT_GREGORIAN_DAY),
            new Enum("ReportingTimePeriod", INT_REPORTING_TIME_PERIOD),
            new Enum("ReportingYear", INT_REPORTING_YEAR),
            new Enum("ReportingSemester", INT_REPORTING_SEMESTER),
            new Enum("ReportingTrimester", INT_REPORTING_TRIMESTER),
            new Enum("ReportingQuarter", INT_REPORTING_QUARTER),
            new Enum("ReportingMonth", INT_REPORTING_MONTH),
            new Enum("ReportingWeek", INT_REPORTING_WEEK),
            new Enum("ReportingDay", INT_REPORTING_DAY),
            new Enum("DateTime", INT_DATE_TIME),
            new Enum("TimeRange", INT_TIME_RANGE),
            new Enum("Month", INT_MONTH),
            new Enum("MonthDay", INT_MONTH_DAY),
            new Enum("Day", INT_DAY),
            new Enum("Time", INT_TIME),
            new Enum("Duration", INT_DURATION),
            new Enum("GeospatialInformation", INT_GEOSPATIAL_INFORMATION),
            new Enum("XHTML", INT_XHTML),
            new Enum("KeyValues", INT_KEY_VALUES),
            new Enum("IdentifiableReference", INT_IDENTIFIABLE_REFERENCE),
            new Enum("DataSetReference", INT_DATA_SET_REFERENCE),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
