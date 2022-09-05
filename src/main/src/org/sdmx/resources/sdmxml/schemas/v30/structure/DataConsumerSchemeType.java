/*
 * XML Type:  DataConsumerSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataConsumerSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataConsumerSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataconsumerschemetype8f2dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataConsumer" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType> getDataConsumerList();

    /**
     * Gets array of all "DataConsumer" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType[] getDataConsumerArray();

    /**
     * Gets ith "DataConsumer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType getDataConsumerArray(int i);

    /**
     * Returns number of "DataConsumer" element
     */
    int sizeOfDataConsumerArray();

    /**
     * Sets ith "DataConsumer" element
     */
    void setDataConsumerArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType dataConsumer);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsumer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType insertNewDataConsumer(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsumer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType addNewDataConsumer();

    /**
     * Removes the ith "DataConsumer" element
     */
    void removeDataConsumer(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();
}
