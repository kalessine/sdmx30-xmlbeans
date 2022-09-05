/*
 * XML Type:  StructureSpecificDataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureSpecificDataType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface StructureSpecificDataType extends org.sdmx.resources.sdmxml.schemas.v30.message.MessageType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structurespecificdatatypea299type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataSet" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType> getDataSetList();

    /**
     * Gets array of all "DataSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType[] getDataSetArray();

    /**
     * Gets ith "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType getDataSetArray(int i);

    /**
     * Returns number of "DataSet" element
     */
    int sizeOfDataSetArray();

    /**
     * Sets ith "DataSet" element
     */
    void setDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType dataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType insertNewDataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType addNewDataSet();

    /**
     * Removes the ith "DataSet" element
     */
    void removeDataSet(int i);
}
