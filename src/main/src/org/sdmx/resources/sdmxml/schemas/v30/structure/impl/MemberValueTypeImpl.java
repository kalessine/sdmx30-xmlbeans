/*
 * XML Type:  MemberValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MemberValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType.
 */
public class MemberValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType {
    private static final long serialVersionUID = 1L;

    public MemberValueTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected MemberValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "cascadeValues"),
    };


    /**
     * Gets the "cascadeValues" attribute
     */
    @Override
    public java.lang.Object getCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "cascadeValues" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType xgetCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "cascadeValues" attribute
     */
    @Override
    public boolean isSetCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "cascadeValues" attribute
     */
    @Override
    public void setCascadeValues(java.lang.Object cascadeValues) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setObjectValue(cascadeValues);
        }
    }

    /**
     * Sets (as xml) the "cascadeValues" attribute
     */
    @Override
    public void xsetCascadeValues(org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType cascadeValues) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(cascadeValues);
        }
    }

    /**
     * Unsets the "cascadeValues" attribute
     */
    @Override
    public void unsetCascadeValues() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
