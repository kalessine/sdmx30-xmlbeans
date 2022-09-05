/*
 * XML Type:  TimeRangeValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeRangeValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TimeRangeValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TimeRangeValueType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TimeRangeValueType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "timerangevaluetype5509type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "BeforePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getBeforePeriod();

    /**
     * True if has "BeforePeriod" element
     */
    boolean isSetBeforePeriod();

    /**
     * Sets the "BeforePeriod" element
     */
    void setBeforePeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType beforePeriod);

    /**
     * Appends and returns a new empty "BeforePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewBeforePeriod();

    /**
     * Unsets the "BeforePeriod" element
     */
    void unsetBeforePeriod();

    /**
     * Gets the "AfterPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getAfterPeriod();

    /**
     * True if has "AfterPeriod" element
     */
    boolean isSetAfterPeriod();

    /**
     * Sets the "AfterPeriod" element
     */
    void setAfterPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType afterPeriod);

    /**
     * Appends and returns a new empty "AfterPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewAfterPeriod();

    /**
     * Unsets the "AfterPeriod" element
     */
    void unsetAfterPeriod();

    /**
     * Gets the "StartPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getStartPeriod();

    /**
     * True if has "StartPeriod" element
     */
    boolean isSetStartPeriod();

    /**
     * Sets the "StartPeriod" element
     */
    void setStartPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType startPeriod);

    /**
     * Appends and returns a new empty "StartPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewStartPeriod();

    /**
     * Unsets the "StartPeriod" element
     */
    void unsetStartPeriod();

    /**
     * Gets the "EndPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType getEndPeriod();

    /**
     * True if has "EndPeriod" element
     */
    boolean isSetEndPeriod();

    /**
     * Sets the "EndPeriod" element
     */
    void setEndPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType endPeriod);

    /**
     * Appends and returns a new empty "EndPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TimePeriodRangeType addNewEndPeriod();

    /**
     * Unsets the "EndPeriod" element
     */
    void unsetEndPeriod();

    /**
     * Gets the "validFrom" attribute
     */
    java.lang.Object getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.lang.Object validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.lang.Object getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.lang.Object validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
