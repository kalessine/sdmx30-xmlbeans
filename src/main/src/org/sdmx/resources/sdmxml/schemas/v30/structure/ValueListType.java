/*
 * XML Type:  ValueListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ValueListType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "valuelisttype62a5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ValueItem" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType> getValueItemList();

    /**
     * Gets array of all "ValueItem" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType[] getValueItemArray();

    /**
     * Gets ith "ValueItem" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType getValueItemArray(int i);

    /**
     * Returns number of "ValueItem" element
     */
    int sizeOfValueItemArray();

    /**
     * Sets ith "ValueItem" element
     */
    void setValueItemArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType valueItem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueItem" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType insertNewValueItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueItem" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType addNewValueItem();

    /**
     * Removes the ith "ValueItem" element
     */
    void removeValueItem(int i);
}
