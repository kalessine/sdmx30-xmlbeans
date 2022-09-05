/*
 * XML Type:  DataStructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataStructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataStructuresType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datastructurestype54d2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataStructure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType> getDataStructureList();

    /**
     * Gets array of all "DataStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType[] getDataStructureArray();

    /**
     * Gets ith "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType getDataStructureArray(int i);

    /**
     * Returns number of "DataStructure" element
     */
    int sizeOfDataStructureArray();

    /**
     * Sets ith "DataStructure" element
     */
    void setDataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType dataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType insertNewDataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType addNewDataStructure();

    /**
     * Removes the ith "DataStructure" element
     */
    void removeDataStructure(int i);
}
