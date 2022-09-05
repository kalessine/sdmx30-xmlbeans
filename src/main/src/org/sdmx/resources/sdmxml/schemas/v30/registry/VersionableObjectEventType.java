/*
 * XML Type:  VersionableObjectEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VersionableObjectEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface VersionableObjectEventType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "versionableobjecteventtype8dbftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "All" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAll();

    /**
     * True if has "All" element
     */
    boolean isSetAll();

    /**
     * Sets the "All" element
     */
    void setAll(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType all);

    /**
     * Appends and returns a new empty "All" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAll();

    /**
     * Unsets the "All" element
     */
    void unsetAll();

    /**
     * Gets the "URN" element
     */
    java.lang.String getURN();

    /**
     * Gets (as xml) the "URN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetURN();

    /**
     * True if has "URN" element
     */
    boolean isSetURN();

    /**
     * Sets the "URN" element
     */
    void setURN(java.lang.String urn);

    /**
     * Sets (as xml) the "URN" element
     */
    void xsetURN(org.apache.xmlbeans.XmlAnyURI urn);

    /**
     * Unsets the "URN" element
     */
    void unsetURN();

    /**
     * Gets the "ID" element
     */
    java.lang.String getID();

    /**
     * Gets (as xml) the "ID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType xgetID();

    /**
     * True if has "ID" element
     */
    boolean isSetID();

    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);

    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType id);

    /**
     * Unsets the "ID" element
     */
    void unsetID();

    /**
     * Gets the "Version" element
     */
    java.lang.String getVersion();

    /**
     * Gets (as xml) the "Version" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType xgetVersion();

    /**
     * True if has "Version" element
     */
    boolean isSetVersion();

    /**
     * Sets the "Version" element
     */
    void setVersion(java.lang.String version);

    /**
     * Sets (as xml) the "Version" element
     */
    void xsetVersion(org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType version);

    /**
     * Unsets the "Version" element
     */
    void unsetVersion();
}
