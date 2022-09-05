/*
 * XML Type:  FrequencyFormatMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML FrequencyFormatMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class FrequencyFormatMappingTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.FrequencyFormatMappingBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.FrequencyFormatMappingType {
    private static final long serialVersionUID = 1L;

    public FrequencyFormatMappingTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "FrequencyId"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DatePattern"),
    };


    /**
     * Gets the "FrequencyId" element
     */
    @Override
    public java.lang.String getFrequencyId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "FrequencyId" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetFrequencyId() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "FrequencyId" element
     */
    @Override
    public void setFrequencyId(java.lang.String frequencyId) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(frequencyId);
        }
    }

    /**
     * Sets (as xml) the "FrequencyId" element
     */
    @Override
    public void xsetFrequencyId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType frequencyId) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(frequencyId);
        }
    }

    /**
     * Gets the "DatePattern" element
     */
    @Override
    public java.lang.String getDatePattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DatePattern" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDatePattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "DatePattern" element
     */
    @Override
    public void setDatePattern(java.lang.String datePattern) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(datePattern);
        }
    }

    /**
     * Sets (as xml) the "DatePattern" element
     */
    @Override
    public void xsetDatePattern(org.apache.xmlbeans.XmlString datePattern) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(datePattern);
        }
    }
}
