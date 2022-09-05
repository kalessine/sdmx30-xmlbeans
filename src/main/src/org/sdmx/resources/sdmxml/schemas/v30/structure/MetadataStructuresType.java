/*
 * XML Type:  MetadataStructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataStructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataStructuresType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadatastructurestypec997type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataStructure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType> getMetadataStructureList();

    /**
     * Gets array of all "MetadataStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType[] getMetadataStructureArray();

    /**
     * Gets ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType getMetadataStructureArray(int i);

    /**
     * Returns number of "MetadataStructure" element
     */
    int sizeOfMetadataStructureArray();

    /**
     * Sets ith "MetadataStructure" element
     */
    void setMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType metadataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType insertNewMetadataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType addNewMetadataStructure();

    /**
     * Removes the ith "MetadataStructure" element
     */
    void removeMetadataStructure(int i);
}
