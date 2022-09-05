/*
 * An XML document type.
 * Localname: Description
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Description(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public interface DescriptionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.DescriptionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "descriptionef36doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getDescription();

    /**
     * Sets the "Description" element
     */
    void setDescription(org.sdmx.resources.sdmxml.schemas.v30.common.TextType description);

    /**
     * Appends and returns a new empty "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewDescription();
}
