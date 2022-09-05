/*
 * XML Type:  StructureMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface StructureMapsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structuremapstype8820type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "StructureMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType> getStructureMapList();

    /**
     * Gets array of all "StructureMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType[] getStructureMapArray();

    /**
     * Gets ith "StructureMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType getStructureMapArray(int i);

    /**
     * Returns number of "StructureMap" element
     */
    int sizeOfStructureMapArray();

    /**
     * Sets ith "StructureMap" element
     */
    void setStructureMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType structureMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType insertNewStructureMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StructureMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType addNewStructureMap();

    /**
     * Removes the ith "StructureMap" element
     */
    void removeStructureMap(int i);
}
