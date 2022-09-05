/*
 * XML Type:  InputOutputType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML InputOutputType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class InputOutputTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.InputOutputType {
    private static final long serialVersionUID = 1L;

    public InputOutputTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ObjectReference"),
        new QName("", "localID"),
    };


    /**
     * Gets the "ObjectReference" element
     */
    @Override
    public java.lang.String getObjectReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ObjectReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetObjectReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "ObjectReference" element
     */
    @Override
    public void setObjectReference(java.lang.String objectReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(objectReference);
        }
    }

    /**
     * Sets (as xml) the "ObjectReference" element
     */
    @Override
    public void xsetObjectReference(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType objectReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(objectReference);
        }
    }

    /**
     * Gets the "localID" attribute
     */
    @Override
    public java.lang.String getLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "localID" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "localID" attribute
     */
    @Override
    public boolean isSetLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "localID" attribute
     */
    @Override
    public void setLocalID(java.lang.String localID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(localID);
        }
    }

    /**
     * Sets (as xml) the "localID" attribute
     */
    @Override
    public void xsetLocalID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType localID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(localID);
        }
    }

    /**
     * Unsets the "localID" attribute
     */
    @Override
    public void unsetLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}
