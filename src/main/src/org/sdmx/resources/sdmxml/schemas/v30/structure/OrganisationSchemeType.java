/*
 * XML Type:  OrganisationSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML OrganisationSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface OrganisationSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeBaseType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "organisationschemetypef6c7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Organisation" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType> getOrganisationList();

    /**
     * Gets array of all "Organisation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType[] getOrganisationArray();

    /**
     * Gets ith "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType getOrganisationArray(int i);

    /**
     * Returns number of "Organisation" element
     */
    int sizeOfOrganisationArray();

    /**
     * Sets ith "Organisation" element
     */
    void setOrganisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType organisation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType insertNewOrganisation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType addNewOrganisation();

    /**
     * Removes the ith "Organisation" element
     */
    void removeOrganisation(int i);
}
