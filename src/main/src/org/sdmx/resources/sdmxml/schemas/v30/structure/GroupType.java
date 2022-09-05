/*
 * XML Type:  GroupType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GroupType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface GroupType extends org.sdmx.resources.sdmxml.schemas.v30.structure.GroupBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "grouptypea6f5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "GroupDimension" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType> getGroupDimensionList();

    /**
     * Gets array of all "GroupDimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType[] getGroupDimensionArray();

    /**
     * Gets ith "GroupDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType getGroupDimensionArray(int i);

    /**
     * Returns number of "GroupDimension" element
     */
    int sizeOfGroupDimensionArray();

    /**
     * Sets ith "GroupDimension" element
     */
    void setGroupDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType groupDimension);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GroupDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType insertNewGroupDimension(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "GroupDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType addNewGroupDimension();

    /**
     * Removes the ith "GroupDimension" element
     */
    void removeGroupDimension(int i);
}
