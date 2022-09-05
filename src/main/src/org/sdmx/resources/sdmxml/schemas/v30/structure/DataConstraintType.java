/*
 * XML Type:  DataConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataConstraintType extends org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataconstrainttype814ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataKeySet" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType> getDataKeySetList();

    /**
     * Gets array of all "DataKeySet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType[] getDataKeySetArray();

    /**
     * Gets ith "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType getDataKeySetArray(int i);

    /**
     * Returns number of "DataKeySet" element
     */
    int sizeOfDataKeySetArray();

    /**
     * Sets ith "DataKeySet" element
     */
    void setDataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType dataKeySet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType insertNewDataKeySet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType addNewDataKeySet();

    /**
     * Removes the ith "DataKeySet" element
     */
    void removeDataKeySet(int i);

    /**
     * Gets a List of "CubeRegion" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType> getCubeRegionList();

    /**
     * Gets array of all "CubeRegion" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType[] getCubeRegionArray();

    /**
     * Gets ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType getCubeRegionArray(int i);

    /**
     * Returns number of "CubeRegion" element
     */
    int sizeOfCubeRegionArray();

    /**
     * Sets ith "CubeRegion" element
     */
    void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType cubeRegion);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType insertNewCubeRegion(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType addNewCubeRegion();

    /**
     * Removes the ith "CubeRegion" element
     */
    void removeCubeRegion(int i);
}
