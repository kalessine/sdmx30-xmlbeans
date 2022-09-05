/*
 * XML Type:  ProcessesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ProcessesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ProcessesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "processestypea853type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Process" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType> getProcessList();

    /**
     * Gets array of all "Process" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType[] getProcessArray();

    /**
     * Gets ith "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType getProcessArray(int i);

    /**
     * Returns number of "Process" element
     */
    int sizeOfProcessArray();

    /**
     * Sets ith "Process" element
     */
    void setProcessArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType process);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType insertNewProcess(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType addNewProcess();

    /**
     * Removes the ith "Process" element
     */
    void removeProcess(int i);
}
