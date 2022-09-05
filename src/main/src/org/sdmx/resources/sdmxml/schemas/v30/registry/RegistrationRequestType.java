/*
 * XML Type:  RegistrationRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RegistrationRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface RegistrationRequestType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "registrationrequesttypedac4type");
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

    /**
     * Gets the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction();

    /**
     * Gets (as xml) the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction();

    /**
     * Sets the "action" attribute
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action);

    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action);
}
