/*
 * XML Type:  SubscriptionStatusType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubscriptionStatusType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubscriptionStatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType {
    private static final long serialVersionUID = 1L;

    public SubscriptionStatusTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubscriptionURN"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubscriberAssignedID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StatusMessage"),
    };


    /**
     * Gets the "SubscriptionURN" element
     */
    @Override
    public java.lang.String getSubscriptionURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SubscriptionURN" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetSubscriptionURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "SubscriptionURN" element
     */
    @Override
    public boolean isSetSubscriptionURN() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "SubscriptionURN" element
     */
    @Override
    public void setSubscriptionURN(java.lang.String subscriptionURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(subscriptionURN);
        }
    }

    /**
     * Sets (as xml) the "SubscriptionURN" element
     */
    @Override
    public void xsetSubscriptionURN(org.apache.xmlbeans.XmlAnyURI subscriptionURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(subscriptionURN);
        }
    }

    /**
     * Unsets the "SubscriptionURN" element
     */
    @Override
    public void unsetSubscriptionURN() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "SubscriberAssignedID" element
     */
    @Override
    public java.lang.String getSubscriberAssignedID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SubscriberAssignedID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSubscriberAssignedID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "SubscriberAssignedID" element
     */
    @Override
    public boolean isSetSubscriberAssignedID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "SubscriberAssignedID" element
     */
    @Override
    public void setSubscriberAssignedID(java.lang.String subscriberAssignedID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(subscriberAssignedID);
        }
    }

    /**
     * Sets (as xml) the "SubscriberAssignedID" element
     */
    @Override
    public void xsetSubscriberAssignedID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType subscriberAssignedID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(subscriberAssignedID);
        }
    }

    /**
     * Unsets the "SubscriberAssignedID" element
     */
    @Override
    public void unsetSubscriberAssignedID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType getStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StatusMessage" element
     */
    @Override
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType statusMessage) {
        generatedSetterHelperImpl(statusMessage, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType addNewStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }
}
