/*
 * An XML document type.
 * Localname: StructuredText
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.StructuredTextDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one StructuredText(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public class StructuredTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.StructuredTextDocument {
    private static final long serialVersionUID = 1L;

    public StructuredTextDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "StructuredText"),
    };


    /**
     * Gets the "StructuredText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType getStructuredText() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StructuredText" element
     */
    @Override
    public void setStructuredText(org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType structuredText) {
        generatedSetterHelperImpl(structuredText, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StructuredText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType addNewStructuredText() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
