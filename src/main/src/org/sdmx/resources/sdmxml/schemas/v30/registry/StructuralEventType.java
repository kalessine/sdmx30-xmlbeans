/*
 * XML Type:  StructuralEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructuralEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface StructuralEventType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structuraleventtype8a3dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType getStructures();

    /**
     * Sets the "Structures" element
     */
    void setStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType structures);

    /**
     * Appends and returns a new empty "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType addNewStructures();
}
