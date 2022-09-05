/*
 * XML Type:  DatePatternMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DatePatternMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DatePatternMapType extends org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DatePatternMapType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datepatternmaptypef622type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "sourcePattern" attribute
     */
    java.lang.String getSourcePattern();

    /**
     * Gets (as xml) the "sourcePattern" attribute
     */
    org.apache.xmlbeans.XmlString xgetSourcePattern();

    /**
     * Sets the "sourcePattern" attribute
     */
    void setSourcePattern(java.lang.String sourcePattern);

    /**
     * Sets (as xml) the "sourcePattern" attribute
     */
    void xsetSourcePattern(org.apache.xmlbeans.XmlString sourcePattern);

    /**
     * Gets the "locale" attribute
     */
    java.lang.String getLocale();

    /**
     * Gets (as xml) the "locale" attribute
     */
    org.apache.xmlbeans.XmlString xgetLocale();

    /**
     * Sets the "locale" attribute
     */
    void setLocale(java.lang.String locale);

    /**
     * Sets (as xml) the "locale" attribute
     */
    void xsetLocale(org.apache.xmlbeans.XmlString locale);
}
