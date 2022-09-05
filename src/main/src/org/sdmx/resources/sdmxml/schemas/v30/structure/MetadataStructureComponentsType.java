/*
 * XML Type:  MetadataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataStructureComponentsType extends org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadatastructurecomponentstype3e70type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataAttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType getMetadataAttributeList();

    /**
     * Sets the "MetadataAttributeList" element
     */
    void setMetadataAttributeList(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType metadataAttributeList);

    /**
     * Appends and returns a new empty "MetadataAttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListType addNewMetadataAttributeList();
}
