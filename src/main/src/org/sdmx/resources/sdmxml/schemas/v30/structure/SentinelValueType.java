/*
 * XML Type:  SentinelValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SentinelValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface SentinelValueType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.SentinelValueType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "sentinelvaluetypea923type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Name" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getNameList();

    /**
     * Gets array of all "Name" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getNameArray();

    /**
     * Gets ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getNameArray(int i);

    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();

    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewName();

    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);

    /**
     * Gets a List of "Description" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getDescriptionList();

    /**
     * Gets array of all "Description" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getDescriptionArray();

    /**
     * Gets ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getDescriptionArray(int i);

    /**
     * Returns number of "Description" element
     */
    int sizeOfDescriptionArray();

    /**
     * Sets ith "Description" element
     */
    void setDescriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType description);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewDescription(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewDescription();

    /**
     * Removes the ith "Description" element
     */
    void removeDescription(int i);

    /**
     * Gets the "value" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getValue();

    /**
     * Sets the "value" attribute
     */
    void setValue(org.apache.xmlbeans.XmlAnySimpleType value);

    /**
     * Appends and returns a new empty "value" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewValue();
}
