/*
 * XML Type:  NotifyRegistryEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML NotifyRegistryEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class NotifyRegistryEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType {
    private static final long serialVersionUID = 1L;

    public NotifyRegistryEventTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "EventTime"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ObjectURN"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "RegistrationID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubscriptionURN"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "EventAction"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StructuralEvent"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "RegistrationEvent"),
    };


    /**
     * Gets the "EventTime" element
     */
    @Override
    public java.util.Calendar getEventTime() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "EventTime" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetEventTime() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "EventTime" element
     */
    @Override
    public void setEventTime(java.util.Calendar eventTime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setCalendarValue(eventTime);
        }
    }

    /**
     * Sets (as xml) the "EventTime" element
     */
    @Override
    public void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(eventTime);
        }
    }

    /**
     * Gets the "ObjectURN" element
     */
    @Override
    public java.lang.String getObjectURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ObjectURN" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetObjectURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "ObjectURN" element
     */
    @Override
    public boolean isSetObjectURN() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "ObjectURN" element
     */
    @Override
    public void setObjectURN(java.lang.String objectURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(objectURN);
        }
    }

    /**
     * Sets (as xml) the "ObjectURN" element
     */
    @Override
    public void xsetObjectURN(org.apache.xmlbeans.XmlAnyURI objectURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(objectURN);
        }
    }

    /**
     * Unsets the "ObjectURN" element
     */
    @Override
    public void unsetObjectURN() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "RegistrationID" element
     */
    @Override
    public java.lang.String getRegistrationID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "RegistrationID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetRegistrationID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "RegistrationID" element
     */
    @Override
    public boolean isSetRegistrationID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "RegistrationID" element
     */
    @Override
    public void setRegistrationID(java.lang.String registrationID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(registrationID);
        }
    }

    /**
     * Sets (as xml) the "RegistrationID" element
     */
    @Override
    public void xsetRegistrationID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType registrationID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(registrationID);
        }
    }

    /**
     * Unsets the "RegistrationID" element
     */
    @Override
    public void unsetRegistrationID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "SubscriptionURN" element
     */
    @Override
    public java.lang.String getSubscriptionURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SubscriptionURN" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetSubscriptionURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * Sets the "SubscriptionURN" element
     */
    @Override
    public void setSubscriptionURN(java.lang.String subscriptionURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(subscriptionURN);
        }
    }

    /**
     * Sets (as xml) the "SubscriptionURN" element
     */
    @Override
    public void xsetSubscriptionURN(org.apache.xmlbeans.XmlAnyURI subscriptionURN) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(subscriptionURN);
        }
    }

    /**
     * Gets the "EventAction" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getEventAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "EventAction" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetEventAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * Sets the "EventAction" element
     */
    @Override
    public void setEventAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum eventAction) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setEnumValue(eventAction);
        }
    }

    /**
     * Sets (as xml) the "EventAction" element
     */
    @Override
    public void xsetEventAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType eventAction) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(eventAction);
        }
    }

    /**
     * Gets the "StructuralEvent" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType getStructuralEvent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "StructuralEvent" element
     */
    @Override
    public boolean isSetStructuralEvent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "StructuralEvent" element
     */
    @Override
    public void setStructuralEvent(org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType structuralEvent) {
        generatedSetterHelperImpl(structuralEvent, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StructuralEvent" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType addNewStructuralEvent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralEventType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "StructuralEvent" element
     */
    @Override
    public void unsetStructuralEvent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "RegistrationEvent" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType getRegistrationEvent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "RegistrationEvent" element
     */
    @Override
    public boolean isSetRegistrationEvent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "RegistrationEvent" element
     */
    @Override
    public void setRegistrationEvent(org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType registrationEvent) {
        generatedSetterHelperImpl(registrationEvent, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RegistrationEvent" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType addNewRegistrationEvent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationEventType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "RegistrationEvent" element
     */
    @Override
    public void unsetRegistrationEvent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }
}
