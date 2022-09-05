/*
 * XML Type:  VtlMappingSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VtlMappingSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface VtlMappingSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "vtlmappingschemetypebf2dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "VtlMapping" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType> getVtlMappingList();

    /**
     * Gets array of all "VtlMapping" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType[] getVtlMappingArray();

    /**
     * Gets ith "VtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType getVtlMappingArray(int i);

    /**
     * Returns number of "VtlMapping" element
     */
    int sizeOfVtlMappingArray();

    /**
     * Sets ith "VtlMapping" element
     */
    void setVtlMappingArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType vtlMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType insertNewVtlMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType addNewVtlMapping();

    /**
     * Removes the ith "VtlMapping" element
     */
    void removeVtlMapping(int i);
}
