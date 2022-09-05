/*
 * XML Type:  VersionableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.VersionableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VersionableType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface VersionableType extends org.sdmx.resources.sdmxml.schemas.v30.common.NameableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.VersionableType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "versionabletypeb216type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "version" attribute
     */
    java.lang.String getVersion();

    /**
     * Gets (as xml) the "version" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.VersionType xgetVersion();

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
    void xsetVersion(org.sdmx.resources.sdmxml.schemas.v30.common.VersionType version);

    /**
     * Unsets the "version" attribute
     */
    void unsetVersion();

    /**
     * Gets the "validFrom" attribute
     */
    java.util.Calendar getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.util.Calendar validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.util.Calendar getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.util.Calendar validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
