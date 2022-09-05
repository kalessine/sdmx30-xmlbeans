/*
 * XML Type:  QueryRegistrationResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML QueryRegistrationResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class QueryRegistrationResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType {
    private static final long serialVersionUID = 1L;

    public QueryRegistrationResponseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StatusMessage"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "QueryResult"),
    };


    /**
     * Gets the "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType getStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StatusMessage" element
     */
    @Override
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType statusMessage) {
        generatedSetterHelperImpl(statusMessage, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType addNewStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets a List of "QueryResult" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType> getQueryResultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getQueryResultArray,
                this::setQueryResultArray,
                this::insertNewQueryResult,
                this::removeQueryResult,
                this::sizeOfQueryResultArray
            );
        }
    }

    /**
     * Gets array of all "QueryResult" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType[] getQueryResultArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType[0]);
    }

    /**
     * Gets ith "QueryResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType getQueryResultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "QueryResult" element
     */
    @Override
    public int sizeOfQueryResultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "QueryResult" element
     */
    @Override
    public void setQueryResultArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType queryResult) {
        generatedSetterHelperImpl(queryResult, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType insertNewQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "QueryResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType addNewQueryResult() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "QueryResult" element
     */
    @Override
    public void removeQueryResult(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
