/*
 * XML Type:  DataSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific).
 *
 * This is a complex type.
 */
public class DataSetTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.DataSetType {
    private static final long serialVersionUID = 1L;

    public DataSetTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "DataProvider"),
        new QName("", "Atts"),
        new QName("", "Group"),
        new QName("", "Series"),
        new QName("", "Obs"),
        new QName("", "Metadata"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "structureRef"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "setID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "action"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "reportingBeginDate"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "reportingEndDate"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "validFromDate"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "validToDate"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "publicationYear"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific", "publicationPeriod"),
    };


    /**
     * Gets the "DataProvider" element
     */
    @Override
    public java.lang.String getDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType xgetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "DataProvider" element
     */
    @Override
    public boolean isSetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "DataProvider" element
     */
    @Override
    public void setDataProvider(java.lang.String dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(dataProvider);
        }
    }

    /**
     * Sets (as xml) the "DataProvider" element
     */
    @Override
    public void xsetDataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(dataProvider);
        }
    }

    /**
     * Unsets the "DataProvider" element
     */
    @Override
    public void unsetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "Atts" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType> getAttsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttsArray,
                this::setAttsArray,
                this::insertNewAtts,
                this::removeAtts,
                this::sizeOfAttsArray
            );
        }
    }

    /**
     * Gets array of all "Atts" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType[] getAttsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType[0]);
    }

    /**
     * Gets ith "Atts" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType getAttsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Atts" element
     */
    @Override
    public int sizeOfAttsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Atts" element
     */
    @Override
    public void setAttsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType atts) {
        generatedSetterHelperImpl(atts, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Atts" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType insertNewAtts(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Atts" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType addNewAtts() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.AttsType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Atts" element
     */
    @Override
    public void removeAtts(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "Group" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType> getGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGroupArray,
                this::setGroupArray,
                this::insertNewGroup,
                this::removeGroup,
                this::sizeOfGroupArray
            );
        }
    }

    /**
     * Gets array of all "Group" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType[] getGroupArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType[0]);
    }

    /**
     * Gets ith "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType getGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Group" element
     */
    @Override
    public int sizeOfGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "Group" element
     */
    @Override
    public void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType insertNewGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "Group" element
     */
    @Override
    public void removeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "Series" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType> getSeriesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSeriesArray,
                this::setSeriesArray,
                this::insertNewSeries,
                this::removeSeries,
                this::sizeOfSeriesArray
            );
        }
    }

    /**
     * Gets array of all "Series" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType[] getSeriesArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType[0]);
    }

    /**
     * Gets ith "Series" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType getSeriesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Series" element
     */
    @Override
    public int sizeOfSeriesArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "Series" element
     */
    @Override
    public void setSeriesArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType series) {
        generatedSetterHelperImpl(series, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Series" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType insertNewSeries(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Series" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType addNewSeries() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "Series" element
     */
    @Override
    public void removeSeries(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "Obs" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType> getObsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getObsArray,
                this::setObsArray,
                this::insertNewObs,
                this::removeObs,
                this::sizeOfObsArray
            );
        }
    }

    /**
     * Gets array of all "Obs" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType[] getObsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType[0]);
    }

    /**
     * Gets ith "Obs" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType getObsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Obs" element
     */
    @Override
    public int sizeOfObsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "Obs" element
     */
    @Override
    public void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType obs) {
        generatedSetterHelperImpl(obs, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType insertNewObs(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType addNewObs() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "Obs" element
     */
    @Override
    public void removeObs(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets the "Metadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType getMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Metadata" element
     */
    @Override
    public boolean isSetMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "Metadata" element
     */
    @Override
    public void setMetadata(org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType metadata) {
        generatedSetterHelperImpl(metadata, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Metadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType addNewMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "Metadata" element
     */
    @Override
    public void unsetMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "structureRef" attribute
     */
    @Override
    public java.lang.String getStructureRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "structureRef" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlIDREF xgetStructureRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Sets the "structureRef" attribute
     */
    @Override
    public void setStructureRef(java.lang.String structureRef) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(structureRef);
        }
    }

    /**
     * Sets (as xml) the "structureRef" attribute
     */
    @Override
    public void xsetStructureRef(org.apache.xmlbeans.XmlIDREF structureRef) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(structureRef);
        }
    }

    /**
     * Gets the "setID" attribute
     */
    @Override
    public java.lang.String getSetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "setID" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "setID" attribute
     */
    @Override
    public boolean isSetSetID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "setID" attribute
     */
    @Override
    public void setSetID(java.lang.String setID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(setID);
        }
    }

    /**
     * Sets (as xml) the "setID" attribute
     */
    @Override
    public void xsetSetID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType setID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(setID);
        }
    }

    /**
     * Unsets the "setID" attribute
     */
    @Override
    public void unsetSetID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "action" attribute
     */
    @Override
    public boolean isSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "action" attribute
     */
    @Override
    public void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setEnumValue(action);
        }
    }

    /**
     * Sets (as xml) the "action" attribute
     */
    @Override
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(action);
        }
    }

    /**
     * Unsets the "action" attribute
     */
    @Override
    public void unsetAction() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "reportingBeginDate" attribute
     */
    @Override
    public java.util.Calendar getReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "reportingBeginDate" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "reportingBeginDate" attribute
     */
    @Override
    public boolean isSetReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "reportingBeginDate" attribute
     */
    @Override
    public void setReportingBeginDate(java.util.Calendar reportingBeginDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setCalendarValue(reportingBeginDate);
        }
    }

    /**
     * Sets (as xml) the "reportingBeginDate" attribute
     */
    @Override
    public void xsetReportingBeginDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingBeginDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(reportingBeginDate);
        }
    }

    /**
     * Unsets the "reportingBeginDate" attribute
     */
    @Override
    public void unsetReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "reportingEndDate" attribute
     */
    @Override
    public java.util.Calendar getReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "reportingEndDate" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "reportingEndDate" attribute
     */
    @Override
    public boolean isSetReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "reportingEndDate" attribute
     */
    @Override
    public void setReportingEndDate(java.util.Calendar reportingEndDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setCalendarValue(reportingEndDate);
        }
    }

    /**
     * Sets (as xml) the "reportingEndDate" attribute
     */
    @Override
    public void xsetReportingEndDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingEndDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(reportingEndDate);
        }
    }

    /**
     * Unsets the "reportingEndDate" attribute
     */
    @Override
    public void unsetReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "validFromDate" attribute
     */
    @Override
    public java.util.Calendar getValidFromDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validFromDate" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetValidFromDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "validFromDate" attribute
     */
    @Override
    public boolean isSetValidFromDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "validFromDate" attribute
     */
    @Override
    public void setValidFromDate(java.util.Calendar validFromDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setCalendarValue(validFromDate);
        }
    }

    /**
     * Sets (as xml) the "validFromDate" attribute
     */
    @Override
    public void xsetValidFromDate(org.apache.xmlbeans.XmlDateTime validFromDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(validFromDate);
        }
    }

    /**
     * Unsets the "validFromDate" attribute
     */
    @Override
    public void unsetValidFromDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "validToDate" attribute
     */
    @Override
    public java.util.Calendar getValidToDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validToDate" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetValidToDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "validToDate" attribute
     */
    @Override
    public boolean isSetValidToDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "validToDate" attribute
     */
    @Override
    public void setValidToDate(java.util.Calendar validToDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setCalendarValue(validToDate);
        }
    }

    /**
     * Sets (as xml) the "validToDate" attribute
     */
    @Override
    public void xsetValidToDate(org.apache.xmlbeans.XmlDateTime validToDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(validToDate);
        }
    }

    /**
     * Unsets the "validToDate" attribute
     */
    @Override
    public void unsetValidToDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "publicationYear" attribute
     */
    @Override
    public java.util.Calendar getPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "publicationYear" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlGYear xgetPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "publicationYear" attribute
     */
    @Override
    public boolean isSetPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "publicationYear" attribute
     */
    @Override
    public void setPublicationYear(java.util.Calendar publicationYear) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setCalendarValue(publicationYear);
        }
    }

    /**
     * Sets (as xml) the "publicationYear" attribute
     */
    @Override
    public void xsetPublicationYear(org.apache.xmlbeans.XmlGYear publicationYear) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlGYear)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(publicationYear);
        }
    }

    /**
     * Unsets the "publicationYear" attribute
     */
    @Override
    public void unsetPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "publicationPeriod" attribute
     */
    @Override
    public java.lang.Object getPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "publicationPeriod" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "publicationPeriod" attribute
     */
    @Override
    public boolean isSetPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "publicationPeriod" attribute
     */
    @Override
    public void setPublicationPeriod(java.lang.Object publicationPeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setObjectValue(publicationPeriod);
        }
    }

    /**
     * Sets (as xml) the "publicationPeriod" attribute
     */
    @Override
    public void xsetPublicationPeriod(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType publicationPeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(publicationPeriod);
        }
    }

    /**
     * Unsets the "publicationPeriod" attribute
     */
    @Override
    public void unsetPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }
}
