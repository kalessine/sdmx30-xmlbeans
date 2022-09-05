/*
 * XML Type:  ReportingTaxonomyMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ReportingTaxonomyMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ReportingTaxonomyMapsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType {
    private static final long serialVersionUID = 1L;

    public ReportingTaxonomyMapsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingTaxonomyMap"),
    };


    /**
     * Gets a List of "ReportingTaxonomyMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType> getReportingTaxonomyMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReportingTaxonomyMapArray,
                this::setReportingTaxonomyMapArray,
                this::insertNewReportingTaxonomyMap,
                this::removeReportingTaxonomyMap,
                this::sizeOfReportingTaxonomyMapArray
            );
        }
    }

    /**
     * Gets array of all "ReportingTaxonomyMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType[] getReportingTaxonomyMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType[0]);
    }

    /**
     * Gets ith "ReportingTaxonomyMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType getReportingTaxonomyMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ReportingTaxonomyMap" element
     */
    @Override
    public int sizeOfReportingTaxonomyMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ReportingTaxonomyMap" element
     */
    @Override
    public void setReportingTaxonomyMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType reportingTaxonomyMap) {
        generatedSetterHelperImpl(reportingTaxonomyMap, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomyMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType insertNewReportingTaxonomyMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomyMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType addNewReportingTaxonomyMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ReportingTaxonomyMap" element
     */
    @Override
    public void removeReportingTaxonomyMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
