/*
 * XML Type:  DataSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific).
 *
 * This is a complex type.
 */
public interface DataSetType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datasettypeb6c5type");
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
     * Gets a List of "Atts" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType> getAttsList();

    /**
     * Gets array of all "Atts" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType[] getAttsArray();

    /**
     * Gets ith "Atts" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType getAttsArray(int i);

    /**
     * Returns number of "Atts" element
     */
    int sizeOfAttsArray();

    /**
     * Sets ith "Atts" element
     */
    void setAttsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType atts);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Atts" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType insertNewAtts(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Atts" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType addNewAtts();

    /**
     * Removes the ith "Atts" element
     */
    void removeAtts(int i);

    /**
     * Gets a List of "Group" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType> getGroupList();

    /**
     * Gets array of all "Group" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType[] getGroupArray();

    /**
     * Gets ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType getGroupArray(int i);

    /**
     * Returns number of "Group" element
     */
    int sizeOfGroupArray();

    /**
     * Sets ith "Group" element
     */
    void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType group);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType insertNewGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType addNewGroup();

    /**
     * Removes the ith "Group" element
     */
    void removeGroup(int i);

    /**
     * Gets a List of "Series" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType> getSeriesList();

    /**
     * Gets array of all "Series" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType[] getSeriesArray();

    /**
     * Gets ith "Series" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType getSeriesArray(int i);

    /**
     * Returns number of "Series" element
     */
    int sizeOfSeriesArray();

    /**
     * Sets ith "Series" element
     */
    void setSeriesArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType series);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Series" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType insertNewSeries(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Series" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType addNewSeries();

    /**
     * Removes the ith "Series" element
     */
    void removeSeries(int i);

    /**
     * Gets a List of "Obs" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType> getObsList();

    /**
     * Gets array of all "Obs" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType[] getObsArray();

    /**
     * Gets ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType getObsArray(int i);

    /**
     * Returns number of "Obs" element
     */
    int sizeOfObsArray();

    /**
     * Sets ith "Obs" element
     */
    void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType obs);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType insertNewObs(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType addNewObs();

    /**
     * Removes the ith "Obs" element
     */
    void removeObs(int i);

    /**
     * Gets the "Metadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType getMetadata();

    /**
     * True if has "Metadata" element
     */
    boolean isSetMetadata();

    /**
     * Sets the "Metadata" element
     */
    void setMetadata(org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType metadata);

    /**
     * Appends and returns a new empty "Metadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType addNewMetadata();

    /**
     * Unsets the "Metadata" element
     */
    void unsetMetadata();

    /**
     * Gets the "structureRef" attribute
     */
    java.lang.String getStructureRef();

    /**
     * Gets (as xml) the "structureRef" attribute
     */
    org.apache.xmlbeans.XmlIDREF xgetStructureRef();

    /**
     * Sets the "structureRef" attribute
     */
    void setStructureRef(java.lang.String structureRef);

    /**
     * Sets (as xml) the "structureRef" attribute
     */
    void xsetStructureRef(org.apache.xmlbeans.XmlIDREF structureRef);

    /**
     * Gets the "setID" attribute
     */
    java.lang.String getSetID();

    /**
     * Gets (as xml) the "setID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSetID();

    /**
     * True if has "setID" attribute
     */
    boolean isSetSetID();

    /**
     * Sets the "setID" attribute
     */
    void setSetID(java.lang.String setID);

    /**
     * Sets (as xml) the "setID" attribute
     */
    void xsetSetID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType setID);

    /**
     * Unsets the "setID" attribute
     */
    void unsetSetID();

    /**
     * Gets the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction();

    /**
     * Gets (as xml) the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction();

    /**
     * True if has "action" attribute
     */
    boolean isSetAction();

    /**
     * Sets the "action" attribute
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action);

    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action);

    /**
     * Unsets the "action" attribute
     */
    void unsetAction();

    /**
     * Gets the "reportingBeginDate" attribute
     */
    java.util.Calendar getReportingBeginDate();

    /**
     * Gets (as xml) the "reportingBeginDate" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingBeginDate();

    /**
     * True if has "reportingBeginDate" attribute
     */
    boolean isSetReportingBeginDate();

    /**
     * Sets the "reportingBeginDate" attribute
     */
    void setReportingBeginDate(java.util.Calendar reportingBeginDate);

    /**
     * Sets (as xml) the "reportingBeginDate" attribute
     */
    void xsetReportingBeginDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingBeginDate);

    /**
     * Unsets the "reportingBeginDate" attribute
     */
    void unsetReportingBeginDate();

    /**
     * Gets the "reportingEndDate" attribute
     */
    java.util.Calendar getReportingEndDate();

    /**
     * Gets (as xml) the "reportingEndDate" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingEndDate();

    /**
     * True if has "reportingEndDate" attribute
     */
    boolean isSetReportingEndDate();

    /**
     * Sets the "reportingEndDate" attribute
     */
    void setReportingEndDate(java.util.Calendar reportingEndDate);

    /**
     * Sets (as xml) the "reportingEndDate" attribute
     */
    void xsetReportingEndDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingEndDate);

    /**
     * Unsets the "reportingEndDate" attribute
     */
    void unsetReportingEndDate();

    /**
     * Gets the "validFromDate" attribute
     */
    java.util.Calendar getValidFromDate();

    /**
     * Gets (as xml) the "validFromDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidFromDate();

    /**
     * True if has "validFromDate" attribute
     */
    boolean isSetValidFromDate();

    /**
     * Sets the "validFromDate" attribute
     */
    void setValidFromDate(java.util.Calendar validFromDate);

    /**
     * Sets (as xml) the "validFromDate" attribute
     */
    void xsetValidFromDate(org.apache.xmlbeans.XmlDateTime validFromDate);

    /**
     * Unsets the "validFromDate" attribute
     */
    void unsetValidFromDate();

    /**
     * Gets the "validToDate" attribute
     */
    java.util.Calendar getValidToDate();

    /**
     * Gets (as xml) the "validToDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidToDate();

    /**
     * True if has "validToDate" attribute
     */
    boolean isSetValidToDate();

    /**
     * Sets the "validToDate" attribute
     */
    void setValidToDate(java.util.Calendar validToDate);

    /**
     * Sets (as xml) the "validToDate" attribute
     */
    void xsetValidToDate(org.apache.xmlbeans.XmlDateTime validToDate);

    /**
     * Unsets the "validToDate" attribute
     */
    void unsetValidToDate();

    /**
     * Gets the "publicationYear" attribute
     */
    java.util.Calendar getPublicationYear();

    /**
     * Gets (as xml) the "publicationYear" attribute
     */
    org.apache.xmlbeans.XmlGYear xgetPublicationYear();

    /**
     * True if has "publicationYear" attribute
     */
    boolean isSetPublicationYear();

    /**
     * Sets the "publicationYear" attribute
     */
    void setPublicationYear(java.util.Calendar publicationYear);

    /**
     * Sets (as xml) the "publicationYear" attribute
     */
    void xsetPublicationYear(org.apache.xmlbeans.XmlGYear publicationYear);

    /**
     * Unsets the "publicationYear" attribute
     */
    void unsetPublicationYear();

    /**
     * Gets the "publicationPeriod" attribute
     */
    java.lang.Object getPublicationPeriod();

    /**
     * Gets (as xml) the "publicationPeriod" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetPublicationPeriod();

    /**
     * True if has "publicationPeriod" attribute
     */
    boolean isSetPublicationPeriod();

    /**
     * Sets the "publicationPeriod" attribute
     */
    void setPublicationPeriod(java.lang.Object publicationPeriod);

    /**
     * Sets (as xml) the "publicationPeriod" attribute
     */
    void xsetPublicationPeriod(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType publicationPeriod);

    /**
     * Unsets the "publicationPeriod" attribute
     */
    void unsetPublicationPeriod();
}
