/*
 * XML Type:  QueryTypeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QueryTypeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType.
 */
public interface QueryTypeType extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "querytypetype27f8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum DATA_SETS = Enum.forString("DataSets");
    Enum METADATA_SETS = Enum.forString("MetadataSets");
    Enum ALL_SETS = Enum.forString("AllSets");

    int INT_DATA_SETS = Enum.INT_DATA_SETS;
    int INT_METADATA_SETS = Enum.INT_METADATA_SETS;
    int INT_ALL_SETS = Enum.INT_ALL_SETS;

    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DATA_SETS
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

        static final int INT_DATA_SETS = 1;
        static final int INT_METADATA_SETS = 2;
        static final int INT_ALL_SETS = 3;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("DataSets", INT_DATA_SETS),
            new Enum("MetadataSets", INT_METADATA_SETS),
            new Enum("AllSets", INT_ALL_SETS),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
