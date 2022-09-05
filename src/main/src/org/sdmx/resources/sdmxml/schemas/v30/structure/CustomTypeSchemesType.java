/*
 * XML Type:  CustomTypeSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CustomTypeSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CustomTypeSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "customtypeschemestypeb499type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CustomTypeScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType> getCustomTypeSchemeList();

    /**
     * Gets array of all "CustomTypeScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType[] getCustomTypeSchemeArray();

    /**
     * Gets ith "CustomTypeScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType getCustomTypeSchemeArray(int i);

    /**
     * Returns number of "CustomTypeScheme" element
     */
    int sizeOfCustomTypeSchemeArray();

    /**
     * Sets ith "CustomTypeScheme" element
     */
    void setCustomTypeSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType customTypeScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CustomTypeScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType insertNewCustomTypeScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CustomTypeScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemeType addNewCustomTypeScheme();

    /**
     * Removes the ith "CustomTypeScheme" element
     */
    void removeCustomTypeScheme(int i);
}
