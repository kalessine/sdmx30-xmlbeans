/*
 * An XML document type.
 * Localname: OrganisationUnit
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one OrganisationUnit(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface OrganisationUnitDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "organisationunit489cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "OrganisationUnit" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType getOrganisationUnit();

    /**
     * Sets the "OrganisationUnit" element
     */
    void setOrganisationUnit(org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType organisationUnit);

    /**
     * Appends and returns a new empty "OrganisationUnit" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType addNewOrganisationUnit();
}
