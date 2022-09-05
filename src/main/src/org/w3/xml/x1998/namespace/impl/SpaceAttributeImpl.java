/*
 * An XML attribute type.
 * Localname: space
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.w3.xml.x1998.namespace.SpaceAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.xml.x1998.namespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one space(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public class SpaceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.xml.x1998.namespace.SpaceAttribute {
    private static final long serialVersionUID = 1L;

    public SpaceAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/XML/1998/namespace", "space"),
    };


    /**
     * Gets the "space" attribute
     */
    @Override
    public org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum getSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : (org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "space" attribute
     */
    @Override
    public org.w3.xml.x1998.namespace.SpaceAttribute.Space xgetSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.w3.xml.x1998.namespace.SpaceAttribute.Space target = null;
            target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "space" attribute
     */
    @Override
    public boolean isSetSpace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "space" attribute
     */
    @Override
    public void setSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space.Enum space) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(space);
        }
    }

    /**
     * Sets (as xml) the "space" attribute
     */
    @Override
    public void xsetSpace(org.w3.xml.x1998.namespace.SpaceAttribute.Space space) {
        synchronized (monitor()) {
            check_orphaned();
            org.w3.xml.x1998.namespace.SpaceAttribute.Space target = null;
            target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.w3.xml.x1998.namespace.SpaceAttribute.Space)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(space);
        }
    }

    /**
     * Unsets the "space" attribute
     */
    @Override
    public void unsetSpace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
    /**
     * An XML space(@http://www.w3.org/XML/1998/namespace).
     *
     * This is an atomic type that is a restriction of org.w3.xml.x1998.namespace.SpaceAttribute$Space.
     */
    public static class SpaceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.xml.x1998.namespace.SpaceAttribute.Space {
        private static final long serialVersionUID = 1L;

        public SpaceImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected SpaceImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
