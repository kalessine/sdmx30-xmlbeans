/*
 * XML Type:  RegistryInterfaceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RegistryInterfaceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class RegistryInterfaceTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType {
    private static final long serialVersionUID = 1L;

    public RegistryInterfaceTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitRegistrationsRequest"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitRegistrationsResponse"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "QueryRegistrationRequest"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "QueryRegistrationResponse"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitStructureRequest"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitStructureResponse"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitSubscriptionsRequest"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "SubmitSubscriptionsResponse"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "QuerySubscriptionRequest"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "QuerySubscriptionResponse"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "NotifyRegistryEvent"),
    };


    /**
     * Gets the "SubmitRegistrationsRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType getSubmitRegistrationsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitRegistrationsRequest" element
     */
    @Override
    public boolean isSetSubmitRegistrationsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "SubmitRegistrationsRequest" element
     */
    @Override
    public void setSubmitRegistrationsRequest(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType submitRegistrationsRequest) {
        generatedSetterHelperImpl(submitRegistrationsRequest, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitRegistrationsRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType addNewSubmitRegistrationsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsRequestType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitRegistrationsRequest" element
     */
    @Override
    public void unsetSubmitRegistrationsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "SubmitRegistrationsResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType getSubmitRegistrationsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitRegistrationsResponse" element
     */
    @Override
    public boolean isSetSubmitRegistrationsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "SubmitRegistrationsResponse" element
     */
    @Override
    public void setSubmitRegistrationsResponse(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType submitRegistrationsResponse) {
        generatedSetterHelperImpl(submitRegistrationsResponse, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitRegistrationsResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType addNewSubmitRegistrationsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitRegistrationsResponseType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitRegistrationsResponse" element
     */
    @Override
    public void unsetSubmitRegistrationsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "QueryRegistrationRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType getQueryRegistrationRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "QueryRegistrationRequest" element
     */
    @Override
    public boolean isSetQueryRegistrationRequest() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "QueryRegistrationRequest" element
     */
    @Override
    public void setQueryRegistrationRequest(org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType queryRegistrationRequest) {
        generatedSetterHelperImpl(queryRegistrationRequest, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QueryRegistrationRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType addNewQueryRegistrationRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "QueryRegistrationRequest" element
     */
    @Override
    public void unsetQueryRegistrationRequest() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "QueryRegistrationResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType getQueryRegistrationResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "QueryRegistrationResponse" element
     */
    @Override
    public boolean isSetQueryRegistrationResponse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "QueryRegistrationResponse" element
     */
    @Override
    public void setQueryRegistrationResponse(org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType queryRegistrationResponse) {
        generatedSetterHelperImpl(queryRegistrationResponse, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QueryRegistrationResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType addNewQueryRegistrationResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationResponseType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "QueryRegistrationResponse" element
     */
    @Override
    public void unsetQueryRegistrationResponse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "SubmitStructureRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType getSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitStructureRequest" element
     */
    @Override
    public boolean isSetSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "SubmitStructureRequest" element
     */
    @Override
    public void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType submitStructureRequest) {
        generatedSetterHelperImpl(submitStructureRequest, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType addNewSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitStructureRequest" element
     */
    @Override
    public void unsetSubmitStructureRequest() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "SubmitStructureResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType getSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitStructureResponse" element
     */
    @Override
    public boolean isSetSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "SubmitStructureResponse" element
     */
    @Override
    public void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType submitStructureResponse) {
        generatedSetterHelperImpl(submitStructureResponse, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType addNewSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureResponseType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitStructureResponse" element
     */
    @Override
    public void unsetSubmitStructureResponse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "SubmitSubscriptionsRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType getSubmitSubscriptionsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitSubscriptionsRequest" element
     */
    @Override
    public boolean isSetSubmitSubscriptionsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "SubmitSubscriptionsRequest" element
     */
    @Override
    public void setSubmitSubscriptionsRequest(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType submitSubscriptionsRequest) {
        generatedSetterHelperImpl(submitSubscriptionsRequest, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitSubscriptionsRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType addNewSubmitSubscriptionsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsRequestType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitSubscriptionsRequest" element
     */
    @Override
    public void unsetSubmitSubscriptionsRequest() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "SubmitSubscriptionsResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType getSubmitSubscriptionsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubmitSubscriptionsResponse" element
     */
    @Override
    public boolean isSetSubmitSubscriptionsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "SubmitSubscriptionsResponse" element
     */
    @Override
    public void setSubmitSubscriptionsResponse(org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType submitSubscriptionsResponse) {
        generatedSetterHelperImpl(submitSubscriptionsResponse, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubmitSubscriptionsResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType addNewSubmitSubscriptionsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitSubscriptionsResponseType)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "SubmitSubscriptionsResponse" element
     */
    @Override
    public void unsetSubmitSubscriptionsResponse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "QuerySubscriptionRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType getQuerySubscriptionRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "QuerySubscriptionRequest" element
     */
    @Override
    public boolean isSetQuerySubscriptionRequest() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "QuerySubscriptionRequest" element
     */
    @Override
    public void setQuerySubscriptionRequest(org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType querySubscriptionRequest) {
        generatedSetterHelperImpl(querySubscriptionRequest, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QuerySubscriptionRequest" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType addNewQuerySubscriptionRequest() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "QuerySubscriptionRequest" element
     */
    @Override
    public void unsetQuerySubscriptionRequest() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "QuerySubscriptionResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType getQuerySubscriptionResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "QuerySubscriptionResponse" element
     */
    @Override
    public boolean isSetQuerySubscriptionResponse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "QuerySubscriptionResponse" element
     */
    @Override
    public void setQuerySubscriptionResponse(org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType querySubscriptionResponse) {
        generatedSetterHelperImpl(querySubscriptionResponse, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QuerySubscriptionResponse" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType addNewQuerySubscriptionResponse() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionResponseType)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "QuerySubscriptionResponse" element
     */
    @Override
    public void unsetQuerySubscriptionResponse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets the "NotifyRegistryEvent" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType getNotifyRegistryEvent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "NotifyRegistryEvent" element
     */
    @Override
    public boolean isSetNotifyRegistryEvent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "NotifyRegistryEvent" element
     */
    @Override
    public void setNotifyRegistryEvent(org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType notifyRegistryEvent) {
        generatedSetterHelperImpl(notifyRegistryEvent, PROPERTY_QNAME[10], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "NotifyRegistryEvent" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType addNewNotifyRegistryEvent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NotifyRegistryEventType)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Unsets the "NotifyRegistryEvent" element
     */
    @Override
    public void unsetNotifyRegistryEvent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }
}
