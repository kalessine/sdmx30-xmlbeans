/*
 * An XML document type.
 * Localname: AttributeList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AttributeList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface AttributeListDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "attributelist36e6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType getAttributeList();

    /**
     * Sets the "AttributeList" element
     */
    void setAttributeList(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType attributeList);

    /**
     * Appends and returns a new empty "AttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType addNewAttributeList();
}
