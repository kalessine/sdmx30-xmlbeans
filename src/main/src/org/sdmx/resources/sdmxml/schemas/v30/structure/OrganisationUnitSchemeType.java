/*
 * XML Type:  OrganisationUnitSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML OrganisationUnitSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface OrganisationUnitSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "organisationunitschemetypecfebtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "OrganisationUnit" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType> getOrganisationUnitList();

    /**
     * Gets array of all "OrganisationUnit" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType[] getOrganisationUnitArray();

    /**
     * Gets ith "OrganisationUnit" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType getOrganisationUnitArray(int i);

    /**
     * Returns number of "OrganisationUnit" element
     */
    int sizeOfOrganisationUnitArray();

    /**
     * Sets ith "OrganisationUnit" element
     */
    void setOrganisationUnitArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType organisationUnit);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnit" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType insertNewOrganisationUnit(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnit" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType addNewOrganisationUnit();

    /**
     * Removes the ith "OrganisationUnit" element
     */
    void removeOrganisationUnit(int i);
}
