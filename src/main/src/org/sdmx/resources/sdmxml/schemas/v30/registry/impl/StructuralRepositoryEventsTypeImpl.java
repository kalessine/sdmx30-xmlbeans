/*
 * XML Type:  StructuralRepositoryEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructuralRepositoryEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class StructuralRepositoryEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType {
    private static final long serialVersionUID = 1L;

    public StructuralRepositoryEventsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "AgencyID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "AllEvents"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "AgencyScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "DataConsmerScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "DataProviderScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "OrganisationUnitScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Dataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Metadataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "CategoryScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Categorisation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Codelist"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "HierarchicalCodelist"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ConceptScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MetadataStructureDefinition"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "KeyFamily"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StructureSet"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ReportingTaxonomy"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Process"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "AttachmentConstraint"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ContentConstraint"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ProvisionAgreement"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "TransformationScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "NameAliasScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "NamePersonalisationScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "RulesetScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "UserDefinedOperatorScheme"),
        new QName("", "TYPE"),
    };


    /**
     * Gets a List of "AgencyID" elements
     */
    @Override
    public java.util.List<java.lang.String> getAgencyIDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAgencyIDArray,
                this::setAgencyIDArray,
                this::insertAgencyID,
                this::removeAgencyID,
                this::sizeOfAgencyIDArray
            );
        }
    }

    /**
     * Gets array of all "AgencyID" elements
     */
    @Override
    public java.lang.String[] getAgencyIDArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "AgencyID" element
     */
    @Override
    public java.lang.String getAgencyIDArray(int i) {
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
     * Gets (as xml) a List of "AgencyID" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType> xgetAgencyIDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAgencyIDArray,
                this::xsetAgencyIDArray,
                this::insertNewAgencyID,
                this::removeAgencyID,
                this::sizeOfAgencyIDArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "AgencyID" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType[] xgetAgencyIDArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType[]::new);
    }

    /**
     * Gets (as xml) ith "AgencyID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType xgetAgencyIDArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AgencyID" element
     */
    @Override
    public int sizeOfAgencyIDArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "AgencyID" element
     */
    @Override
    public void setAgencyIDArray(int i, java.lang.String agencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(agencyID);
        }
    }

    /**
     * Sets (as xml) array of all "AgencyID" element
     */
    @Override
    public void xsetAgencyIDArray(org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType[]agencyIDArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(agencyIDArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "AgencyID" element
     */
    @Override
    public void xsetAgencyIDArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType agencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(agencyID);
        }
    }

    /**
     * Inserts the value as the ith "AgencyID" element
     */
    @Override
    public void insertAgencyID(int i, java.lang.String agencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(agencyID);
        }
    }

    /**
     * Appends the value as the last "AgencyID" element
     */
    @Override
    public void addAgencyID(java.lang.String agencyID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(agencyID);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType insertNewAgencyID(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType addNewAgencyID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "AgencyID" element
     */
    @Override
    public void removeAgencyID(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "AllEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAllEvents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "AllEvents" element
     */
    @Override
    public void setAllEvents(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType allEvents) {
        generatedSetterHelperImpl(allEvents, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AllEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAllEvents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "AgencyScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getAgencySchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgencySchemeArray,
                this::setAgencySchemeArray,
                this::insertNewAgencyScheme,
                this::removeAgencyScheme,
                this::sizeOfAgencySchemeArray
            );
        }
    }

    /**
     * Gets array of all "AgencyScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getAgencySchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "AgencyScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getAgencySchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AgencyScheme" element
     */
    @Override
    public int sizeOfAgencySchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "AgencyScheme" element
     */
    @Override
    public void setAgencySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType agencyScheme) {
        generatedSetterHelperImpl(agencyScheme, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewAgencyScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewAgencyScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "AgencyScheme" element
     */
    @Override
    public void removeAgencyScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "DataConsmerScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getDataConsmerSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataConsmerSchemeArray,
                this::setDataConsmerSchemeArray,
                this::insertNewDataConsmerScheme,
                this::removeDataConsmerScheme,
                this::sizeOfDataConsmerSchemeArray
            );
        }
    }

    /**
     * Gets array of all "DataConsmerScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getDataConsmerSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "DataConsmerScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getDataConsmerSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataConsmerScheme" element
     */
    @Override
    public int sizeOfDataConsmerSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "DataConsmerScheme" element
     */
    @Override
    public void setDataConsmerSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType dataConsmerScheme) {
        generatedSetterHelperImpl(dataConsmerScheme, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsmerScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewDataConsmerScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsmerScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewDataConsmerScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "DataConsmerScheme" element
     */
    @Override
    public void removeDataConsmerScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "DataProviderScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getDataProviderSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataProviderSchemeArray,
                this::setDataProviderSchemeArray,
                this::insertNewDataProviderScheme,
                this::removeDataProviderScheme,
                this::sizeOfDataProviderSchemeArray
            );
        }
    }

    /**
     * Gets array of all "DataProviderScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getDataProviderSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "DataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getDataProviderSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataProviderScheme" element
     */
    @Override
    public int sizeOfDataProviderSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "DataProviderScheme" element
     */
    @Override
    public void setDataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType dataProviderScheme) {
        generatedSetterHelperImpl(dataProviderScheme, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewDataProviderScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewDataProviderScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "DataProviderScheme" element
     */
    @Override
    public void removeDataProviderScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "OrganisationUnitScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getOrganisationUnitSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOrganisationUnitSchemeArray,
                this::setOrganisationUnitSchemeArray,
                this::insertNewOrganisationUnitScheme,
                this::removeOrganisationUnitScheme,
                this::sizeOfOrganisationUnitSchemeArray
            );
        }
    }

    /**
     * Gets array of all "OrganisationUnitScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getOrganisationUnitSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "OrganisationUnitScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getOrganisationUnitSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "OrganisationUnitScheme" element
     */
    @Override
    public int sizeOfOrganisationUnitSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "OrganisationUnitScheme" element
     */
    @Override
    public void setOrganisationUnitSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType organisationUnitScheme) {
        generatedSetterHelperImpl(organisationUnitScheme, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnitScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewOrganisationUnitScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnitScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewOrganisationUnitScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "OrganisationUnitScheme" element
     */
    @Override
    public void removeOrganisationUnitScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "Dataflow" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getDataflowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataflowArray,
                this::setDataflowArray,
                this::insertNewDataflow,
                this::removeDataflow,
                this::sizeOfDataflowArray
            );
        }
    }

    /**
     * Gets array of all "Dataflow" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getDataflowArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getDataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Dataflow" element
     */
    @Override
    public int sizeOfDataflowArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "Dataflow" element
     */
    @Override
    public void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType dataflow) {
        generatedSetterHelperImpl(dataflow, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewDataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "Dataflow" element
     */
    @Override
    public void removeDataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "Metadataflow" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getMetadataflowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataflowArray,
                this::setMetadataflowArray,
                this::insertNewMetadataflow,
                this::removeMetadataflow,
                this::sizeOfMetadataflowArray
            );
        }
    }

    /**
     * Gets array of all "Metadataflow" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getMetadataflowArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getMetadataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Metadataflow" element
     */
    @Override
    public int sizeOfMetadataflowArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets ith "Metadataflow" element
     */
    @Override
    public void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType metadataflow) {
        generatedSetterHelperImpl(metadataflow, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewMetadataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "Metadataflow" element
     */
    @Override
    public void removeMetadataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "CategoryScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getCategorySchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategorySchemeArray,
                this::setCategorySchemeArray,
                this::insertNewCategoryScheme,
                this::removeCategoryScheme,
                this::sizeOfCategorySchemeArray
            );
        }
    }

    /**
     * Gets array of all "CategoryScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getCategorySchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "CategoryScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getCategorySchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryScheme" element
     */
    @Override
    public int sizeOfCategorySchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets ith "CategoryScheme" element
     */
    @Override
    public void setCategorySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType categoryScheme) {
        generatedSetterHelperImpl(categoryScheme, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewCategoryScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewCategoryScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryScheme" element
     */
    @Override
    public void removeCategoryScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "Categorisation" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType> getCategorisationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategorisationArray,
                this::setCategorisationArray,
                this::insertNewCategorisation,
                this::removeCategorisation,
                this::sizeOfCategorisationArray
            );
        }
    }

    /**
     * Gets array of all "Categorisation" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType[] getCategorisationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType[0]);
    }

    /**
     * Gets ith "Categorisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType getCategorisationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Categorisation" element
     */
    @Override
    public int sizeOfCategorisationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets ith "Categorisation" element
     */
    @Override
    public void setCategorisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType categorisation) {
        generatedSetterHelperImpl(categorisation, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Categorisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType insertNewCategorisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Categorisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType addNewCategorisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "Categorisation" element
     */
    @Override
    public void removeCategorisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "Codelist" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodelistArray,
                this::setCodelistArray,
                this::insertNewCodelist,
                this::removeCodelist,
                this::sizeOfCodelistArray
            );
        }
    }

    /**
     * Gets array of all "Codelist" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getCodelistArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "Codelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Codelist" element
     */
    @Override
    public int sizeOfCodelistArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets ith "Codelist" element
     */
    @Override
    public void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType codelist) {
        generatedSetterHelperImpl(codelist, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "Codelist" element
     */
    @Override
    public void removeCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "HierarchicalCodelist" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getHierarchicalCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHierarchicalCodelistArray,
                this::setHierarchicalCodelistArray,
                this::insertNewHierarchicalCodelist,
                this::removeHierarchicalCodelist,
                this::sizeOfHierarchicalCodelistArray
            );
        }
    }

    /**
     * Gets array of all "HierarchicalCodelist" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getHierarchicalCodelistArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "HierarchicalCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getHierarchicalCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "HierarchicalCodelist" element
     */
    @Override
    public int sizeOfHierarchicalCodelistArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets ith "HierarchicalCodelist" element
     */
    @Override
    public void setHierarchicalCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType hierarchicalCodelist) {
        generatedSetterHelperImpl(hierarchicalCodelist, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewHierarchicalCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewHierarchicalCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "HierarchicalCodelist" element
     */
    @Override
    public void removeHierarchicalCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets a List of "ConceptScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getConceptSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptSchemeArray,
                this::setConceptSchemeArray,
                this::insertNewConceptScheme,
                this::removeConceptScheme,
                this::sizeOfConceptSchemeArray
            );
        }
    }

    /**
     * Gets array of all "ConceptScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getConceptSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[12], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "ConceptScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getConceptSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptScheme" element
     */
    @Override
    public int sizeOfConceptSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets ith "ConceptScheme" element
     */
    @Override
    public void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType conceptScheme) {
        generatedSetterHelperImpl(conceptScheme, PROPERTY_QNAME[12], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewConceptScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewConceptScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptScheme" element
     */
    @Override
    public void removeConceptScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets a List of "MetadataStructureDefinition" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getMetadataStructureDefinitionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataStructureDefinitionArray,
                this::setMetadataStructureDefinitionArray,
                this::insertNewMetadataStructureDefinition,
                this::removeMetadataStructureDefinition,
                this::sizeOfMetadataStructureDefinitionArray
            );
        }
    }

    /**
     * Gets array of all "MetadataStructureDefinition" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getMetadataStructureDefinitionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[13], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "MetadataStructureDefinition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getMetadataStructureDefinitionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataStructureDefinition" element
     */
    @Override
    public int sizeOfMetadataStructureDefinitionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets ith "MetadataStructureDefinition" element
     */
    @Override
    public void setMetadataStructureDefinitionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType metadataStructureDefinition) {
        generatedSetterHelperImpl(metadataStructureDefinition, PROPERTY_QNAME[13], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewMetadataStructureDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewMetadataStructureDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataStructureDefinition" element
     */
    @Override
    public void removeMetadataStructureDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }

    /**
     * Gets a List of "KeyFamily" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getKeyFamilyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyFamilyArray,
                this::setKeyFamilyArray,
                this::insertNewKeyFamily,
                this::removeKeyFamily,
                this::sizeOfKeyFamilyArray
            );
        }
    }

    /**
     * Gets array of all "KeyFamily" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getKeyFamilyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[14], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "KeyFamily" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getKeyFamilyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyFamily" element
     */
    @Override
    public int sizeOfKeyFamilyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets ith "KeyFamily" element
     */
    @Override
    public void setKeyFamilyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType keyFamily) {
        generatedSetterHelperImpl(keyFamily, PROPERTY_QNAME[14], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamily" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewKeyFamily(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamily" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewKeyFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyFamily" element
     */
    @Override
    public void removeKeyFamily(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets a List of "StructureSet" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getStructureSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStructureSetArray,
                this::setStructureSetArray,
                this::insertNewStructureSet,
                this::removeStructureSet,
                this::sizeOfStructureSetArray
            );
        }
    }

    /**
     * Gets array of all "StructureSet" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getStructureSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[15], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "StructureSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getStructureSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StructureSet" element
     */
    @Override
    public int sizeOfStructureSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets ith "StructureSet" element
     */
    @Override
    public void setStructureSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType structureSet) {
        generatedSetterHelperImpl(structureSet, PROPERTY_QNAME[15], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewStructureSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewStructureSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Removes the ith "StructureSet" element
     */
    @Override
    public void removeStructureSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }

    /**
     * Gets a List of "ReportingTaxonomy" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getReportingTaxonomyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReportingTaxonomyArray,
                this::setReportingTaxonomyArray,
                this::insertNewReportingTaxonomy,
                this::removeReportingTaxonomy,
                this::sizeOfReportingTaxonomyArray
            );
        }
    }

    /**
     * Gets array of all "ReportingTaxonomy" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getReportingTaxonomyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[16], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "ReportingTaxonomy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getReportingTaxonomyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ReportingTaxonomy" element
     */
    @Override
    public int sizeOfReportingTaxonomyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets ith "ReportingTaxonomy" element
     */
    @Override
    public void setReportingTaxonomyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType reportingTaxonomy) {
        generatedSetterHelperImpl(reportingTaxonomy, PROPERTY_QNAME[16], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewReportingTaxonomy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomy" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewReportingTaxonomy() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Removes the ith "ReportingTaxonomy" element
     */
    @Override
    public void removeReportingTaxonomy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }

    /**
     * Gets a List of "Process" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getProcessList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProcessArray,
                this::setProcessArray,
                this::insertNewProcess,
                this::removeProcess,
                this::sizeOfProcessArray
            );
        }
    }

    /**
     * Gets array of all "Process" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getProcessArray() {
        return getXmlObjectArray(PROPERTY_QNAME[17], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "Process" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getProcessArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Process" element
     */
    @Override
    public int sizeOfProcessArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets ith "Process" element
     */
    @Override
    public void setProcessArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType process) {
        generatedSetterHelperImpl(process, PROPERTY_QNAME[17], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Process" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewProcess(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Process" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewProcess() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Removes the ith "Process" element
     */
    @Override
    public void removeProcess(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], i);
        }
    }

    /**
     * Gets a List of "AttachmentConstraint" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getAttachmentConstraintList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttachmentConstraintArray,
                this::setAttachmentConstraintArray,
                this::insertNewAttachmentConstraint,
                this::removeAttachmentConstraint,
                this::sizeOfAttachmentConstraintArray
            );
        }
    }

    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getAttachmentConstraintArray() {
        return getXmlObjectArray(PROPERTY_QNAME[18], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "AttachmentConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getAttachmentConstraintArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AttachmentConstraint" element
     */
    @Override
    public int sizeOfAttachmentConstraintArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets ith "AttachmentConstraint" element
     */
    @Override
    public void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType attachmentConstraint) {
        generatedSetterHelperImpl(attachmentConstraint, PROPERTY_QNAME[18], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewAttachmentConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewAttachmentConstraint() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Removes the ith "AttachmentConstraint" element
     */
    @Override
    public void removeAttachmentConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], i);
        }
    }

    /**
     * Gets a List of "ContentConstraint" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getContentConstraintList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getContentConstraintArray,
                this::setContentConstraintArray,
                this::insertNewContentConstraint,
                this::removeContentConstraint,
                this::sizeOfContentConstraintArray
            );
        }
    }

    /**
     * Gets array of all "ContentConstraint" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getContentConstraintArray() {
        return getXmlObjectArray(PROPERTY_QNAME[19], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "ContentConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getContentConstraintArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ContentConstraint" element
     */
    @Override
    public int sizeOfContentConstraintArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets ith "ContentConstraint" element
     */
    @Override
    public void setContentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType contentConstraint) {
        generatedSetterHelperImpl(contentConstraint, PROPERTY_QNAME[19], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContentConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewContentConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ContentConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewContentConstraint() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Removes the ith "ContentConstraint" element
     */
    @Override
    public void removeContentConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], i);
        }
    }

    /**
     * Gets a List of "ProvisionAgreement" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getProvisionAgreementList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getProvisionAgreementArray() {
        return getXmlObjectArray(PROPERTY_QNAME[20], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[20], i);
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
            return get_store().count_elements(PROPERTY_QNAME[20]);
        }
    }

    /**
     * Sets ith "ProvisionAgreement" element
     */
    @Override
    public void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType provisionAgreement) {
        generatedSetterHelperImpl(provisionAgreement, PROPERTY_QNAME[20], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewProvisionAgreement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[20], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[20]);
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
            get_store().remove_element(PROPERTY_QNAME[20], i);
        }
    }

    /**
     * Gets a List of "TransformationScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getTransformationSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTransformationSchemeArray,
                this::setTransformationSchemeArray,
                this::insertNewTransformationScheme,
                this::removeTransformationScheme,
                this::sizeOfTransformationSchemeArray
            );
        }
    }

    /**
     * Gets array of all "TransformationScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getTransformationSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[21], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "TransformationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getTransformationSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[21], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TransformationScheme" element
     */
    @Override
    public int sizeOfTransformationSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[21]);
        }
    }

    /**
     * Sets ith "TransformationScheme" element
     */
    @Override
    public void setTransformationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType transformationScheme) {
        generatedSetterHelperImpl(transformationScheme, PROPERTY_QNAME[21], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TransformationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewTransformationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[21], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TransformationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewTransformationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * Removes the ith "TransformationScheme" element
     */
    @Override
    public void removeTransformationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[21], i);
        }
    }

    /**
     * Gets a List of "NameAliasScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getNameAliasSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameAliasSchemeArray,
                this::setNameAliasSchemeArray,
                this::insertNewNameAliasScheme,
                this::removeNameAliasScheme,
                this::sizeOfNameAliasSchemeArray
            );
        }
    }

    /**
     * Gets array of all "NameAliasScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getNameAliasSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[22], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "NameAliasScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getNameAliasSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[22], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NameAliasScheme" element
     */
    @Override
    public int sizeOfNameAliasSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[22]);
        }
    }

    /**
     * Sets ith "NameAliasScheme" element
     */
    @Override
    public void setNameAliasSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType nameAliasScheme) {
        generatedSetterHelperImpl(nameAliasScheme, PROPERTY_QNAME[22], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameAliasScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewNameAliasScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[22], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NameAliasScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewNameAliasScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[22]);
            return target;
        }
    }

    /**
     * Removes the ith "NameAliasScheme" element
     */
    @Override
    public void removeNameAliasScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[22], i);
        }
    }

    /**
     * Gets a List of "NamePersonalisationScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getNamePersonalisationSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNamePersonalisationSchemeArray,
                this::setNamePersonalisationSchemeArray,
                this::insertNewNamePersonalisationScheme,
                this::removeNamePersonalisationScheme,
                this::sizeOfNamePersonalisationSchemeArray
            );
        }
    }

    /**
     * Gets array of all "NamePersonalisationScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getNamePersonalisationSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[23], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "NamePersonalisationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getNamePersonalisationSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[23], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NamePersonalisationScheme" element
     */
    @Override
    public int sizeOfNamePersonalisationSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[23]);
        }
    }

    /**
     * Sets ith "NamePersonalisationScheme" element
     */
    @Override
    public void setNamePersonalisationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType namePersonalisationScheme) {
        generatedSetterHelperImpl(namePersonalisationScheme, PROPERTY_QNAME[23], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NamePersonalisationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewNamePersonalisationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[23], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NamePersonalisationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewNamePersonalisationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[23]);
            return target;
        }
    }

    /**
     * Removes the ith "NamePersonalisationScheme" element
     */
    @Override
    public void removeNamePersonalisationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[23], i);
        }
    }

    /**
     * Gets a List of "RulesetScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getRulesetSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRulesetSchemeArray,
                this::setRulesetSchemeArray,
                this::insertNewRulesetScheme,
                this::removeRulesetScheme,
                this::sizeOfRulesetSchemeArray
            );
        }
    }

    /**
     * Gets array of all "RulesetScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getRulesetSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[24], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getRulesetSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[24], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RulesetScheme" element
     */
    @Override
    public int sizeOfRulesetSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[24]);
        }
    }

    /**
     * Sets ith "RulesetScheme" element
     */
    @Override
    public void setRulesetSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType rulesetScheme) {
        generatedSetterHelperImpl(rulesetScheme, PROPERTY_QNAME[24], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewRulesetScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[24], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewRulesetScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[24]);
            return target;
        }
    }

    /**
     * Removes the ith "RulesetScheme" element
     */
    @Override
    public void removeRulesetScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[24], i);
        }
    }

    /**
     * Gets a List of "UserDefinedOperatorScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getUserDefinedOperatorSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUserDefinedOperatorSchemeArray,
                this::setUserDefinedOperatorSchemeArray,
                this::insertNewUserDefinedOperatorScheme,
                this::removeUserDefinedOperatorScheme,
                this::sizeOfUserDefinedOperatorSchemeArray
            );
        }
    }

    /**
     * Gets array of all "UserDefinedOperatorScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getUserDefinedOperatorSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[25], new org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[0]);
    }

    /**
     * Gets ith "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getUserDefinedOperatorSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().find_element_user(PROPERTY_QNAME[25], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "UserDefinedOperatorScheme" element
     */
    @Override
    public int sizeOfUserDefinedOperatorSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[25]);
        }
    }

    /**
     * Sets ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void setUserDefinedOperatorSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType userDefinedOperatorScheme) {
        generatedSetterHelperImpl(userDefinedOperatorScheme, PROPERTY_QNAME[25], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewUserDefinedOperatorScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().insert_element_user(PROPERTY_QNAME[25], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewUserDefinedOperatorScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType)get_store().add_element_user(PROPERTY_QNAME[25]);
            return target;
        }
    }

    /**
     * Removes the ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void removeUserDefinedOperatorScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[25], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[26]);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(PROPERTY_QNAME[26]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[26]) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[26]);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[26]);
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
            get_store().remove_attribute(PROPERTY_QNAME[26]);
        }
    }
}
