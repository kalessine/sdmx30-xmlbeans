/*
 * XML Type:  SubmitRegistrationsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitRegistrationsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmitRegistrationsResponseType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitregistrationsresponsetypefbb7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "RegistrationStatus" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType> getRegistrationStatusList();

    /**
     * Gets array of all "RegistrationStatus" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType[] getRegistrationStatusArray();

    /**
     * Gets ith "RegistrationStatus" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType getRegistrationStatusArray(int i);

    /**
     * Returns number of "RegistrationStatus" element
     */
    int sizeOfRegistrationStatusArray();

    /**
     * Sets ith "RegistrationStatus" element
     */
    void setRegistrationStatusArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType registrationStatus);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationStatus" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType insertNewRegistrationStatus(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationStatus" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationStatusType addNewRegistrationStatus();

    /**
     * Removes the ith "RegistrationStatus" element
     */
    void removeRegistrationStatus(int i);
}
