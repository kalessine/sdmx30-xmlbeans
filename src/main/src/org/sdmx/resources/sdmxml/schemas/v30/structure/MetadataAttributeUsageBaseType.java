/*
 * XML Type:  MetadataAttributeUsageBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataAttributeUsageBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataAttributeUsageBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributeusagebasetype250dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Link" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.LinkType> getLinkList();

    /**
     * Gets array of all "Link" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType[] getLinkArray();

    /**
     * Gets ith "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType getLinkArray(int i);

    /**
     * Returns number of "Link" element
     */
    int sizeOfLinkArray();

    /**
     * Sets ith "Link" element
     */
    void setLinkArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.LinkType link);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType insertNewLink(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.LinkType addNewLink();

    /**
     * Removes the ith "Link" element
     */
    void removeLink(int i);
}
