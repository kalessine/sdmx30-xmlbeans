/*
 * XML Type:  IdentifiableObjectEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML IdentifiableObjectEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class IdentifiableObjectEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType {
    private static final long serialVersionUID = 1L;

    public IdentifiableObjectEventTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "All"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "URN"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ID"),
    };


    /**
     * Gets the "All" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "All" element
     */
    @Override
    public boolean isSetAll() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "All" element
     */
    @Override
    public void setAll(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType all) {
        generatedSetterHelperImpl(all, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "All" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "All" element
     */
    @Override
    public void unsetAll() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "URN" element
     */
    @Override
    public java.lang.String getURN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "ID" element
     */
    @Override
    public java.lang.String getID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType xgetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "ID" element
     */
    @Override
    public boolean isSetID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "ID" element
     */
    @Override
    public void setID(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "ID" element
     */
    @Override
    public void xsetID(org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.registry.IDQueryType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "ID" element
     */
    @Override
    public void unsetID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}
