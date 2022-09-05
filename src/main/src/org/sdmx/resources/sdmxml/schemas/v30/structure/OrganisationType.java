/*
 * XML Type:  OrganisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML OrganisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface OrganisationType extends org.sdmx.resources.sdmxml.schemas.v30.structure.BaseOrganisationType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "organisationtypeb342type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Contact" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType> getContactList();

    /**
     * Gets array of all "Contact" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType[] getContactArray();

    /**
     * Gets ith "Contact" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType getContactArray(int i);

    /**
     * Returns number of "Contact" element
     */
    int sizeOfContactArray();

    /**
     * Sets ith "Contact" element
     */
    void setContactArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType contact);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Contact" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType insertNewContact(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Contact" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType addNewContact();

    /**
     * Removes the ith "Contact" element
     */
    void removeContact(int i);
}
