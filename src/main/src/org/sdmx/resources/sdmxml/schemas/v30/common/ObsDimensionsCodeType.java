/*
 * XML Type:  ObsDimensionsCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.ObsDimensionsCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ObsDimensionsCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.common.ObsDimensionsCodeType.
 */
public interface ObsDimensionsCodeType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.common.ObsDimensionsCodeType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "obsdimensionscodetypee60etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum ALL_DIMENSIONS = Enum.forString("AllDimensions");
    Enum TIME_PERIOD = Enum.forString("TIME_PERIOD");

    int INT_ALL_DIMENSIONS = Enum.INT_ALL_DIMENSIONS;
    int INT_TIME_PERIOD = Enum.INT_TIME_PERIOD;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.common.ObsDimensionsCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ALL_DIMENSIONS
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

        static final int INT_ALL_DIMENSIONS = 1;
        static final int INT_TIME_PERIOD = 2;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("AllDimensions", INT_ALL_DIMENSIONS),
            new Enum("TIME_PERIOD", INT_TIME_PERIOD),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
