/*
 * XML Type:  SubmissionResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmissionResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmissionResultType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submissionresulttype317ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType getSubmittedStructure();

    /**
     * Sets the "SubmittedStructure" element
     */
    void setSubmittedStructure(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType submittedStructure);

    /**
     * Appends and returns a new empty "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType addNewSubmittedStructure();

    /**
     * Gets the "StatusMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType getStatusMessage();

    /**
     * Sets the "StatusMessage" element
     */
    void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType statusMessage);

    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType addNewStatusMessage();
}
