/*
 * An XML document type.
 * Localname: ComponentList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ComponentList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface ComponentListDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "componentlist2147doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ComponentList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType getComponentList();

    /**
     * Sets the "ComponentList" element
     */
    void setComponentList(org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType componentList);

    /**
     * Appends and returns a new empty "ComponentList" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType addNewComponentList();
}
