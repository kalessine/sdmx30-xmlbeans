/*
 * XML Type:  AgencySchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AgencySchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class AgencySchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemeType {
    private static final long serialVersionUID = 1L;

    public AgencySchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Agency"),
        new QName("", "id"),
    };


    /**
     * Gets a List of "Agency" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType> getAgencyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgencyArray,
                this::setAgencyArray,
                this::insertNewAgency,
                this::removeAgency,
                this::sizeOfAgencyArray
            );
        }
    }

    /**
     * Gets array of all "Agency" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType[] getAgencyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType[0]);
    }

    /**
     * Gets ith "Agency" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType getAgencyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Agency" element
     */
    @Override
    public int sizeOfAgencyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Agency" element
     */
    @Override
    public void setAgencyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType agency) {
        generatedSetterHelperImpl(agency, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Agency" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType insertNewAgency(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Agency" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType addNewAgency() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Agency" element
     */
    @Override
    public void removeAgency(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    @Override
    public boolean isSetId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    @Override
    public void unsetId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}
