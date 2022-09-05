/*
 * XML Type:  MetadataflowsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataflowsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataflowsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataflowstypec0actype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Metadataflow" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType> getMetadataflowList();

    /**
     * Gets array of all "Metadataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType[] getMetadataflowArray();

    /**
     * Gets ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType getMetadataflowArray(int i);

    /**
     * Returns number of "Metadataflow" element
     */
    int sizeOfMetadataflowArray();

    /**
     * Sets ith "Metadataflow" element
     */
    void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType metadataflow);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType insertNewMetadataflow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType addNewMetadataflow();

    /**
     * Removes the ith "Metadataflow" element
     */
    void removeMetadataflow(int i);
}
