/*
 * XML Type:  DataflowsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataflowsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataflowsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType {
    private static final long serialVersionUID = 1L;

    public DataflowsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dataflow"),
    };


    /**
     * Gets a List of "Dataflow" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType> getDataflowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataflowArray,
                this::setDataflowArray,
                this::insertNewDataflow,
                this::removeDataflow,
                this::sizeOfDataflowArray
            );
        }
    }

    /**
     * Gets array of all "Dataflow" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType[] getDataflowArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType[0]);
    }

    /**
     * Gets ith "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType getDataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Dataflow" element
     */
    @Override
    public int sizeOfDataflowArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Dataflow" element
     */
    @Override
    public void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType dataflow) {
        generatedSetterHelperImpl(dataflow, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType insertNewDataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType addNewDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Dataflow" element
     */
    @Override
    public void removeDataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
