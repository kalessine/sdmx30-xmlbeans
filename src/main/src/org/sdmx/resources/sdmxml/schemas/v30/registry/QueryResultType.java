/*
 * XML Type:  QueryResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QueryResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface QueryResultType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "queryresulttypefa75type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType getDataResult();

    /**
     * True if has "DataResult" element
     */
    boolean isSetDataResult();

    /**
     * Sets the "DataResult" element
     */
    void setDataResult(org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType dataResult);

    /**
     * Appends and returns a new empty "DataResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType addNewDataResult();

    /**
     * Unsets the "DataResult" element
     */
    void unsetDataResult();

    /**
     * Gets the "MetadataResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType getMetadataResult();

    /**
     * True if has "MetadataResult" element
     */
    boolean isSetMetadataResult();

    /**
     * Sets the "MetadataResult" element
     */
    void setMetadataResult(org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType metadataResult);

    /**
     * Appends and returns a new empty "MetadataResult" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType addNewMetadataResult();

    /**
     * Unsets the "MetadataResult" element
     */
    void unsetMetadataResult();

    /**
     * Gets the "timeSeriesMatch" attribute
     */
    boolean getTimeSeriesMatch();

    /**
     * Gets (as xml) the "timeSeriesMatch" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTimeSeriesMatch();

    /**
     * Sets the "timeSeriesMatch" attribute
     */
    void setTimeSeriesMatch(boolean timeSeriesMatch);

    /**
     * Sets (as xml) the "timeSeriesMatch" attribute
     */
    void xsetTimeSeriesMatch(org.apache.xmlbeans.XmlBoolean timeSeriesMatch);
}
