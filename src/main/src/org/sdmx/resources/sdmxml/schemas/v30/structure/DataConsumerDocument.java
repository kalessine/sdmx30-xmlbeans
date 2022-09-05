/*
 * An XML document type.
 * Localname: DataConsumer
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataConsumer(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface DataConsumerDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataconsumer5a5edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataConsumer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType getDataConsumer();

    /**
     * Sets the "DataConsumer" element
     */
    void setDataConsumer(org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType dataConsumer);

    /**
     * Appends and returns a new empty "DataConsumer" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType addNewDataConsumer();
}
