/*
 * XML Type:  DataRegistrationEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataRegistrationEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface DataRegistrationEventsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataregistrationeventstypecbectype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAllEvents();

    /**
     * True if has "AllEvents" element
     */
    boolean isSetAllEvents();

    /**
     * Sets the "AllEvents" element
     */
    void setAllEvents(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType allEvents);

    /**
     * Appends and returns a new empty "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAllEvents();

    /**
     * Unsets the "AllEvents" element
     */
    void unsetAllEvents();

    /**
     * Gets a List of "RegistrationID" elements
     */
    java.util.List<java.lang.String> getRegistrationIDList();

    /**
     * Gets array of all "RegistrationID" elements
     */
    java.lang.String[] getRegistrationIDArray();

    /**
     * Gets ith "RegistrationID" element
     */
    java.lang.String getRegistrationIDArray(int i);

    /**
     * Gets (as xml) a List of "RegistrationID" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetRegistrationIDList();

    /**
     * Gets (as xml) array of all "RegistrationID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetRegistrationIDArray();

    /**
     * Gets (as xml) ith "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetRegistrationIDArray(int i);

    /**
     * Returns number of "RegistrationID" element
     */
    int sizeOfRegistrationIDArray();

    /**
     * Sets ith "RegistrationID" element
     */
    void setRegistrationIDArray(int i, java.lang.String registrationID);

    /**
     * Sets (as xml) array of all "RegistrationID" element
     */
    void xsetRegistrationIDArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] registrationIDArray);

    /**
     * Sets (as xml) ith "RegistrationID" element
     */
    void xsetRegistrationIDArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType registrationID);

    /**
     * Inserts the value as the ith "RegistrationID" element
     */
    void insertRegistrationID(int i, java.lang.String registrationID);

    /**
     * Appends the value as the last "RegistrationID" element
     */
    void addRegistrationID(java.lang.String registrationID);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewRegistrationID(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewRegistrationID();

    /**
     * Removes the ith "RegistrationID" element
     */
    void removeRegistrationID(int i);

    /**
     * Gets a List of "ProvisionAgreement" elements
     */
    java.util.List<java.lang.String> getProvisionAgreementList();

    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    java.lang.String[] getProvisionAgreementArray();

    /**
     * Gets ith "ProvisionAgreement" element
     */
    java.lang.String getProvisionAgreementArray(int i);

    /**
     * Gets (as xml) a List of "ProvisionAgreement" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType> xgetProvisionAgreementList();

    /**
     * Gets (as xml) array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[] xgetProvisionAgreementArray();

    /**
     * Gets (as xml) ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType xgetProvisionAgreementArray(int i);

    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();

    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, java.lang.String provisionAgreement);

    /**
     * Sets (as xml) array of all "ProvisionAgreement" element
     */
    void xsetProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[] provisionAgreementArray);

    /**
     * Sets (as xml) ith "ProvisionAgreement" element
     */
    void xsetProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType provisionAgreement);

    /**
     * Inserts the value as the ith "ProvisionAgreement" element
     */
    void insertProvisionAgreement(int i, java.lang.String provisionAgreement);

    /**
     * Appends the value as the last "ProvisionAgreement" element
     */
    void addProvisionAgreement(java.lang.String provisionAgreement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType insertNewProvisionAgreement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType addNewProvisionAgreement();

    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);

    /**
     * Gets a List of "DataProvider" elements
     */
    java.util.List<java.lang.String> getDataProviderList();

    /**
     * Gets array of all "DataProvider" elements
     */
    java.lang.String[] getDataProviderArray();

    /**
     * Gets ith "DataProvider" element
     */
    java.lang.String getDataProviderArray(int i);

    /**
     * Gets (as xml) a List of "DataProvider" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType> xgetDataProviderList();

    /**
     * Gets (as xml) array of all "DataProvider" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType[] xgetDataProviderArray();

    /**
     * Gets (as xml) ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType xgetDataProviderArray(int i);

    /**
     * Returns number of "DataProvider" element
     */
    int sizeOfDataProviderArray();

    /**
     * Sets ith "DataProvider" element
     */
    void setDataProviderArray(int i, java.lang.String dataProvider);

    /**
     * Sets (as xml) array of all "DataProvider" element
     */
    void xsetDataProviderArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType[] dataProviderArray);

    /**
     * Sets (as xml) ith "DataProvider" element
     */
    void xsetDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType dataProvider);

    /**
     * Inserts the value as the ith "DataProvider" element
     */
    void insertDataProvider(int i, java.lang.String dataProvider);

    /**
     * Appends the value as the last "DataProvider" element
     */
    void addDataProvider(java.lang.String dataProvider);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType insertNewDataProvider(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType addNewDataProvider();

    /**
     * Removes the ith "DataProvider" element
     */
    void removeDataProvider(int i);

    /**
     * Gets a List of "DataflowReference" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType> getDataflowReferenceList();

    /**
     * Gets array of all "DataflowReference" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType[] getDataflowReferenceArray();

    /**
     * Gets ith "DataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType getDataflowReferenceArray(int i);

    /**
     * Returns number of "DataflowReference" element
     */
    int sizeOfDataflowReferenceArray();

    /**
     * Sets ith "DataflowReference" element
     */
    void setDataflowReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType dataflowReference);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType insertNewDataflowReference(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType addNewDataflowReference();

    /**
     * Removes the ith "DataflowReference" element
     */
    void removeDataflowReference(int i);

    /**
     * Gets a List of "KeyFamilyReference" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType> getKeyFamilyReferenceList();

    /**
     * Gets array of all "KeyFamilyReference" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType[] getKeyFamilyReferenceArray();

    /**
     * Gets ith "KeyFamilyReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType getKeyFamilyReferenceArray(int i);

    /**
     * Returns number of "KeyFamilyReference" element
     */
    int sizeOfKeyFamilyReferenceArray();

    /**
     * Sets ith "KeyFamilyReference" element
     */
    void setKeyFamilyReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType keyFamilyReference);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamilyReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType insertNewKeyFamilyReference(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamilyReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableEventType addNewKeyFamilyReference();

    /**
     * Removes the ith "KeyFamilyReference" element
     */
    void removeKeyFamilyReference(int i);

    /**
     * Gets a List of "Category" elements
     */
    java.util.List<java.lang.String> getCategoryList();

    /**
     * Gets array of all "Category" elements
     */
    java.lang.String[] getCategoryArray();

    /**
     * Gets ith "Category" element
     */
    java.lang.String getCategoryArray(int i);

    /**
     * Gets (as xml) a List of "Category" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType> xgetCategoryList();

    /**
     * Gets (as xml) array of all "Category" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType[] xgetCategoryArray();

    /**
     * Gets (as xml) ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType xgetCategoryArray(int i);

    /**
     * Returns number of "Category" element
     */
    int sizeOfCategoryArray();

    /**
     * Sets ith "Category" element
     */
    void setCategoryArray(int i, java.lang.String category);

    /**
     * Sets (as xml) array of all "Category" element
     */
    void xsetCategoryArray(org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType[] categoryArray);

    /**
     * Sets (as xml) ith "Category" element
     */
    void xsetCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType category);

    /**
     * Inserts the value as the ith "Category" element
     */
    void insertCategory(int i, java.lang.String category);

    /**
     * Appends the value as the last "Category" element
     */
    void addCategory(java.lang.String category);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType insertNewCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType addNewCategory();

    /**
     * Removes the ith "Category" element
     */
    void removeCategory(int i);

    /**
     * Gets the "TYPE" attribute
     */
    java.lang.String getTYPE();

    /**
     * Gets (as xml) the "TYPE" attribute
     */
    org.apache.xmlbeans.XmlString xgetTYPE();

    /**
     * True if has "TYPE" attribute
     */
    boolean isSetTYPE();

    /**
     * Sets the "TYPE" attribute
     */
    void setTYPE(java.lang.String type);

    /**
     * Sets (as xml) the "TYPE" attribute
     */
    void xsetTYPE(org.apache.xmlbeans.XmlString type);

    /**
     * Unsets the "TYPE" attribute
     */
    void unsetTYPE();
}
