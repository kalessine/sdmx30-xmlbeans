/*
 * XML Type:  DataProviderSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataProviderSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataProviderSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataproviderschemetype10e8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataProvider" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType> getDataProviderList();

    /**
     * Gets array of all "DataProvider" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType[] getDataProviderArray();

    /**
     * Gets ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType getDataProviderArray(int i);

    /**
     * Returns number of "DataProvider" element
     */
    int sizeOfDataProviderArray();

    /**
     * Sets ith "DataProvider" element
     */
    void setDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType dataProvider);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType insertNewDataProvider(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType addNewDataProvider();

    /**
     * Removes the ith "DataProvider" element
     */
    void removeDataProvider(int i);

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
