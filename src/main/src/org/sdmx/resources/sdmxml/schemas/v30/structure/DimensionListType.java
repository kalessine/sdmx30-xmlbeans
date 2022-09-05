/*
 * XML Type:  DimensionListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DimensionListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DimensionListType extends org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dimensionlisttype709atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Dimension" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType> getDimensionList();

    /**
     * Gets array of all "Dimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType[] getDimensionArray();

    /**
     * Gets ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType getDimensionArray(int i);

    /**
     * Returns number of "Dimension" element
     */
    int sizeOfDimensionArray();

    /**
     * Sets ith "Dimension" element
     */
    void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType dimension);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType insertNewDimension(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType addNewDimension();

    /**
     * Removes the ith "Dimension" element
     */
    void removeDimension(int i);

    /**
     * Gets the "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType getTimeDimension();

    /**
     * True if has "TimeDimension" element
     */
    boolean isSetTimeDimension();

    /**
     * Sets the "TimeDimension" element
     */
    void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType timeDimension);

    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType addNewTimeDimension();

    /**
     * Unsets the "TimeDimension" element
     */
    void unsetTimeDimension();
}
