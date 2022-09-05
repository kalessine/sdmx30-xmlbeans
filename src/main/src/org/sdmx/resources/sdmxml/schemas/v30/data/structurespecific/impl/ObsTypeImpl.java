/*
 * XML Type:  ObsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ObsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific).
 *
 * This is a complex type.
 */
public class ObsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.ObsType {
    private static final long serialVersionUID = 1L;

    public ObsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "Comp"),
        new QName("", "Metadata"),
        new QName("", "type"),
        new QName("", "TIME_PERIOD"),
    };


    /**
     * Gets a List of "Comp" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType> getCompList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCompArray,
                this::setCompArray,
                this::insertNewComp,
                this::removeComp,
                this::sizeOfCompArray
            );
        }
    }

    /**
     * Gets array of all "Comp" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType[] getCompArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType[0]);
    }

    /**
     * Gets ith "Comp" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType getCompArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Comp" element
     */
    @Override
    public int sizeOfCompArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Comp" element
     */
    @Override
    public void setCompArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType comp) {
        generatedSetterHelperImpl(comp, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comp" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType insertNewComp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Comp" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType addNewComp() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Comp" element
     */
    @Override
    public void removeComp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "Metadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType getMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Metadata" element
     */
    @Override
    public boolean isSetMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Metadata" element
     */
    @Override
    public void setMetadata(org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType metadata) {
        generatedSetterHelperImpl(metadata, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Metadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType addNewMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Metadata" element
     */
    @Override
    public void unsetMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "type" attribute
     */
    @Override
    public java.lang.String getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(java.lang.String type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    @Override
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v30.common.IDType type) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "type" attribute
     */
    @Override
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "TIME_PERIOD" attribute
     */
    @Override
    public java.lang.Object getTIMEPERIOD() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "TIME_PERIOD" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetTIMEPERIOD() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "TIME_PERIOD" attribute
     */
    @Override
    public boolean isSetTIMEPERIOD() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "TIME_PERIOD" attribute
     */
    @Override
    public void setTIMEPERIOD(java.lang.Object timeperiod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setObjectValue(timeperiod);
        }
    }

    /**
     * Sets (as xml) the "TIME_PERIOD" attribute
     */
    @Override
    public void xsetTIMEPERIOD(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType timeperiod) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(timeperiod);
        }
    }

    /**
     * Unsets the "TIME_PERIOD" attribute
     */
    @Override
    public void unsetTIMEPERIOD() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
