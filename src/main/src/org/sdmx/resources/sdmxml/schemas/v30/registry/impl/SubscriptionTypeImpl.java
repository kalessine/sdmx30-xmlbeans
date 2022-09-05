/*
 * XML Type:  SubscriptionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubscriptionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubscriptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType {
    private static final long serialVersionUID = 1L;

    public SubscriptionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Organisation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "RegistryURN"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "NotificationMailTo"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "NotificationHTTP"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubscriberAssignedID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ValidityPeriod"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "EventSelector"),
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

    /**
     * Gets the "RegistryURN" element
     */
    @Override
    public java.lang.String getRegistryURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "RegistryURN" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetRegistryURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "RegistryURN" element
     */
    @Override
    public boolean isSetRegistryURN() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "RegistryURN" element
     */
    @Override
    public void setRegistryURN(java.lang.String registryURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(registryURN);
        }
    }

    /**
     * Sets (as xml) the "RegistryURN" element
     */
    @Override
    public void xsetRegistryURN(org.apache.xmlbeans.XmlAnyURI registryURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(registryURN);
        }
    }

    /**
     * Unsets the "RegistryURN" element
     */
    @Override
    public void unsetRegistryURN() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "NotificationMailTo" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType> getNotificationMailToList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNotificationMailToArray,
                this::setNotificationMailToArray,
                this::insertNewNotificationMailTo,
                this::removeNotificationMailTo,
                this::sizeOfNotificationMailToArray
            );
        }
    }

    /**
     * Gets array of all "NotificationMailTo" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType[] getNotificationMailToArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType[0]);
    }

    /**
     * Gets ith "NotificationMailTo" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType getNotificationMailToArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NotificationMailTo" element
     */
    @Override
    public int sizeOfNotificationMailToArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "NotificationMailTo" element
     */
    @Override
    public void setNotificationMailToArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType notificationMailTo) {
        generatedSetterHelperImpl(notificationMailTo, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationMailTo" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType insertNewNotificationMailTo(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationMailTo" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType addNewNotificationMailTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "NotificationMailTo" element
     */
    @Override
    public void removeNotificationMailTo(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "NotificationHTTP" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType> getNotificationHTTPList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNotificationHTTPArray,
                this::setNotificationHTTPArray,
                this::insertNewNotificationHTTP,
                this::removeNotificationHTTP,
                this::sizeOfNotificationHTTPArray
            );
        }
    }

    /**
     * Gets array of all "NotificationHTTP" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType[] getNotificationHTTPArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType[0]);
    }

    /**
     * Gets ith "NotificationHTTP" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType getNotificationHTTPArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NotificationHTTP" element
     */
    @Override
    public int sizeOfNotificationHTTPArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "NotificationHTTP" element
     */
    @Override
    public void setNotificationHTTPArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType notificationHTTP) {
        generatedSetterHelperImpl(notificationHTTP, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationHTTP" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType insertNewNotificationHTTP(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationHTTP" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType addNewNotificationHTTP() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "NotificationHTTP" element
     */
    @Override
    public void removeNotificationHTTP(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[4]);
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
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "ValidityPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType getValidityPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ValidityPeriod" element
     */
    @Override
    public void setValidityPeriod(org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType validityPeriod) {
        generatedSetterHelperImpl(validityPeriod, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ValidityPeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType addNewValidityPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Gets the "EventSelector" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType getEventSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "EventSelector" element
     */
    @Override
    public void setEventSelector(org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType eventSelector) {
        generatedSetterHelperImpl(eventSelector, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EventSelector" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType addNewEventSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }
}
