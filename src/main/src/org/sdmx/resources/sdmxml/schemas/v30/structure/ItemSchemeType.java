/*
 * XML Type:  ItemSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ItemSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ItemSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "itemschemetype3340type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Item" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType> getItemList();

    /**
     * Gets array of all "Item" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType[] getItemArray();

    /**
     * Gets ith "Item" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType getItemArray(int i);

    /**
     * Returns number of "Item" element
     */
    int sizeOfItemArray();

    /**
     * Sets ith "Item" element
     */
    void setItemArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType item);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType insertNewItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType addNewItem();

    /**
     * Removes the ith "Item" element
     */
    void removeItem(int i);

    /**
     * Gets the "isPartial" attribute
     */
    boolean getIsPartial();

    /**
     * Gets (as xml) the "isPartial" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPartial();

    /**
     * True if has "isPartial" attribute
     */
    boolean isSetIsPartial();

    /**
     * Sets the "isPartial" attribute
     */
    void setIsPartial(boolean isPartial);

    /**
     * Sets (as xml) the "isPartial" attribute
     */
    void xsetIsPartial(org.apache.xmlbeans.XmlBoolean isPartial);

    /**
     * Unsets the "isPartial" attribute
     */
    void unsetIsPartial();
}
