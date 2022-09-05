/*
 * XML Type:  DataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataStructureComponentsType extends org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datastructurecomponentstype2595type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType getDimensionList();

    /**
     * Sets the "DimensionList" element
     */
    void setDimensionList(org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType dimensionList);

    /**
     * Appends and returns a new empty "DimensionList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionListType addNewDimensionList();

    /**
     * Gets a List of "Group" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType> getGroupList();

    /**
     * Gets array of all "Group" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType[] getGroupArray();

    /**
     * Gets ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType getGroupArray(int i);

    /**
     * Returns number of "Group" element
     */
    int sizeOfGroupArray();

    /**
     * Sets ith "Group" element
     */
    void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType group);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType insertNewGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType addNewGroup();

    /**
     * Removes the ith "Group" element
     */
    void removeGroup(int i);

    /**
     * Gets the "AttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType getAttributeList();

    /**
     * True if has "AttributeList" element
     */
    boolean isSetAttributeList();

    /**
     * Sets the "AttributeList" element
     */
    void setAttributeList(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType attributeList);

    /**
     * Appends and returns a new empty "AttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType addNewAttributeList();

    /**
     * Unsets the "AttributeList" element
     */
    void unsetAttributeList();

    /**
     * Gets the "MeasureList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType getMeasureList();

    /**
     * True if has "MeasureList" element
     */
    boolean isSetMeasureList();

    /**
     * Sets the "MeasureList" element
     */
    void setMeasureList(org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType measureList);

    /**
     * Appends and returns a new empty "MeasureList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureListType addNewMeasureList();

    /**
     * Unsets the "MeasureList" element
     */
    void unsetMeasureList();
}
