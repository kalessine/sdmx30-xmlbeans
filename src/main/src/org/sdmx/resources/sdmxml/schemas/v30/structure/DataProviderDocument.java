/*
 * An XML document type.
 * Localname: DataProvider
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataProvider(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface DataProviderDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataproviderb9d9doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType getDataProvider();

    /**
     * Sets the "DataProvider" element
     */
    void setDataProvider(org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType dataProvider);

    /**
     * Appends and returns a new empty "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType addNewDataProvider();
}
