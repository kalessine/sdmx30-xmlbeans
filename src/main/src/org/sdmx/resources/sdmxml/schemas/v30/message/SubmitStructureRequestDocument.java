/*
 * An XML document type.
 * Localname: SubmitStructureRequest
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SubmitStructureRequest(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public interface SubmitStructureRequestDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitstructurerequest5b86doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubmitStructureRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType getSubmitStructureRequest();

    /**
     * Sets the "SubmitStructureRequest" element
     */
    void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType submitStructureRequest);

    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.SubmitStructureRequestType addNewSubmitStructureRequest();
}
