/*
 * An XML document type.
 * Localname: StructuredText
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.StructuredTextDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one StructuredText(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public interface StructuredTextDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.StructuredTextDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structuredtextd882doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType getStructuredText();

    /**
     * Sets the "StructuredText" element
     */
    void setStructuredText(org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType structuredText);

    /**
     * Appends and returns a new empty "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType addNewStructuredText();
}
