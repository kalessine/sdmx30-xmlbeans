/*
 * An XML document type.
 * Localname: GeoFeatureSetCode
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one GeoFeatureSetCode(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface GeoFeatureSetCodeDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geofeaturesetcode8556doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GeoFeatureSetCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType getGeoFeatureSetCode();

    /**
     * Sets the "GeoFeatureSetCode" element
     */
    void setGeoFeatureSetCode(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType geoFeatureSetCode);

    /**
     * Appends and returns a new empty "GeoFeatureSetCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType addNewGeoFeatureSetCode();
}
