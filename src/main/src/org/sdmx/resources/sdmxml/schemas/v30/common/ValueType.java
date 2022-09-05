/*
 * XML Type:  ValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.ValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface ValueType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.ValueType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "valuetype19f7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Text" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getTextList();

    /**
     * Gets array of all "Text" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getTextArray();

    /**
     * Gets ith "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getTextArray(int i);

    /**
     * Returns number of "Text" element
     */
    int sizeOfTextArray();

    /**
     * Sets ith "Text" element
     */
    void setTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType text);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewText(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewText();

    /**
     * Removes the ith "Text" element
     */
    void removeText(int i);

    /**
     * Gets a List of "StructuredText" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType> getStructuredTextList();

    /**
     * Gets array of all "StructuredText" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType[] getStructuredTextArray();

    /**
     * Gets ith "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType getStructuredTextArray(int i);

    /**
     * Returns number of "StructuredText" element
     */
    int sizeOfStructuredTextArray();

    /**
     * Sets ith "StructuredText" element
     */
    void setStructuredTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType structuredText);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType insertNewStructuredText(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.XHTMLType addNewStructuredText();

    /**
     * Removes the ith "StructuredText" element
     */
    void removeStructuredText(int i);
}
