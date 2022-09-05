/*
 * XML Type:  SubmittedStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmittedStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubmittedStructureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType {
    private static final long serialVersionUID = 1L;

    public SubmittedStructureTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MaintainableObject"),
        new QName("", "action"),
        new QName("", "externalDependencies"),
    };


    /**
     * Gets the "MaintainableObject" element
     */
    @Override
    public java.lang.String getMaintainableObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MaintainableObject" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType xgetMaintainableObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "MaintainableObject" element
     */
    @Override
    public void setMaintainableObject(java.lang.String maintainableObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(maintainableObject);
        }
    }

    /**
     * Sets (as xml) the "MaintainableObject" element
     */
    @Override
    public void xsetMaintainableObject(org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType maintainableObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(maintainableObject);
        }
    }

    /**
     * Gets the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "action" attribute
     */
    @Override
    public boolean isSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "action" attribute
     */
    @Override
    public void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(action);
        }
    }

    /**
     * Sets (as xml) the "action" attribute
     */
    @Override
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(action);
        }
    }

    /**
     * Unsets the "action" attribute
     */
    @Override
    public void unsetAction() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "externalDependencies" attribute
     */
    @Override
    public boolean getExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "externalDependencies" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "externalDependencies" attribute
     */
    @Override
    public boolean isSetExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "externalDependencies" attribute
     */
    @Override
    public void setExternalDependencies(boolean externalDependencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(externalDependencies);
        }
    }

    /**
     * Sets (as xml) the "externalDependencies" attribute
     */
    @Override
    public void xsetExternalDependencies(org.apache.xmlbeans.XmlBoolean externalDependencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(externalDependencies);
        }
    }

    /**
     * Unsets the "externalDependencies" attribute
     */
    @Override
    public void unsetExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}
