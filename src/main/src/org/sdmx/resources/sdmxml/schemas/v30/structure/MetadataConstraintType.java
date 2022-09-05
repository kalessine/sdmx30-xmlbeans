/*
 * XML Type:  MetadataConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataConstraintType extends org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataconstrainttypef614type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataTargetRegion" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType> getMetadataTargetRegionList();

    /**
     * Gets array of all "MetadataTargetRegion" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType[] getMetadataTargetRegionArray();

    /**
     * Gets ith "MetadataTargetRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType getMetadataTargetRegionArray(int i);

    /**
     * Returns number of "MetadataTargetRegion" element
     */
    int sizeOfMetadataTargetRegionArray();

    /**
     * Sets ith "MetadataTargetRegion" element
     */
    void setMetadataTargetRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType metadataTargetRegion);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType insertNewMetadataTargetRegion(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType addNewMetadataTargetRegion();

    /**
     * Removes the ith "MetadataTargetRegion" element
     */
    void removeMetadataTargetRegion(int i);
}
