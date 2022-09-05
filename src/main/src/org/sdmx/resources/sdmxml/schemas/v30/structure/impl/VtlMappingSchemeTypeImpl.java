/*
 * XML Type:  VtlMappingSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VtlMappingSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class VtlMappingSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType {
    private static final long serialVersionUID = 1L;

    public VtlMappingSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMapping"),
    };


    /**
     * Gets a List of "VtlMapping" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType> getVtlMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVtlMappingArray,
                this::setVtlMappingArray,
                this::insertNewVtlMapping,
                this::removeVtlMapping,
                this::sizeOfVtlMappingArray
            );
        }
    }

    /**
     * Gets array of all "VtlMapping" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType[] getVtlMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType[0]);
    }

    /**
     * Gets ith "VtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType getVtlMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VtlMapping" element
     */
    @Override
    public int sizeOfVtlMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "VtlMapping" element
     */
    @Override
    public void setVtlMappingArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType vtlMapping) {
        generatedSetterHelperImpl(vtlMapping, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType insertNewVtlMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType addNewVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "VtlMapping" element
     */
    @Override
    public void removeVtlMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
