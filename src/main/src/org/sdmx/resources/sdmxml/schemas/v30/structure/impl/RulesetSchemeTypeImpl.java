/*
 * XML Type:  RulesetSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RulesetSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class RulesetSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.RulesetSchemeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType {
    private static final long serialVersionUID = 1L;

    public RulesetSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMappingScheme"),
    };


    /**
     * Gets the "VtlMappingScheme" element
     */
    @Override
    public java.lang.String getVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "VtlMappingScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType xgetVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "VtlMappingScheme" element
     */
    @Override
    public boolean isSetVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "VtlMappingScheme" element
     */
    @Override
    public void setVtlMappingScheme(java.lang.String vtlMappingScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(vtlMappingScheme);
        }
    }

    /**
     * Sets (as xml) the "VtlMappingScheme" element
     */
    @Override
    public void xsetVtlMappingScheme(org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType vtlMappingScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(vtlMappingScheme);
        }
    }

    /**
     * Unsets the "VtlMappingScheme" element
     */
    @Override
    public void unsetVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
