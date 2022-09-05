/*
 * XML Type:  ReportingTaxonomiesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ReportingTaxonomiesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ReportingTaxonomiesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType {
    private static final long serialVersionUID = 1L;

    public ReportingTaxonomiesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingTaxonomy"),
    };


    /**
     * Gets a List of "ReportingTaxonomy" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType> getReportingTaxonomyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReportingTaxonomyArray,
                this::setReportingTaxonomyArray,
                this::insertNewReportingTaxonomy,
                this::removeReportingTaxonomy,
                this::sizeOfReportingTaxonomyArray
            );
        }
    }

    /**
     * Gets array of all "ReportingTaxonomy" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType[] getReportingTaxonomyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType[0]);
    }

    /**
     * Gets ith "ReportingTaxonomy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType getReportingTaxonomyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ReportingTaxonomy" element
     */
    @Override
    public int sizeOfReportingTaxonomyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ReportingTaxonomy" element
     */
    @Override
    public void setReportingTaxonomyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType reportingTaxonomy) {
        generatedSetterHelperImpl(reportingTaxonomy, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType insertNewReportingTaxonomy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType addNewReportingTaxonomy() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ReportingTaxonomy" element
     */
    @Override
    public void removeReportingTaxonomy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
