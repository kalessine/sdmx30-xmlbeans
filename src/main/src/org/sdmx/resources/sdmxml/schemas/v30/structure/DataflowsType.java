/*
 * XML Type:  DataflowsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataflowsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataflowsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataflowstypedc91type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Dataflow" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType> getDataflowList();

    /**
     * Gets array of all "Dataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType[] getDataflowArray();

    /**
     * Gets ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType getDataflowArray(int i);

    /**
     * Returns number of "Dataflow" element
     */
    int sizeOfDataflowArray();

    /**
     * Sets ith "Dataflow" element
     */
    void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType dataflow);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType insertNewDataflow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType addNewDataflow();

    /**
     * Removes the ith "Dataflow" element
     */
    void removeDataflow(int i);
}
