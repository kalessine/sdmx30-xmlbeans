/*
 * An XML document type.
 * Localname: SubmitStructureResponse
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SubmitStructureResponse(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public class SubmitStructureResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseDocument {
    private static final long serialVersionUID = 1L;

    public SubmitStructureResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitStructureResponse"),
    };


    /**
     * Gets the "SubmitStructureResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType getSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SubmitStructureResponse" element
     */
    @Override
    public void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType submitStructureResponse) {
        generatedSetterHelperImpl(submitStructureResponse, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType addNewSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
