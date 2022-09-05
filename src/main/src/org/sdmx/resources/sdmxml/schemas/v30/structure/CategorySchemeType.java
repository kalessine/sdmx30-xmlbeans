/*
 * XML Type:  CategorySchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategorySchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CategorySchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "categoryschemetype746btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Category" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType> getCategoryList();

    /**
     * Gets array of all "Category" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType[] getCategoryArray();

    /**
     * Gets ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType getCategoryArray(int i);

    /**
     * Returns number of "Category" element
     */
    int sizeOfCategoryArray();

    /**
     * Sets ith "Category" element
     */
    void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType category);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType insertNewCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType addNewCategory();

    /**
     * Removes the ith "Category" element
     */
    void removeCategory(int i);
}
