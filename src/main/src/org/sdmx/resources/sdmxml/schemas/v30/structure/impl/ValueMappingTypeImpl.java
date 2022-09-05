/*
 * XML Type:  ValueMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ValueMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ValueMappingTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType {
    private static final long serialVersionUID = 1L;

    public ValueMappingTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "SourceValue"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TargetValue"),
        new QName("", "validFrom"),
        new QName("", "validTo"),
    };


    /**
     * Gets a List of "SourceValue" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType> getSourceValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSourceValueArray,
                this::setSourceValueArray,
                this::insertNewSourceValue,
                this::removeSourceValue,
                this::sizeOfSourceValueArray
            );
        }
    }

    /**
     * Gets array of all "SourceValue" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType[] getSourceValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType[0]);
    }

    /**
     * Gets ith "SourceValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType getSourceValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SourceValue" element
     */
    @Override
    public int sizeOfSourceValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "SourceValue" element
     */
    @Override
    public void setSourceValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType sourceValue) {
        generatedSetterHelperImpl(sourceValue, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SourceValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType insertNewSourceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SourceValue" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType addNewSourceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "SourceValue" element
     */
    @Override
    public void removeSourceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "TargetValue" elements
     */
    @Override
    public java.util.List<java.lang.String> getTargetValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTargetValueArray,
                this::setTargetValueArray,
                this::insertTargetValue,
                this::removeTargetValue,
                this::sizeOfTargetValueArray
            );
        }
    }

    /**
     * Gets array of all "TargetValue" elements
     */
    @Override
    public java.lang.String[] getTargetValueArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "TargetValue" element
     */
    @Override
    public java.lang.String getTargetValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "TargetValue" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetTargetValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTargetValueArray,
                this::xsetTargetValueArray,
                this::insertNewTargetValue,
                this::removeTargetValue,
                this::sizeOfTargetValueArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "TargetValue" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetTargetValueArray() {
        return xgetArray(PROPERTY_QNAME[1], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "TargetValue" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTargetValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TargetValue" element
     */
    @Override
    public int sizeOfTargetValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "TargetValue" element
     */
    @Override
    public void setTargetValueArray(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) array of all "TargetValue" element
     */
    @Override
    public void xsetTargetValueArray(org.apache.xmlbeans.XmlString[]targetValueArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(targetValueArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "TargetValue" element
     */
    @Override
    public void xsetTargetValueArray(int i, org.apache.xmlbeans.XmlString targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }

    /**
     * Inserts the value as the ith "TargetValue" element
     */
    @Override
    public void insertTargetValue(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Appends the value as the last "TargetValue" element
     */
    @Override
    public void addTargetValue(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetValue" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewTargetValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TargetValue" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewTargetValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "TargetValue" element
     */
    @Override
    public void removeTargetValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "validFrom" attribute
     */
    @Override
    public java.util.Calendar getValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "validFrom" attribute
     */
    @Override
    public boolean isSetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "validFrom" attribute
     */
    @Override
    public void setValidFrom(java.util.Calendar validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setCalendarValue(validFrom);
        }
    }

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    @Override
    public void xsetValidFrom(org.apache.xmlbeans.XmlDate validFrom) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(validFrom);
        }
    }

    /**
     * Unsets the "validFrom" attribute
     */
    @Override
    public void unsetValidFrom() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "validTo" attribute
     */
    @Override
    public java.util.Calendar getValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "validTo" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "validTo" attribute
     */
    @Override
    public boolean isSetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "validTo" attribute
     */
    @Override
    public void setValidTo(java.util.Calendar validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setCalendarValue(validTo);
        }
    }

    /**
     * Sets (as xml) the "validTo" attribute
     */
    @Override
    public void xsetValidTo(org.apache.xmlbeans.XmlDate validTo) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(validTo);
        }
    }

    /**
     * Unsets the "validTo" attribute
     */
    @Override
    public void unsetValidTo() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
