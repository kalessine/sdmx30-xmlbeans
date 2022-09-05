/*
 * XML Type:  ReportingCategoryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ReportingCategoryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ReportingCategoryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ReportingCategoryBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType {
    private static final long serialVersionUID = 1L;

    public ReportingCategoryTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "StructuralMetadata"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ProvisioningMetadata"),
    };


    /**
     * Gets a List of "StructuralMetadata" elements
     */
    @Override
    public java.util.List<java.lang.String> getStructuralMetadataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getStructuralMetadataArray,
                this::setStructuralMetadataArray,
                this::insertStructuralMetadata,
                this::removeStructuralMetadata,
                this::sizeOfStructuralMetadataArray
            );
        }
    }

    /**
     * Gets array of all "StructuralMetadata" elements
     */
    @Override
    public java.lang.String[] getStructuralMetadataArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "StructuralMetadata" element
     */
    @Override
    public java.lang.String getStructuralMetadataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "StructuralMetadata" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType> xgetStructuralMetadataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetStructuralMetadataArray,
                this::xsetStructuralMetadataArray,
                this::insertNewStructuralMetadata,
                this::removeStructuralMetadata,
                this::sizeOfStructuralMetadataArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "StructuralMetadata" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType[] xgetStructuralMetadataArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "StructuralMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType xgetStructuralMetadataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StructuralMetadata" element
     */
    @Override
    public int sizeOfStructuralMetadataArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "StructuralMetadata" element
     */
    @Override
    public void setStructuralMetadataArray(int i, java.lang.String structuralMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(structuralMetadata);
        }
    }

    /**
     * Sets (as xml) array of all "StructuralMetadata" element
     */
    @Override
    public void xsetStructuralMetadataArray(org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType[]structuralMetadataArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(structuralMetadataArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "StructuralMetadata" element
     */
    @Override
    public void xsetStructuralMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType structuralMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(structuralMetadata);
        }
    }

    /**
     * Inserts the value as the ith "StructuralMetadata" element
     */
    @Override
    public void insertStructuralMetadata(int i, java.lang.String structuralMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(structuralMetadata);
        }
    }

    /**
     * Appends the value as the last "StructuralMetadata" element
     */
    @Override
    public void addStructuralMetadata(java.lang.String structuralMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(structuralMetadata);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType insertNewStructuralMetadata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType addNewStructuralMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "StructuralMetadata" element
     */
    @Override
    public void removeStructuralMetadata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "ProvisioningMetadata" elements
     */
    @Override
    public java.util.List<java.lang.String> getProvisioningMetadataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getProvisioningMetadataArray,
                this::setProvisioningMetadataArray,
                this::insertProvisioningMetadata,
                this::removeProvisioningMetadata,
                this::sizeOfProvisioningMetadataArray
            );
        }
    }

    /**
     * Gets array of all "ProvisioningMetadata" elements
     */
    @Override
    public java.lang.String[] getProvisioningMetadataArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ProvisioningMetadata" element
     */
    @Override
    public java.lang.String getProvisioningMetadataArray(int i) {
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
     * Gets (as xml) a List of "ProvisioningMetadata" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType> xgetProvisioningMetadataList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetProvisioningMetadataArray,
                this::xsetProvisioningMetadataArray,
                this::insertNewProvisioningMetadata,
                this::removeProvisioningMetadata,
                this::sizeOfProvisioningMetadataArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ProvisioningMetadata" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType[] xgetProvisioningMetadataArray() {
        return xgetArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "ProvisioningMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType xgetProvisioningMetadataArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ProvisioningMetadata" element
     */
    @Override
    public int sizeOfProvisioningMetadataArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "ProvisioningMetadata" element
     */
    @Override
    public void setProvisioningMetadataArray(int i, java.lang.String provisioningMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(provisioningMetadata);
        }
    }

    /**
     * Sets (as xml) array of all "ProvisioningMetadata" element
     */
    @Override
    public void xsetProvisioningMetadataArray(org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType[]provisioningMetadataArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(provisioningMetadataArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "ProvisioningMetadata" element
     */
    @Override
    public void xsetProvisioningMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType provisioningMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisioningMetadata);
        }
    }

    /**
     * Inserts the value as the ith "ProvisioningMetadata" element
     */
    @Override
    public void insertProvisioningMetadata(int i, java.lang.String provisioningMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(provisioningMetadata);
        }
    }

    /**
     * Appends the value as the last "ProvisioningMetadata" element
     */
    @Override
    public void addProvisioningMetadata(java.lang.String provisioningMetadata) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(provisioningMetadata);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisioningMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType insertNewProvisioningMetadata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisioningMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType addNewProvisioningMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "ProvisioningMetadata" element
     */
    @Override
    public void removeProvisioningMetadata(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
