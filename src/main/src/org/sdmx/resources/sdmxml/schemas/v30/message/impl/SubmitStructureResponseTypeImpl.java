/*
 * XML Type:  SubmitStructureResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitStructureResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class SubmitStructureResponseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType {
    private static final long serialVersionUID = 1L;

    public SubmitStructureResponseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitStructureResponse"),
    };


    /**
     * Gets the "SubmitStructureResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType getSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitStructureResponse" element
     */
    @Override
    public boolean isSetSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "SubmitStructureResponse" element
     */
    @Override
    public void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType submitStructureResponse) {
        generatedSetterHelperImpl(submitStructureResponse, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType addNewSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitStructureResponse" element
     */
    @Override
    public void unsetSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
