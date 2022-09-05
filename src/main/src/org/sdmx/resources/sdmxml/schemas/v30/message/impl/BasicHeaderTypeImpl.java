/*
 * XML Type:  BasicHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.BasicHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML BasicHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class BasicHeaderTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.BaseHeaderTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.BasicHeaderType {
    private static final long serialVersionUID = 1L;

    public BasicHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Receiver"),
    };


    /**
     * Gets a List of "Receiver" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.PartyType> getReceiverList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReceiverArray,
                this::setReceiverArray,
                this::insertNewReceiver,
                this::removeReceiver,
                this::sizeOfReceiverArray
            );
        }
    }

    /**
     * Gets array of all "Receiver" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType[] getReceiverArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.message.PartyType[0]);
    }

    /**
     * Gets ith "Receiver" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType getReceiverArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.PartyType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Receiver" element
     */
    @Override
    public int sizeOfReceiverArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Receiver" element
     */
    @Override
    public void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.PartyType receiver) {
        generatedSetterHelperImpl(receiver, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType insertNewReceiver(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.PartyType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType addNewReceiver() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.PartyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Receiver" element
     */
    @Override
    public void removeReceiver(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
