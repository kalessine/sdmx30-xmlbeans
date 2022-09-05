/*
 * An XML document type.
 * Localname: Attribute
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.metadata.generic;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Attribute(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic) element.
 *
 * This is a complex type.
 */
public interface AttributeDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "attribute3e22doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType getAttribute();

    /**
     * Sets the "Attribute" element
     */
    void setAttribute(org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType attribute);

    /**
     * Appends and returns a new empty "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType addNewAttribute();
}
