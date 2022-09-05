/*
 * XML Type:  AgencySchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AgencySchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface AgencySchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "agencyschemestypeb51ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "AgencyScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType> getAgencySchemeList();

    /**
     * Gets array of all "AgencyScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType[] getAgencySchemeArray();

    /**
     * Gets ith "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType getAgencySchemeArray(int i);

    /**
     * Returns number of "AgencyScheme" element
     */
    int sizeOfAgencySchemeArray();

    /**
     * Sets ith "AgencyScheme" element
     */
    void setAgencySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType agencyScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType insertNewAgencyScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType addNewAgencyScheme();

    /**
     * Removes the ith "AgencyScheme" element
     */
    void removeAgencyScheme(int i);
}
