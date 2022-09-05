/*
 * XML Type:  LevelType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LevelType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface LevelType extends org.sdmx.resources.sdmxml.schemas.v30.structure.LevelBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "leveltypea3fatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CodingFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType getCodingFormat();

    /**
     * True if has "CodingFormat" element
     */
    boolean isSetCodingFormat();

    /**
     * Sets the "CodingFormat" element
     */
    void setCodingFormat(org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType codingFormat);

    /**
     * Appends and returns a new empty "CodingFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodingTextFormatType addNewCodingFormat();

    /**
     * Unsets the "CodingFormat" element
     */
    void unsetCodingFormat();

    /**
     * Gets the "Level" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType getLevel();

    /**
     * True if has "Level" element
     */
    boolean isSetLevel();

    /**
     * Sets the "Level" element
     */
    void setLevel(org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType level);

    /**
     * Appends and returns a new empty "Level" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.LevelType addNewLevel();

    /**
     * Unsets the "Level" element
     */
    void unsetLevel();
}
