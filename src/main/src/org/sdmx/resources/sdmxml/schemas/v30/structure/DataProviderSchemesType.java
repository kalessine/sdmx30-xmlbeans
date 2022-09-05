/*
 * XML Type:  DataProviderSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataProviderSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataProviderSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataproviderschemestype4b69type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataProviderScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType> getDataProviderSchemeList();

    /**
     * Gets array of all "DataProviderScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType[] getDataProviderSchemeArray();

    /**
     * Gets ith "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType getDataProviderSchemeArray(int i);

    /**
     * Returns number of "DataProviderScheme" element
     */
    int sizeOfDataProviderSchemeArray();

    /**
     * Sets ith "DataProviderScheme" element
     */
    void setDataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType dataProviderScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType insertNewDataProviderScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType addNewDataProviderScheme();

    /**
     * Removes the ith "DataProviderScheme" element
     */
    void removeDataProviderScheme(int i);
}
