/*
 * XML Type:  QuerySubscriptionResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML QuerySubscriptionResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class QuerySubscriptionResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType {
    private static final long serialVersionUID = 1L;

    public QuerySubscriptionResponseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StatusMessage"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Subscription"),
    };


    /**
     * Gets the "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType getStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StatusMessage" element
     */
    @Override
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType statusMessage) {
        generatedSetterHelperImpl(statusMessage, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType addNewStatusMessage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StatusMessageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets a List of "Subscription" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType> getSubscriptionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubscriptionArray,
                this::setSubscriptionArray,
                this::insertNewSubscription,
                this::removeSubscription,
                this::sizeOfSubscriptionArray
            );
        }
    }

    /**
     * Gets array of all "Subscription" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType[] getSubscriptionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType[0]);
    }

    /**
     * Gets ith "Subscription" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType getSubscriptionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Subscription" element
     */
    @Override
    public int sizeOfSubscriptionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Subscription" element
     */
    @Override
    public void setSubscriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType subscription) {
        generatedSetterHelperImpl(subscription, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscription" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType insertNewSubscription(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Subscription" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType addNewSubscription() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Subscription" element
     */
    @Override
    public void removeSubscription(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
