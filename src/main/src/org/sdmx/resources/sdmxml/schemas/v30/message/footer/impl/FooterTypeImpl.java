/*
 * XML Type:  FooterType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.footer.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML FooterType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer).
 *
 * This is a complex type.
 */
public class FooterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType {
    private static final long serialVersionUID = 1L;

    public FooterTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer", "Message"),
    };


    /**
     * Gets a List of "Message" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType> getMessageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMessageArray,
                this::setMessageArray,
                this::insertNewMessage,
                this::removeMessage,
                this::sizeOfMessageArray
            );
        }
    }

    /**
     * Gets array of all "Message" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType[] getMessageArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType[0]);
    }

    /**
     * Gets ith "Message" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType getMessageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Message" element
     */
    @Override
    public int sizeOfMessageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Message" element
     */
    @Override
    public void setMessageArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType message) {
        generatedSetterHelperImpl(message, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Message" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType insertNewMessage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Message" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType addNewMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Message" element
     */
    @Override
    public void removeMessage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
