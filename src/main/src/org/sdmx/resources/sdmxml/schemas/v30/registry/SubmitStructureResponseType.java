/*
 * XML Type:  SubmitStructureResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitStructureResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmitStructureResponseType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitstructureresponsetype3f7etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SubmissionResult" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType> getSubmissionResultList();

    /**
     * Gets array of all "SubmissionResult" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType[] getSubmissionResultArray();

    /**
     * Gets ith "SubmissionResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType getSubmissionResultArray(int i);

    /**
     * Returns number of "SubmissionResult" element
     */
    int sizeOfSubmissionResultArray();

    /**
     * Sets ith "SubmissionResult" element
     */
    void setSubmissionResultArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType submissionResult);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmissionResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType insertNewSubmissionResult(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SubmissionResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType addNewSubmissionResult();

    /**
     * Removes the ith "SubmissionResult" element
     */
    void removeSubmissionResult(int i);
}
