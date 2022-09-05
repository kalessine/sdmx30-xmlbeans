/*
 * An XML document type.
 * Localname: GeoRefCode
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one GeoRefCode(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface GeoRefCodeDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.CodeDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "georefcode5aeddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GeoRefCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType getGeoRefCode();

    /**
     * Sets the "GeoRefCode" element
     */
    void setGeoRefCode(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType geoRefCode);

    /**
     * Appends and returns a new empty "GeoRefCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType addNewGeoRefCode();
}
