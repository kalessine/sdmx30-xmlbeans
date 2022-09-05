/*
 * XML Type:  QuerySubscriptionRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML QuerySubscriptionRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class QuerySubscriptionRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType {
    private static final long serialVersionUID = 1L;

    public QuerySubscriptionRequestTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Organisation"),
    };


    /**
     * Gets the "Organisation" element
     */
    @Override
    public java.lang.String getOrganisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Organisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType xgetOrganisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "Organisation" element
     */
    @Override
    public void setOrganisation(java.lang.String organisation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(organisation);
        }
    }

    /**
     * Sets (as xml) the "Organisation" element
     */
    @Override
    public void xsetOrganisation(org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType organisation) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(organisation);
        }
    }
}
