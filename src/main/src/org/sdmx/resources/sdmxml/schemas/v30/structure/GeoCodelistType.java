/*
 * XML Type:  GeoCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeoCodelistType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistBaseType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geocodelisttype0db2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geoType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType.Enum getGeoType();

    /**
     * Gets (as xml) the "geoType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType xgetGeoType();

    /**
     * Sets the "geoType" attribute
     */
    void setGeoType(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType.Enum geoType);

    /**
     * Sets (as xml) the "geoType" attribute
     */
    void xsetGeoType(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType geoType);
}
