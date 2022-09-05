/*
 * XML Type:  SubmitRegistrationsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitRegistrationsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubmitRegistrationsRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType {
    private static final long serialVersionUID = 1L;

    public SubmitRegistrationsRequestTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "RegistrationRequest"),
    };


    /**
     * Gets a List of "RegistrationRequest" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType> getRegistrationRequestList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRegistrationRequestArray,
                this::setRegistrationRequestArray,
                this::insertNewRegistrationRequest,
                this::removeRegistrationRequest,
                this::sizeOfRegistrationRequestArray
            );
        }
    }

    /**
     * Gets array of all "RegistrationRequest" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType[] getRegistrationRequestArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType[0]);
    }

    /**
     * Gets ith "RegistrationRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType getRegistrationRequestArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RegistrationRequest" element
     */
    @Override
    public int sizeOfRegistrationRequestArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "RegistrationRequest" element
     */
    @Override
    public void setRegistrationRequestArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType registrationRequest) {
        generatedSetterHelperImpl(registrationRequest, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType insertNewRegistrationRequest(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType addNewRegistrationRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "RegistrationRequest" element
     */
    @Override
    public void removeRegistrationRequest(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
