/*
 * XML Type:  ProcessStepType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ProcessStepType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ProcessStepTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ProcessStepBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType {
    private static final long serialVersionUID = 1L;

    public ProcessStepTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Input"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Output"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Computation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Transition"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ProcessStep"),
    };


    /**
     * Gets a List of "Input" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType> getInputList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInputArray,
                this::setInputArray,
                this::insertNewInput,
                this::removeInput,
                this::sizeOfInputArray
            );
        }
    }

    /**
     * Gets array of all "Input" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType[] getInputArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType[0]);
    }

    /**
     * Gets ith "Input" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType getInputArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Input" element
     */
    @Override
    public int sizeOfInputArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Input" element
     */
    @Override
    public void setInputArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType input) {
        generatedSetterHelperImpl(input, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Input" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType insertNewInput(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Input" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType addNewInput() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Input" element
     */
    @Override
    public void removeInput(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Output" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType> getOutputList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOutputArray,
                this::setOutputArray,
                this::insertNewOutput,
                this::removeOutput,
                this::sizeOfOutputArray
            );
        }
    }

    /**
     * Gets array of all "Output" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType[] getOutputArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType[0]);
    }

    /**
     * Gets ith "Output" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType getOutputArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Output" element
     */
    @Override
    public int sizeOfOutputArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Output" element
     */
    @Override
    public void setOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType output) {
        generatedSetterHelperImpl(output, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType insertNewOutput(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType addNewOutput() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Output" element
     */
    @Override
    public void removeOutput(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "Computation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType getComputation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Computation" element
     */
    @Override
    public boolean isSetComputation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "Computation" element
     */
    @Override
    public void setComputation(org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType computation) {
        generatedSetterHelperImpl(computation, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Computation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType addNewComputation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "Computation" element
     */
    @Override
    public void unsetComputation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets a List of "Transition" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType> getTransitionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTransitionArray,
                this::setTransitionArray,
                this::insertNewTransition,
                this::removeTransition,
                this::sizeOfTransitionArray
            );
        }
    }

    /**
     * Gets array of all "Transition" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType[] getTransitionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType[0]);
    }

    /**
     * Gets ith "Transition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType getTransitionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Transition" element
     */
    @Override
    public int sizeOfTransitionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "Transition" element
     */
    @Override
    public void setTransitionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType transition) {
        generatedSetterHelperImpl(transition, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType insertNewTransition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Transition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType addNewTransition() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "Transition" element
     */
    @Override
    public void removeTransition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "ProcessStep" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType> getProcessStepList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProcessStepArray,
                this::setProcessStepArray,
                this::insertNewProcessStep,
                this::removeProcessStep,
                this::sizeOfProcessStepArray
            );
        }
    }

    /**
     * Gets array of all "ProcessStep" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType[] getProcessStepArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType[0]);
    }

    /**
     * Gets ith "ProcessStep" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType getProcessStepArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ProcessStep" element
     */
    @Override
    public int sizeOfProcessStepArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "ProcessStep" element
     */
    @Override
    public void setProcessStepArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType processStep) {
        generatedSetterHelperImpl(processStep, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStep" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType insertNewProcessStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessStep" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType addNewProcessStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "ProcessStep" element
     */
    @Override
    public void removeProcessStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }
}
