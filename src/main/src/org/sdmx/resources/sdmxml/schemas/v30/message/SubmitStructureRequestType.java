/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface SubmitStructureRequestType extends org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitstructurerequesttype45d0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubmitStructureRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType getSubmitStructureRequest();

    /**
     * True if has "SubmitStructureRequest" element
     */
    boolean isSetSubmitStructureRequest();

    /**
     * Sets the "SubmitStructureRequest" element
     */
    void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType submitStructureRequest);

    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType addNewSubmitStructureRequest();

    /**
     * Unsets the "SubmitStructureRequest" element
     */
    void unsetSubmitStructureRequest();
}
