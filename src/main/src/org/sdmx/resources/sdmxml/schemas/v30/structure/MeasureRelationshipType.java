/*
 * XML Type:  MeasureRelationshipType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MeasureRelationshipType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MeasureRelationshipType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "measurerelationshiptype16ectype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Measure" elements
     */
    java.util.List<java.lang.String> getMeasureList();

    /**
     * Gets array of all "Measure" elements
     */
    java.lang.String[] getMeasureArray();

    /**
     * Gets ith "Measure" element
     */
    java.lang.String getMeasureArray(int i);

    /**
     * Gets (as xml) a List of "Measure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType> xgetMeasureList();

    /**
     * Gets (as xml) array of all "Measure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType[] xgetMeasureArray();

    /**
     * Gets (as xml) ith "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetMeasureArray(int i);

    /**
     * Returns number of "Measure" element
     */
    int sizeOfMeasureArray();

    /**
     * Sets ith "Measure" element
     */
    void setMeasureArray(int i, java.lang.String measure);

    /**
     * Sets (as xml) array of all "Measure" element
     */
    void xsetMeasureArray(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType[] measureArray);

    /**
     * Sets (as xml) ith "Measure" element
     */
    void xsetMeasureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType measure);

    /**
     * Inserts the value as the ith "Measure" element
     */
    void insertMeasure(int i, java.lang.String measure);

    /**
     * Appends the value as the last "Measure" element
     */
    void addMeasure(java.lang.String measure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType insertNewMeasure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType addNewMeasure();

    /**
     * Removes the ith "Measure" element
     */
    void removeMeasure(int i);
}
