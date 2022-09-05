/*
 * XML Type:  GeoCodelistBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoCodelistBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeoCodelistBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geocodelistbasetype1f23type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "GeoRefCode" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType> getGeoRefCodeList();

    /**
     * Gets array of all "GeoRefCode" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType[] getGeoRefCodeArray();

    /**
     * Gets ith "GeoRefCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType getGeoRefCodeArray(int i);

    /**
     * Returns number of "GeoRefCode" element
     */
    int sizeOfGeoRefCodeArray();

    /**
     * Sets ith "GeoRefCode" element
     */
    void setGeoRefCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType geoRefCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoRefCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType insertNewGeoRefCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoRefCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType addNewGeoRefCode();

    /**
     * Removes the ith "GeoRefCode" element
     */
    void removeGeoRefCode(int i);
}
