/*
 * An XML document type.
 * Localname: SubmitStructureRequest
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SubmitStructureRequest(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public class SubmitStructureRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestDocument {
    private static final long serialVersionUID = 1L;

    public SubmitStructureRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitStructureRequest"),
    };


    /**
     * Gets the "SubmitStructureRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType getSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SubmitStructureRequest" element
     */
    @Override
    public void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType submitStructureRequest) {
        generatedSetterHelperImpl(submitStructureRequest, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType addNewSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
