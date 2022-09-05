/*
 * XML Type:  GeoFeatureSetCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoFeatureSetCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeoFeatureSetCodeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geofeaturesetcodetype8140type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "value" attribute
     */
    java.lang.String getValue();

    /**
     * Gets (as xml) the "value" attribute
     */
    org.apache.xmlbeans.XmlString xgetValue();

    /**
     * Sets the "value" attribute
     */
    void setValue(java.lang.String value);

    /**
     * Sets (as xml) the "value" attribute
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
}
