/*
 * XML Type:  VersionableQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VersionableQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface VersionableQueryType extends org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableQueryType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableQueryType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "versionablequerytype14b2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "version" attribute
     */
    java.lang.String getVersion();

    /**
     * Gets (as xml) the "version" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType xgetVersion();

    /**
     * True if has "version" attribute
     */
    boolean isSetVersion();

    /**
     * Sets the "version" attribute
     */
    void setVersion(java.lang.String version);

    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType version);

    /**
     * Unsets the "version" attribute
     */
    void unsetVersion();
}
