/*
 * XML Type:  ProvisionAgreementsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ProvisionAgreementsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ProvisionAgreementsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType {
    private static final long serialVersionUID = 1L;

    public ProvisionAgreementsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ProvisionAgreement"),
    };


    /**
     * Gets a List of "ProvisionAgreement" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType> getProvisionAgreementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProvisionAgreementArray,
                this::setProvisionAgreementArray,
                this::insertNewProvisionAgreement,
                this::removeProvisionAgreement,
                this::sizeOfProvisionAgreementArray
            );
        }
    }

    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType[] getProvisionAgreementArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType[0]);
    }

    /**
     * Gets ith "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType getProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ProvisionAgreement" element
     */
    @Override
    public int sizeOfProvisionAgreementArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ProvisionAgreement" element
     */
    @Override
    public void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType provisionAgreement) {
        generatedSetterHelperImpl(provisionAgreement, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType insertNewProvisionAgreement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType addNewProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ProvisionAgreement" element
     */
    @Override
    public void removeProvisionAgreement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
