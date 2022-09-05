/*
 * An XML document type.
 * Localname: Category
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Category(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface CategoryDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "category9d1cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType getCategory();

    /**
     * Sets the "Category" element
     */
    void setCategory(org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType category);

    /**
     * Appends and returns a new empty "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType addNewCategory();
}
