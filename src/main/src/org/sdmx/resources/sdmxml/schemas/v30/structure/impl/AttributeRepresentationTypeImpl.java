/*
 * XML Type:  AttributeRepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AttributeRepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class AttributeRepresentationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.RepresentationTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRepresentationType {
    private static final long serialVersionUID = 1L;

    public AttributeRepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "maxOccurs"),
    };


    /**
     * Gets the "maxOccurs" attribute
     */
    @Override
    public java.lang.Object getMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType xgetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "maxOccurs" attribute
     */
    @Override
    public boolean isSetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "maxOccurs" attribute
     */
    @Override
    public void setMaxOccurs(java.lang.Object maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setObjectValue(maxOccurs);
        }
    }

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    @Override
    public void xsetMaxOccurs(org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(maxOccurs);
        }
    }

    /**
     * Unsets the "maxOccurs" attribute
     */
    @Override
    public void unsetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
