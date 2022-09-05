/*
 * XML Type:  HierarchyAssociationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML HierarchyAssociationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface HierarchyAssociationsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "hierarchyassociationstype555dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "HierarchyAssociation" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType> getHierarchyAssociationList();

    /**
     * Gets array of all "HierarchyAssociation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType[] getHierarchyAssociationArray();

    /**
     * Gets ith "HierarchyAssociation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType getHierarchyAssociationArray(int i);

    /**
     * Returns number of "HierarchyAssociation" element
     */
    int sizeOfHierarchyAssociationArray();

    /**
     * Sets ith "HierarchyAssociation" element
     */
    void setHierarchyAssociationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType hierarchyAssociation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchyAssociation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType insertNewHierarchyAssociation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchyAssociation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType addNewHierarchyAssociation();

    /**
     * Removes the ith "HierarchyAssociation" element
     */
    void removeHierarchyAssociation(int i);
}
