/*
 * XML Type:  StandardToVtlMappingMethodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StandardToVtlMappingMethodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StandardToVtlMappingMethodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.StandardToVtlMappingMethodType.
 */
public interface StandardToVtlMappingMethodType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.StandardToVtlMappingMethodType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "standardtovtlmappingmethodtypee561type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum BASIC = Enum.forString("Basic");
    Enum PIVOT = Enum.forString("Pivot");
    Enum BASIC_A_2_M = Enum.forString("Basic-A2M");
    Enum PIVOT_A_2_M = Enum.forString("Pivot-A2M");

    int INT_BASIC = Enum.INT_BASIC;
    int INT_PIVOT = Enum.INT_PIVOT;
    int INT_BASIC_A_2_M = Enum.INT_BASIC_A_2_M;
    int INT_PIVOT_A_2_M = Enum.INT_PIVOT_A_2_M;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.structure.StandardToVtlMappingMethodType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BASIC
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

        static final int INT_BASIC = 1;
        static final int INT_PIVOT = 2;
        static final int INT_BASIC_A_2_M = 3;
        static final int INT_PIVOT_A_2_M = 4;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Basic", INT_BASIC),
            new Enum("Pivot", INT_PIVOT),
            new Enum("Basic-A2M", INT_BASIC_A_2_M),
            new Enum("Pivot-A2M", INT_PIVOT_A_2_M),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
