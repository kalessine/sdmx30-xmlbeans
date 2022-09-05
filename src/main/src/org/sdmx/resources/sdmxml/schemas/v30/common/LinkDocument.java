/*
 * An XML document type.
 * Localname: Link
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.LinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Link(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public interface LinkDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.LinkDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "link6ee6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType getLink();

    /**
     * Sets the "Link" element
     */
    void setLink(org.sdmx.resources.sdmxml.schemas.v30.common.LinkType link);

    /**
     * Appends and returns a new empty "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType addNewLink();
}
