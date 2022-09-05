/*
 * XML Type:  RegistrationStatusType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RegistrationStatusType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class RegistrationStatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType {
    private static final long serialVersionUID = 1L;

    public RegistrationStatusTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Registration"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StatusMessage"),
    };


    /**
     * Gets the "Registration" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType getRegistration() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Registration" element
     */
    @Override
    public void setRegistration(org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType registration) {
        generatedSetterHelperImpl(registration, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Registration" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType addNewRegistration() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType getStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StatusMessage" element
     */
    @Override
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType statusMessage) {
        generatedSetterHelperImpl(statusMessage, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType addNewStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }
}
