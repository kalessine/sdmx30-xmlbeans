/*
 * XML Type:  AttributeListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AttributeListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class AttributeListTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.AttributeListBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType {
    private static final long serialVersionUID = 1L;

    public AttributeListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Attribute"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttributeUsage"),
    };


    /**
     * Gets a List of "Attribute" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType> getAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttributeArray,
                this::setAttributeArray,
                this::insertNewAttribute,
                this::removeAttribute,
                this::sizeOfAttributeArray
            );
        }
    }

    /**
     * Gets array of all "Attribute" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType[] getAttributeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType[0]);
    }

    /**
     * Gets ith "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType getAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Attribute" element
     */
    @Override
    public int sizeOfAttributeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Attribute" element
     */
    @Override
    public void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType insertNewAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType addNewAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Attribute" element
     */
    @Override
    public void removeAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "MetadataAttributeUsage" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType> getMetadataAttributeUsageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataAttributeUsageArray,
                this::setMetadataAttributeUsageArray,
                this::insertNewMetadataAttributeUsage,
                this::removeMetadataAttributeUsage,
                this::sizeOfMetadataAttributeUsageArray
            );
        }
    }

    /**
     * Gets array of all "MetadataAttributeUsage" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType[] getMetadataAttributeUsageArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType[0]);
    }

    /**
     * Gets ith "MetadataAttributeUsage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType getMetadataAttributeUsageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataAttributeUsage" element
     */
    @Override
    public int sizeOfMetadataAttributeUsageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "MetadataAttributeUsage" element
     */
    @Override
    public void setMetadataAttributeUsageArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType metadataAttributeUsage) {
        generatedSetterHelperImpl(metadataAttributeUsage, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttributeUsage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType insertNewMetadataAttributeUsage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttributeUsage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType addNewMetadataAttributeUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeUsageType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataAttributeUsage" element
     */
    @Override
    public void removeMetadataAttributeUsage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
