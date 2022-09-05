/*
 * XML Type:  SeriesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SeriesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific).
 *
 * This is a complex type.
 */
public interface SeriesType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.SeriesType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "seriestype21d4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Comp" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType> getCompList();

    /**
     * Gets array of all "Comp" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType[] getCompArray();

    /**
     * Gets ith "Comp" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType getCompArray(int i);

    /**
     * Returns number of "Comp" element
     */
    int sizeOfCompArray();

    /**
     * Sets ith "Comp" element
     */
    void setCompArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType comp);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comp" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType insertNewComp(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Comp" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType addNewComp();

    /**
     * Removes the ith "Comp" element
     */
    void removeComp(int i);

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
     * Gets the "TIME_PERIOD" attribute
     */
    java.lang.Object getTIMEPERIOD();

    /**
     * Gets (as xml) the "TIME_PERIOD" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetTIMEPERIOD();

    /**
     * True if has "TIME_PERIOD" attribute
     */
    boolean isSetTIMEPERIOD();

    /**
     * Sets the "TIME_PERIOD" attribute
     */
    void setTIMEPERIOD(java.lang.Object timeperiod);

    /**
     * Sets (as xml) the "TIME_PERIOD" attribute
     */
    void xsetTIMEPERIOD(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType timeperiod);

    /**
     * Unsets the "TIME_PERIOD" attribute
     */
    void unsetTIMEPERIOD();
}
