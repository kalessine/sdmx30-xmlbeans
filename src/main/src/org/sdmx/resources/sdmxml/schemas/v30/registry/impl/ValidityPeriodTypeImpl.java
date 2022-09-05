/*
 * XML Type:  ValidityPeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ValidityPeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class ValidityPeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType {
    private static final long serialVersionUID = 1L;

    public ValidityPeriodTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StartDate"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "EndDate"),
    };


    /**
     * Gets the "StartDate" element
     */
    @Override
    public java.util.Calendar getStartDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "StartDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetStartDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "StartDate" element
     */
    @Override
    public void setStartDate(java.util.Calendar startDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setCalendarValue(startDate);
        }
    }

    /**
     * Sets (as xml) the "StartDate" element
     */
    @Override
    public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(startDate);
        }
    }

    /**
     * Gets the "EndDate" element
     */
    @Override
    public java.util.Calendar getEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "EndDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "EndDate" element
     */
    @Override
    public void setEndDate(java.util.Calendar endDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setCalendarValue(endDate);
        }
    }

    /**
     * Sets (as xml) the "EndDate" element
     */
    @Override
    public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(endDate);
        }
    }
}
