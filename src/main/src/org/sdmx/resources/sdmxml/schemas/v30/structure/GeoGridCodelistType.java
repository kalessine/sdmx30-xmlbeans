/*
 * XML Type:  GeoGridCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoGridCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GeoGridCodelistType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "geogridcodelisttypec318type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GridDefinition" element
     */
    java.lang.String getGridDefinition();

    /**
     * Gets (as xml) the "GridDefinition" element
     */
    org.apache.xmlbeans.XmlString xgetGridDefinition();

    /**
     * Sets the "GridDefinition" element
     */
    void setGridDefinition(java.lang.String gridDefinition);

    /**
     * Sets (as xml) the "GridDefinition" element
     */
    void xsetGridDefinition(org.apache.xmlbeans.XmlString gridDefinition);
}
