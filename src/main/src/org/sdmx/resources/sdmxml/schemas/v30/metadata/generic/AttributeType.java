/*
 * XML Type:  AttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.metadata.generic;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic).
 *
 * This is a complex type.
 */
public interface AttributeType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "attributetypeeff8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Value" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnySimpleType> getValueList();

    /**
     * Gets array of all "Value" elements
     */
    org.apache.xmlbeans.XmlAnySimpleType[] getValueArray();

    /**
     * Gets ith "Value" element
     */
    org.apache.xmlbeans.XmlAnySimpleType getValueArray(int i);

    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();

    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, org.apache.xmlbeans.XmlAnySimpleType value);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.apache.xmlbeans.XmlAnySimpleType insertNewValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewValue();

    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);

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

    /**
     * Gets a List of "Attribute" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType> getAttributeList();

    /**
     * Gets array of all "Attribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType[] getAttributeArray();

    /**
     * Gets ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType getAttributeArray(int i);

    /**
     * Returns number of "Attribute" element
     */
    int sizeOfAttributeArray();

    /**
     * Sets ith "Attribute" element
     */
    void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType attribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType insertNewAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType addNewAttribute();

    /**
     * Removes the ith "Attribute" element
     */
    void removeAttribute(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);
}
