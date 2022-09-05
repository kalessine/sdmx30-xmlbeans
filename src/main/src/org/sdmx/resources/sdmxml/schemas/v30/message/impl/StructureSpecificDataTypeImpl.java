/*
 * XML Type:  StructureSpecificDataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureSpecificDataType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class StructureSpecificDataTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType {
    private static final long serialVersionUID = 1L;

    public StructureSpecificDataTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "DataSet"),
    };


    /**
     * Gets a List of "DataSet" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType> getDataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataSetArray,
                this::setDataSetArray,
                this::insertNewDataSet,
                this::removeDataSet,
                this::sizeOfDataSetArray
            );
        }
    }

    /**
     * Gets array of all "DataSet" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType[] getDataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType[0]);
    }

    /**
     * Gets ith "DataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType getDataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataSet" element
     */
    @Override
    public int sizeOfDataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "DataSet" element
     */
    @Override
    public void setDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType dataSet) {
        generatedSetterHelperImpl(dataSet, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType insertNewDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType addNewDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataSet" element
     */
    @Override
    public void removeDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
