/*
 * An XML document type.
 * Localname: SubmitStructureResponse
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SubmitStructureResponse(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public interface SubmitStructureResponseDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitstructureresponse7b3cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubmitStructureResponse" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType getSubmitStructureResponse();

    /**
     * Sets the "SubmitStructureResponse" element
     */
    void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType submitStructureResponse);

    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureResponseType addNewSubmitStructureResponse();
}
