/*
 * XML Type:  OrganisationUnitSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML OrganisationUnitSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface OrganisationUnitSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "organisationunitschemestype6cc6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "OrganisationUnitScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType> getOrganisationUnitSchemeList();

    /**
     * Gets array of all "OrganisationUnitScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType[] getOrganisationUnitSchemeArray();

    /**
     * Gets ith "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType getOrganisationUnitSchemeArray(int i);

    /**
     * Returns number of "OrganisationUnitScheme" element
     */
    int sizeOfOrganisationUnitSchemeArray();

    /**
     * Sets ith "OrganisationUnitScheme" element
     */
    void setOrganisationUnitSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType organisationUnitScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType insertNewOrganisationUnitScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType addNewOrganisationUnitScheme();

    /**
     * Removes the ith "OrganisationUnitScheme" element
     */
    void removeOrganisationUnitScheme(int i);
}
