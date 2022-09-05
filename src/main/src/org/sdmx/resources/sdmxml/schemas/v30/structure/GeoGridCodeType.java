/*
 * XML Type:  GeoGridCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoGridCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeoGridCodeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geogridcodetypec7fatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GeoCell" element
     */
    java.lang.String getGeoCell();

    /**
     * Gets (as xml) the "GeoCell" element
     */
    org.apache.xmlbeans.XmlString xgetGeoCell();

    /**
     * Sets the "GeoCell" element
     */
    void setGeoCell(java.lang.String geoCell);

    /**
     * Sets (as xml) the "GeoCell" element
     */
    void xsetGeoCell(org.apache.xmlbeans.XmlString geoCell);
}
