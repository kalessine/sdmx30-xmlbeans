/*
 * XML Type:  SubmitSubscriptionsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitSubscriptionsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType {
    private static final long serialVersionUID = 1L;

    public SubmitSubscriptionsRequestTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubscriptionRequest"),
    };


    /**
     * Gets a List of "SubscriptionRequest" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType> getSubscriptionRequestList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubscriptionRequestArray,
                this::setSubscriptionRequestArray,
                this::insertNewSubscriptionRequest,
                this::removeSubscriptionRequest,
                this::sizeOfSubscriptionRequestArray
            );
        }
    }

    /**
     * Gets array of all "SubscriptionRequest" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType[] getSubscriptionRequestArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType[0]);
    }

    /**
     * Gets ith "SubscriptionRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType getSubscriptionRequestArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SubscriptionRequest" element
     */
    @Override
    public int sizeOfSubscriptionRequestArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "SubscriptionRequest" element
     */
    @Override
    public void setSubscriptionRequestArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType subscriptionRequest) {
        generatedSetterHelperImpl(subscriptionRequest, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubscriptionRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType insertNewSubscriptionRequest(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SubscriptionRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType addNewSubscriptionRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionRequestType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "SubscriptionRequest" element
     */
    @Override
    public void removeSubscriptionRequest(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
