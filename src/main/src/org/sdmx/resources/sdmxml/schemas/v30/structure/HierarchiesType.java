/*
 * XML Type:  HierarchiesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML HierarchiesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface HierarchiesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "hierarchiestypeccc9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Hierarchy" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType> getHierarchyList();

    /**
     * Gets array of all "Hierarchy" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType[] getHierarchyArray();

    /**
     * Gets ith "Hierarchy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType getHierarchyArray(int i);

    /**
     * Returns number of "Hierarchy" element
     */
    int sizeOfHierarchyArray();

    /**
     * Sets ith "Hierarchy" element
     */
    void setHierarchyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType hierarchy);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Hierarchy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType insertNewHierarchy(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Hierarchy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType addNewHierarchy();

    /**
     * Removes the ith "Hierarchy" element
     */
    void removeHierarchy(int i);
}
