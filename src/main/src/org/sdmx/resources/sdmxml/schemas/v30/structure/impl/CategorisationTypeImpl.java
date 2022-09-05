/*
 * XML Type:  CategorisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CategorisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CategorisationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.CategorisationBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType {
    private static final long serialVersionUID = 1L;

    public CategorisationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Source"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Target"),
    };


    /**
     * Gets the "Source" element
     */
    @Override
    public java.lang.String getSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Source" element
     */
    @Override
    public boolean isSetSource() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Source" element
     */
    @Override
    public void setSource(java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(source);
        }
    }

    /**
     * Sets (as xml) the "Source" element
     */
    @Override
    public void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType source) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(source);
        }
    }

    /**
     * Unsets the "Source" element
     */
    @Override
    public void unsetSource() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Target" element
     */
    @Override
    public java.lang.String getTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType xgetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "Target" element
     */
    @Override
    public boolean isSetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Target" element
     */
    @Override
    public void setTarget(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) the "Target" element
     */
    @Override
    public void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(targetValue);
        }
    }

    /**
     * Unsets the "Target" element
     */
    @Override
    public void unsetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
