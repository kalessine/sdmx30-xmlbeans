/*
 * XML Type:  LinkType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.LinkType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LinkType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface LinkType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.LinkType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "linktype3a5ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "rel" attribute
     */
    java.lang.String getRel();

    /**
     * Gets (as xml) the "rel" attribute
     */
    org.apache.xmlbeans.XmlString xgetRel();

    /**
     * Sets the "rel" attribute
     */
    void setRel(java.lang.String rel);

    /**
     * Sets (as xml) the "rel" attribute
     */
    void xsetRel(org.apache.xmlbeans.XmlString rel);

    /**
     * Gets the "url" attribute
     */
    java.lang.String getUrl();

    /**
     * Gets (as xml) the "url" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetUrl();

    /**
     * Sets the "url" attribute
     */
    void setUrl(java.lang.String url);

    /**
     * Sets (as xml) the "url" attribute
     */
    void xsetUrl(org.apache.xmlbeans.XmlAnyURI url);

    /**
     * Gets the "urn" attribute
     */
    java.lang.String getUrn();

    /**
     * Gets (as xml) the "urn" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetUrn();

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
    void xsetUrn(org.apache.xmlbeans.XmlAnyURI urn);

    /**
     * Unsets the "urn" attribute
     */
    void unsetUrn();

    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();
}
