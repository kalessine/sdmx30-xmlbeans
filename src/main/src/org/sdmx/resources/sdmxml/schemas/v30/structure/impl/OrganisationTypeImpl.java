/*
 * XML Type:  OrganisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML OrganisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class OrganisationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.BaseOrganisationTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType {
    private static final long serialVersionUID = 1L;

    public OrganisationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Contact"),
    };


    /**
     * Gets a List of "Contact" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType> getContactList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType[] getContactArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType[0]);
    }

    /**
     * Gets ith "Contact" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType getContactArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Contact" element
     */
    @Override
    public void setContactArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType contact) {
        generatedSetterHelperImpl(contact, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Contact" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType insertNewContact(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Contact" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType addNewContact() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
