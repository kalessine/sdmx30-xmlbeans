/*
 * XML Type:  GroupingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GroupingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GroupingType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "groupingtype73ebtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ComponentList" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType> getComponentListList();

    /**
     * Gets array of all "ComponentList" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType[] getComponentListArray();

    /**
     * Gets ith "ComponentList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType getComponentListArray(int i);

    /**
     * Returns number of "ComponentList" element
     */
    int sizeOfComponentListArray();

    /**
     * Sets ith "ComponentList" element
     */
    void setComponentListArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType componentList);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType insertNewComponentList(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType addNewComponentList();

    /**
     * Removes the ith "ComponentList" element
     */
    void removeComponentList(int i);
}
