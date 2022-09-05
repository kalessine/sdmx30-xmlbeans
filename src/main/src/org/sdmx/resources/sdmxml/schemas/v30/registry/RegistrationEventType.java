/*
 * XML Type:  RegistrationEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RegistrationEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface RegistrationEventType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "registrationeventtype35d9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Registration" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType getRegistration();

    /**
     * Sets the "Registration" element
     */
    void setRegistration(org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType registration);

    /**
     * Appends and returns a new empty "Registration" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType addNewRegistration();
}
