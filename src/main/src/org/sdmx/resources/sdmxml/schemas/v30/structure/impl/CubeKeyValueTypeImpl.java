/*
 * XML Type:  CubeKeyValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CubeKeyValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CubeKeyValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.CubeKeyValueType.
 */
public class CubeKeyValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.sdmx.resources.sdmxml.schemas.v30.structure.CubeKeyValueType {
    private static final long serialVersionUID = 1L;

    public CubeKeyValueTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected CubeKeyValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/XML/1998/namespace", "lang"),
        new QName("", "cascadeValues"),
        new QName("", "validFrom"),
        new QName("", "validTo"),
    };


    /**
     * Gets the "lang" attribute
     */
    @Override
    public java.lang.String getLang() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "lang" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage xgetLang() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "lang" attribute
     */
    @Override
    public boolean isSetLang() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "lang" attribute
     */
    @Override
    public void setLang(java.lang.String lang) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(lang);
        }
    }

    /**
     * Sets (as xml) the "lang" attribute
     */
    @Override
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(lang);
        }
    }

    /**
     * Unsets the "lang" attribute
     */
    @Override
    public void unsetLang() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "cascadeValues" attribute
     */
    @Override
    public java.lang.Object getCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "cascadeValues" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType xgetCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return target;
        }
    }

    /**
     * True if has "cascadeValues" attribute
     */
    @Override
    public boolean isSetCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "cascadeValues" attribute
     */
    @Override
    public void setCascadeValues(java.lang.Object cascadeValues) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setObjectValue(cascadeValues);
        }
    }

    /**
     * Sets (as xml) the "cascadeValues" attribute
     */
    @Override
    public void xsetCascadeValues(org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType cascadeValues) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(cascadeValues);
        }
    }

    /**
     * Unsets the "cascadeValues" attribute
     */
    @Override
    public void unsetCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "validFrom" attribute
     */
    @Override
    public java.lang.Object getValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "validFrom" attribute
     */
    @Override
    public boolean isSetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "validFrom" attribute
     */
    @Override
    public void setValidFrom(java.lang.Object validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setObjectValue(validFrom);
        }
    }

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    @Override
    public void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(validFrom);
        }
    }

    /**
     * Unsets the "validFrom" attribute
     */
    @Override
    public void unsetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "validTo" attribute
     */
    @Override
    public java.lang.Object getValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "validTo" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "validTo" attribute
     */
    @Override
    public boolean isSetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "validTo" attribute
     */
    @Override
    public void setValidTo(java.lang.Object validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setObjectValue(validTo);
        }
    }

    /**
     * Sets (as xml) the "validTo" attribute
     */
    @Override
    public void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(validTo);
        }
    }

    /**
     * Unsets the "validTo" attribute
     */
    @Override
    public void unsetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
