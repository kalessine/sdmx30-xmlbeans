/*
 * An XML document type.
 * Localname: GeoGridCode
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one GeoGridCode(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface GeoGridCodeDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geogridcodeed10doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GeoGridCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType getGeoGridCode();

    /**
     * Sets the "GeoGridCode" element
     */
    void setGeoGridCode(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType geoGridCode);

    /**
     * Appends and returns a new empty "GeoGridCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType addNewGeoGridCode();
}
