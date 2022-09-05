/*
 * XML Type:  StatusMessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StatusMessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class StatusMessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType {
    private static final long serialVersionUID = 1L;

    public StatusMessageTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MessageText"),
        new QName("", "status"),
    };


    /**
     * Gets a List of "MessageText" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType> getMessageTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMessageTextArray,
                this::setMessageTextArray,
                this::insertNewMessageText,
                this::removeMessageText,
                this::sizeOfMessageTextArray
            );
        }
    }

    /**
     * Gets array of all "MessageText" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType[] getMessageTextArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType[0]);
    }

    /**
     * Gets ith "MessageText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType getMessageTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MessageText" element
     */
    @Override
    public int sizeOfMessageTextArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MessageText" element
     */
    @Override
    public void setMessageTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType messageText) {
        generatedSetterHelperImpl(messageText, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MessageText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType insertNewMessageText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MessageText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType addNewMessageText() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MessageText" element
     */
    @Override
    public void removeMessageText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "status" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType.Enum getStatus() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "status" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType xgetStatus() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "status" attribute
     */
    @Override
    public void setStatus(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType.Enum status) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(status);
        }
    }

    /**
     * Sets (as xml) the "status" attribute
     */
    @Override
    public void xsetStatus(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType status) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(status);
        }
    }
}
