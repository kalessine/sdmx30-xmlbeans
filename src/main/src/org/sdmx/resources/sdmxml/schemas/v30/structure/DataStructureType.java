/*
 * XML Type:  DataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataStructureType extends org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datastructuretypeb65ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Metadata" element
     */
    java.lang.String getMetadata();

    /**
     * Gets (as xml) the "Metadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType xgetMetadata();

    /**
     * True if has "Metadata" element
     */
    boolean isSetMetadata();

    /**
     * Sets the "Metadata" element
     */
    void setMetadata(java.lang.String metadata);

    /**
     * Sets (as xml) the "Metadata" element
     */
    void xsetMetadata(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType metadata);

    /**
     * Unsets the "Metadata" element
     */
    void unsetMetadata();
}
