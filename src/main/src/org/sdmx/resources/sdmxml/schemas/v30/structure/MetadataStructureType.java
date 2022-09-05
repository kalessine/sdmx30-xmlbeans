/*
 * XML Type:  MetadataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataStructureType extends org.sdmx.resources.sdmxml.schemas.v30.structure.StructureType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadatastructuretype14fatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType getMetadataStructureComponents();

    /**
     * True if has "MetadataStructureComponents" element
     */
    boolean isSetMetadataStructureComponents();

    /**
     * Sets the "MetadataStructureComponents" element
     */
    void setMetadataStructureComponents(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType metadataStructureComponents);

    /**
     * Appends and returns a new empty "MetadataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType addNewMetadataStructureComponents();

    /**
     * Unsets the "MetadataStructureComponents" element
     */
    void unsetMetadataStructureComponents();
}
