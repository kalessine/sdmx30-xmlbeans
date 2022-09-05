/*
 * XML Type:  SubmitRegistrationsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitRegistrationsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmitRegistrationsRequestType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitregistrationsrequesttypefc3btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "RegistrationRequest" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType> getRegistrationRequestList();

    /**
     * Gets array of all "RegistrationRequest" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType[] getRegistrationRequestArray();

    /**
     * Gets ith "RegistrationRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType getRegistrationRequestArray(int i);

    /**
     * Returns number of "RegistrationRequest" element
     */
    int sizeOfRegistrationRequestArray();

    /**
     * Sets ith "RegistrationRequest" element
     */
    void setRegistrationRequestArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType registrationRequest);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType insertNewRegistrationRequest(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType addNewRegistrationRequest();

    /**
     * Removes the ith "RegistrationRequest" element
     */
    void removeRegistrationRequest(int i);
}
