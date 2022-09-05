/*
 * XML Type:  TimeDimensionRepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TimeDimensionRepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TimeDimensionRepresentationType extends org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleDataStructureRepresentationType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionRepresentationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "timedimensionrepresentationtype537ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType getTextFormat();

    /**
     * True if has "TextFormat" element
     */
    boolean isSetTextFormat();

    /**
     * Sets the "TextFormat" element
     */
    void setTextFormat(org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType textFormat);

    /**
     * Appends and returns a new empty "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType addNewTextFormat();

    /**
     * Unsets the "TextFormat" element
     */
    void unsetTextFormat();
}
