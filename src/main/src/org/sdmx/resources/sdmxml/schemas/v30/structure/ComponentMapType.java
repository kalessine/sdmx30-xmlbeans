/*
 * XML Type:  ComponentMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ComponentMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ComponentMapType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "componentmaptype9d87type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Source" elements
     */
    java.util.List<java.lang.String> getSourceList();

    /**
     * Gets array of all "Source" elements
     */
    java.lang.String[] getSourceArray();

    /**
     * Gets ith "Source" element
     */
    java.lang.String getSourceArray(int i);

    /**
     * Gets (as xml) a List of "Source" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetSourceList();

    /**
     * Gets (as xml) array of all "Source" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetSourceArray();

    /**
     * Gets (as xml) ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSourceArray(int i);

    /**
     * Returns number of "Source" element
     */
    int sizeOfSourceArray();

    /**
     * Sets ith "Source" element
     */
    void setSourceArray(int i, java.lang.String source);

    /**
     * Sets (as xml) array of all "Source" element
     */
    void xsetSourceArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] sourceArray);

    /**
     * Sets (as xml) ith "Source" element
     */
    void xsetSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType source);

    /**
     * Inserts the value as the ith "Source" element
     */
    void insertSource(int i, java.lang.String source);

    /**
     * Appends the value as the last "Source" element
     */
    void addSource(java.lang.String source);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewSource();

    /**
     * Removes the ith "Source" element
     */
    void removeSource(int i);

    /**
     * Gets a List of "Target" elements
     */
    java.util.List<java.lang.String> getTargetList();

    /**
     * Gets array of all "Target" elements
     */
    java.lang.String[] getTargetArray();

    /**
     * Gets ith "Target" element
     */
    java.lang.String getTargetArray(int i);

    /**
     * Gets (as xml) a List of "Target" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetTargetList();

    /**
     * Gets (as xml) array of all "Target" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetTargetArray();

    /**
     * Gets (as xml) ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTargetArray(int i);

    /**
     * Returns number of "Target" element
     */
    int sizeOfTargetArray();

    /**
     * Sets ith "Target" element
     */
    void setTargetArray(int i, java.lang.String target);

    /**
     * Sets (as xml) array of all "Target" element
     */
    void xsetTargetArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] targetArray);

    /**
     * Sets (as xml) ith "Target" element
     */
    void xsetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType target);

    /**
     * Inserts the value as the ith "Target" element
     */
    void insertTarget(int i, java.lang.String target);

    /**
     * Appends the value as the last "Target" element
     */
    void addTarget(java.lang.String target);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewTarget(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewTarget();

    /**
     * Removes the ith "Target" element
     */
    void removeTarget(int i);

    /**
     * Gets the "RepresentationMap" element
     */
    java.lang.String getRepresentationMap();

    /**
     * Gets (as xml) the "RepresentationMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType xgetRepresentationMap();

    /**
     * True if has "RepresentationMap" element
     */
    boolean isSetRepresentationMap();

    /**
     * Sets the "RepresentationMap" element
     */
    void setRepresentationMap(java.lang.String representationMap);

    /**
     * Sets (as xml) the "RepresentationMap" element
     */
    void xsetRepresentationMap(org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType representationMap);

    /**
     * Unsets the "RepresentationMap" element
     */
    void unsetRepresentationMap();
}
