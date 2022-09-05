/*
 * XML Type:  ProcessesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ProcessesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ProcessesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType {
    private static final long serialVersionUID = 1L;

    public ProcessesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Process"),
    };


    /**
     * Gets a List of "Process" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType> getProcessList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProcessArray,
                this::setProcessArray,
                this::insertNewProcess,
                this::removeProcess,
                this::sizeOfProcessArray
            );
        }
    }

    /**
     * Gets array of all "Process" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType[] getProcessArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType[0]);
    }

    /**
     * Gets ith "Process" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType getProcessArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Process" element
     */
    @Override
    public int sizeOfProcessArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Process" element
     */
    @Override
    public void setProcessArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType process) {
        generatedSetterHelperImpl(process, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Process" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType insertNewProcess(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Process" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType addNewProcess() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Process" element
     */
    @Override
    public void removeProcess(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
