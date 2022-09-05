/*
 * XML Type:  DataConsumerSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataConsumerSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataConsumerSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataconsumerschemestype95c4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataConsumerScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType> getDataConsumerSchemeList();

    /**
     * Gets array of all "DataConsumerScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType[] getDataConsumerSchemeArray();

    /**
     * Gets ith "DataConsumerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType getDataConsumerSchemeArray(int i);

    /**
     * Returns number of "DataConsumerScheme" element
     */
    int sizeOfDataConsumerSchemeArray();

    /**
     * Sets ith "DataConsumerScheme" element
     */
    void setDataConsumerSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType dataConsumerScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsumerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType insertNewDataConsumerScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsumerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType addNewDataConsumerScheme();

    /**
     * Removes the ith "DataConsumerScheme" element
     */
    void removeDataConsumerScheme(int i);
}
