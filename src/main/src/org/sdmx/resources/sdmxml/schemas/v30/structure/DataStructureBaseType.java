/*
 * XML Type:  DataStructureBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataStructureBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataStructureBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.StructureType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datastructurebasetypea950type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType getDataStructureComponents();

    /**
     * True if has "DataStructureComponents" element
     */
    boolean isSetDataStructureComponents();

    /**
     * Sets the "DataStructureComponents" element
     */
    void setDataStructureComponents(org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType dataStructureComponents);

    /**
     * Appends and returns a new empty "DataStructureComponents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureComponentsType addNewDataStructureComponents();

    /**
     * Unsets the "DataStructureComponents" element
     */
    void unsetDataStructureComponents();
}
