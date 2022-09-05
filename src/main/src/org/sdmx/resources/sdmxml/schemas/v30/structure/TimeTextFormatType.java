/*
 * XML Type:  TimeTextFormatType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeTextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TimeTextFormatType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TimeTextFormatType extends org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentTextFormatType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TimeTextFormatType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "timetextformattype0259type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "textType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getTextType();

    /**
     * Gets (as xml) the "textType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetTextType();

    /**
     * True if has "textType" attribute
     */
    boolean isSetTextType();

    /**
     * Sets the "textType" attribute
     */
    void setTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum textType);

    /**
     * Sets (as xml) the "textType" attribute
     */
    void xsetTextType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType textType);

    /**
     * Unsets the "textType" attribute
     */
    void unsetTextType();
}
