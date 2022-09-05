/*
 * XML Type:  VtlDefinitionSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VtlDefinitionSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class VtlDefinitionSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType {
    private static final long serialVersionUID = 1L;

    public VtlDefinitionSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "vtlVersion"),
    };


    /**
     * Gets the "vtlVersion" attribute
     */
    @Override
    public java.lang.String getVtlVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "vtlVersion" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetVtlVersion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "vtlVersion" attribute
     */
    @Override
    public void setVtlVersion(java.lang.String vtlVersion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(vtlVersion);
        }
    }

    /**
     * Sets (as xml) the "vtlVersion" attribute
     */
    @Override
    public void xsetVtlVersion(org.apache.xmlbeans.XmlString vtlVersion) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(vtlVersion);
        }
    }
}
