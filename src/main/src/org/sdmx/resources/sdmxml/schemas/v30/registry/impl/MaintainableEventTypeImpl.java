/*
 * XML Type:  MaintainableEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MaintainableEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class MaintainableEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType {
    private static final long serialVersionUID = 1L;

    public MaintainableEventTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "URN"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Ref"),
    };


    /**
     * Gets the "URN" element
     */
    @Override
    public java.lang.String getURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "URN" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "URN" element
     */
    @Override
    public boolean isSetURN() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "URN" element
     */
    @Override
    public void setURN(java.lang.String urn) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(urn);
        }
    }

    /**
     * Sets (as xml) the "URN" element
     */
    @Override
    public void xsetURN(org.apache.xmlbeans.XmlAnyURI urn) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(urn);
        }
    }

    /**
     * Unsets the "URN" element
     */
    @Override
    public void unsetURN() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Ref" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType getRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Ref" element
     */
    @Override
    public boolean isSetRef() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Ref" element
     */
    @Override
    public void setRef(org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType ref) {
        generatedSetterHelperImpl(ref, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Ref" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType addNewRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Ref" element
     */
    @Override
    public void unsetRef() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
