/*
 * XML Type:  CustomTypeSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CustomTypeSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CustomTypeSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "customtypeschemetypec1b8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CustomType" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType> getCustomTypeList();

    /**
     * Gets array of all "CustomType" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType[] getCustomTypeArray();

    /**
     * Gets ith "CustomType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType getCustomTypeArray(int i);

    /**
     * Returns number of "CustomType" element
     */
    int sizeOfCustomTypeArray();

    /**
     * Sets ith "CustomType" element
     */
    void setCustomTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType customType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CustomType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType insertNewCustomType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CustomType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType addNewCustomType();

    /**
     * Removes the ith "CustomType" element
     */
    void removeCustomType(int i);
}
