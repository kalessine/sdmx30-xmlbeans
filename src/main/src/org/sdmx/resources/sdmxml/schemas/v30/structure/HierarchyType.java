/*
 * XML Type:  HierarchyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML HierarchyType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface HierarchyType extends org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "hierarchytype2f2btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Level" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType getLevel();

    /**
     * True if has "Level" element
     */
    boolean isSetLevel();

    /**
     * Sets the "Level" element
     */
    void setLevel(org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType level);

    /**
     * Appends and returns a new empty "Level" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType addNewLevel();

    /**
     * Unsets the "Level" element
     */
    void unsetLevel();

    /**
     * Gets a List of "HierarchicalCode" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType> getHierarchicalCodeList();

    /**
     * Gets array of all "HierarchicalCode" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType[] getHierarchicalCodeArray();

    /**
     * Gets ith "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType getHierarchicalCodeArray(int i);

    /**
     * Returns number of "HierarchicalCode" element
     */
    int sizeOfHierarchicalCodeArray();

    /**
     * Sets ith "HierarchicalCode" element
     */
    void setHierarchicalCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType hierarchicalCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType insertNewHierarchicalCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType addNewHierarchicalCode();

    /**
     * Removes the ith "HierarchicalCode" element
     */
    void removeHierarchicalCode(int i);

    /**
     * Gets the "hasFormalLevels" attribute
     */
    boolean getHasFormalLevels();

    /**
     * Gets (as xml) the "hasFormalLevels" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHasFormalLevels();

    /**
     * Sets the "hasFormalLevels" attribute
     */
    void setHasFormalLevels(boolean hasFormalLevels);

    /**
     * Sets (as xml) the "hasFormalLevels" attribute
     */
    void xsetHasFormalLevels(org.apache.xmlbeans.XmlBoolean hasFormalLevels);
}
