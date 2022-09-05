/*
 * XML Type:  ProcessType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ProcessType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ProcessType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "processtypee525type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ProcessStep" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType> getProcessStepList();

    /**
     * Gets array of all "ProcessStep" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType[] getProcessStepArray();

    /**
     * Gets ith "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType getProcessStepArray(int i);

    /**
     * Returns number of "ProcessStep" element
     */
    int sizeOfProcessStepArray();

    /**
     * Sets ith "ProcessStep" element
     */
    void setProcessStepArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType processStep);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType insertNewProcessStep(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType addNewProcessStep();

    /**
     * Removes the ith "ProcessStep" element
     */
    void removeProcessStep(int i);
}
