/*
 * An XML attribute type.
 * Localname: space
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.w3.xml.x1998.namespace.SpaceAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.xml.x1998.namespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one space(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public interface SpaceAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.w3.xml.x1998.namespace.SpaceAttribute> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "space9344attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "space" attribute
     */
    org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum getSpace();

    /**
     * Gets (as xml) the "space" attribute
     */
    org.w3.xml.x1998.namespace.SpaceAttribute.Space xgetSpace();

    /**
     * True if has "space" attribute
     */
    boolean isSetSpace();

    /**
     * Sets the "space" attribute
     */
    void setSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum space);

    /**
     * Sets (as xml) the "space" attribute
     */
    void xsetSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space space);

    /**
     * Unsets the "space" attribute
     */
    void unsetSpace();

    /**
     * An XML space(@http://www.w3.org/XML/1998/namespace).
     *
     * This is an atomic type that is a restriction of org.w3.xml.x1998.namespace.SpaceAttribute$Space.
     */
    public interface Space extends org.apache.xmlbeans.XmlNCName {
        ElementFactory<org.w3.xml.x1998.namespace.SpaceAttribute.Space> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "spaceb986attrtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
        void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

        Enum DEFAULT = Enum.forString("default");
        Enum PRESERVE = Enum.forString("preserve");

        int INT_DEFAULT = Enum.INT_DEFAULT;
        int INT_PRESERVE = Enum.INT_PRESERVE;

        /**
         * Enumeration value class for org.w3.xml.x1998.namespace.SpaceAttribute$Space.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_DEFAULT
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

            static final int INT_DEFAULT = 1;
            static final int INT_PRESERVE = 2;

            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                new Enum("default", INT_DEFAULT),
                new Enum("preserve", INT_PRESERVE),
            });
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() {
                return forInt(intValue());
            }
        }
    }
}
