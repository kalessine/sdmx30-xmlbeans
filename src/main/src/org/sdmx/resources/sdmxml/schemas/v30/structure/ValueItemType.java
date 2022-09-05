/*
 * XML Type:  ValueItemType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueItemType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ValueItemType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "valueitemtype051atype");
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
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
}
