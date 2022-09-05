/*
 * XML Type:  MetadataAttributeListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataAttributeListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataAttributeListType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributelisttypefce1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataAttribute" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType> getMetadataAttributeList();

    /**
     * Gets array of all "MetadataAttribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType[] getMetadataAttributeArray();

    /**
     * Gets ith "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType getMetadataAttributeArray(int i);

    /**
     * Returns number of "MetadataAttribute" element
     */
    int sizeOfMetadataAttributeArray();

    /**
     * Sets ith "MetadataAttribute" element
     */
    void setMetadataAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType metadataAttribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType insertNewMetadataAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType addNewMetadataAttribute();

    /**
     * Removes the ith "MetadataAttribute" element
     */
    void removeMetadataAttribute(int i);

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
