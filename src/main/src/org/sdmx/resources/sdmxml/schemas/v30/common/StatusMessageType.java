/*
 * XML Type:  StatusMessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StatusMessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface StatusMessageType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.StatusMessageType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "statusmessagetypee533type");
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
     * Gets the "code" attribute
     */
    java.lang.String getCode();

    /**
     * Gets (as xml) the "code" attribute
     */
    org.apache.xmlbeans.XmlString xgetCode();

    /**
     * True if has "code" attribute
     */
    boolean isSetCode();

    /**
     * Sets the "code" attribute
     */
    void setCode(java.lang.String code);

    /**
     * Sets (as xml) the "code" attribute
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);

    /**
     * Unsets the "code" attribute
     */
    void unsetCode();
}
