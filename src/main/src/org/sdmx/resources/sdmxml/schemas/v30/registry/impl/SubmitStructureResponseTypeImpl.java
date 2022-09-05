/*
 * XML Type:  SubmitStructureResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitStructureResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubmitStructureResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType {
    private static final long serialVersionUID = 1L;

    public SubmitStructureResponseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubmissionResult"),
    };


    /**
     * Gets a List of "SubmissionResult" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType> getSubmissionResultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubmissionResultArray,
                this::setSubmissionResultArray,
                this::insertNewSubmissionResult,
                this::removeSubmissionResult,
                this::sizeOfSubmissionResultArray
            );
        }
    }

    /**
     * Gets array of all "SubmissionResult" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType[] getSubmissionResultArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType[0]);
    }

    /**
     * Gets ith "SubmissionResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType getSubmissionResultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SubmissionResult" element
     */
    @Override
    public int sizeOfSubmissionResultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "SubmissionResult" element
     */
    @Override
    public void setSubmissionResultArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType submissionResult) {
        generatedSetterHelperImpl(submissionResult, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmissionResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType insertNewSubmissionResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SubmissionResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType addNewSubmissionResult() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmissionResultType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "SubmissionResult" element
     */
    @Override
    public void removeSubmissionResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
