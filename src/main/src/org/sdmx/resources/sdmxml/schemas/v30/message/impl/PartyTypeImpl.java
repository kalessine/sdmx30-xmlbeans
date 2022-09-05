/*
 * XML Type:  PartyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.PartyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PartyType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class PartyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.PartyType {
    private static final long serialVersionUID = 1L;

    public PartyTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Name"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Contact"),
        new QName("", "id"),
    };


    /**
     * Gets a List of "Name" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameArray,
                this::setNameArray,
                this::insertNewName,
                this::removeName,
                this::sizeOfNameArray
            );
        }
    }

    /**
     * Gets array of all "Name" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Name" element
     */
    @Override
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
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

    /**
     * Removes the ith "Name" element
     */
    @Override
    public void removeName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Contact" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.ContactType> getContactList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getContactArray,
                this::setContactArray,
                this::insertNewContact,
                this::removeContact,
                this::sizeOfContactArray
            );
        }
    }

    /**
     * Gets array of all "Contact" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.ContactType[] getContactArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.message.ContactType[0]);
    }

    /**
     * Gets ith "Contact" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.ContactType getContactArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.ContactType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Contact" element
     */
    @Override
    public int sizeOfContactArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Contact" element
     */
    @Override
    public void setContactArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.ContactType contact) {
        generatedSetterHelperImpl(contact, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Contact" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.ContactType insertNewContact(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.ContactType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Contact" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.ContactType addNewContact() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.ContactType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Contact" element
     */
    @Override
    public void removeContact(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(id);
        }
    }
}
