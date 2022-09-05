/*
 * XML Type:  OptionalLocalDimensionReferenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML OptionalLocalDimensionReferenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType.
 */
public class OptionalLocalDimensionReferenceTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType {
    private static final long serialVersionUID = 1L;

    public OptionalLocalDimensionReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected OptionalLocalDimensionReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "optional"),
    };


    /**
     * Gets the "optional" attribute
     */
    @Override
    public boolean getOptional() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "optional" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetOptional() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "optional" attribute
     */
    @Override
    public boolean isSetOptional() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "optional" attribute
     */
    @Override
    public void setOptional(boolean optional) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(optional);
        }
    }

    /**
     * Sets (as xml) the "optional" attribute
     */
    @Override
    public void xsetOptional(org.apache.xmlbeans.XmlBoolean optional) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(optional);
        }
    }

    /**
     * Unsets the "optional" attribute
     */
    @Override
    public void unsetOptional() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
