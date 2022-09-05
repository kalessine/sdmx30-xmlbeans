/*
 * XML Type:  VtlMappingSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VtlMappingSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class VtlMappingSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType {
    private static final long serialVersionUID = 1L;

    public VtlMappingSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMappingScheme"),
    };


    /**
     * Gets a List of "VtlMappingScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType> getVtlMappingSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVtlMappingSchemeArray,
                this::setVtlMappingSchemeArray,
                this::insertNewVtlMappingScheme,
                this::removeVtlMappingScheme,
                this::sizeOfVtlMappingSchemeArray
            );
        }
    }

    /**
     * Gets array of all "VtlMappingScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType[] getVtlMappingSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType[0]);
    }

    /**
     * Gets ith "VtlMappingScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType getVtlMappingSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VtlMappingScheme" element
     */
    @Override
    public int sizeOfVtlMappingSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "VtlMappingScheme" element
     */
    @Override
    public void setVtlMappingSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType vtlMappingScheme) {
        generatedSetterHelperImpl(vtlMappingScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VtlMappingScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType insertNewVtlMappingScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VtlMappingScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType addNewVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "VtlMappingScheme" element
     */
    @Override
    public void removeVtlMappingScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
