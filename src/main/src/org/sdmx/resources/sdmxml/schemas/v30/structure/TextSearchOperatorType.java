/*
 * XML Type:  TextSearchOperatorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TextSearchOperatorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TextSearchOperatorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.TextSearchOperatorType.
 */
public interface TextSearchOperatorType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TextSearchOperatorType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "textsearchoperatortype58a1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum CONTAINS = Enum.forString("contains");
    Enum STARTS_WITH = Enum.forString("startsWith");
    Enum ENDS_WITH = Enum.forString("endsWith");
    Enum DOES_NOT_CONTAIN = Enum.forString("doesNotContain");
    Enum DOES_NOT_START_WITH = Enum.forString("doesNotStartWith");
    Enum DOES_NOT_END_WITH = Enum.forString("doesNotEndWith");

    int INT_CONTAINS = Enum.INT_CONTAINS;
    int INT_STARTS_WITH = Enum.INT_STARTS_WITH;
    int INT_ENDS_WITH = Enum.INT_ENDS_WITH;
    int INT_DOES_NOT_CONTAIN = Enum.INT_DOES_NOT_CONTAIN;
    int INT_DOES_NOT_START_WITH = Enum.INT_DOES_NOT_START_WITH;
    int INT_DOES_NOT_END_WITH = Enum.INT_DOES_NOT_END_WITH;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.structure.TextSearchOperatorType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CONTAINS
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

        static final int INT_CONTAINS = 1;
        static final int INT_STARTS_WITH = 2;
        static final int INT_ENDS_WITH = 3;
        static final int INT_DOES_NOT_CONTAIN = 4;
        static final int INT_DOES_NOT_START_WITH = 5;
        static final int INT_DOES_NOT_END_WITH = 6;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("contains", INT_CONTAINS),
            new Enum("startsWith", INT_STARTS_WITH),
            new Enum("endsWith", INT_ENDS_WITH),
            new Enum("doesNotContain", INT_DOES_NOT_CONTAIN),
            new Enum("doesNotStartWith", INT_DOES_NOT_START_WITH),
            new Enum("doesNotEndWith", INT_DOES_NOT_END_WITH),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
