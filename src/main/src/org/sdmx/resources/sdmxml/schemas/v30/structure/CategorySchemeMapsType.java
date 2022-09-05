/*
 * XML Type:  CategorySchemeMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategorySchemeMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CategorySchemeMapsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "categoryschememapstype5122type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CategorySchemeMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType> getCategorySchemeMapList();

    /**
     * Gets array of all "CategorySchemeMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType[] getCategorySchemeMapArray();

    /**
     * Gets ith "CategorySchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType getCategorySchemeMapArray(int i);

    /**
     * Returns number of "CategorySchemeMap" element
     */
    int sizeOfCategorySchemeMapArray();

    /**
     * Sets ith "CategorySchemeMap" element
     */
    void setCategorySchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType categorySchemeMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType insertNewCategorySchemeMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType addNewCategorySchemeMap();

    /**
     * Removes the ith "CategorySchemeMap" element
     */
    void removeCategorySchemeMap(int i);
}
