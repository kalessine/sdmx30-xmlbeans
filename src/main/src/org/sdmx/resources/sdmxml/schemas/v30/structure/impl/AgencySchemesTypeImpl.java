/*
 * XML Type:  AgencySchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AgencySchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class AgencySchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType {
    private static final long serialVersionUID = 1L;

    public AgencySchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AgencyScheme"),
    };


    /**
     * Gets a List of "AgencyScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType> getAgencySchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgencySchemeArray,
                this::setAgencySchemeArray,
                this::insertNewAgencyScheme,
                this::removeAgencyScheme,
                this::sizeOfAgencySchemeArray
            );
        }
    }

    /**
     * Gets array of all "AgencyScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType[] getAgencySchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType[0]);
    }

    /**
     * Gets ith "AgencyScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType getAgencySchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AgencyScheme" element
     */
    @Override
    public int sizeOfAgencySchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "AgencyScheme" element
     */
    @Override
    public void setAgencySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType agencyScheme) {
        generatedSetterHelperImpl(agencyScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType insertNewAgencyScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType addNewAgencyScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "AgencyScheme" element
     */
    @Override
    public void removeAgencyScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
