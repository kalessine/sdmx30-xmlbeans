/*
 * XML Type:  SubmitSubscriptionsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitSubscriptionsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmitSubscriptionsRequestType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitsubscriptionsrequesttype3357type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "SubscriptionRequest" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType> getSubscriptionRequestList();

    /**
     * Gets array of all "SubscriptionRequest" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType[] getSubscriptionRequestArray();

    /**
     * Gets ith "SubscriptionRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType getSubscriptionRequestArray(int i);

    /**
     * Returns number of "SubscriptionRequest" element
     */
    int sizeOfSubscriptionRequestArray();

    /**
     * Sets ith "SubscriptionRequest" element
     */
    void setSubscriptionRequestArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType subscriptionRequest);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubscriptionRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType insertNewSubscriptionRequest(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SubscriptionRequest" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType addNewSubscriptionRequest();

    /**
     * Removes the ith "SubscriptionRequest" element
     */
    void removeSubscriptionRequest(int i);
}
