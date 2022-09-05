/*
 * XML Type:  DataSourceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.DataSourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataSourceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface DataSourceType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.DataSourceType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datasourcetype1d63type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SimpleDataSource" elements
     */
    java.util.List<java.lang.String> getSimpleDataSourceList();

    /**
     * Gets array of all "SimpleDataSource" elements
     */
    java.lang.String[] getSimpleDataSourceArray();

    /**
     * Gets ith "SimpleDataSource" element
     */
    java.lang.String getSimpleDataSourceArray(int i);

    /**
     * Gets (as xml) a List of "SimpleDataSource" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetSimpleDataSourceList();

    /**
     * Gets (as xml) array of all "SimpleDataSource" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetSimpleDataSourceArray();

    /**
     * Gets (as xml) ith "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSimpleDataSourceArray(int i);

    /**
     * Returns number of "SimpleDataSource" element
     */
    int sizeOfSimpleDataSourceArray();

    /**
     * Sets ith "SimpleDataSource" element
     */
    void setSimpleDataSourceArray(int i, java.lang.String simpleDataSource);

    /**
     * Sets (as xml) array of all "SimpleDataSource" element
     */
    void xsetSimpleDataSourceArray(org.apache.xmlbeans.XmlAnyURI[] simpleDataSourceArray);

    /**
     * Sets (as xml) ith "SimpleDataSource" element
     */
    void xsetSimpleDataSourceArray(int i, org.apache.xmlbeans.XmlAnyURI simpleDataSource);

    /**
     * Inserts the value as the ith "SimpleDataSource" element
     */
    void insertSimpleDataSource(int i, java.lang.String simpleDataSource);

    /**
     * Appends the value as the last "SimpleDataSource" element
     */
    void addSimpleDataSource(java.lang.String simpleDataSource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewSimpleDataSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewSimpleDataSource();

    /**
     * Removes the ith "SimpleDataSource" element
     */
    void removeSimpleDataSource(int i);

    /**
     * Gets a List of "QueryableDataSource" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType> getQueryableDataSourceList();

    /**
     * Gets array of all "QueryableDataSource" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType[] getQueryableDataSourceArray();

    /**
     * Gets ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType getQueryableDataSourceArray(int i);

    /**
     * Returns number of "QueryableDataSource" element
     */
    int sizeOfQueryableDataSourceArray();

    /**
     * Sets ith "QueryableDataSource" element
     */
    void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType queryableDataSource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType insertNewQueryableDataSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType addNewQueryableDataSource();

    /**
     * Removes the ith "QueryableDataSource" element
     */
    void removeQueryableDataSource(int i);
}
