/*
 * XML Type:  NamePersonalisationSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML NamePersonalisationSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface NamePersonalisationSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "namepersonalisationschemetype007btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "NamePersonalisation" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType> getNamePersonalisationList();

    /**
     * Gets array of all "NamePersonalisation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType[] getNamePersonalisationArray();

    /**
     * Gets ith "NamePersonalisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType getNamePersonalisationArray(int i);

    /**
     * Returns number of "NamePersonalisation" element
     */
    int sizeOfNamePersonalisationArray();

    /**
     * Sets ith "NamePersonalisation" element
     */
    void setNamePersonalisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType namePersonalisation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NamePersonalisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType insertNewNamePersonalisation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "NamePersonalisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType addNewNamePersonalisation();

    /**
     * Removes the ith "NamePersonalisation" element
     */
    void removeNamePersonalisation(int i);
}
