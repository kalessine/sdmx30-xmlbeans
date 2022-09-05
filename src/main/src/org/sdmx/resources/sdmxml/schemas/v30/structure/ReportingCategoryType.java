/*
 * XML Type:  ReportingCategoryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReportingCategoryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ReportingCategoryType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "reportingcategorytypeb742type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "StructuralMetadata" elements
     */
    java.util.List<java.lang.String> getStructuralMetadataList();

    /**
     * Gets array of all "StructuralMetadata" elements
     */
    java.lang.String[] getStructuralMetadataArray();

    /**
     * Gets ith "StructuralMetadata" element
     */
    java.lang.String getStructuralMetadataArray(int i);

    /**
     * Gets (as xml) a List of "StructuralMetadata" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType> xgetStructuralMetadataList();

    /**
     * Gets (as xml) array of all "StructuralMetadata" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType[] xgetStructuralMetadataArray();

    /**
     * Gets (as xml) ith "StructuralMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType xgetStructuralMetadataArray(int i);

    /**
     * Returns number of "StructuralMetadata" element
     */
    int sizeOfStructuralMetadataArray();

    /**
     * Sets ith "StructuralMetadata" element
     */
    void setStructuralMetadataArray(int i, java.lang.String structuralMetadata);

    /**
     * Sets (as xml) array of all "StructuralMetadata" element
     */
    void xsetStructuralMetadataArray(org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType[] structuralMetadataArray);

    /**
     * Sets (as xml) ith "StructuralMetadata" element
     */
    void xsetStructuralMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType structuralMetadata);

    /**
     * Inserts the value as the ith "StructuralMetadata" element
     */
    void insertStructuralMetadata(int i, java.lang.String structuralMetadata);

    /**
     * Appends the value as the last "StructuralMetadata" element
     */
    void addStructuralMetadata(java.lang.String structuralMetadata);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType insertNewStructuralMetadata(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType addNewStructuralMetadata();

    /**
     * Removes the ith "StructuralMetadata" element
     */
    void removeStructuralMetadata(int i);

    /**
     * Gets a List of "ProvisioningMetadata" elements
     */
    java.util.List<java.lang.String> getProvisioningMetadataList();

    /**
     * Gets array of all "ProvisioningMetadata" elements
     */
    java.lang.String[] getProvisioningMetadataArray();

    /**
     * Gets ith "ProvisioningMetadata" element
     */
    java.lang.String getProvisioningMetadataArray(int i);

    /**
     * Gets (as xml) a List of "ProvisioningMetadata" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType> xgetProvisioningMetadataList();

    /**
     * Gets (as xml) array of all "ProvisioningMetadata" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType[] xgetProvisioningMetadataArray();

    /**
     * Gets (as xml) ith "ProvisioningMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType xgetProvisioningMetadataArray(int i);

    /**
     * Returns number of "ProvisioningMetadata" element
     */
    int sizeOfProvisioningMetadataArray();

    /**
     * Sets ith "ProvisioningMetadata" element
     */
    void setProvisioningMetadataArray(int i, java.lang.String provisioningMetadata);

    /**
     * Sets (as xml) array of all "ProvisioningMetadata" element
     */
    void xsetProvisioningMetadataArray(org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType[] provisioningMetadataArray);

    /**
     * Sets (as xml) ith "ProvisioningMetadata" element
     */
    void xsetProvisioningMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType provisioningMetadata);

    /**
     * Inserts the value as the ith "ProvisioningMetadata" element
     */
    void insertProvisioningMetadata(int i, java.lang.String provisioningMetadata);

    /**
     * Appends the value as the last "ProvisioningMetadata" element
     */
    void addProvisioningMetadata(java.lang.String provisioningMetadata);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisioningMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType insertNewProvisioningMetadata(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisioningMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType addNewProvisioningMetadata();

    /**
     * Removes the ith "ProvisioningMetadata" element
     */
    void removeProvisioningMetadata(int i);
}
