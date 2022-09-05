/*
 * XML Type:  GeoGridCodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoGridCodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeoGridCodelistsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geogridcodeliststypedf39type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "GeoGridCodelist" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType> getGeoGridCodelistList();

    /**
     * Gets array of all "GeoGridCodelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType[] getGeoGridCodelistArray();

    /**
     * Gets ith "GeoGridCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType getGeoGridCodelistArray(int i);

    /**
     * Returns number of "GeoGridCodelist" element
     */
    int sizeOfGeoGridCodelistArray();

    /**
     * Sets ith "GeoGridCodelist" element
     */
    void setGeoGridCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType geoGridCodelist);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoGridCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType insertNewGeoGridCodelist(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoGridCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType addNewGeoGridCodelist();

    /**
     * Removes the ith "GeoGridCodelist" element
     */
    void removeGeoGridCodelist(int i);
}
