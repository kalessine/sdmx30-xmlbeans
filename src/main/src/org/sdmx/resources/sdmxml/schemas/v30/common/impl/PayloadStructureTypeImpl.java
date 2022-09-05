/*
 * XML Type:  PayloadStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PayloadStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public class PayloadStructureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType {
    private static final long serialVersionUID = 1L;

    public PayloadStructureTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "ProvisionAgreement"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "StructureUsage"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Structure"),
        new QName("", "structureID"),
        new QName("", "schemaURL"),
        new QName("", "namespace"),
        new QName("", "dimensionAtObservation"),
        new QName("", "explicitMeasures"),
        new QName("", "serviceURL"),
        new QName("", "structureURL"),
    };


    /**
     * Gets the "ProvisionAgreement" element
     */
    @Override
    public java.lang.String getProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType xgetProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "ProvisionAgreement" element
     */
    @Override
    public boolean isSetProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "ProvisionAgreement" element
     */
    @Override
    public void setProvisionAgreement(java.lang.String provisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(provisionAgreement);
        }
    }

    /**
     * Sets (as xml) the "ProvisionAgreement" element
     */
    @Override
    public void xsetProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType provisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(provisionAgreement);
        }
    }

    /**
     * Unsets the "ProvisionAgreement" element
     */
    @Override
    public void unsetProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "StructureUsage" element
     */
    @Override
    public java.lang.String getStructureUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "StructureUsage" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType xgetStructureUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "StructureUsage" element
     */
    @Override
    public boolean isSetStructureUsage() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "StructureUsage" element
     */
    @Override
    public void setStructureUsage(java.lang.String structureUsage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(structureUsage);
        }
    }

    /**
     * Sets (as xml) the "StructureUsage" element
     */
    @Override
    public void xsetStructureUsage(org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType structureUsage) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(structureUsage);
        }
    }

    /**
     * Unsets the "StructureUsage" element
     */
    @Override
    public void unsetStructureUsage() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "Structure" element
     */
    @Override
    public java.lang.String getStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType xgetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "Structure" element
     */
    @Override
    public boolean isSetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "Structure" element
     */
    @Override
    public void setStructure(java.lang.String structure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(structure);
        }
    }

    /**
     * Sets (as xml) the "Structure" element
     */
    @Override
    public void xsetStructure(org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType structure) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(structure);
        }
    }

    /**
     * Unsets the "Structure" element
     */
    @Override
    public void unsetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "structureID" attribute
     */
    @Override
    public java.lang.String getStructureID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "structureID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlID xgetStructureID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "structureID" attribute
     */
    @Override
    public void setStructureID(java.lang.String structureID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(structureID);
        }
    }

    /**
     * Sets (as xml) the "structureID" attribute
     */
    @Override
    public void xsetStructureID(org.apache.xmlbeans.XmlID structureID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(structureID);
        }
    }

    /**
     * Gets the "schemaURL" attribute
     */
    @Override
    public java.lang.String getSchemaURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "schemaURL" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetSchemaURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "schemaURL" attribute
     */
    @Override
    public boolean isSetSchemaURL() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "schemaURL" attribute
     */
    @Override
    public void setSchemaURL(java.lang.String schemaURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(schemaURL);
        }
    }

    /**
     * Sets (as xml) the "schemaURL" attribute
     */
    @Override
    public void xsetSchemaURL(org.apache.xmlbeans.XmlAnyURI schemaURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(schemaURL);
        }
    }

    /**
     * Unsets the "schemaURL" attribute
     */
    @Override
    public void unsetSchemaURL() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "namespace" attribute
     */
    @Override
    public java.lang.String getNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "namespace" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "namespace" attribute
     */
    @Override
    public boolean isSetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "namespace" attribute
     */
    @Override
    public void setNamespace(java.lang.String namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(namespace);
        }
    }

    /**
     * Sets (as xml) the "namespace" attribute
     */
    @Override
    public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(namespace);
        }
    }

    /**
     * Unsets the "namespace" attribute
     */
    @Override
    public void unsetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "dimensionAtObservation" attribute
     */
    @Override
    public java.lang.String getDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "dimensionAtObservation" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType xgetDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "dimensionAtObservation" attribute
     */
    @Override
    public boolean isSetDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "dimensionAtObservation" attribute
     */
    @Override
    public void setDimensionAtObservation(java.lang.String dimensionAtObservation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(dimensionAtObservation);
        }
    }

    /**
     * Sets (as xml) the "dimensionAtObservation" attribute
     */
    @Override
    public void xsetDimensionAtObservation(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType dimensionAtObservation) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(dimensionAtObservation);
        }
    }

    /**
     * Unsets the "dimensionAtObservation" attribute
     */
    @Override
    public void unsetDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "explicitMeasures" attribute
     */
    @Override
    public boolean getExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "explicitMeasures" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "explicitMeasures" attribute
     */
    @Override
    public boolean isSetExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "explicitMeasures" attribute
     */
    @Override
    public void setExplicitMeasures(boolean explicitMeasures) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setBooleanValue(explicitMeasures);
        }
    }

    /**
     * Sets (as xml) the "explicitMeasures" attribute
     */
    @Override
    public void xsetExplicitMeasures(org.apache.xmlbeans.XmlBoolean explicitMeasures) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(explicitMeasures);
        }
    }

    /**
     * Unsets the "explicitMeasures" attribute
     */
    @Override
    public void unsetExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "serviceURL" attribute
     */
    @Override
    public java.lang.String getServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "serviceURL" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "serviceURL" attribute
     */
    @Override
    public boolean isSetServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "serviceURL" attribute
     */
    @Override
    public void setServiceURL(java.lang.String serviceURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(serviceURL);
        }
    }

    /**
     * Sets (as xml) the "serviceURL" attribute
     */
    @Override
    public void xsetServiceURL(org.apache.xmlbeans.XmlAnyURI serviceURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(serviceURL);
        }
    }

    /**
     * Unsets the "serviceURL" attribute
     */
    @Override
    public void unsetServiceURL() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "structureURL" attribute
     */
    @Override
    public java.lang.String getStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "structureURL" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "structureURL" attribute
     */
    @Override
    public boolean isSetStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "structureURL" attribute
     */
    @Override
    public void setStructureURL(java.lang.String structureURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setStringValue(structureURL);
        }
    }

    /**
     * Sets (as xml) the "structureURL" attribute
     */
    @Override
    public void xsetStructureURL(org.apache.xmlbeans.XmlAnyURI structureURL) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(structureURL);
        }
    }

    /**
     * Unsets the "structureURL" attribute
     */
    @Override
    public void unsetStructureURL() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }
}
