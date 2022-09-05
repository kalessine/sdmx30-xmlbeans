/*
 * XML Type:  GenericMetadataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GenericMetadataType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface GenericMetadataType extends org.sdmx.resources.sdmxml.schemas.v30.message.MessageType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "genericmetadatatype42b0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataSet" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType> getMetadataSetList();

    /**
     * Gets array of all "MetadataSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType[] getMetadataSetArray();

    /**
     * Gets ith "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType getMetadataSetArray(int i);

    /**
     * Returns number of "MetadataSet" element
     */
    int sizeOfMetadataSetArray();

    /**
     * Sets ith "MetadataSet" element
     */
    void setMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType metadataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType insertNewMetadataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType addNewMetadataSet();

    /**
     * Removes the ith "MetadataSet" element
     */
    void removeMetadataSet(int i);
}
