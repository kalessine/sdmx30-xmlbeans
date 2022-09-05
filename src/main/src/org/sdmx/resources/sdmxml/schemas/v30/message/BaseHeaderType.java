/*
 * XML Type:  BaseHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML BaseHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface BaseHeaderType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "baseheadertype28batype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ID" element
     */
    java.lang.String getID();

    /**
     * Gets (as xml) the "ID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetID();

    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);

    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);

    /**
     * Gets the "Test" element
     */
    boolean getTest();

    /**
     * Gets (as xml) the "Test" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTest();

    /**
     * Sets the "Test" element
     */
    void setTest(boolean test);

    /**
     * Sets (as xml) the "Test" element
     */
    void xsetTest(org.apache.xmlbeans.XmlBoolean test);

    /**
     * Gets the "Prepared" element
     */
    java.util.Calendar getPrepared();

    /**
     * Gets (as xml) the "Prepared" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType xgetPrepared();

    /**
     * Sets the "Prepared" element
     */
    void setPrepared(java.util.Calendar prepared);

    /**
     * Sets (as xml) the "Prepared" element
     */
    void xsetPrepared(org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType prepared);

    /**
     * Gets the "Sender" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.SenderType getSender();

    /**
     * Sets the "Sender" element
     */
    void setSender(org.sdmx.resources.sdmxml.schemas.v30.message.SenderType sender);

    /**
     * Appends and returns a new empty "Sender" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.SenderType addNewSender();

    /**
     * Gets a List of "Receiver" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.PartyType> getReceiverList();

    /**
     * Gets array of all "Receiver" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType[] getReceiverArray();

    /**
     * Gets ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType getReceiverArray(int i);

    /**
     * Returns number of "Receiver" element
     */
    int sizeOfReceiverArray();

    /**
     * Sets ith "Receiver" element
     */
    void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.PartyType receiver);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType insertNewReceiver(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.message.PartyType addNewReceiver();

    /**
     * Removes the ith "Receiver" element
     */
    void removeReceiver(int i);

    /**
     * Gets a List of "Name" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getNameList();

    /**
     * Gets array of all "Name" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getNameArray();

    /**
     * Gets ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getNameArray(int i);

    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();

    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewName();

    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);

    /**
     * Gets a List of "Structure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType> getStructureList();

    /**
     * Gets array of all "Structure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType[] getStructureArray();

    /**
     * Gets ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType getStructureArray(int i);

    /**
     * Returns number of "Structure" element
     */
    int sizeOfStructureArray();

    /**
     * Sets ith "Structure" element
     */
    void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType structure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType insertNewStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType addNewStructure();

    /**
     * Removes the ith "Structure" element
     */
    void removeStructure(int i);

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
     * Gets the "DataSetAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getDataSetAction();

    /**
     * Gets (as xml) the "DataSetAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetDataSetAction();

    /**
     * True if has "DataSetAction" element
     */
    boolean isSetDataSetAction();

    /**
     * Sets the "DataSetAction" element
     */
    void setDataSetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum dataSetAction);

    /**
     * Sets (as xml) the "DataSetAction" element
     */
    void xsetDataSetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType dataSetAction);

    /**
     * Unsets the "DataSetAction" element
     */
    void unsetDataSetAction();

    /**
     * Gets a List of "DataSetID" elements
     */
    java.util.List<java.lang.String> getDataSetIDList();

    /**
     * Gets array of all "DataSetID" elements
     */
    java.lang.String[] getDataSetIDArray();

    /**
     * Gets ith "DataSetID" element
     */
    java.lang.String getDataSetIDArray(int i);

    /**
     * Gets (as xml) a List of "DataSetID" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetDataSetIDList();

    /**
     * Gets (as xml) array of all "DataSetID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetDataSetIDArray();

    /**
     * Gets (as xml) ith "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetDataSetIDArray(int i);

    /**
     * Returns number of "DataSetID" element
     */
    int sizeOfDataSetIDArray();

    /**
     * Sets ith "DataSetID" element
     */
    void setDataSetIDArray(int i, java.lang.String dataSetID);

    /**
     * Sets (as xml) array of all "DataSetID" element
     */
    void xsetDataSetIDArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] dataSetIDArray);

    /**
     * Sets (as xml) ith "DataSetID" element
     */
    void xsetDataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType dataSetID);

    /**
     * Inserts the value as the ith "DataSetID" element
     */
    void insertDataSetID(int i, java.lang.String dataSetID);

    /**
     * Appends the value as the last "DataSetID" element
     */
    void addDataSetID(java.lang.String dataSetID);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewDataSetID(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewDataSetID();

    /**
     * Removes the ith "DataSetID" element
     */
    void removeDataSetID(int i);

    /**
     * Gets the "Extracted" element
     */
    java.util.Calendar getExtracted();

    /**
     * Gets (as xml) the "Extracted" element
     */
    org.apache.xmlbeans.XmlDateTime xgetExtracted();

    /**
     * True if has "Extracted" element
     */
    boolean isSetExtracted();

    /**
     * Sets the "Extracted" element
     */
    void setExtracted(java.util.Calendar extracted);

    /**
     * Sets (as xml) the "Extracted" element
     */
    void xsetExtracted(org.apache.xmlbeans.XmlDateTime extracted);

    /**
     * Unsets the "Extracted" element
     */
    void unsetExtracted();

    /**
     * Gets the "ReportingBegin" element
     */
    java.lang.Object getReportingBegin();

    /**
     * Gets (as xml) the "ReportingBegin" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetReportingBegin();

    /**
     * True if has "ReportingBegin" element
     */
    boolean isSetReportingBegin();

    /**
     * Sets the "ReportingBegin" element
     */
    void setReportingBegin(java.lang.Object reportingBegin);

    /**
     * Sets (as xml) the "ReportingBegin" element
     */
    void xsetReportingBegin(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType reportingBegin);

    /**
     * Unsets the "ReportingBegin" element
     */
    void unsetReportingBegin();

    /**
     * Gets the "ReportingEnd" element
     */
    java.lang.Object getReportingEnd();

    /**
     * Gets (as xml) the "ReportingEnd" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetReportingEnd();

    /**
     * True if has "ReportingEnd" element
     */
    boolean isSetReportingEnd();

    /**
     * Sets the "ReportingEnd" element
     */
    void setReportingEnd(java.lang.Object reportingEnd);

    /**
     * Sets (as xml) the "ReportingEnd" element
     */
    void xsetReportingEnd(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType reportingEnd);

    /**
     * Unsets the "ReportingEnd" element
     */
    void unsetReportingEnd();

    /**
     * Gets the "EmbargoDate" element
     */
    java.util.Calendar getEmbargoDate();

    /**
     * Gets (as xml) the "EmbargoDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEmbargoDate();

    /**
     * True if has "EmbargoDate" element
     */
    boolean isSetEmbargoDate();

    /**
     * Sets the "EmbargoDate" element
     */
    void setEmbargoDate(java.util.Calendar embargoDate);

    /**
     * Sets (as xml) the "EmbargoDate" element
     */
    void xsetEmbargoDate(org.apache.xmlbeans.XmlDateTime embargoDate);

    /**
     * Unsets the "EmbargoDate" element
     */
    void unsetEmbargoDate();

    /**
     * Gets a List of "Source" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getSourceList();

    /**
     * Gets array of all "Source" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getSourceArray();

    /**
     * Gets ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getSourceArray(int i);

    /**
     * Returns number of "Source" element
     */
    int sizeOfSourceArray();

    /**
     * Sets ith "Source" element
     */
    void setSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType source);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewSource();

    /**
     * Removes the ith "Source" element
     */
    void removeSource(int i);
}
