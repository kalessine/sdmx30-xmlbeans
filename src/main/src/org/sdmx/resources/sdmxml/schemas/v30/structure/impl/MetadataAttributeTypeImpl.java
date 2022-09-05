/*
 * XML Type:  MetadataAttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataAttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataAttributeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.MetadataAttributeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType {
    private static final long serialVersionUID = 1L;

    public MetadataAttributeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttribute"),
        new QName("", "minOccurs"),
        new QName("", "maxOccurs"),
        new QName("", "isPresentational"),
    };


    /**
     * Gets a List of "MetadataAttribute" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType> getMetadataAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataAttributeArray,
                this::setMetadataAttributeArray,
                this::insertNewMetadataAttribute,
                this::removeMetadataAttribute,
                this::sizeOfMetadataAttributeArray
            );
        }
    }

    /**
     * Gets array of all "MetadataAttribute" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType[] getMetadataAttributeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType[0]);
    }

    /**
     * Gets ith "MetadataAttribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType getMetadataAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataAttribute" element
     */
    @Override
    public int sizeOfMetadataAttributeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MetadataAttribute" element
     */
    @Override
    public void setMetadataAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType metadataAttribute) {
        generatedSetterHelperImpl(metadataAttribute, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType insertNewMetadataAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType addNewMetadataAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataAttribute" element
     */
    @Override
    public void removeMetadataAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "minOccurs" attribute
     */
    @Override
    public java.math.BigInteger getMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return target;
        }
    }

    /**
     * True if has "minOccurs" attribute
     */
    @Override
    public boolean isSetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "minOccurs" attribute
     */
    @Override
    public void setMinOccurs(java.math.BigInteger minOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setBigIntegerValue(minOccurs);
        }
    }

    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    @Override
    public void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(minOccurs);
        }
    }

    /**
     * Unsets the "minOccurs" attribute
     */
    @Override
    public void unsetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "maxOccurs" attribute
     */
    @Override
    public java.lang.Object getMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType xgetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return target;
        }
    }

    /**
     * True if has "maxOccurs" attribute
     */
    @Override
    public boolean isSetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "maxOccurs" attribute
     */
    @Override
    public void setMaxOccurs(java.lang.Object maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setObjectValue(maxOccurs);
        }
    }

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    @Override
    public void xsetMaxOccurs(org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(maxOccurs);
        }
    }

    /**
     * Unsets the "maxOccurs" attribute
     */
    @Override
    public void unsetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "isPresentational" attribute
     */
    @Override
    public boolean getIsPresentational() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isPresentational" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsPresentational() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return target;
        }
    }

    /**
     * True if has "isPresentational" attribute
     */
    @Override
    public boolean isSetIsPresentational() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "isPresentational" attribute
     */
    @Override
    public void setIsPresentational(boolean isPresentational) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setBooleanValue(isPresentational);
        }
    }

    /**
     * Sets (as xml) the "isPresentational" attribute
     */
    @Override
    public void xsetIsPresentational(org.apache.xmlbeans.XmlBoolean isPresentational) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(isPresentational);
        }
    }

    /**
     * Unsets the "isPresentational" attribute
     */
    @Override
    public void unsetIsPresentational() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
