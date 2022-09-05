/*
 * XML Type:  QueryRegistrationRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML QueryRegistrationRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class QueryRegistrationRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.QueryRegistrationRequestType {
    private static final long serialVersionUID = 1L;

    public QueryRegistrationRequestTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "QueryType"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "All"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ProvisionAgreement"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "DataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Dataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Metadataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "ReferencePeriod"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "DataKeySet"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "CubeRegion"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MetadataTargetRegion"),
        new QName("", "returnConstraints"),
    };


    /**
     * Gets the "QueryType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType.Enum getQueryType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "QueryType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType xgetQueryType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "QueryType" element
     */
    @Override
    public void setQueryType(org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType.Enum queryType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(queryType);
        }
    }

    /**
     * Sets (as xml) the "QueryType" element
     */
    @Override
    public void xsetQueryType(org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType queryType) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryTypeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(queryType);
        }
    }

    /**
     * Gets the "All" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "All" element
     */
    @Override
    public boolean isSetAll() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "All" element
     */
    @Override
    public void setAll(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType all) {
        generatedSetterHelperImpl(all, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "All" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "All" element
     */
    @Override
    public void unsetAll() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "ProvisionAgreement" element
     */
    @Override
    public java.lang.String getProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "DataProvider" element
     */
    @Override
    public java.lang.String getDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType xgetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "DataProvider" element
     */
    @Override
    public boolean isSetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "DataProvider" element
     */
    @Override
    public void setDataProvider(java.lang.String dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(dataProvider);
        }
    }

    /**
     * Sets (as xml) the "DataProvider" element
     */
    @Override
    public void xsetDataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(dataProvider);
        }
    }

    /**
     * Unsets the "DataProvider" element
     */
    @Override
    public void unsetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "Dataflow" element
     */
    @Override
    public java.lang.String getDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType xgetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "Dataflow" element
     */
    @Override
    public boolean isSetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "Dataflow" element
     */
    @Override
    public void setDataflow(java.lang.String dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(dataflow);
        }
    }

    /**
     * Sets (as xml) the "Dataflow" element
     */
    @Override
    public void xsetDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(dataflow);
        }
    }

    /**
     * Unsets the "Dataflow" element
     */
    @Override
    public void unsetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().add_element_user(PROPERTY_QNAME[5]);
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
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "ReferencePeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType getReferencePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ReferencePeriod" element
     */
    @Override
    public boolean isSetReferencePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "ReferencePeriod" element
     */
    @Override
    public void setReferencePeriod(org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType referencePeriod) {
        generatedSetterHelperImpl(referencePeriod, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReferencePeriod" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType addNewReferencePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "ReferencePeriod" element
     */
    @Override
    public void unsetReferencePeriod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets a List of "DataKeySet" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType> getDataKeySetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataKeySetArray,
                this::setDataKeySetArray,
                this::insertNewDataKeySet,
                this::removeDataKeySet,
                this::sizeOfDataKeySetArray
            );
        }
    }

    /**
     * Gets array of all "DataKeySet" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType[] getDataKeySetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType[0]);
    }

    /**
     * Gets ith "DataKeySet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType getDataKeySetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataKeySet" element
     */
    @Override
    public int sizeOfDataKeySetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets ith "DataKeySet" element
     */
    @Override
    public void setDataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType dataKeySet) {
        generatedSetterHelperImpl(dataKeySet, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKeySet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType insertNewDataKeySet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataKeySet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType addNewDataKeySet() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "DataKeySet" element
     */
    @Override
    public void removeDataKeySet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "CubeRegion" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType> getCubeRegionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCubeRegionArray,
                this::setCubeRegionArray,
                this::insertNewCubeRegion,
                this::removeCubeRegion,
                this::sizeOfCubeRegionArray
            );
        }
    }

    /**
     * Gets array of all "CubeRegion" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType[] getCubeRegionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType[0]);
    }

    /**
     * Gets ith "CubeRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType getCubeRegionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CubeRegion" element
     */
    @Override
    public int sizeOfCubeRegionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets ith "CubeRegion" element
     */
    @Override
    public void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType cubeRegion) {
        generatedSetterHelperImpl(cubeRegion, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType insertNewCubeRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType addNewCubeRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "CubeRegion" element
     */
    @Override
    public void removeCubeRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "MetadataTargetRegion" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType> getMetadataTargetRegionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataTargetRegionArray,
                this::setMetadataTargetRegionArray,
                this::insertNewMetadataTargetRegion,
                this::removeMetadataTargetRegion,
                this::sizeOfMetadataTargetRegionArray
            );
        }
    }

    /**
     * Gets array of all "MetadataTargetRegion" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType[] getMetadataTargetRegionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType[0]);
    }

    /**
     * Gets ith "MetadataTargetRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType getMetadataTargetRegionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataTargetRegion" element
     */
    @Override
    public int sizeOfMetadataTargetRegionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets ith "MetadataTargetRegion" element
     */
    @Override
    public void setMetadataTargetRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType metadataTargetRegion) {
        generatedSetterHelperImpl(metadataTargetRegion, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType insertNewMetadataTargetRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType addNewMetadataTargetRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataTargetRegion" element
     */
    @Override
    public void removeMetadataTargetRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets the "returnConstraints" attribute
     */
    @Override
    public boolean getReturnConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[10]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "returnConstraints" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetReturnConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[10]);
            }
            return target;
        }
    }

    /**
     * True if has "returnConstraints" attribute
     */
    @Override
    public boolean isSetReturnConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "returnConstraints" attribute
     */
    @Override
    public void setReturnConstraints(boolean returnConstraints) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBooleanValue(returnConstraints);
        }
    }

    /**
     * Sets (as xml) the "returnConstraints" attribute
     */
    @Override
    public void xsetReturnConstraints(org.apache.xmlbeans.XmlBoolean returnConstraints) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(returnConstraints);
        }
    }

    /**
     * Unsets the "returnConstraints" attribute
     */
    @Override
    public void unsetReturnConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }
}
