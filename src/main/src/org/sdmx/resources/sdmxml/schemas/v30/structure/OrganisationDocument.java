/*
 * An XML document type.
 * Localname: Organisation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Organisation(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface OrganisationDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "organisation9a78doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType getOrganisation();

    /**
     * Sets the "Organisation" element
     */
    void setOrganisation(org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType organisation);

    /**
     * Appends and returns a new empty "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType addNewOrganisation();
}
