/*
 * XML Type:  SubmitSubscriptionsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitSubscriptionsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmitSubscriptionsResponseType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitsubscriptionsresponsetypea81btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SubscriptionStatus" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType> getSubscriptionStatusList();

    /**
     * Gets array of all "SubscriptionStatus" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType[] getSubscriptionStatusArray();

    /**
     * Gets ith "SubscriptionStatus" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType getSubscriptionStatusArray(int i);

    /**
     * Returns number of "SubscriptionStatus" element
     */
    int sizeOfSubscriptionStatusArray();

    /**
     * Sets ith "SubscriptionStatus" element
     */
    void setSubscriptionStatusArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType subscriptionStatus);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubscriptionStatus" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType insertNewSubscriptionStatus(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SubscriptionStatus" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType addNewSubscriptionStatus();

    /**
     * Removes the ith "SubscriptionStatus" element
     */
    void removeSubscriptionStatus(int i);
}
