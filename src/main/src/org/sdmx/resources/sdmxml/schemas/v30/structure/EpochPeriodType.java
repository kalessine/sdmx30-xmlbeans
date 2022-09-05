/*
 * XML Type:  EpochPeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML EpochPeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType.
 */
public interface EpochPeriodType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "epochperiodtypedee0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum NANOSECOND = Enum.forString("nanosecond");
    Enum MILLISECOND = Enum.forString("millisecond");
    Enum MICROSECOND = Enum.forString("microsecond");
    Enum SECOND = Enum.forString("second");
    Enum DAY = Enum.forString("day");

    int INT_NANOSECOND = Enum.INT_NANOSECOND;
    int INT_MILLISECOND = Enum.INT_MILLISECOND;
    int INT_MICROSECOND = Enum.INT_MICROSECOND;
    int INT_SECOND = Enum.INT_SECOND;
    int INT_DAY = Enum.INT_DAY;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NANOSECOND
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

        static final int INT_NANOSECOND = 1;
        static final int INT_MILLISECOND = 2;
        static final int INT_MICROSECOND = 3;
        static final int INT_SECOND = 4;
        static final int INT_DAY = 5;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("nanosecond", INT_NANOSECOND),
            new Enum("millisecond", INT_MILLISECOND),
            new Enum("microsecond", INT_MICROSECOND),
            new Enum("second", INT_SECOND),
            new Enum("day", INT_DAY),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
