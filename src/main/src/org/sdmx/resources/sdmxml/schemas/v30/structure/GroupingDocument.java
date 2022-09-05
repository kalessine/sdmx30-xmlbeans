/*
 * An XML document type.
 * Localname: Grouping
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Grouping(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface GroupingDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "grouping9fa1doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Grouping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType getGrouping();

    /**
     * Sets the "Grouping" element
     */
    void setGrouping(org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType grouping);

    /**
     * Appends and returns a new empty "Grouping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType addNewGrouping();
}
