/*
 * XML Type:  SubscriptionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubscriptionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubscriptionType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "subscriptiontypedfebtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Organisation" element
     */
    java.lang.String getOrganisation();

    /**
     * Gets (as xml) the "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType xgetOrganisation();

    /**
     * Sets the "Organisation" element
     */
    void setOrganisation(java.lang.String organisation);

    /**
     * Sets (as xml) the "Organisation" element
     */
    void xsetOrganisation(org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType organisation);

    /**
     * Gets the "RegistryURN" element
     */
    java.lang.String getRegistryURN();

    /**
     * Gets (as xml) the "RegistryURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetRegistryURN();

    /**
     * True if has "RegistryURN" element
     */
    boolean isSetRegistryURN();

    /**
     * Sets the "RegistryURN" element
     */
    void setRegistryURN(java.lang.String registryURN);

    /**
     * Sets (as xml) the "RegistryURN" element
     */
    void xsetRegistryURN(org.apache.xmlbeans.XmlAnyURI registryURN);

    /**
     * Unsets the "RegistryURN" element
     */
    void unsetRegistryURN();

    /**
     * Gets a List of "NotificationMailTo" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType> getNotificationMailToList();

    /**
     * Gets array of all "NotificationMailTo" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType[] getNotificationMailToArray();

    /**
     * Gets ith "NotificationMailTo" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType getNotificationMailToArray(int i);

    /**
     * Returns number of "NotificationMailTo" element
     */
    int sizeOfNotificationMailToArray();

    /**
     * Sets ith "NotificationMailTo" element
     */
    void setNotificationMailToArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType notificationMailTo);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationMailTo" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType insertNewNotificationMailTo(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationMailTo" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType addNewNotificationMailTo();

    /**
     * Removes the ith "NotificationMailTo" element
     */
    void removeNotificationMailTo(int i);

    /**
     * Gets a List of "NotificationHTTP" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType> getNotificationHTTPList();

    /**
     * Gets array of all "NotificationHTTP" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType[] getNotificationHTTPArray();

    /**
     * Gets ith "NotificationHTTP" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType getNotificationHTTPArray(int i);

    /**
     * Returns number of "NotificationHTTP" element
     */
    int sizeOfNotificationHTTPArray();

    /**
     * Sets ith "NotificationHTTP" element
     */
    void setNotificationHTTPArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType notificationHTTP);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationHTTP" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType insertNewNotificationHTTP(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationHTTP" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NotificationURLType addNewNotificationHTTP();

    /**
     * Removes the ith "NotificationHTTP" element
     */
    void removeNotificationHTTP(int i);

    /**
     * Gets the "SubscriberAssignedID" element
     */
    java.lang.String getSubscriberAssignedID();

    /**
     * Gets (as xml) the "SubscriberAssignedID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSubscriberAssignedID();

    /**
     * True if has "SubscriberAssignedID" element
     */
    boolean isSetSubscriberAssignedID();

    /**
     * Sets the "SubscriberAssignedID" element
     */
    void setSubscriberAssignedID(java.lang.String subscriberAssignedID);

    /**
     * Sets (as xml) the "SubscriberAssignedID" element
     */
    void xsetSubscriberAssignedID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType subscriberAssignedID);

    /**
     * Unsets the "SubscriberAssignedID" element
     */
    void unsetSubscriberAssignedID();

    /**
     * Gets the "ValidityPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType getValidityPeriod();

    /**
     * Sets the "ValidityPeriod" element
     */
    void setValidityPeriod(org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType validityPeriod);

    /**
     * Appends and returns a new empty "ValidityPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType addNewValidityPeriod();

    /**
     * Gets the "EventSelector" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType getEventSelector();

    /**
     * Sets the "EventSelector" element
     */
    void setEventSelector(org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType eventSelector);

    /**
     * Appends and returns a new empty "EventSelector" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType addNewEventSelector();
}
