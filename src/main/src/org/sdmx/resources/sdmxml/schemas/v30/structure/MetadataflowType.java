/*
 * XML Type:  MetadataflowType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataflowType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataflowType extends org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataflowtype6745type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Target" elements
     */
    java.util.List<java.lang.String> getTargetList();

    /**
     * Gets array of all "Target" elements
     */
    java.lang.String[] getTargetArray();

    /**
     * Gets ith "Target" element
     */
    java.lang.String getTargetArray(int i);

    /**
     * Gets (as xml) a List of "Target" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType> xgetTargetList();

    /**
     * Gets (as xml) array of all "Target" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType[] xgetTargetArray();

    /**
     * Gets (as xml) ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType xgetTargetArray(int i);

    /**
     * Returns number of "Target" element
     */
    int sizeOfTargetArray();

    /**
     * Sets ith "Target" element
     */
    void setTargetArray(int i, java.lang.String target);

    /**
     * Sets (as xml) array of all "Target" element
     */
    void xsetTargetArray(org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType[] targetArray);

    /**
     * Sets (as xml) ith "Target" element
     */
    void xsetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType target);

    /**
     * Inserts the value as the ith "Target" element
     */
    void insertTarget(int i, java.lang.String target);

    /**
     * Appends the value as the last "Target" element
     */
    void addTarget(java.lang.String target);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType insertNewTarget(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType addNewTarget();

    /**
     * Removes the ith "Target" element
     */
    void removeTarget(int i);
}
