/*
 * An XML document type.
 * Localname: MetadataProvider
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MetadataProvider(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface MetadataProviderDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataproviderde5edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType getMetadataProvider();

    /**
     * Sets the "MetadataProvider" element
     */
    void setMetadataProvider(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType metadataProvider);

    /**
     * Appends and returns a new empty "MetadataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType addNewMetadataProvider();
}
