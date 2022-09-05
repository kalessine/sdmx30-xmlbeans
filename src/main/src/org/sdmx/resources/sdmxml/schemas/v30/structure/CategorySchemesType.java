/*
 * XML Type:  CategorySchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategorySchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CategorySchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "categoryschemestype5846type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CategoryScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType> getCategorySchemeList();

    /**
     * Gets array of all "CategoryScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType[] getCategorySchemeArray();

    /**
     * Gets ith "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType getCategorySchemeArray(int i);

    /**
     * Returns number of "CategoryScheme" element
     */
    int sizeOfCategorySchemeArray();

    /**
     * Sets ith "CategoryScheme" element
     */
    void setCategorySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType categoryScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType insertNewCategoryScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType addNewCategoryScheme();

    /**
     * Removes the ith "CategoryScheme" element
     */
    void removeCategoryScheme(int i);
}
