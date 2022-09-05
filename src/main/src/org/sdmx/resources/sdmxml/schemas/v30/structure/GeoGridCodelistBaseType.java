/*
 * XML Type:  GeoGridCodelistBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoGridCodelistBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeoGridCodelistBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geogridcodelistbasetypeb189type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "GeoGridCode" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType> getGeoGridCodeList();

    /**
     * Gets array of all "GeoGridCode" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType[] getGeoGridCodeArray();

    /**
     * Gets ith "GeoGridCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType getGeoGridCodeArray(int i);

    /**
     * Returns number of "GeoGridCode" element
     */
    int sizeOfGeoGridCodeArray();

    /**
     * Sets ith "GeoGridCode" element
     */
    void setGeoGridCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType geoGridCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoGridCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType insertNewGeoGridCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoGridCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType addNewGeoGridCode();

    /**
     * Removes the ith "GeoGridCode" element
     */
    void removeGeoGridCode(int i);

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
