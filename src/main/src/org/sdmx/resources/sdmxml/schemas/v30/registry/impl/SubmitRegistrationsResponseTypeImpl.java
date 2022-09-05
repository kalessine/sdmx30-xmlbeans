/*
 * XML Type:  SubmitRegistrationsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitRegistrationsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubmitRegistrationsResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType {
    private static final long serialVersionUID = 1L;

    public SubmitRegistrationsResponseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "RegistrationStatus"),
    };


    /**
     * Gets a List of "RegistrationStatus" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType> getRegistrationStatusList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRegistrationStatusArray,
                this::setRegistrationStatusArray,
                this::insertNewRegistrationStatus,
                this::removeRegistrationStatus,
                this::sizeOfRegistrationStatusArray
            );
        }
    }

    /**
     * Gets array of all "RegistrationStatus" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType[] getRegistrationStatusArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType[0]);
    }

    /**
     * Gets ith "RegistrationStatus" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType getRegistrationStatusArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RegistrationStatus" element
     */
    @Override
    public int sizeOfRegistrationStatusArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "RegistrationStatus" element
     */
    @Override
    public void setRegistrationStatusArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType registrationStatus) {
        generatedSetterHelperImpl(registrationStatus, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationStatus" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType insertNewRegistrationStatus(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationStatus" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType addNewRegistrationStatus() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "RegistrationStatus" element
     */
    @Override
    public void removeRegistrationStatus(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
