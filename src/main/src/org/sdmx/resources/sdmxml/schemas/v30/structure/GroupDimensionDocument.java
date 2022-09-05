/*
 * An XML document type.
 * Localname: GroupDimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one GroupDimension(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface GroupDimensionDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "groupdimension1385doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GroupDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType getGroupDimension();

    /**
     * Sets the "GroupDimension" element
     */
    void setGroupDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType groupDimension);

    /**
     * Appends and returns a new empty "GroupDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType addNewGroupDimension();
}
