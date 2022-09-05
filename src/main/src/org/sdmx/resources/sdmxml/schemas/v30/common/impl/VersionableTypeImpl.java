/*
 * XML Type:  VersionableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.VersionableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VersionableType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public class VersionableTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.NameableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.VersionableType {
    private static final long serialVersionUID = 1L;

    public VersionableTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "version"),
        new QName("", "validFrom"),
        new QName("", "validTo"),
    };


    /**
     * Gets the "version" attribute
     */
    @Override
    public java.lang.String getVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "version" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.VersionType xgetVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.VersionType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "version" attribute
     */
    @Override
    public boolean isSetVersion() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "version" attribute
     */
    @Override
    public void setVersion(java.lang.String version) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(version);
        }
    }

    /**
     * Sets (as xml) the "version" attribute
     */
    @Override
    public void xsetVersion(org.sdmx.resources.sdmxml.schemas.v30.common.VersionType version) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.VersionType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.VersionType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(version);
        }
    }

    /**
     * Unsets the "version" attribute
     */
    @Override
    public void unsetVersion() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "validFrom" attribute
     */
    @Override
    public java.util.Calendar getValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[1]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "validFrom" attribute
     */
    @Override
    public void setValidFrom(java.util.Calendar validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setCalendarValue(validFrom);
        }
    }

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    @Override
    public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "validTo" attribute
     */
    @Override
    public java.util.Calendar getValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validTo" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[2]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "validTo" attribute
     */
    @Override
    public void setValidTo(java.util.Calendar validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setCalendarValue(validTo);
        }
    }

    /**
     * Sets (as xml) the "validTo" attribute
     */
    @Override
    public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PROPERTY_QNAME[2]);
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
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}
