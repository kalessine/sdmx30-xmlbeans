/*
 * XML Type:  MeasureListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MeasureListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MeasureListType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "measurelisttype4652type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Measure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType> getMeasureList();

    /**
     * Gets array of all "Measure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType[] getMeasureArray();

    /**
     * Gets ith "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType getMeasureArray(int i);

    /**
     * Returns number of "Measure" element
     */
    int sizeOfMeasureArray();

    /**
     * Sets ith "Measure" element
     */
    void setMeasureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType measure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType insertNewMeasure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Measure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType addNewMeasure();

    /**
     * Removes the ith "Measure" element
     */
    void removeMeasure(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();
}
