/*
 * XML Type:  ReportingCategoryBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ReportingCategoryBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ReportingCategoryBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryBaseType {
    private static final long serialVersionUID = 1L;

    public ReportingCategoryBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingCategory"),
    };


    /**
     * Gets a List of "ReportingCategory" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType> getReportingCategoryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReportingCategoryArray,
                this::setReportingCategoryArray,
                this::insertNewReportingCategory,
                this::removeReportingCategory,
                this::sizeOfReportingCategoryArray
            );
        }
    }

    /**
     * Gets array of all "ReportingCategory" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType[] getReportingCategoryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType[0]);
    }

    /**
     * Gets ith "ReportingCategory" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType getReportingCategoryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ReportingCategory" element
     */
    @Override
    public int sizeOfReportingCategoryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ReportingCategory" element
     */
    @Override
    public void setReportingCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType reportingCategory) {
        generatedSetterHelperImpl(reportingCategory, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingCategory" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType insertNewReportingCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingCategory" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType addNewReportingCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ReportingCategory" element
     */
    @Override
    public void removeReportingCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
