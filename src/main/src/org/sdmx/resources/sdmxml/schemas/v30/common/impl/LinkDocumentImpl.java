/*
 * An XML document type.
 * Localname: Link
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.LinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Link(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common) element.
 *
 * This is a complex type.
 */
public class LinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.LinkDocument {
    private static final long serialVersionUID = 1L;

    public LinkDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Link"),
    };


    /**
     * Gets the "Link" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.LinkType getLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.LinkType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.LinkType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Link" element
     */
    @Override
    public void setLink(org.sdmx.resources.sdmxml.schemas.v30.common.LinkType link) {
        generatedSetterHelperImpl(link, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Link" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.LinkType addNewLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.LinkType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.LinkType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
