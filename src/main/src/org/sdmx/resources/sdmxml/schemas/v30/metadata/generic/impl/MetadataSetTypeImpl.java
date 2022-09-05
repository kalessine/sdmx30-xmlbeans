/*
 * XML Type:  MetadataSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic).
 *
 * This is a complex type.
 */
public class MetadataSetTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.impl.MetadataSetBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType {
    private static final long serialVersionUID = 1L;

    public MetadataSetTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic", "MetadataProvisionAgreement"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic", "Metadataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic", "Target"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic", "Attribute"),
        new QName("", "action"),
        new QName("", "reportingBeginDate"),
        new QName("", "reportingEndDate"),
        new QName("", "publicationYear"),
        new QName("", "publicationPeriod"),
    };


    /**
     * Gets the "MetadataProvisionAgreement" element
     */
    @Override
    public java.lang.String getMetadataProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MetadataProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType xgetMetadataProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "MetadataProvisionAgreement" element
     */
    @Override
    public boolean isSetMetadataProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "MetadataProvisionAgreement" element
     */
    @Override
    public void setMetadataProvisionAgreement(java.lang.String metadataProvisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(metadataProvisionAgreement);
        }
    }

    /**
     * Sets (as xml) the "MetadataProvisionAgreement" element
     */
    @Override
    public void xsetMetadataProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType metadataProvisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(metadataProvisionAgreement);
        }
    }

    /**
     * Unsets the "MetadataProvisionAgreement" element
     */
    @Override
    public void unsetMetadataProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Metadataflow" element
     */
    @Override
    public java.lang.String getMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType xgetMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "Metadataflow" element
     */
    @Override
    public boolean isSetMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Metadataflow" element
     */
    @Override
    public void setMetadataflow(java.lang.String metadataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(metadataflow);
        }
    }

    /**
     * Sets (as xml) the "Metadataflow" element
     */
    @Override
    public void xsetMetadataflow(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType metadataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(metadataflow);
        }
    }

    /**
     * Unsets the "Metadataflow" element
     */
    @Override
    public void unsetMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "Target" elements
     */
    @Override
    public java.util.List<java.lang.String> getTargetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTargetArray,
                this::setTargetArray,
                this::insertTarget,
                this::removeTarget,
                this::sizeOfTargetArray
            );
        }
    }

    /**
     * Gets array of all "Target" elements
     */
    @Override
    public java.lang.String[] getTargetArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Target" element
     */
    @Override
    public java.lang.String getTargetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Target" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType> xgetTargetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTargetArray,
                this::xsetTargetArray,
                this::insertNewTarget,
                this::removeTarget,
                this::sizeOfTargetArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Target" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType[] xgetTargetArray() {
        return xgetArray(PROPERTY_QNAME[2], org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType[]::new);
    }

    /**
     * Gets (as xml) ith "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType xgetTargetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Target" element
     */
    @Override
    public int sizeOfTargetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "Target" element
     */
    @Override
    public void setTargetArray(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) array of all "Target" element
     */
    @Override
    public void xsetTargetArray(org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType[]targetValueArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(targetValueArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "Target" element
     */
    @Override
    public void xsetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }

    /**
     * Inserts the value as the ith "Target" element
     */
    @Override
    public void insertTarget(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Appends the value as the last "Target" element
     */
    @Override
    public void addTarget(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType insertNewTarget(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType addNewTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "Target" element
     */
    @Override
    public void removeTarget(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "Attribute" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType> getAttributeList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType[] getAttributeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType[0]);
    }

    /**
     * Gets ith "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType getAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType)get_store().find_element_user(PROPERTY_QNAME[3], i);
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
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "Attribute" element
     */
    @Override
    public void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType insertNewAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType addNewAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType)get_store().add_element_user(PROPERTY_QNAME[3]);
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
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "action" attribute
     */
    @Override
    public boolean isSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "action" attribute
     */
    @Override
    public void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setEnumValue(action);
        }
    }

    /**
     * Sets (as xml) the "action" attribute
     */
    @Override
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(action);
        }
    }

    /**
     * Unsets the "action" attribute
     */
    @Override
    public void unsetAction() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "reportingBeginDate" attribute
     */
    @Override
    public java.util.Calendar getReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "reportingBeginDate" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "reportingBeginDate" attribute
     */
    @Override
    public boolean isSetReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "reportingBeginDate" attribute
     */
    @Override
    public void setReportingBeginDate(java.util.Calendar reportingBeginDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setCalendarValue(reportingBeginDate);
        }
    }

    /**
     * Sets (as xml) the "reportingBeginDate" attribute
     */
    @Override
    public void xsetReportingBeginDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingBeginDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(reportingBeginDate);
        }
    }

    /**
     * Unsets the "reportingBeginDate" attribute
     */
    @Override
    public void unsetReportingBeginDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "reportingEndDate" attribute
     */
    @Override
    public java.util.Calendar getReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "reportingEndDate" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "reportingEndDate" attribute
     */
    @Override
    public boolean isSetReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "reportingEndDate" attribute
     */
    @Override
    public void setReportingEndDate(java.util.Calendar reportingEndDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setCalendarValue(reportingEndDate);
        }
    }

    /**
     * Sets (as xml) the "reportingEndDate" attribute
     */
    @Override
    public void xsetReportingEndDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingEndDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(reportingEndDate);
        }
    }

    /**
     * Unsets the "reportingEndDate" attribute
     */
    @Override
    public void unsetReportingEndDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "publicationYear" attribute
     */
    @Override
    public java.util.Calendar getPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "publicationYear" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlGYear xgetPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "publicationYear" attribute
     */
    @Override
    public boolean isSetPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "publicationYear" attribute
     */
    @Override
    public void setPublicationYear(java.util.Calendar publicationYear) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setCalendarValue(publicationYear);
        }
    }

    /**
     * Sets (as xml) the "publicationYear" attribute
     */
    @Override
    public void xsetPublicationYear(org.apache.xmlbeans.XmlGYear publicationYear) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlGYear)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(publicationYear);
        }
    }

    /**
     * Unsets the "publicationYear" attribute
     */
    @Override
    public void unsetPublicationYear() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "publicationPeriod" attribute
     */
    @Override
    public java.lang.Object getPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "publicationPeriod" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "publicationPeriod" attribute
     */
    @Override
    public boolean isSetPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "publicationPeriod" attribute
     */
    @Override
    public void setPublicationPeriod(java.lang.Object publicationPeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setObjectValue(publicationPeriod);
        }
    }

    /**
     * Sets (as xml) the "publicationPeriod" attribute
     */
    @Override
    public void xsetPublicationPeriod(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType publicationPeriod) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(publicationPeriod);
        }
    }

    /**
     * Unsets the "publicationPeriod" attribute
     */
    @Override
    public void unsetPublicationPeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }
}
