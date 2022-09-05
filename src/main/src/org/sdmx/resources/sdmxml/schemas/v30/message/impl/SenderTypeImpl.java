/*
 * XML Type:  SenderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.SenderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SenderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class SenderTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.PartyTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.SenderType {
    private static final long serialVersionUID = 1L;

    public SenderTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Timezone"),
    };


    /**
     * Gets the "Timezone" element
     */
    @Override
    public java.lang.String getTimezone() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Timezone" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType xgetTimezone() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Timezone" element
     */
    @Override
    public boolean isSetTimezone() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Timezone" element
     */
    @Override
    public void setTimezone(java.lang.String timezone) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(timezone);
        }
    }

    /**
     * Sets (as xml) the "Timezone" element
     */
    @Override
    public void xsetTimezone(org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType timezone) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.TimezoneType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(timezone);
        }
    }

    /**
     * Unsets the "Timezone" element
     */
    @Override
    public void unsetTimezone() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
