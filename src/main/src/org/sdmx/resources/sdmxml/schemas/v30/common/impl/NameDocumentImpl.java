/*
 * An XML document type.
 * Localname: Name
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.NameDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Name(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.NameDocument {
    private static final long serialVersionUID = 1L;

    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Name"),
    };


    /**
     * Gets the "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Name" element
     */
    @Override
    public void setName(org.sdmx.resources.sdmxml.schemas.v30.common.TextType name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
