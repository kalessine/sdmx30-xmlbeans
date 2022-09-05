/*
 * XML Type:  VersionableQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VersionableQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class VersionableQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.registry.impl.IdentifiableQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableQueryType {
    private static final long serialVersionUID = 1L;

    public VersionableQueryTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "version"),
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
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "version" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType xgetVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
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
    public void xsetVersion(org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType version) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
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
}
