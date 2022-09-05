/*
 * XML Type:  DataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataStructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.DataStructureBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructureType {
    private static final long serialVersionUID = 1L;

    public DataStructureTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Metadata"),
    };


    /**
     * Gets the "Metadata" element
     */
    @Override
    public java.lang.String getMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Metadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType xgetMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Metadata" element
     */
    @Override
    public boolean isSetMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Metadata" element
     */
    @Override
    public void setMetadata(java.lang.String metadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(metadata);
        }
    }

    /**
     * Sets (as xml) the "Metadata" element
     */
    @Override
    public void xsetMetadata(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType metadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(metadata);
        }
    }

    /**
     * Unsets the "Metadata" element
     */
    @Override
    public void unsetMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
