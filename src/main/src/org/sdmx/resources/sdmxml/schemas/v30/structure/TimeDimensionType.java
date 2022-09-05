/*
 * XML Type:  TimeDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TimeDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TimeDimensionType extends org.sdmx.resources.sdmxml.schemas.v30.structure.BaseDimensionType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "timedimensiontypeea8ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LocalRepresentation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType getLocalRepresentation();

    /**
     * True if has "LocalRepresentation" element
     */
    boolean isSetLocalRepresentation();

    /**
     * Sets the "LocalRepresentation" element
     */
    void setLocalRepresentation(org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType localRepresentation);

    /**
     * Appends and returns a new empty "LocalRepresentation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType addNewLocalRepresentation();

    /**
     * Unsets the "LocalRepresentation" element
     */
    void unsetLocalRepresentation();

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
