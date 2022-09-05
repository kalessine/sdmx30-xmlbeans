/*
 * XML Type:  ConstraintAttachmentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConstraintAttachmentType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ConstraintAttachmentType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "constraintattachmenttypec448type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
     * Gets the "MetadataProvider" element
     */
    java.lang.String getMetadataProvider();

    /**
     * Gets (as xml) the "MetadataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType xgetMetadataProvider();

    /**
     * True if has "MetadataProvider" element
     */
    boolean isSetMetadataProvider();

    /**
     * Sets the "MetadataProvider" element
     */
    void setMetadataProvider(java.lang.String metadataProvider);

    /**
     * Sets (as xml) the "MetadataProvider" element
     */
    void xsetMetadataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType metadataProvider);

    /**
     * Unsets the "MetadataProvider" element
     */
    void unsetMetadataProvider();

    /**
     * Gets a List of "MetadataSet" elements
     */
    java.util.List<java.lang.String> getMetadataSetList();

    /**
     * Gets array of all "MetadataSet" elements
     */
    java.lang.String[] getMetadataSetArray();

    /**
     * Gets ith "MetadataSet" element
     */
    java.lang.String getMetadataSetArray(int i);

    /**
     * Gets (as xml) a List of "MetadataSet" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType> xgetMetadataSetList();

    /**
     * Gets (as xml) array of all "MetadataSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType[] xgetMetadataSetArray();

    /**
     * Gets (as xml) ith "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType xgetMetadataSetArray(int i);

    /**
     * Returns number of "MetadataSet" element
     */
    int sizeOfMetadataSetArray();

    /**
     * Sets ith "MetadataSet" element
     */
    void setMetadataSetArray(int i, java.lang.String metadataSet);

    /**
     * Sets (as xml) array of all "MetadataSet" element
     */
    void xsetMetadataSetArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType[] metadataSetArray);

    /**
     * Sets (as xml) ith "MetadataSet" element
     */
    void xsetMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType metadataSet);

    /**
     * Inserts the value as the ith "MetadataSet" element
     */
    void insertMetadataSet(int i, java.lang.String metadataSet);

    /**
     * Appends the value as the last "MetadataSet" element
     */
    void addMetadataSet(java.lang.String metadataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType insertNewMetadataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType addNewMetadataSet();

    /**
     * Removes the ith "MetadataSet" element
     */
    void removeMetadataSet(int i);

    /**
     * Gets a List of "SimpleDataSource" elements
     */
    java.util.List<java.lang.String> getSimpleDataSourceList();

    /**
     * Gets array of all "SimpleDataSource" elements
     */
    java.lang.String[] getSimpleDataSourceArray();

    /**
     * Gets ith "SimpleDataSource" element
     */
    java.lang.String getSimpleDataSourceArray(int i);

    /**
     * Gets (as xml) a List of "SimpleDataSource" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetSimpleDataSourceList();

    /**
     * Gets (as xml) array of all "SimpleDataSource" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetSimpleDataSourceArray();

    /**
     * Gets (as xml) ith "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSimpleDataSourceArray(int i);

    /**
     * Returns number of "SimpleDataSource" element
     */
    int sizeOfSimpleDataSourceArray();

    /**
     * Sets ith "SimpleDataSource" element
     */
    void setSimpleDataSourceArray(int i, java.lang.String simpleDataSource);

    /**
     * Sets (as xml) array of all "SimpleDataSource" element
     */
    void xsetSimpleDataSourceArray(org.apache.xmlbeans.XmlAnyURI[] simpleDataSourceArray);

    /**
     * Sets (as xml) ith "SimpleDataSource" element
     */
    void xsetSimpleDataSourceArray(int i, org.apache.xmlbeans.XmlAnyURI simpleDataSource);

    /**
     * Inserts the value as the ith "SimpleDataSource" element
     */
    void insertSimpleDataSource(int i, java.lang.String simpleDataSource);

    /**
     * Appends the value as the last "SimpleDataSource" element
     */
    void addSimpleDataSource(java.lang.String simpleDataSource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewSimpleDataSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewSimpleDataSource();

    /**
     * Removes the ith "SimpleDataSource" element
     */
    void removeSimpleDataSource(int i);

    /**
     * Gets a List of "DataStructure" elements
     */
    java.util.List<java.lang.String> getDataStructureList();

    /**
     * Gets array of all "DataStructure" elements
     */
    java.lang.String[] getDataStructureArray();

    /**
     * Gets ith "DataStructure" element
     */
    java.lang.String getDataStructureArray(int i);

    /**
     * Gets (as xml) a List of "DataStructure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType> xgetDataStructureList();

    /**
     * Gets (as xml) array of all "DataStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType[] xgetDataStructureArray();

    /**
     * Gets (as xml) ith "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType xgetDataStructureArray(int i);

    /**
     * Returns number of "DataStructure" element
     */
    int sizeOfDataStructureArray();

    /**
     * Sets ith "DataStructure" element
     */
    void setDataStructureArray(int i, java.lang.String dataStructure);

    /**
     * Sets (as xml) array of all "DataStructure" element
     */
    void xsetDataStructureArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType[] dataStructureArray);

    /**
     * Sets (as xml) ith "DataStructure" element
     */
    void xsetDataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType dataStructure);

    /**
     * Inserts the value as the ith "DataStructure" element
     */
    void insertDataStructure(int i, java.lang.String dataStructure);

    /**
     * Appends the value as the last "DataStructure" element
     */
    void addDataStructure(java.lang.String dataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType insertNewDataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType addNewDataStructure();

    /**
     * Removes the ith "DataStructure" element
     */
    void removeDataStructure(int i);

    /**
     * Gets a List of "QueryableDataSource" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType> getQueryableDataSourceList();

    /**
     * Gets array of all "QueryableDataSource" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType[] getQueryableDataSourceArray();

    /**
     * Gets ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType getQueryableDataSourceArray(int i);

    /**
     * Returns number of "QueryableDataSource" element
     */
    int sizeOfQueryableDataSourceArray();

    /**
     * Sets ith "QueryableDataSource" element
     */
    void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType queryableDataSource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType insertNewQueryableDataSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType addNewQueryableDataSource();

    /**
     * Removes the ith "QueryableDataSource" element
     */
    void removeQueryableDataSource(int i);

    /**
     * Gets a List of "MetadataStructure" elements
     */
    java.util.List<java.lang.String> getMetadataStructureList();

    /**
     * Gets array of all "MetadataStructure" elements
     */
    java.lang.String[] getMetadataStructureArray();

    /**
     * Gets ith "MetadataStructure" element
     */
    java.lang.String getMetadataStructureArray(int i);

    /**
     * Gets (as xml) a List of "MetadataStructure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType> xgetMetadataStructureList();

    /**
     * Gets (as xml) array of all "MetadataStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType[] xgetMetadataStructureArray();

    /**
     * Gets (as xml) ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType xgetMetadataStructureArray(int i);

    /**
     * Returns number of "MetadataStructure" element
     */
    int sizeOfMetadataStructureArray();

    /**
     * Sets ith "MetadataStructure" element
     */
    void setMetadataStructureArray(int i, java.lang.String metadataStructure);

    /**
     * Sets (as xml) array of all "MetadataStructure" element
     */
    void xsetMetadataStructureArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType[] metadataStructureArray);

    /**
     * Sets (as xml) ith "MetadataStructure" element
     */
    void xsetMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType metadataStructure);

    /**
     * Inserts the value as the ith "MetadataStructure" element
     */
    void insertMetadataStructure(int i, java.lang.String metadataStructure);

    /**
     * Appends the value as the last "MetadataStructure" element
     */
    void addMetadataStructure(java.lang.String metadataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType insertNewMetadataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType addNewMetadataStructure();

    /**
     * Removes the ith "MetadataStructure" element
     */
    void removeMetadataStructure(int i);

    /**
     * Gets a List of "Dataflow" elements
     */
    java.util.List<java.lang.String> getDataflowList();

    /**
     * Gets array of all "Dataflow" elements
     */
    java.lang.String[] getDataflowArray();

    /**
     * Gets ith "Dataflow" element
     */
    java.lang.String getDataflowArray(int i);

    /**
     * Gets (as xml) a List of "Dataflow" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType> xgetDataflowList();

    /**
     * Gets (as xml) array of all "Dataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType[] xgetDataflowArray();

    /**
     * Gets (as xml) ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType xgetDataflowArray(int i);

    /**
     * Returns number of "Dataflow" element
     */
    int sizeOfDataflowArray();

    /**
     * Sets ith "Dataflow" element
     */
    void setDataflowArray(int i, java.lang.String dataflow);

    /**
     * Sets (as xml) array of all "Dataflow" element
     */
    void xsetDataflowArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType[] dataflowArray);

    /**
     * Sets (as xml) ith "Dataflow" element
     */
    void xsetDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType dataflow);

    /**
     * Inserts the value as the ith "Dataflow" element
     */
    void insertDataflow(int i, java.lang.String dataflow);

    /**
     * Appends the value as the last "Dataflow" element
     */
    void addDataflow(java.lang.String dataflow);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType insertNewDataflow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType addNewDataflow();

    /**
     * Removes the ith "Dataflow" element
     */
    void removeDataflow(int i);

    /**
     * Gets a List of "Metadataflow" elements
     */
    java.util.List<java.lang.String> getMetadataflowList();

    /**
     * Gets array of all "Metadataflow" elements
     */
    java.lang.String[] getMetadataflowArray();

    /**
     * Gets ith "Metadataflow" element
     */
    java.lang.String getMetadataflowArray(int i);

    /**
     * Gets (as xml) a List of "Metadataflow" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType> xgetMetadataflowList();

    /**
     * Gets (as xml) array of all "Metadataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType[] xgetMetadataflowArray();

    /**
     * Gets (as xml) ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType xgetMetadataflowArray(int i);

    /**
     * Returns number of "Metadataflow" element
     */
    int sizeOfMetadataflowArray();

    /**
     * Sets ith "Metadataflow" element
     */
    void setMetadataflowArray(int i, java.lang.String metadataflow);

    /**
     * Sets (as xml) array of all "Metadataflow" element
     */
    void xsetMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType[] metadataflowArray);

    /**
     * Sets (as xml) ith "Metadataflow" element
     */
    void xsetMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType metadataflow);

    /**
     * Inserts the value as the ith "Metadataflow" element
     */
    void insertMetadataflow(int i, java.lang.String metadataflow);

    /**
     * Appends the value as the last "Metadataflow" element
     */
    void addMetadataflow(java.lang.String metadataflow);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType insertNewMetadataflow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType addNewMetadataflow();

    /**
     * Removes the ith "Metadataflow" element
     */
    void removeMetadataflow(int i);

    /**
     * Gets a List of "ProvisionAgreement" elements
     */
    java.util.List<java.lang.String> getProvisionAgreementList();

    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    java.lang.String[] getProvisionAgreementArray();

    /**
     * Gets ith "ProvisionAgreement" element
     */
    java.lang.String getProvisionAgreementArray(int i);

    /**
     * Gets (as xml) a List of "ProvisionAgreement" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType> xgetProvisionAgreementList();

    /**
     * Gets (as xml) array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[] xgetProvisionAgreementArray();

    /**
     * Gets (as xml) ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType xgetProvisionAgreementArray(int i);

    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();

    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, java.lang.String provisionAgreement);

    /**
     * Sets (as xml) array of all "ProvisionAgreement" element
     */
    void xsetProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[] provisionAgreementArray);

    /**
     * Sets (as xml) ith "ProvisionAgreement" element
     */
    void xsetProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType provisionAgreement);

    /**
     * Inserts the value as the ith "ProvisionAgreement" element
     */
    void insertProvisionAgreement(int i, java.lang.String provisionAgreement);

    /**
     * Appends the value as the last "ProvisionAgreement" element
     */
    void addProvisionAgreement(java.lang.String provisionAgreement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType insertNewProvisionAgreement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType addNewProvisionAgreement();

    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);

    /**
     * Gets a List of "MetadataProvisionAgreement" elements
     */
    java.util.List<java.lang.String> getMetadataProvisionAgreementList();

    /**
     * Gets array of all "MetadataProvisionAgreement" elements
     */
    java.lang.String[] getMetadataProvisionAgreementArray();

    /**
     * Gets ith "MetadataProvisionAgreement" element
     */
    java.lang.String getMetadataProvisionAgreementArray(int i);

    /**
     * Gets (as xml) a List of "MetadataProvisionAgreement" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType> xgetMetadataProvisionAgreementList();

    /**
     * Gets (as xml) array of all "MetadataProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType[] xgetMetadataProvisionAgreementArray();

    /**
     * Gets (as xml) ith "MetadataProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType xgetMetadataProvisionAgreementArray(int i);

    /**
     * Returns number of "MetadataProvisionAgreement" element
     */
    int sizeOfMetadataProvisionAgreementArray();

    /**
     * Sets ith "MetadataProvisionAgreement" element
     */
    void setMetadataProvisionAgreementArray(int i, java.lang.String metadataProvisionAgreement);

    /**
     * Sets (as xml) array of all "MetadataProvisionAgreement" element
     */
    void xsetMetadataProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType[] metadataProvisionAgreementArray);

    /**
     * Sets (as xml) ith "MetadataProvisionAgreement" element
     */
    void xsetMetadataProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType metadataProvisionAgreement);

    /**
     * Inserts the value as the ith "MetadataProvisionAgreement" element
     */
    void insertMetadataProvisionAgreement(int i, java.lang.String metadataProvisionAgreement);

    /**
     * Appends the value as the last "MetadataProvisionAgreement" element
     */
    void addMetadataProvisionAgreement(java.lang.String metadataProvisionAgreement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType insertNewMetadataProvisionAgreement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType addNewMetadataProvisionAgreement();

    /**
     * Removes the ith "MetadataProvisionAgreement" element
     */
    void removeMetadataProvisionAgreement(int i);
}
