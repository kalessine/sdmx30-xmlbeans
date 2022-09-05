/*
 * XML Type:  MetadataProvisionAgreementsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataProvisionAgreementsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataProvisionAgreementsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType {
    private static final long serialVersionUID = 1L;

    public MetadataProvisionAgreementsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvisionAgreement"),
    };


    /**
     * Gets a List of "MetadataProvisionAgreement" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType> getMetadataProvisionAgreementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataProvisionAgreementArray,
                this::setMetadataProvisionAgreementArray,
                this::insertNewMetadataProvisionAgreement,
                this::removeMetadataProvisionAgreement,
                this::sizeOfMetadataProvisionAgreementArray
            );
        }
    }

    /**
     * Gets array of all "MetadataProvisionAgreement" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType[] getMetadataProvisionAgreementArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType[0]);
    }

    /**
     * Gets ith "MetadataProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType getMetadataProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataProvisionAgreement" element
     */
    @Override
    public int sizeOfMetadataProvisionAgreementArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MetadataProvisionAgreement" element
     */
    @Override
    public void setMetadataProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType metadataProvisionAgreement) {
        generatedSetterHelperImpl(metadataProvisionAgreement, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType insertNewMetadataProvisionAgreement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType addNewMetadataProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataProvisionAgreement" element
     */
    @Override
    public void removeMetadataProvisionAgreement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
