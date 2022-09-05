/*
 * XML Type:  QueryableDataSourceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QueryableDataSourceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface QueryableDataSourceType extends org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "queryabledatasourcetype9c13type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TYPE" attribute
     */
    java.lang.String getTYPE();

    /**
     * Gets (as xml) the "TYPE" attribute
     */
    org.apache.xmlbeans.XmlString xgetTYPE();

    /**
     * True if has "TYPE" attribute
     */
    boolean isSetTYPE();

    /**
     * Sets the "TYPE" attribute
     */
    void setTYPE(java.lang.String type);

    /**
     * Sets (as xml) the "TYPE" attribute
     */
    void xsetTYPE(org.apache.xmlbeans.XmlString type);

    /**
     * Unsets the "TYPE" attribute
     */
    void unsetTYPE();
}
