/*
 * XML Type:  MetadataProviderSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataProviderSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataProviderSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataproviderschemetype9b2dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataProvider" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType> getMetadataProviderList();

    /**
     * Gets array of all "MetadataProvider" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType[] getMetadataProviderArray();

    /**
     * Gets ith "MetadataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType getMetadataProviderArray(int i);

    /**
     * Returns number of "MetadataProvider" element
     */
    int sizeOfMetadataProviderArray();

    /**
     * Sets ith "MetadataProvider" element
     */
    void setMetadataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType metadataProvider);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType insertNewMetadataProvider(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType addNewMetadataProvider();

    /**
     * Removes the ith "MetadataProvider" element
     */
    void removeMetadataProvider(int i);

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
