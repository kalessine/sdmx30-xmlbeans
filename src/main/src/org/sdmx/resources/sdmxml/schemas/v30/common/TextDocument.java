/*
 * An XML document type.
 * Localname: Text
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.TextDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Text(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public interface TextDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.TextDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "text1513doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getText();

    /**
     * Sets the "Text" element
     */
    void setText(org.sdmx.resources.sdmxml.schemas.v30.common.TextType text);

    /**
     * Appends and returns a new empty "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewText();
}
