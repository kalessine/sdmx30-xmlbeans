/*
 * XML Type:  RepresentationMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RepresentationMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RepresentationMapType extends org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "representationmaptype4b45type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SourceCodelist" elements
     */
    java.util.List<java.lang.String> getSourceCodelistList();

    /**
     * Gets array of all "SourceCodelist" elements
     */
    java.lang.String[] getSourceCodelistArray();

    /**
     * Gets ith "SourceCodelist" element
     */
    java.lang.String getSourceCodelistArray(int i);

    /**
     * Gets (as xml) a List of "SourceCodelist" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType> xgetSourceCodelistList();

    /**
     * Gets (as xml) array of all "SourceCodelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[] xgetSourceCodelistArray();

    /**
     * Gets (as xml) ith "SourceCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType xgetSourceCodelistArray(int i);

    /**
     * Returns number of "SourceCodelist" element
     */
    int sizeOfSourceCodelistArray();

    /**
     * Sets ith "SourceCodelist" element
     */
    void setSourceCodelistArray(int i, java.lang.String sourceCodelist);

    /**
     * Sets (as xml) array of all "SourceCodelist" element
     */
    void xsetSourceCodelistArray(org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[] sourceCodelistArray);

    /**
     * Sets (as xml) ith "SourceCodelist" element
     */
    void xsetSourceCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType sourceCodelist);

    /**
     * Inserts the value as the ith "SourceCodelist" element
     */
    void insertSourceCodelist(int i, java.lang.String sourceCodelist);

    /**
     * Appends the value as the last "SourceCodelist" element
     */
    void addSourceCodelist(java.lang.String sourceCodelist);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SourceCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType insertNewSourceCodelist(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SourceCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType addNewSourceCodelist();

    /**
     * Removes the ith "SourceCodelist" element
     */
    void removeSourceCodelist(int i);

    /**
     * Gets a List of "SourceDataType" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum> getSourceDataTypeList();

    /**
     * Gets array of all "SourceDataType" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum[] getSourceDataTypeArray();

    /**
     * Gets ith "SourceDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getSourceDataTypeArray(int i);

    /**
     * Gets (as xml) a List of "SourceDataType" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType> xgetSourceDataTypeList();

    /**
     * Gets (as xml) array of all "SourceDataType" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType[] xgetSourceDataTypeArray();

    /**
     * Gets (as xml) ith "SourceDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetSourceDataTypeArray(int i);

    /**
     * Returns number of "SourceDataType" element
     */
    int sizeOfSourceDataTypeArray();

    /**
     * Sets ith "SourceDataType" element
     */
    void setSourceDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum sourceDataType);

    /**
     * Sets (as xml) array of all "SourceDataType" element
     */
    void xsetSourceDataTypeArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataType[] sourceDataTypeArray);

    /**
     * Sets (as xml) ith "SourceDataType" element
     */
    void xsetSourceDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType sourceDataType);

    /**
     * Inserts the value as the ith "SourceDataType" element
     */
    void insertSourceDataType(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum sourceDataType);

    /**
     * Appends the value as the last "SourceDataType" element
     */
    void addSourceDataType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum sourceDataType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SourceDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType insertNewSourceDataType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SourceDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType addNewSourceDataType();

    /**
     * Removes the ith "SourceDataType" element
     */
    void removeSourceDataType(int i);

    /**
     * Gets a List of "TargetCodelist" elements
     */
    java.util.List<java.lang.String> getTargetCodelistList();

    /**
     * Gets array of all "TargetCodelist" elements
     */
    java.lang.String[] getTargetCodelistArray();

    /**
     * Gets ith "TargetCodelist" element
     */
    java.lang.String getTargetCodelistArray(int i);

    /**
     * Gets (as xml) a List of "TargetCodelist" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType> xgetTargetCodelistList();

    /**
     * Gets (as xml) array of all "TargetCodelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[] xgetTargetCodelistArray();

    /**
     * Gets (as xml) ith "TargetCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType xgetTargetCodelistArray(int i);

    /**
     * Returns number of "TargetCodelist" element
     */
    int sizeOfTargetCodelistArray();

    /**
     * Sets ith "TargetCodelist" element
     */
    void setTargetCodelistArray(int i, java.lang.String targetCodelist);

    /**
     * Sets (as xml) array of all "TargetCodelist" element
     */
    void xsetTargetCodelistArray(org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[] targetCodelistArray);

    /**
     * Sets (as xml) ith "TargetCodelist" element
     */
    void xsetTargetCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType targetCodelist);

    /**
     * Inserts the value as the ith "TargetCodelist" element
     */
    void insertTargetCodelist(int i, java.lang.String targetCodelist);

    /**
     * Appends the value as the last "TargetCodelist" element
     */
    void addTargetCodelist(java.lang.String targetCodelist);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType insertNewTargetCodelist(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "TargetCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType addNewTargetCodelist();

    /**
     * Removes the ith "TargetCodelist" element
     */
    void removeTargetCodelist(int i);

    /**
     * Gets a List of "TargetDataType" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum> getTargetDataTypeList();

    /**
     * Gets array of all "TargetDataType" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum[] getTargetDataTypeArray();

    /**
     * Gets ith "TargetDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getTargetDataTypeArray(int i);

    /**
     * Gets (as xml) a List of "TargetDataType" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType> xgetTargetDataTypeList();

    /**
     * Gets (as xml) array of all "TargetDataType" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType[] xgetTargetDataTypeArray();

    /**
     * Gets (as xml) ith "TargetDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetTargetDataTypeArray(int i);

    /**
     * Returns number of "TargetDataType" element
     */
    int sizeOfTargetDataTypeArray();

    /**
     * Sets ith "TargetDataType" element
     */
    void setTargetDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum targetDataType);

    /**
     * Sets (as xml) array of all "TargetDataType" element
     */
    void xsetTargetDataTypeArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataType[] targetDataTypeArray);

    /**
     * Sets (as xml) ith "TargetDataType" element
     */
    void xsetTargetDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType targetDataType);

    /**
     * Inserts the value as the ith "TargetDataType" element
     */
    void insertTargetDataType(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum targetDataType);

    /**
     * Appends the value as the last "TargetDataType" element
     */
    void addTargetDataType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum targetDataType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType insertNewTargetDataType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "TargetDataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataType addNewTargetDataType();

    /**
     * Removes the ith "TargetDataType" element
     */
    void removeTargetDataType(int i);

    /**
     * Gets a List of "RepresentationMapping" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType> getRepresentationMappingList();

    /**
     * Gets array of all "RepresentationMapping" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType[] getRepresentationMappingArray();

    /**
     * Gets ith "RepresentationMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType getRepresentationMappingArray(int i);

    /**
     * Returns number of "RepresentationMapping" element
     */
    int sizeOfRepresentationMappingArray();

    /**
     * Sets ith "RepresentationMapping" element
     */
    void setRepresentationMappingArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType representationMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentationMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType insertNewRepresentationMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentationMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType addNewRepresentationMapping();

    /**
     * Removes the ith "RepresentationMapping" element
     */
    void removeRepresentationMapping(int i);
}
