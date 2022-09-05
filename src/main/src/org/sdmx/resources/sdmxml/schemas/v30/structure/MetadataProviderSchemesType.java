/*
 * XML Type:  MetadataProviderSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataProviderSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataProviderSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataproviderschemestype09c4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataProviderScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType> getMetadataProviderSchemeList();

    /**
     * Gets array of all "MetadataProviderScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType[] getMetadataProviderSchemeArray();

    /**
     * Gets ith "MetadataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType getMetadataProviderSchemeArray(int i);

    /**
     * Returns number of "MetadataProviderScheme" element
     */
    int sizeOfMetadataProviderSchemeArray();

    /**
     * Sets ith "MetadataProviderScheme" element
     */
    void setMetadataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType metadataProviderScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType insertNewMetadataProviderScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType addNewMetadataProviderScheme();

    /**
     * Removes the ith "MetadataProviderScheme" element
     */
    void removeMetadataProviderScheme(int i);
}
