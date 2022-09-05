/*
 * XML Type:  QuerySubscriptionResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QuerySubscriptionResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface QuerySubscriptionResponseType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "querysubscriptionresponsetype5834type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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

    /**
     * Gets a List of "Subscription" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType> getSubscriptionList();

    /**
     * Gets array of all "Subscription" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType[] getSubscriptionArray();

    /**
     * Gets ith "Subscription" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType getSubscriptionArray(int i);

    /**
     * Returns number of "Subscription" element
     */
    int sizeOfSubscriptionArray();

    /**
     * Sets ith "Subscription" element
     */
    void setSubscriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType subscription);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscription" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType insertNewSubscription(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Subscription" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType addNewSubscription();

    /**
     * Removes the ith "Subscription" element
     */
    void removeSubscription(int i);
}
