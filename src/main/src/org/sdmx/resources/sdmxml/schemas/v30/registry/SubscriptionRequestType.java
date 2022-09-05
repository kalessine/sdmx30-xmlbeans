/*
 * XML Type:  SubscriptionRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubscriptionRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubscriptionRequestType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "subscriptionrequesttype5028type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Subscription" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType getSubscription();

    /**
     * Sets the "Subscription" element
     */
    void setSubscription(org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType subscription);

    /**
     * Appends and returns a new empty "Subscription" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType addNewSubscription();

    /**
     * Gets the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction();

    /**
     * Gets (as xml) the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction();

    /**
     * Sets the "action" attribute
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action);

    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action);
}
