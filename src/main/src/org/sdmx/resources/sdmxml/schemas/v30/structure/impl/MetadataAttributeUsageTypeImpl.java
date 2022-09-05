/*
 * XML Type:  MetadataAttributeUsageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataAttributeUsageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataAttributeUsageTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.MetadataAttributeUsageBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType {
    private static final long serialVersionUID = 1L;

    public MetadataAttributeUsageTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttributeReference"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AttributeRelationship"),
    };


    /**
     * Gets the "MetadataAttributeReference" element
     */
    @Override
    public java.lang.String getMetadataAttributeReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MetadataAttributeReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetMetadataAttributeReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "MetadataAttributeReference" element
     */
    @Override
    public void setMetadataAttributeReference(java.lang.String metadataAttributeReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(metadataAttributeReference);
        }
    }

    /**
     * Sets (as xml) the "MetadataAttributeReference" element
     */
    @Override
    public void xsetMetadataAttributeReference(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType metadataAttributeReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(metadataAttributeReference);
        }
    }

    /**
     * Gets the "AttributeRelationship" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType getAttributeRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AttributeRelationship" element
     */
    @Override
    public void setAttributeRelationship(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType attributeRelationship) {
        generatedSetterHelperImpl(attributeRelationship, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AttributeRelationship" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType addNewAttributeRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }
}
