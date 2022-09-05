/*
 * XML Type:  StructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface StructureType extends org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.StructureType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structuretypeda69type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Grouping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType getGrouping();

    /**
     * True if has "Grouping" element
     */
    boolean isSetGrouping();

    /**
     * Sets the "Grouping" element
     */
    void setGrouping(org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType grouping);

    /**
     * Appends and returns a new empty "Grouping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType addNewGrouping();

    /**
     * Unsets the "Grouping" element
     */
    void unsetGrouping();
}
