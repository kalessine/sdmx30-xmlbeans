/*
 * XML Type:  IdentifiableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.IdentifiableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML IdentifiableType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public class IdentifiableTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.IdentifiableType {
    private static final long serialVersionUID = 1L;

    public IdentifiableTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Link"),
        new QName("", "id"),
        new QName("", "urn"),
        new QName("", "uri"),
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

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    @Override
    public boolean isSetId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    @Override
    public void unsetId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "urn" attribute
     */
    @Override
    public java.lang.String getUrn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "urn" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UrnType xgetUrn() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "urn" attribute
     */
    @Override
    public boolean isSetUrn() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "urn" attribute
     */
    @Override
    public void setUrn(java.lang.String urn) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(urn);
        }
    }

    /**
     * Sets (as xml) the "urn" attribute
     */
    @Override
    public void xsetUrn(org.sdmx.resources.sdmxml.schemas.v30.common.UrnType urn) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UrnType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.UrnType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(urn);
        }
    }

    /**
     * Unsets the "urn" attribute
     */
    @Override
    public void unsetUrn() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "uri" attribute
     */
    @Override
    public java.lang.String getUri() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "uri" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetUri() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "uri" attribute
     */
    @Override
    public boolean isSetUri() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "uri" attribute
     */
    @Override
    public void setUri(java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(uri);
        }
    }

    /**
     * Sets (as xml) the "uri" attribute
     */
    @Override
    public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(uri);
        }
    }

    /**
     * Unsets the "uri" attribute
     */
    @Override
    public void unsetUri() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
