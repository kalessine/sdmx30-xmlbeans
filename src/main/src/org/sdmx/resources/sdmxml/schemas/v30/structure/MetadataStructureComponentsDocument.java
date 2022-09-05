/*
 * An XML document type.
 * Localname: MetadataStructureComponents
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MetadataStructureComponents(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface MetadataStructureComponentsDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadatastructurecomponents2e86doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType getMetadataStructureComponents();

    /**
     * Sets the "MetadataStructureComponents" element
     */
    void setMetadataStructureComponents(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType metadataStructureComponents);

    /**
     * Appends and returns a new empty "MetadataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureComponentsType addNewMetadataStructureComponents();
}
