/*
 * XML Type:  NotifyRegistryEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML NotifyRegistryEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface NotifyRegistryEventType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "notifyregistryeventtype7b06type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "EventTime" element
     */
    java.util.Calendar getEventTime();

    /**
     * Gets (as xml) the "EventTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEventTime();

    /**
     * Sets the "EventTime" element
     */
    void setEventTime(java.util.Calendar eventTime);

    /**
     * Sets (as xml) the "EventTime" element
     */
    void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime);

    /**
     * Gets the "ObjectURN" element
     */
    java.lang.String getObjectURN();

    /**
     * Gets (as xml) the "ObjectURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetObjectURN();

    /**
     * True if has "ObjectURN" element
     */
    boolean isSetObjectURN();

    /**
     * Sets the "ObjectURN" element
     */
    void setObjectURN(java.lang.String objectURN);

    /**
     * Sets (as xml) the "ObjectURN" element
     */
    void xsetObjectURN(org.apache.xmlbeans.XmlAnyURI objectURN);

    /**
     * Unsets the "ObjectURN" element
     */
    void unsetObjectURN();

    /**
     * Gets the "RegistrationID" element
     */
    java.lang.String getRegistrationID();

    /**
     * Gets (as xml) the "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetRegistrationID();

    /**
     * True if has "RegistrationID" element
     */
    boolean isSetRegistrationID();

    /**
     * Sets the "RegistrationID" element
     */
    void setRegistrationID(java.lang.String registrationID);

    /**
     * Sets (as xml) the "RegistrationID" element
     */
    void xsetRegistrationID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType registrationID);

    /**
     * Unsets the "RegistrationID" element
     */
    void unsetRegistrationID();

    /**
     * Gets the "SubscriptionURN" element
     */
    java.lang.String getSubscriptionURN();

    /**
     * Gets (as xml) the "SubscriptionURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSubscriptionURN();

    /**
     * Sets the "SubscriptionURN" element
     */
    void setSubscriptionURN(java.lang.String subscriptionURN);

    /**
     * Sets (as xml) the "SubscriptionURN" element
     */
    void xsetSubscriptionURN(org.apache.xmlbeans.XmlAnyURI subscriptionURN);

    /**
     * Gets the "EventAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getEventAction();

    /**
     * Gets (as xml) the "EventAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetEventAction();

    /**
     * Sets the "EventAction" element
     */
    void setEventAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum eventAction);

    /**
     * Sets (as xml) the "EventAction" element
     */
    void xsetEventAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType eventAction);

    /**
     * Gets the "StructuralEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType getStructuralEvent();

    /**
     * True if has "StructuralEvent" element
     */
    boolean isSetStructuralEvent();

    /**
     * Sets the "StructuralEvent" element
     */
    void setStructuralEvent(org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType structuralEvent);

    /**
     * Appends and returns a new empty "StructuralEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType addNewStructuralEvent();

    /**
     * Unsets the "StructuralEvent" element
     */
    void unsetStructuralEvent();

    /**
     * Gets the "RegistrationEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType getRegistrationEvent();

    /**
     * True if has "RegistrationEvent" element
     */
    boolean isSetRegistrationEvent();

    /**
     * Sets the "RegistrationEvent" element
     */
    void setRegistrationEvent(org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType registrationEvent);

    /**
     * Appends and returns a new empty "RegistrationEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType addNewRegistrationEvent();

    /**
     * Unsets the "RegistrationEvent" element
     */
    void unsetRegistrationEvent();
}
