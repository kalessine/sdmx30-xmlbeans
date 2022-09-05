/*
 * XML Type:  StructureUsageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureUsageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureUsageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface StructureUsageType extends org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.StructureUsageType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structureusagetypec416type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Structure" element
     */
    java.lang.String getStructure();

    /**
     * Gets (as xml) the "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType xgetStructure();

    /**
     * True if has "Structure" element
     */
    boolean isSetStructure();

    /**
     * Sets the "Structure" element
     */
    void setStructure(java.lang.String structure);

    /**
     * Sets (as xml) the "Structure" element
     */
    void xsetStructure(org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType structure);

    /**
     * Unsets the "Structure" element
     */
    void unsetStructure();
}
