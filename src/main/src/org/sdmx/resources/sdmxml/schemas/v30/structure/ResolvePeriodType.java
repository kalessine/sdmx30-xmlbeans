/*
 * XML Type:  ResolvePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ResolvePeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType.
 */
public interface ResolvePeriodType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "resolveperiodtypefc43type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum START_OF_PERIOD = Enum.forString("startOfPeriod");
    Enum END_OF_PERIOD = Enum.forString("endOfPeriod");
    Enum MID_PERIOD = Enum.forString("midPeriod");

    int INT_START_OF_PERIOD = Enum.INT_START_OF_PERIOD;
    int INT_END_OF_PERIOD = Enum.INT_END_OF_PERIOD;
    int INT_MID_PERIOD = Enum.INT_MID_PERIOD;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.structure.ResolvePeriodType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_START_OF_PERIOD
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

        static final int INT_START_OF_PERIOD = 1;
        static final int INT_END_OF_PERIOD = 2;
        static final int INT_MID_PERIOD = 3;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("startOfPeriod", INT_START_OF_PERIOD),
            new Enum("endOfPeriod", INT_END_OF_PERIOD),
            new Enum("midPeriod", INT_MID_PERIOD),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
