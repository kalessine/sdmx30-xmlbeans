/*
 * XML Type:  GenericMetadataHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GenericMetadataHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class GenericMetadataHeaderTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.BaseHeaderTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataHeaderType {
    private static final long serialVersionUID = 1L;

    public GenericMetadataHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Structure"),
    };


    /**
     * Gets a List of "Structure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType> getStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStructureArray,
                this::setStructureArray,
                this::insertNewStructure,
                this::removeStructure,
                this::sizeOfStructureArray
            );
        }
    }

    /**
     * Gets array of all "Structure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType[] getStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType[0]);
    }

    /**
     * Gets ith "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType getStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Structure" element
     */
    @Override
    public int sizeOfStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Structure" element
     */
    @Override
    public void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType structure) {
        generatedSetterHelperImpl(structure, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType insertNewStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType addNewStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Structure" element
     */
    @Override
    public void removeStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
