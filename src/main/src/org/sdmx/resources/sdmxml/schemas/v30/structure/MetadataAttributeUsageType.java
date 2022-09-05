/*
 * XML Type:  MetadataAttributeUsageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataAttributeUsageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataAttributeUsageType extends org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributeusagetype989ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataAttributeReference" element
     */
    java.lang.String getMetadataAttributeReference();

    /**
     * Gets (as xml) the "MetadataAttributeReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetMetadataAttributeReference();

    /**
     * Sets the "MetadataAttributeReference" element
     */
    void setMetadataAttributeReference(java.lang.String metadataAttributeReference);

    /**
     * Sets (as xml) the "MetadataAttributeReference" element
     */
    void xsetMetadataAttributeReference(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType metadataAttributeReference);

    /**
     * Gets the "AttributeRelationship" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType getAttributeRelationship();

    /**
     * Sets the "AttributeRelationship" element
     */
    void setAttributeRelationship(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType attributeRelationship);

    /**
     * Appends and returns a new empty "AttributeRelationship" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType addNewAttributeRelationship();
}
