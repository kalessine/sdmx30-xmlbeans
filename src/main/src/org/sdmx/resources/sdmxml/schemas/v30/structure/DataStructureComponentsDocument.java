/*
 * An XML document type.
 * Localname: DataStructureComponents
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataStructureComponents(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface DataStructureComponentsDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datastructurecomponentse82bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType getDataStructureComponents();

    /**
     * Sets the "DataStructureComponents" element
     */
    void setDataStructureComponents(org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType dataStructureComponents);

    /**
     * Appends and returns a new empty "DataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType addNewDataStructureComponents();
}
