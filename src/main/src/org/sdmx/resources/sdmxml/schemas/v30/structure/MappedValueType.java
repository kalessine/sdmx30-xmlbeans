/*
 * XML Type:  MappedValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MappedValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType.
 */
public interface MappedValueType extends org.apache.xmlbeans.XmlString {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "mappedvaluetype1634type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "isRegEx" attribute
     */
    boolean getIsRegEx();

    /**
     * Gets (as xml) the "isRegEx" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRegEx();

    /**
     * True if has "isRegEx" attribute
     */
    boolean isSetIsRegEx();

    /**
     * Sets the "isRegEx" attribute
     */
    void setIsRegEx(boolean isRegEx);

    /**
     * Sets (as xml) the "isRegEx" attribute
     */
    void xsetIsRegEx(org.apache.xmlbeans.XmlBoolean isRegEx);

    /**
     * Unsets the "isRegEx" attribute
     */
    void unsetIsRegEx();

    /**
     * Gets the "startIndex" attribute
     */
    int getStartIndex();

    /**
     * Gets (as xml) the "startIndex" attribute
     */
    org.apache.xmlbeans.XmlInt xgetStartIndex();

    /**
     * True if has "startIndex" attribute
     */
    boolean isSetStartIndex();

    /**
     * Sets the "startIndex" attribute
     */
    void setStartIndex(int startIndex);

    /**
     * Sets (as xml) the "startIndex" attribute
     */
    void xsetStartIndex(org.apache.xmlbeans.XmlInt startIndex);

    /**
     * Unsets the "startIndex" attribute
     */
    void unsetStartIndex();

    /**
     * Gets the "endIndex" attribute
     */
    int getEndIndex();

    /**
     * Gets (as xml) the "endIndex" attribute
     */
    org.apache.xmlbeans.XmlInt xgetEndIndex();

    /**
     * True if has "endIndex" attribute
     */
    boolean isSetEndIndex();

    /**
     * Sets the "endIndex" attribute
     */
    void setEndIndex(int endIndex);

    /**
     * Sets (as xml) the "endIndex" attribute
     */
    void xsetEndIndex(org.apache.xmlbeans.XmlInt endIndex);

    /**
     * Unsets the "endIndex" attribute
     */
    void unsetEndIndex();
}
