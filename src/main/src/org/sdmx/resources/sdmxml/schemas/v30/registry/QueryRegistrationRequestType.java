/*
 * XML Type:  QueryRegistrationRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QueryRegistrationRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface QueryRegistrationRequestType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "queryregistrationrequesttype26batype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "QueryType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType.Enum getQueryType();

    /**
     * Gets (as xml) the "QueryType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType xgetQueryType();

    /**
     * Sets the "QueryType" element
     */
    void setQueryType(org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType.Enum queryType);

    /**
     * Sets (as xml) the "QueryType" element
     */
    void xsetQueryType(org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType queryType);

    /**
     * Gets the "All" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAll();

    /**
     * True if has "All" element
     */
    boolean isSetAll();

    /**
     * Sets the "All" element
     */
    void setAll(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType all);

    /**
     * Appends and returns a new empty "All" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAll();

    /**
     * Unsets the "All" element
     */
    void unsetAll();

    /**
     * Gets the "ProvisionAgreement" element
     */
    java.lang.String getProvisionAgreement();

    /**
     * Gets (as xml) the "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType xgetProvisionAgreement();

    /**
     * True if has "ProvisionAgreement" element
     */
    boolean isSetProvisionAgreement();

    /**
     * Sets the "ProvisionAgreement" element
     */
    void setProvisionAgreement(java.lang.String provisionAgreement);

    /**
     * Sets (as xml) the "ProvisionAgreement" element
     */
    void xsetProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType provisionAgreement);

    /**
     * Unsets the "ProvisionAgreement" element
     */
    void unsetProvisionAgreement();

    /**
     * Gets the "DataProvider" element
     */
    java.lang.String getDataProvider();

    /**
     * Gets (as xml) the "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType xgetDataProvider();

    /**
     * True if has "DataProvider" element
     */
    boolean isSetDataProvider();

    /**
     * Sets the "DataProvider" element
     */
    void setDataProvider(java.lang.String dataProvider);

    /**
     * Sets (as xml) the "DataProvider" element
     */
    void xsetDataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType dataProvider);

    /**
     * Unsets the "DataProvider" element
     */
    void unsetDataProvider();

    /**
     * Gets the "Dataflow" element
     */
    java.lang.String getDataflow();

    /**
     * Gets (as xml) the "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType xgetDataflow();

    /**
     * True if has "Dataflow" element
     */
    boolean isSetDataflow();

    /**
     * Sets the "Dataflow" element
     */
    void setDataflow(java.lang.String dataflow);

    /**
     * Sets (as xml) the "Dataflow" element
     */
    void xsetDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType dataflow);

    /**
     * Unsets the "Dataflow" element
     */
    void unsetDataflow();

    /**
     * Gets the "Metadataflow" element
     */
    java.lang.String getMetadataflow();

    /**
     * Gets (as xml) the "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType xgetMetadataflow();

    /**
     * True if has "Metadataflow" element
     */
    boolean isSetMetadataflow();

    /**
     * Sets the "Metadataflow" element
     */
    void setMetadataflow(java.lang.String metadataflow);

    /**
     * Sets (as xml) the "Metadataflow" element
     */
    void xsetMetadataflow(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType metadataflow);

    /**
     * Unsets the "Metadataflow" element
     */
    void unsetMetadataflow();

    /**
     * Gets the "ReferencePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType getReferencePeriod();

    /**
     * True if has "ReferencePeriod" element
     */
    boolean isSetReferencePeriod();

    /**
     * Sets the "ReferencePeriod" element
     */
    void setReferencePeriod(org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType referencePeriod);

    /**
     * Appends and returns a new empty "ReferencePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType addNewReferencePeriod();

    /**
     * Unsets the "ReferencePeriod" element
     */
    void unsetReferencePeriod();

    /**
     * Gets a List of "DataKeySet" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType> getDataKeySetList();

    /**
     * Gets array of all "DataKeySet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType[] getDataKeySetArray();

    /**
     * Gets ith "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType getDataKeySetArray(int i);

    /**
     * Returns number of "DataKeySet" element
     */
    int sizeOfDataKeySetArray();

    /**
     * Sets ith "DataKeySet" element
     */
    void setDataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType dataKeySet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType insertNewDataKeySet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType addNewDataKeySet();

    /**
     * Removes the ith "DataKeySet" element
     */
    void removeDataKeySet(int i);

    /**
     * Gets a List of "CubeRegion" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType> getCubeRegionList();

    /**
     * Gets array of all "CubeRegion" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType[] getCubeRegionArray();

    /**
     * Gets ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType getCubeRegionArray(int i);

    /**
     * Returns number of "CubeRegion" element
     */
    int sizeOfCubeRegionArray();

    /**
     * Sets ith "CubeRegion" element
     */
    void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType cubeRegion);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType insertNewCubeRegion(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType addNewCubeRegion();

    /**
     * Removes the ith "CubeRegion" element
     */
    void removeCubeRegion(int i);

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

    /**
     * Gets the "returnConstraints" attribute
     */
    boolean getReturnConstraints();

    /**
     * Gets (as xml) the "returnConstraints" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetReturnConstraints();

    /**
     * True if has "returnConstraints" attribute
     */
    boolean isSetReturnConstraints();

    /**
     * Sets the "returnConstraints" attribute
     */
    void setReturnConstraints(boolean returnConstraints);

    /**
     * Sets (as xml) the "returnConstraints" attribute
     */
    void xsetReturnConstraints(org.apache.xmlbeans.XmlBoolean returnConstraints);

    /**
     * Unsets the "returnConstraints" attribute
     */
    void unsetReturnConstraints();
}
