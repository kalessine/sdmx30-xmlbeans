/*
 * XML Type:  ProcessStepType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ProcessStepType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ProcessStepType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "processsteptypead11type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Input" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType> getInputList();

    /**
     * Gets array of all "Input" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType[] getInputArray();

    /**
     * Gets ith "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType getInputArray(int i);

    /**
     * Returns number of "Input" element
     */
    int sizeOfInputArray();

    /**
     * Sets ith "Input" element
     */
    void setInputArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType input);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType insertNewInput(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType addNewInput();

    /**
     * Removes the ith "Input" element
     */
    void removeInput(int i);

    /**
     * Gets a List of "Output" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType> getOutputList();

    /**
     * Gets array of all "Output" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType[] getOutputArray();

    /**
     * Gets ith "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType getOutputArray(int i);

    /**
     * Returns number of "Output" element
     */
    int sizeOfOutputArray();

    /**
     * Sets ith "Output" element
     */
    void setOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType output);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType insertNewOutput(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType addNewOutput();

    /**
     * Removes the ith "Output" element
     */
    void removeOutput(int i);

    /**
     * Gets the "Computation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType getComputation();

    /**
     * True if has "Computation" element
     */
    boolean isSetComputation();

    /**
     * Sets the "Computation" element
     */
    void setComputation(org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType computation);

    /**
     * Appends and returns a new empty "Computation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType addNewComputation();

    /**
     * Unsets the "Computation" element
     */
    void unsetComputation();

    /**
     * Gets a List of "Transition" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType> getTransitionList();

    /**
     * Gets array of all "Transition" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType[] getTransitionArray();

    /**
     * Gets ith "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType getTransitionArray(int i);

    /**
     * Returns number of "Transition" element
     */
    int sizeOfTransitionArray();

    /**
     * Sets ith "Transition" element
     */
    void setTransitionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType transition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType insertNewTransition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType addNewTransition();

    /**
     * Removes the ith "Transition" element
     */
    void removeTransition(int i);

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
