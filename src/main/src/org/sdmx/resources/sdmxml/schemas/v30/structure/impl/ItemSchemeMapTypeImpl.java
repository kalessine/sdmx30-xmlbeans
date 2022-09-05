/*
 * XML Type:  ItemSchemeMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ItemSchemeMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ItemSchemeMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemSchemeMapBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeMapType {
    private static final long serialVersionUID = 1L;

    public ItemSchemeMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Source"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Target"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ItemMap"),
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
    public org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType xgetSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
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
    public void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType source) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(source);
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
    public org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType xgetTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
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
    public void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(targetValue);
        }
    }

    /**
     * Gets a List of "ItemMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType> getItemMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getItemMapArray,
                this::setItemMapArray,
                this::insertNewItemMap,
                this::removeItemMap,
                this::sizeOfItemMapArray
            );
        }
    }

    /**
     * Gets array of all "ItemMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType[] getItemMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType[0]);
    }

    /**
     * Gets ith "ItemMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType getItemMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ItemMap" element
     */
    @Override
    public int sizeOfItemMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "ItemMap" element
     */
    @Override
    public void setItemMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType itemMap) {
        generatedSetterHelperImpl(itemMap, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ItemMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType insertNewItemMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ItemMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType addNewItemMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "ItemMap" element
     */
    @Override
    public void removeItemMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }
}
