/*
 * XML Type:  ActionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.ActionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ActionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.
 */
public interface ActionType extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.common.ActionType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "actiontype0be0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum APPEND = Enum.forString("Append");
    Enum REPLACE = Enum.forString("Replace");
    Enum DELETE = Enum.forString("Delete");
    Enum INFORMATION = Enum.forString("Information");

    int INT_APPEND = Enum.INT_APPEND;
    int INT_REPLACE = Enum.INT_REPLACE;
    int INT_DELETE = Enum.INT_DELETE;
    int INT_INFORMATION = Enum.INT_INFORMATION;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_APPEND
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

        static final int INT_APPEND = 1;
        static final int INT_REPLACE = 2;
        static final int INT_DELETE = 3;
        static final int INT_INFORMATION = 4;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Append", INT_APPEND),
            new Enum("Replace", INT_REPLACE),
            new Enum("Delete", INT_DELETE),
            new Enum("Information", INT_INFORMATION),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
