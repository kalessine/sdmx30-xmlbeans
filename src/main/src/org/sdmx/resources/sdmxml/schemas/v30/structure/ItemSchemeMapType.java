/*
 * XML Type:  ItemSchemeMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ItemSchemeMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ItemSchemeMapType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeMapBaseType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeMapType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "itemschememaptype451atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Source" element
     */
    java.lang.String getSource();

    /**
     * Gets (as xml) the "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType xgetSource();

    /**
     * Sets the "Source" element
     */
    void setSource(java.lang.String source);

    /**
     * Sets (as xml) the "Source" element
     */
    void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType source);

    /**
     * Gets the "Target" element
     */
    java.lang.String getTarget();

    /**
     * Gets (as xml) the "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType xgetTarget();

    /**
     * Sets the "Target" element
     */
    void setTarget(java.lang.String target);

    /**
     * Sets (as xml) the "Target" element
     */
    void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType target);

    /**
     * Gets a List of "ItemMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType> getItemMapList();

    /**
     * Gets array of all "ItemMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType[] getItemMapArray();

    /**
     * Gets ith "ItemMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType getItemMapArray(int i);

    /**
     * Returns number of "ItemMap" element
     */
    int sizeOfItemMapArray();

    /**
     * Sets ith "ItemMap" element
     */
    void setItemMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType itemMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ItemMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType insertNewItemMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ItemMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType addNewItemMap();

    /**
     * Removes the ith "ItemMap" element
     */
    void removeItemMap(int i);
}
