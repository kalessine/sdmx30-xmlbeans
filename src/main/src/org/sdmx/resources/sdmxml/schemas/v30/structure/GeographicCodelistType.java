/*
 * XML Type:  GeographicCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeographicCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeographicCodelistType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geographiccodelisttypedb4atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "GeoFeatureSetCode" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType> getGeoFeatureSetCodeList();

    /**
     * Gets array of all "GeoFeatureSetCode" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType[] getGeoFeatureSetCodeArray();

    /**
     * Gets ith "GeoFeatureSetCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType getGeoFeatureSetCodeArray(int i);

    /**
     * Returns number of "GeoFeatureSetCode" element
     */
    int sizeOfGeoFeatureSetCodeArray();

    /**
     * Sets ith "GeoFeatureSetCode" element
     */
    void setGeoFeatureSetCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType geoFeatureSetCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoFeatureSetCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType insertNewGeoFeatureSetCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoFeatureSetCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType addNewGeoFeatureSetCode();

    /**
     * Removes the ith "GeoFeatureSetCode" element
     */
    void removeGeoFeatureSetCode(int i);

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
