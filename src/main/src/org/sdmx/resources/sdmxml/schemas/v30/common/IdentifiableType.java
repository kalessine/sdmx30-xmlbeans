/*
 * XML Type:  IdentifiableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.IdentifiableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML IdentifiableType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface IdentifiableType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.IdentifiableType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "identifiabletype1a80type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Link" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.LinkType> getLinkList();

    /**
     * Gets array of all "Link" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType[] getLinkArray();

    /**
     * Gets ith "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType getLinkArray(int i);

    /**
     * Returns number of "Link" element
     */
    int sizeOfLinkArray();

    /**
     * Sets ith "Link" element
     */
    void setLinkArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.LinkType link);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType insertNewLink(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType addNewLink();

    /**
     * Removes the ith "Link" element
     */
    void removeLink(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "urn" attribute
     */
    java.lang.String getUrn();

    /**
     * Gets (as xml) the "urn" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UrnType xgetUrn();

    /**
     * True if has "urn" attribute
     */
    boolean isSetUrn();

    /**
     * Sets the "urn" attribute
     */
    void setUrn(java.lang.String urn);

    /**
     * Sets (as xml) the "urn" attribute
     */
    void xsetUrn(org.sdmx.resources.sdmxml.schemas.v30.common.UrnType urn);

    /**
     * Unsets the "urn" attribute
     */
    void unsetUrn();

    /**
     * Gets the "uri" attribute
     */
    java.lang.String getUri();

    /**
     * Gets (as xml) the "uri" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetUri();

    /**
     * True if has "uri" attribute
     */
    boolean isSetUri();

    /**
     * Sets the "uri" attribute
     */
    void setUri(java.lang.String uri);

    /**
     * Sets (as xml) the "uri" attribute
     */
    void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);

    /**
     * Unsets the "uri" attribute
     */
    void unsetUri();
}
