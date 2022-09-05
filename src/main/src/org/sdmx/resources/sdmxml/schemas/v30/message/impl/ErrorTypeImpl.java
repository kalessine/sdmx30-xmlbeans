/*
 * XML Type:  ErrorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ErrorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class ErrorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.ErrorType {
    private static final long serialVersionUID = 1L;

    public ErrorTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "ErrorMessage"),
    };


    /**
     * Gets a List of "ErrorMessage" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType> getErrorMessageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getErrorMessageArray,
                this::setErrorMessageArray,
                this::insertNewErrorMessage,
                this::removeErrorMessage,
                this::sizeOfErrorMessageArray
            );
        }
    }

    /**
     * Gets array of all "ErrorMessage" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType[] getErrorMessageArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType[0]);
    }

    /**
     * Gets ith "ErrorMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType getErrorMessageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ErrorMessage" element
     */
    @Override
    public int sizeOfErrorMessageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ErrorMessage" element
     */
    @Override
    public void setErrorMessageArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType errorMessage) {
        generatedSetterHelperImpl(errorMessage, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ErrorMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType insertNewErrorMessage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ErrorMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType addNewErrorMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodedStatusMessageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ErrorMessage" element
     */
    @Override
    public void removeErrorMessage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
