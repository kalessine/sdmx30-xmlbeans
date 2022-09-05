/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class SubmitStructureRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType {
    private static final long serialVersionUID = 1L;

    public SubmitStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitStructureRequest"),
    };


    /**
     * Gets the "SubmitStructureRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType getSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitStructureRequest" element
     */
    @Override
    public boolean isSetSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "SubmitStructureRequest" element
     */
    @Override
    public void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType submitStructureRequest) {
        generatedSetterHelperImpl(submitStructureRequest, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType addNewSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitStructureRequest" element
     */
    @Override
    public void unsetSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
