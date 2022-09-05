/*
 * An XML document type.
 * Localname: Error
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Error(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.ErrorDocument {
    private static final long serialVersionUID = 1L;

    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Error"),
    };


    /**
     * Gets the "Error" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType getError() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Error" element
     */
    @Override
    public void setError(org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType error) {
        generatedSetterHelperImpl(error, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Error" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType addNewError() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
