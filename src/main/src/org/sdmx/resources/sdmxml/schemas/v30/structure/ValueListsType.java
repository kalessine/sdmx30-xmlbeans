/*
 * XML Type:  ValueListsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueListsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ValueListsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "valueliststype314ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ValueList" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType> getValueListList();

    /**
     * Gets array of all "ValueList" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType[] getValueListArray();

    /**
     * Gets ith "ValueList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType getValueListArray(int i);

    /**
     * Returns number of "ValueList" element
     */
    int sizeOfValueListArray();

    /**
     * Sets ith "ValueList" element
     */
    void setValueListArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType valueList);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType insertNewValueList(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType addNewValueList();

    /**
     * Removes the ith "ValueList" element
     */
    void removeValueList(int i);
}
