/*
 * XML Type:  SubmitStructureResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitStructureResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface SubmitStructureResponseType extends org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitstructureresponsetype84a6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubmitStructureResponse" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType getSubmitStructureResponse();

    /**
     * True if has "SubmitStructureResponse" element
     */
    boolean isSetSubmitStructureResponse();

    /**
     * Sets the "SubmitStructureResponse" element
     */
    void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType submitStructureResponse);

    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType addNewSubmitStructureResponse();

    /**
     * Unsets the "SubmitStructureResponse" element
     */
    void unsetSubmitStructureResponse();
}
