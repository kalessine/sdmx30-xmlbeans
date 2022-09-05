/*
 * XML Type:  RepresentationMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RepresentationMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RepresentationMapsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "representationmapstype5cactype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "RepresentationMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType> getRepresentationMapList();

    /**
     * Gets array of all "RepresentationMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType[] getRepresentationMapArray();

    /**
     * Gets ith "RepresentationMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType getRepresentationMapArray(int i);

    /**
     * Returns number of "RepresentationMap" element
     */
    int sizeOfRepresentationMapArray();

    /**
     * Sets ith "RepresentationMap" element
     */
    void setRepresentationMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType representationMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentationMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType insertNewRepresentationMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentationMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType addNewRepresentationMap();

    /**
     * Removes the ith "RepresentationMap" element
     */
    void removeRepresentationMap(int i);
}
