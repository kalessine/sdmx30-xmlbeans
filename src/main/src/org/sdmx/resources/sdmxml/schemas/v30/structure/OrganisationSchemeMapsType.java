/*
 * XML Type:  OrganisationSchemeMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML OrganisationSchemeMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface OrganisationSchemeMapsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "organisationschememapstype457etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "OrganisationSchemeMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType> getOrganisationSchemeMapList();

    /**
     * Gets array of all "OrganisationSchemeMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType[] getOrganisationSchemeMapArray();

    /**
     * Gets ith "OrganisationSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType getOrganisationSchemeMapArray(int i);

    /**
     * Returns number of "OrganisationSchemeMap" element
     */
    int sizeOfOrganisationSchemeMapArray();

    /**
     * Sets ith "OrganisationSchemeMap" element
     */
    void setOrganisationSchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType organisationSchemeMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType insertNewOrganisationSchemeMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType addNewOrganisationSchemeMap();

    /**
     * Removes the ith "OrganisationSchemeMap" element
     */
    void removeOrganisationSchemeMap(int i);
}
