/*
 * XML Type:  EpochMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML EpochMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class EpochMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.EpochMapBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.EpochMapType {
    private static final long serialVersionUID = 1L;

    public EpochMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "basePeriod"),
        new QName("", "epochPeriod"),
    };


    /**
     * Gets the "basePeriod" attribute
     */
    @Override
    public java.lang.String getBasePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "basePeriod" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetBasePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "basePeriod" attribute
     */
    @Override
    public void setBasePeriod(java.lang.String basePeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(basePeriod);
        }
    }

    /**
     * Sets (as xml) the "basePeriod" attribute
     */
    @Override
    public void xsetBasePeriod(org.apache.xmlbeans.XmlString basePeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(basePeriod);
        }
    }

    /**
     * Gets the "epochPeriod" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType.Enum getEpochPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "epochPeriod" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType xgetEpochPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Sets the "epochPeriod" attribute
     */
    @Override
    public void setEpochPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType.Enum epochPeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(epochPeriod);
        }
    }

    /**
     * Sets (as xml) the "epochPeriod" attribute
     */
    @Override
    public void xsetEpochPeriod(org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType epochPeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.EpochPeriodType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(epochPeriod);
        }
    }
}
