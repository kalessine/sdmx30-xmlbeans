/*
 * XML Type:  HierarchyAssociationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HierarchyAssociationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class HierarchyAssociationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType {
    private static final long serialVersionUID = 1L;

    public HierarchyAssociationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "LinkedHierarchy"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "LinkedObject"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ContextObject"),
    };


    /**
     * Gets the "LinkedHierarchy" element
     */
    @Override
    public java.lang.String getLinkedHierarchy() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "LinkedHierarchy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType xgetLinkedHierarchy() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "LinkedHierarchy" element
     */
    @Override
    public void setLinkedHierarchy(java.lang.String linkedHierarchy) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(linkedHierarchy);
        }
    }

    /**
     * Sets (as xml) the "LinkedHierarchy" element
     */
    @Override
    public void xsetLinkedHierarchy(org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType linkedHierarchy) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(linkedHierarchy);
        }
    }

    /**
     * Gets the "LinkedObject" element
     */
    @Override
    public java.lang.String getLinkedObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "LinkedObject" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetLinkedObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "LinkedObject" element
     */
    @Override
    public void setLinkedObject(java.lang.String linkedObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(linkedObject);
        }
    }

    /**
     * Sets (as xml) the "LinkedObject" element
     */
    @Override
    public void xsetLinkedObject(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType linkedObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(linkedObject);
        }
    }

    /**
     * Gets the "ContextObject" element
     */
    @Override
    public java.lang.String getContextObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ContextObject" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetContextObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "ContextObject" element
     */
    @Override
    public boolean isSetContextObject() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "ContextObject" element
     */
    @Override
    public void setContextObject(java.lang.String contextObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(contextObject);
        }
    }

    /**
     * Sets (as xml) the "ContextObject" element
     */
    @Override
    public void xsetContextObject(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType contextObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(contextObject);
        }
    }

    /**
     * Unsets the "ContextObject" element
     */
    @Override
    public void unsetContextObject() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}
