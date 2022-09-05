/*
 * XML Type:  QueryRegistrationResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QueryRegistrationResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface QueryRegistrationResponseType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "queryregistrationresponsetype2118type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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

    /**
     * Gets a List of "QueryResult" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType> getQueryResultList();

    /**
     * Gets array of all "QueryResult" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType[] getQueryResultArray();

    /**
     * Gets ith "QueryResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType getQueryResultArray(int i);

    /**
     * Returns number of "QueryResult" element
     */
    int sizeOfQueryResultArray();

    /**
     * Sets ith "QueryResult" element
     */
    void setQueryResultArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType queryResult);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType insertNewQueryResult(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "QueryResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType addNewQueryResult();

    /**
     * Removes the ith "QueryResult" element
     */
    void removeQueryResult(int i);
}
