/*
 * XML Type:  MaintainableQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MaintainableQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class MaintainableQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.registry.impl.VersionableQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType {
    private static final long serialVersionUID = 1L;

    public MaintainableQueryTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "agencyID"),
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
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "agencyID" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType xgetAgencyID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "agencyID" attribute
     */
    @Override
    public boolean isSetAgencyID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
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
    public void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType agencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(agencyID);
        }
    }

    /**
     * Unsets the "agencyID" attribute
     */
    @Override
    public void unsetAgencyID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
