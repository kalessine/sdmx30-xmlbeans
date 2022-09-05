/*
 * XML Type:  PartyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.PartyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PartyType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface PartyType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.PartyType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "partytype4c30type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Name" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getNameList();

    /**
     * Gets array of all "Name" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getNameArray();

    /**
     * Gets ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getNameArray(int i);

    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();

    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewName();

    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);

    /**
     * Gets a List of "Contact" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.ContactType> getContactList();

    /**
     * Gets array of all "Contact" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.ContactType[] getContactArray();

    /**
     * Gets ith "Contact" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.ContactType getContactArray(int i);

    /**
     * Returns number of "Contact" element
     */
    int sizeOfContactArray();

    /**
     * Sets ith "Contact" element
     */
    void setContactArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.ContactType contact);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Contact" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.ContactType insertNewContact(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Contact" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.ContactType addNewContact();

    /**
     * Removes the ith "Contact" element
     */
    void removeContact(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);
}
