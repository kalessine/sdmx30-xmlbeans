/*
 * XML Type:  ProcessType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ProcessType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ProcessTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ProcessBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType {
    private static final long serialVersionUID = 1L;

    public ProcessTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ProcessStep"),
    };


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
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType[0]);
    }

    /**
     * Gets ith "ProcessStep" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType getProcessStepArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ProcessStep" element
     */
    @Override
    public void setProcessStepArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType processStep) {
        generatedSetterHelperImpl(processStep, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStep" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType insertNewProcessStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessStepType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
