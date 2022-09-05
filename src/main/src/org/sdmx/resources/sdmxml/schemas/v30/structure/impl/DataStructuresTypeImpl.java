/*
 * XML Type:  DataStructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataStructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataStructuresTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType {
    private static final long serialVersionUID = 1L;

    public DataStructuresTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataStructure"),
    };


    /**
     * Gets a List of "DataStructure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType> getDataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataStructureArray,
                this::setDataStructureArray,
                this::insertNewDataStructure,
                this::removeDataStructure,
                this::sizeOfDataStructureArray
            );
        }
    }

    /**
     * Gets array of all "DataStructure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType[] getDataStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType[0]);
    }

    /**
     * Gets ith "DataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType getDataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStructure" element
     */
    @Override
    public int sizeOfDataStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "DataStructure" element
     */
    @Override
    public void setDataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType dataStructure) {
        generatedSetterHelperImpl(dataStructure, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType insertNewDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType addNewDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStructure" element
     */
    @Override
    public void removeDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
