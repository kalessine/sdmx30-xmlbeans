/*
 * XML Type:  FromVtlMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML FromVtlMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class FromVtlMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType {
    private static final long serialVersionUID = 1L;

    public FromVtlMappingTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "FromVtlSuperSpace"),
        new QName("", "method"),
    };


    /**
     * Gets the "FromVtlSuperSpace" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType getFromVtlSuperSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "FromVtlSuperSpace" element
     */
    @Override
    public boolean isSetFromVtlSuperSpace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "FromVtlSuperSpace" element
     */
    @Override
    public void setFromVtlSuperSpace(org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType fromVtlSuperSpace) {
        generatedSetterHelperImpl(fromVtlSuperSpace, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FromVtlSuperSpace" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType addNewFromVtlSuperSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "FromVtlSuperSpace" element
     */
    @Override
    public void unsetFromVtlSuperSpace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "method" attribute
     */
    @Override
    public java.lang.String getMethod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "method" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType xgetMethod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "method" attribute
     */
    @Override
    public boolean isSetMethod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "method" attribute
     */
    @Override
    public void setMethod(java.lang.String method) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(method);
        }
    }

    /**
     * Sets (as xml) the "method" attribute
     */
    @Override
    public void xsetMethod(org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType method) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(method);
        }
    }

    /**
     * Unsets the "method" attribute
     */
    @Override
    public void unsetMethod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}
