/*
 * XML Type:  NamePersonalisationSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML NamePersonalisationSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface NamePersonalisationSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "namepersonalisationschemestype4e36type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "NamePersonalisationScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType> getNamePersonalisationSchemeList();

    /**
     * Gets array of all "NamePersonalisationScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType[] getNamePersonalisationSchemeArray();

    /**
     * Gets ith "NamePersonalisationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType getNamePersonalisationSchemeArray(int i);

    /**
     * Returns number of "NamePersonalisationScheme" element
     */
    int sizeOfNamePersonalisationSchemeArray();

    /**
     * Sets ith "NamePersonalisationScheme" element
     */
    void setNamePersonalisationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType namePersonalisationScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NamePersonalisationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType insertNewNamePersonalisationScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "NamePersonalisationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType addNewNamePersonalisationScheme();

    /**
     * Removes the ith "NamePersonalisationScheme" element
     */
    void removeNamePersonalisationScheme(int i);
}
