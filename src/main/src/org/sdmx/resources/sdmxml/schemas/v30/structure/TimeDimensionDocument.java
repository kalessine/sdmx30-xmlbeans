/*
 * An XML document type.
 * Localname: TimeDimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one TimeDimension(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface TimeDimensionDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "timedimension6625doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType getTimeDimension();

    /**
     * Sets the "TimeDimension" element
     */
    void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType timeDimension);

    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType addNewTimeDimension();
}
