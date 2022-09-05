/*
 * XML Type:  SubscriptionStatusType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubscriptionStatusType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubscriptionStatusType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "subscriptionstatustype2e19type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SubscriptionURN" element
     */
    java.lang.String getSubscriptionURN();

    /**
     * Gets (as xml) the "SubscriptionURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSubscriptionURN();

    /**
     * True if has "SubscriptionURN" element
     */
    boolean isSetSubscriptionURN();

    /**
     * Sets the "SubscriptionURN" element
     */
    void setSubscriptionURN(java.lang.String subscriptionURN);

    /**
     * Sets (as xml) the "SubscriptionURN" element
     */
    void xsetSubscriptionURN(org.apache.xmlbeans.XmlAnyURI subscriptionURN);

    /**
     * Unsets the "SubscriptionURN" element
     */
    void unsetSubscriptionURN();

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
     * Gets the "StatusMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType getStatusMessage();

    /**
     * Sets the "StatusMessage" element
     */
    void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType statusMessage);

    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType addNewStatusMessage();
}
