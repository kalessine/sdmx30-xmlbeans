/*
 * XML Type:  ComponentListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ComponentListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ComponentListType extends org.sdmx.resources.sdmxml.schemas.v30.common.IdentifiableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "componentlisttype44b1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Component" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType> getComponentList();

    /**
     * Gets array of all "Component" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType[] getComponentArray();

    /**
     * Gets ith "Component" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType getComponentArray(int i);

    /**
     * Returns number of "Component" element
     */
    int sizeOfComponentArray();

    /**
     * Sets ith "Component" element
     */
    void setComponentArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType component);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType insertNewComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType addNewComponent();

    /**
     * Removes the ith "Component" element
     */
    void removeComponent(int i);
}
