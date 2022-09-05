/*
 * XML Type:  MetadataProvisionAgreementType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataProvisionAgreementType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataProvisionAgreementTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.MetadataProvisionAgreementBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType {
    private static final long serialVersionUID = 1L;

    public MetadataProvisionAgreementTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Metadataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Target"),
    };


    /**
     * Gets the "Metadataflow" element
     */
    @Override
    public java.lang.String getMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(metadataflow);
        }
    }

    /**
     * Gets the "MetadataProvider" element
     */
    @Override
    public java.lang.String getMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MetadataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType xgetMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "MetadataProvider" element
     */
    @Override
    public void setMetadataProvider(java.lang.String metadataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(metadataProvider);
        }
    }

    /**
     * Sets (as xml) the "MetadataProvider" element
     */
    @Override
    public void xsetMetadataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType metadataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(metadataProvider);
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
}
