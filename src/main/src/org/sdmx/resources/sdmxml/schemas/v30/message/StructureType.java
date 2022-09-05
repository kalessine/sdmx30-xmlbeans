/*
 * XML Type:  StructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface StructureType extends org.sdmx.resources.sdmxml.schemas.v30.message.MessageType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.StructureType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structuretype727dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType getStructures();

    /**
     * True if has "Structures" element
     */
    boolean isSetStructures();

    /**
     * Sets the "Structures" element
     */
    void setStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType structures);

    /**
     * Appends and returns a new empty "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType addNewStructures();

    /**
     * Unsets the "Structures" element
     */
    void unsetStructures();
}
