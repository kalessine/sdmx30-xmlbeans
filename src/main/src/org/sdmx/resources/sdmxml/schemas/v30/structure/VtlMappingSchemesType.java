/*
 * XML Type:  VtlMappingSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VtlMappingSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface VtlMappingSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "vtlmappingschemestype65c4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "VtlMappingScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType> getVtlMappingSchemeList();

    /**
     * Gets array of all "VtlMappingScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType[] getVtlMappingSchemeArray();

    /**
     * Gets ith "VtlMappingScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType getVtlMappingSchemeArray(int i);

    /**
     * Returns number of "VtlMappingScheme" element
     */
    int sizeOfVtlMappingSchemeArray();

    /**
     * Sets ith "VtlMappingScheme" element
     */
    void setVtlMappingSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType vtlMappingScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VtlMappingScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType insertNewVtlMappingScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VtlMappingScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType addNewVtlMappingScheme();

    /**
     * Removes the ith "VtlMappingScheme" element
     */
    void removeVtlMappingScheme(int i);
}
