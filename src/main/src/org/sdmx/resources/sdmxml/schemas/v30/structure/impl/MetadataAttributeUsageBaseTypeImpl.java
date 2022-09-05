/*
 * XML Type:  MetadataAttributeUsageBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataAttributeUsageBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataAttributeUsageBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageBaseType {
    private static final long serialVersionUID = 1L;

    public MetadataAttributeUsageBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Link"),
    };


    /**
     * Gets a List of "Link" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.LinkType> getLinkList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLinkArray,
                this::setLinkArray,
                this::insertNewLink,
                this::removeLink,
                this::sizeOfLinkArray
            );
        }
    }

    /**
     * Gets array of all "Link" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.LinkType[] getLinkArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.LinkType[0]);
    }

    /**
     * Gets ith "Link" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.LinkType getLinkArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.LinkType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.LinkType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Link" element
     */
    @Override
    public int sizeOfLinkArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Link" element
     */
    @Override
    public void setLinkArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.LinkType link) {
        generatedSetterHelperImpl(link, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.LinkType insertNewLink(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.LinkType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.LinkType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.LinkType addNewLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.LinkType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.LinkType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Link" element
     */
    @Override
    public void removeLink(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
