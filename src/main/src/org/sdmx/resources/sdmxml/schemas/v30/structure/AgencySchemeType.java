/*
 * XML Type:  AgencySchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AgencySchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface AgencySchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "agencyschemetype9872type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Agency" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType> getAgencyList();

    /**
     * Gets array of all "Agency" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType[] getAgencyArray();

    /**
     * Gets ith "Agency" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType getAgencyArray(int i);

    /**
     * Returns number of "Agency" element
     */
    int sizeOfAgencyArray();

    /**
     * Sets ith "Agency" element
     */
    void setAgencyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType agency);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Agency" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType insertNewAgency(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Agency" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType addNewAgency();

    /**
     * Removes the ith "Agency" element
     */
    void removeAgency(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();
}
