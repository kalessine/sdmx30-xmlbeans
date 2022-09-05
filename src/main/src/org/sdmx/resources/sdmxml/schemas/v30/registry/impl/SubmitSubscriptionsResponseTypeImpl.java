/*
 * XML Type:  SubmitSubscriptionsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitSubscriptionsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType {
    private static final long serialVersionUID = 1L;

    public SubmitSubscriptionsResponseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubscriptionStatus"),
    };


    /**
     * Gets a List of "SubscriptionStatus" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType> getSubscriptionStatusList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubscriptionStatusArray,
                this::setSubscriptionStatusArray,
                this::insertNewSubscriptionStatus,
                this::removeSubscriptionStatus,
                this::sizeOfSubscriptionStatusArray
            );
        }
    }

    /**
     * Gets array of all "SubscriptionStatus" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType[] getSubscriptionStatusArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType[0]);
    }

    /**
     * Gets ith "SubscriptionStatus" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType getSubscriptionStatusArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SubscriptionStatus" element
     */
    @Override
    public int sizeOfSubscriptionStatusArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "SubscriptionStatus" element
     */
    @Override
    public void setSubscriptionStatusArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType subscriptionStatus) {
        generatedSetterHelperImpl(subscriptionStatus, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubscriptionStatus" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType insertNewSubscriptionStatus(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SubscriptionStatus" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType addNewSubscriptionStatus() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubscriptionStatusType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "SubscriptionStatus" element
     */
    @Override
    public void removeSubscriptionStatus(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
