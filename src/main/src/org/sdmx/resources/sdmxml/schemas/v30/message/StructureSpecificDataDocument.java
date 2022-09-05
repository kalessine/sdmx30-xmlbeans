/*
 * An XML document type.
 * Localname: StructureSpecificData
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one StructureSpecificData(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public interface StructureSpecificDataDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structurespecificdatac6afdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "StructureSpecificData" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType getStructureSpecificData();

    /**
     * Sets the "StructureSpecificData" element
     */
    void setStructureSpecificData(org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType structureSpecificData);

    /**
     * Appends and returns a new empty "StructureSpecificData" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType addNewStructureSpecificData();
}
