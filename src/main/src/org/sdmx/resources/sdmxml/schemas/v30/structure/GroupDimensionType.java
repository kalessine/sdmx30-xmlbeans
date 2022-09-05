/*
 * XML Type:  GroupDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GroupDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GroupDimensionType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "groupdimensiontype21cftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionReference" element
     */
    java.lang.String getDimensionReference();

    /**
     * Gets (as xml) the "DimensionReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetDimensionReference();

    /**
     * Sets the "DimensionReference" element
     */
    void setDimensionReference(java.lang.String dimensionReference);

    /**
     * Sets (as xml) the "DimensionReference" element
     */
    void xsetDimensionReference(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType dimensionReference);
}
