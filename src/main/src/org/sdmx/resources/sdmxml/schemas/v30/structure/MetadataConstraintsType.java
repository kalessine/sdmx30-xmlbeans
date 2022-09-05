/*
 * XML Type:  MetadataConstraintsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataConstraintsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataConstraintsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataconstraintstype0bbdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataConstraint" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType> getMetadataConstraintList();

    /**
     * Gets array of all "MetadataConstraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType[] getMetadataConstraintArray();

    /**
     * Gets ith "MetadataConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType getMetadataConstraintArray(int i);

    /**
     * Returns number of "MetadataConstraint" element
     */
    int sizeOfMetadataConstraintArray();

    /**
     * Sets ith "MetadataConstraint" element
     */
    void setMetadataConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType metadataConstraint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType insertNewMetadataConstraint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType addNewMetadataConstraint();

    /**
     * Removes the ith "MetadataConstraint" element
     */
    void removeMetadataConstraint(int i);
}
