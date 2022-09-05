/*
 * XML Type:  StructureSpecificDataHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureSpecificDataHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface StructureSpecificDataHeaderType extends org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataHeaderType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structurespecificdataheadertype7c06type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Structure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType> getStructureList();

    /**
     * Gets array of all "Structure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType[] getStructureArray();

    /**
     * Gets ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType getStructureArray(int i);

    /**
     * Returns number of "Structure" element
     */
    int sizeOfStructureArray();

    /**
     * Sets ith "Structure" element
     */
    void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType structure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType insertNewStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType addNewStructure();

    /**
     * Removes the ith "Structure" element
     */
    void removeStructure(int i);
}
