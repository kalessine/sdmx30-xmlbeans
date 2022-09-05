/*
 * XML Type:  MetadataRegistrationEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataRegistrationEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class MetadataRegistrationEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType {
    private static final long serialVersionUID = 1L;

    public MetadataRegistrationEventsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "AllEvents"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "RegistrationID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ProvisionAgreement"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "DataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MetadataflowReference"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MetadataStructureDefinitionReference"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Category"),
        new QName("", "TYPE"),
    };


    /**
     * Gets the "AllEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAllEvents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "AllEvents" element
     */
    @Override
    public boolean isSetAllEvents() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "AllEvents" element
     */
    @Override
    public void setAllEvents(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType allEvents) {
        generatedSetterHelperImpl(allEvents, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AllEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAllEvents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "AllEvents" element
     */
    @Override
    public void unsetAllEvents() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "RegistrationID" elements
     */
    @Override
    public java.util.List<java.lang.String> getRegistrationIDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getRegistrationIDArray,
                this::setRegistrationIDArray,
                this::insertRegistrationID,
                this::removeRegistrationID,
                this::sizeOfRegistrationIDArray
            );
        }
    }

    /**
     * Gets array of all "RegistrationID" elements
     */
    @Override
    public java.lang.String[] getRegistrationIDArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "RegistrationID" element
     */
    @Override
    public java.lang.String getRegistrationIDArray(int i) {
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
     * Gets (as xml) a List of "RegistrationID" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetRegistrationIDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetRegistrationIDArray,
                this::xsetRegistrationIDArray,
                this::insertNewRegistrationID,
                this::removeRegistrationID,
                this::sizeOfRegistrationIDArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "RegistrationID" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetRegistrationIDArray() {
        return xgetArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]::new);
    }

    /**
     * Gets (as xml) ith "RegistrationID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetRegistrationIDArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RegistrationID" element
     */
    @Override
    public int sizeOfRegistrationIDArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "RegistrationID" element
     */
    @Override
    public void setRegistrationIDArray(int i, java.lang.String registrationID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(registrationID);
        }
    }

    /**
     * Sets (as xml) array of all "RegistrationID" element
     */
    @Override
    public void xsetRegistrationIDArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]registrationIDArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(registrationIDArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "RegistrationID" element
     */
    @Override
    public void xsetRegistrationIDArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType registrationID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(registrationID);
        }
    }

    /**
     * Inserts the value as the ith "RegistrationID" element
     */
    @Override
    public void insertRegistrationID(int i, java.lang.String registrationID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(registrationID);
        }
    }

    /**
     * Appends the value as the last "RegistrationID" element
     */
    @Override
    public void addRegistrationID(java.lang.String registrationID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(registrationID);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewRegistrationID(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewRegistrationID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "RegistrationID" element
     */
    @Override
    public void removeRegistrationID(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "ProvisionAgreement" elements
     */
    @Override
    public java.util.List<java.lang.String> getProvisionAgreementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getProvisionAgreementArray,
                this::setProvisionAgreementArray,
                this::insertProvisionAgreement,
                this::removeProvisionAgreement,
                this::sizeOfProvisionAgreementArray
            );
        }
    }

    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    @Override
    public java.lang.String[] getProvisionAgreementArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ProvisionAgreement" element
     */
    @Override
    public java.lang.String getProvisionAgreementArray(int i) {
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
     * Gets (as xml) a List of "ProvisionAgreement" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType> xgetProvisionAgreementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetProvisionAgreementArray,
                this::xsetProvisionAgreementArray,
                this::insertNewProvisionAgreement,
                this::removeProvisionAgreement,
                this::sizeOfProvisionAgreementArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ProvisionAgreement" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[] xgetProvisionAgreementArray() {
        return xgetArray(PROPERTY_QNAME[2], org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType xgetProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], i);
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
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "ProvisionAgreement" element
     */
    @Override
    public void setProvisionAgreementArray(int i, java.lang.String provisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(provisionAgreement);
        }
    }

    /**
     * Sets (as xml) array of all "ProvisionAgreement" element
     */
    @Override
    public void xsetProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[]provisionAgreementArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(provisionAgreementArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "ProvisionAgreement" element
     */
    @Override
    public void xsetProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType provisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisionAgreement);
        }
    }

    /**
     * Inserts the value as the ith "ProvisionAgreement" element
     */
    @Override
    public void insertProvisionAgreement(int i, java.lang.String provisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(provisionAgreement);
        }
    }

    /**
     * Appends the value as the last "ProvisionAgreement" element
     */
    @Override
    public void addProvisionAgreement(java.lang.String provisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(provisionAgreement);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType insertNewProvisionAgreement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType addNewProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "DataProvider" elements
     */
    @Override
    public java.util.List<java.lang.String> getDataProviderList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDataProviderArray,
                this::setDataProviderArray,
                this::insertDataProvider,
                this::removeDataProvider,
                this::sizeOfDataProviderArray
            );
        }
    }

    /**
     * Gets array of all "DataProvider" elements
     */
    @Override
    public java.lang.String[] getDataProviderArray() {
        return getObjectArray(PROPERTY_QNAME[3], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "DataProvider" element
     */
    @Override
    public java.lang.String getDataProviderArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "DataProvider" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType> xgetDataProviderList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDataProviderArray,
                this::xsetDataProviderArray,
                this::insertNewDataProvider,
                this::removeDataProvider,
                this::sizeOfDataProviderArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "DataProvider" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType[] xgetDataProviderArray() {
        return xgetArray(PROPERTY_QNAME[3], org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType xgetDataProviderArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataProvider" element
     */
    @Override
    public int sizeOfDataProviderArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "DataProvider" element
     */
    @Override
    public void setDataProviderArray(int i, java.lang.String dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataProvider);
        }
    }

    /**
     * Sets (as xml) array of all "DataProvider" element
     */
    @Override
    public void xsetDataProviderArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType[]dataProviderArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dataProviderArray, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets (as xml) ith "DataProvider" element
     */
    @Override
    public void xsetDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProvider);
        }
    }

    /**
     * Inserts the value as the ith "DataProvider" element
     */
    @Override
    public void insertDataProvider(int i, java.lang.String dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            target.setStringValue(dataProvider);
        }
    }

    /**
     * Appends the value as the last "DataProvider" element
     */
    @Override
    public void addDataProvider(java.lang.String dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            target.setStringValue(dataProvider);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType insertNewDataProvider(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType addNewDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "DataProvider" element
     */
    @Override
    public void removeDataProvider(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "MetadataflowReference" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType> getMetadataflowReferenceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataflowReferenceArray,
                this::setMetadataflowReferenceArray,
                this::insertNewMetadataflowReference,
                this::removeMetadataflowReference,
                this::sizeOfMetadataflowReferenceArray
            );
        }
    }

    /**
     * Gets array of all "MetadataflowReference" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType[] getMetadataflowReferenceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType[0]);
    }

    /**
     * Gets ith "MetadataflowReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType getMetadataflowReferenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataflowReference" element
     */
    @Override
    public int sizeOfMetadataflowReferenceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "MetadataflowReference" element
     */
    @Override
    public void setMetadataflowReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType metadataflowReference) {
        generatedSetterHelperImpl(metadataflowReference, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType insertNewMetadataflowReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType addNewMetadataflowReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataflowReference" element
     */
    @Override
    public void removeMetadataflowReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "MetadataStructureDefinitionReference" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType> getMetadataStructureDefinitionReferenceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataStructureDefinitionReferenceArray,
                this::setMetadataStructureDefinitionReferenceArray,
                this::insertNewMetadataStructureDefinitionReference,
                this::removeMetadataStructureDefinitionReference,
                this::sizeOfMetadataStructureDefinitionReferenceArray
            );
        }
    }

    /**
     * Gets array of all "MetadataStructureDefinitionReference" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType[] getMetadataStructureDefinitionReferenceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType[0]);
    }

    /**
     * Gets ith "MetadataStructureDefinitionReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType getMetadataStructureDefinitionReferenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataStructureDefinitionReference" element
     */
    @Override
    public int sizeOfMetadataStructureDefinitionReferenceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "MetadataStructureDefinitionReference" element
     */
    @Override
    public void setMetadataStructureDefinitionReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType metadataStructureDefinitionReference) {
        generatedSetterHelperImpl(metadataStructureDefinitionReference, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinitionReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType insertNewMetadataStructureDefinitionReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinitionReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType addNewMetadataStructureDefinitionReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataStructureDefinitionReference" element
     */
    @Override
    public void removeMetadataStructureDefinitionReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "Category" elements
     */
    @Override
    public java.util.List<java.lang.String> getCategoryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getCategoryArray,
                this::setCategoryArray,
                this::insertCategory,
                this::removeCategory,
                this::sizeOfCategoryArray
            );
        }
    }

    /**
     * Gets array of all "Category" elements
     */
    @Override
    public java.lang.String[] getCategoryArray() {
        return getObjectArray(PROPERTY_QNAME[6], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Category" element
     */
    @Override
    public java.lang.String getCategoryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Category" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType> xgetCategoryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetCategoryArray,
                this::xsetCategoryArray,
                this::insertNewCategory,
                this::removeCategory,
                this::sizeOfCategoryArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Category" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType[] xgetCategoryArray() {
        return xgetArray(PROPERTY_QNAME[6], org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType xgetCategoryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Category" element
     */
    @Override
    public int sizeOfCategoryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "Category" element
     */
    @Override
    public void setCategoryArray(int i, java.lang.String category) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(category);
        }
    }

    /**
     * Sets (as xml) array of all "Category" element
     */
    @Override
    public void xsetCategoryArray(org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType[]categoryArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(categoryArray, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets (as xml) ith "Category" element
     */
    @Override
    public void xsetCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType category) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }

    /**
     * Inserts the value as the ith "Category" element
     */
    @Override
    public void insertCategory(int i, java.lang.String category) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            target.setStringValue(category);
        }
    }

    /**
     * Appends the value as the last "Category" element
     */
    @Override
    public void addCategory(java.lang.String category) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            target.setStringValue(category);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType insertNewCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType addNewCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "Category" element
     */
    @Override
    public void removeCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets the "TYPE" attribute
     */
    @Override
    public java.lang.String getTYPE() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "TYPE" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTYPE() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(PROPERTY_QNAME[7]);
            }
            return target;
        }
    }

    /**
     * True if has "TYPE" attribute
     */
    @Override
    public boolean isSetTYPE() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "TYPE" attribute
     */
    @Override
    public void setTYPE(java.lang.String type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(type);
        }
    }

    /**
     * Sets (as xml) the "TYPE" attribute
     */
    @Override
    public void xsetTYPE(org.apache.xmlbeans.XmlString type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "TYPE" attribute
     */
    @Override
    public void unsetTYPE() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }
}
