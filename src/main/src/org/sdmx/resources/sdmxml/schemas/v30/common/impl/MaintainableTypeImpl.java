/*
 * XML Type:  MaintainableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MaintainableType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public class MaintainableTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.MaintainableBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType {
    private static final long serialVersionUID = 1L;

    public MaintainableTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "agencyID"),
        new QName("", "isExternalReference"),
        new QName("", "serviceURL"),
        new QName("", "structureURL"),
    };


    /**
     * Gets the "agencyID" attribute
     */
    @Override
    public java.lang.String getAgencyID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "agencyID" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType xgetAgencyID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "agencyID" attribute
     */
    @Override
    public void setAgencyID(java.lang.String agencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(agencyID);
        }
    }

    /**
     * Sets (as xml) the "agencyID" attribute
     */
    @Override
    public void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType agencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(agencyID);
        }
    }

    /**
     * Gets the "isExternalReference" attribute
     */
    @Override
    public boolean getIsExternalReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isExternalReference" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsExternalReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return target;
        }
    }

    /**
     * True if has "isExternalReference" attribute
     */
    @Override
    public boolean isSetIsExternalReference() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "isExternalReference" attribute
     */
    @Override
    public void setIsExternalReference(boolean isExternalReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(isExternalReference);
        }
    }

    /**
     * Sets (as xml) the "isExternalReference" attribute
     */
    @Override
    public void xsetIsExternalReference(org.apache.xmlbeans.XmlBoolean isExternalReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(isExternalReference);
        }
    }

    /**
     * Unsets the "isExternalReference" attribute
     */
    @Override
    public void unsetIsExternalReference() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "serviceURL" attribute
     */
    @Override
    public java.lang.String getServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "serviceURL" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "serviceURL" attribute
     */
    @Override
    public boolean isSetServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "serviceURL" attribute
     */
    @Override
    public void setServiceURL(java.lang.String serviceURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(serviceURL);
        }
    }

    /**
     * Sets (as xml) the "serviceURL" attribute
     */
    @Override
    public void xsetServiceURL(org.apache.xmlbeans.XmlAnyURI serviceURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(serviceURL);
        }
    }

    /**
     * Unsets the "serviceURL" attribute
     */
    @Override
    public void unsetServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "structureURL" attribute
     */
    @Override
    public java.lang.String getStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "structureURL" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "structureURL" attribute
     */
    @Override
    public boolean isSetStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "structureURL" attribute
     */
    @Override
    public void setStructureURL(java.lang.String structureURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(structureURL);
        }
    }

    /**
     * Sets (as xml) the "structureURL" attribute
     */
    @Override
    public void xsetStructureURL(org.apache.xmlbeans.XmlAnyURI structureURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(structureURL);
        }
    }

    /**
     * Unsets the "structureURL" attribute
     */
    @Override
    public void unsetStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
