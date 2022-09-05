/*
 * An XML document type.
 * Localname: MetadataAttributeList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MetadataAttributeList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface MetadataAttributeListDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeListDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributelist8177doctype");
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
