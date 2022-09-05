/*
 * XML Type:  MessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.MessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class MessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.MessageType {
    private static final long serialVersionUID = 1L;

    public MessageTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Header"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer", "Footer"),
    };


    /**
     * Gets the "Header" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType getHeader() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Header" element
     */
    @Override
    public void setHeader(org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType header) {
        generatedSetterHelperImpl(header, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Header" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType addNewHeader() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "Footer" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType getFooter() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Footer" element
     */
    @Override
    public boolean isSetFooter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Footer" element
     */
    @Override
    public void setFooter(org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType footer) {
        generatedSetterHelperImpl(footer, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Footer" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType addNewFooter() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Footer" element
     */
    @Override
    public void unsetFooter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
