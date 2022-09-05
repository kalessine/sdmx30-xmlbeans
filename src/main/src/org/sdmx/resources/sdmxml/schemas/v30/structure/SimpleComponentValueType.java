/*
 * XML Type:  SimpleComponentValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SimpleComponentValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType.
 */
public interface SimpleComponentValueType extends org.apache.xmlbeans.XmlString {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "simplecomponentvaluetype722etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "cascadeValues" attribute
     */
    java.lang.Object getCascadeValues();

    /**
     * Gets (as xml) the "cascadeValues" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType xgetCascadeValues();

    /**
     * True if has "cascadeValues" attribute
     */
    boolean isSetCascadeValues();

    /**
     * Sets the "cascadeValues" attribute
     */
    void setCascadeValues(java.lang.Object cascadeValues);

    /**
     * Sets (as xml) the "cascadeValues" attribute
     */
    void xsetCascadeValues(org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType cascadeValues);

    /**
     * Unsets the "cascadeValues" attribute
     */
    void unsetCascadeValues();

    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();

    /**
     * Gets (as xml) the "lang" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLang();

    /**
     * True if has "lang" attribute
     */
    boolean isSetLang();

    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);

    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.apache.xmlbeans.XmlLanguage lang);

    /**
     * Unsets the "lang" attribute
     */
    void unsetLang();

    /**
     * Gets the "validFrom" attribute
     */
    java.lang.Object getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.lang.Object validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.lang.Object getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.lang.Object validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
