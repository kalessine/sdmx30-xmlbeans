/*
 * An XML document type.
 * Localname: Group
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Group(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface GroupDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "group358bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType getGroup();

    /**
     * Sets the "Group" element
     */
    void setGroup(org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType group);

    /**
     * Appends and returns a new empty "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType addNewGroup();
}
