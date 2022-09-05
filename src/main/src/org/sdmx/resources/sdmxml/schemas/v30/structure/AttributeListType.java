/*
 * XML Type:  AttributeListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AttributeListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface AttributeListType extends org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "attributelisttype72d0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Attribute" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType> getAttributeList();

    /**
     * Gets array of all "Attribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType[] getAttributeArray();

    /**
     * Gets ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType getAttributeArray(int i);

    /**
     * Returns number of "Attribute" element
     */
    int sizeOfAttributeArray();

    /**
     * Sets ith "Attribute" element
     */
    void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType attribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType insertNewAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType addNewAttribute();

    /**
     * Removes the ith "Attribute" element
     */
    void removeAttribute(int i);

    /**
     * Gets a List of "MetadataAttributeUsage" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType> getMetadataAttributeUsageList();

    /**
     * Gets array of all "MetadataAttributeUsage" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType[] getMetadataAttributeUsageArray();

    /**
     * Gets ith "MetadataAttributeUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType getMetadataAttributeUsageArray(int i);

    /**
     * Returns number of "MetadataAttributeUsage" element
     */
    int sizeOfMetadataAttributeUsageArray();

    /**
     * Sets ith "MetadataAttributeUsage" element
     */
    void setMetadataAttributeUsageArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType metadataAttributeUsage);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttributeUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType insertNewMetadataAttributeUsage(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttributeUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType addNewMetadataAttributeUsage();

    /**
     * Removes the ith "MetadataAttributeUsage" element
     */
    void removeMetadataAttributeUsage(int i);
}
