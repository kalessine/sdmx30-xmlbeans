/*
 * XML Type:  ConstraintAttachmentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConstraintAttachmentType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ConstraintAttachmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType {
    private static final long serialVersionUID = 1L;

    public ConstraintAttachmentTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataSet"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "SimpleDataSource"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataStructure"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "QueryableDataSource"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataStructure"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Metadataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ProvisionAgreement"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvisionAgreement"),
    };


    /**
     * Gets the "DataProvider" element
     */
    @Override
    public java.lang.String getDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], 0);
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
     * True if has "MetadataProvider" element
     */
    @Override
    public boolean isSetMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
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
     * Unsets the "MetadataProvider" element
     */
    @Override
    public void unsetMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "MetadataSet" elements
     */
    @Override
    public java.util.List<java.lang.String> getMetadataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMetadataSetArray,
                this::setMetadataSetArray,
                this::insertMetadataSet,
                this::removeMetadataSet,
                this::sizeOfMetadataSetArray
            );
        }
    }

    /**
     * Gets array of all "MetadataSet" elements
     */
    @Override
    public java.lang.String[] getMetadataSetArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "MetadataSet" element
     */
    @Override
    public java.lang.String getMetadataSetArray(int i) {
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
     * Gets (as xml) a List of "MetadataSet" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType> xgetMetadataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMetadataSetArray,
                this::xsetMetadataSetArray,
                this::insertNewMetadataSet,
                this::removeMetadataSet,
                this::sizeOfMetadataSetArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MetadataSet" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType[] xgetMetadataSetArray() {
        return xgetArray(PROPERTY_QNAME[2], org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "MetadataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType xgetMetadataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataSet" element
     */
    @Override
    public int sizeOfMetadataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "MetadataSet" element
     */
    @Override
    public void setMetadataSetArray(int i, java.lang.String metadataSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataSet);
        }
    }

    /**
     * Sets (as xml) array of all "MetadataSet" element
     */
    @Override
    public void xsetMetadataSetArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType[]metadataSetArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(metadataSetArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "MetadataSet" element
     */
    @Override
    public void xsetMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType metadataSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataSet);
        }
    }

    /**
     * Inserts the value as the ith "MetadataSet" element
     */
    @Override
    public void insertMetadataSet(int i, java.lang.String metadataSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(metadataSet);
        }
    }

    /**
     * Appends the value as the last "MetadataSet" element
     */
    @Override
    public void addMetadataSet(java.lang.String metadataSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(metadataSet);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType insertNewMetadataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType addNewMetadataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataSetReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataSet" element
     */
    @Override
    public void removeMetadataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "SimpleDataSource" elements
     */
    @Override
    public java.util.List<java.lang.String> getSimpleDataSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSimpleDataSourceArray,
                this::setSimpleDataSourceArray,
                this::insertSimpleDataSource,
                this::removeSimpleDataSource,
                this::sizeOfSimpleDataSourceArray
            );
        }
    }

    /**
     * Gets array of all "SimpleDataSource" elements
     */
    @Override
    public java.lang.String[] getSimpleDataSourceArray() {
        return getObjectArray(PROPERTY_QNAME[3], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "SimpleDataSource" element
     */
    @Override
    public java.lang.String getSimpleDataSourceArray(int i) {
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
     * Gets (as xml) a List of "SimpleDataSource" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetSimpleDataSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSimpleDataSourceArray,
                this::xsetSimpleDataSourceArray,
                this::insertNewSimpleDataSource,
                this::removeSimpleDataSource,
                this::sizeOfSimpleDataSourceArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "SimpleDataSource" elements
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI[] xgetSimpleDataSourceArray() {
        return xgetArray(PROPERTY_QNAME[3], org.apache.xmlbeans.XmlAnyURI[]::new);
    }

    /**
     * Gets (as xml) ith "SimpleDataSource" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetSimpleDataSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SimpleDataSource" element
     */
    @Override
    public int sizeOfSimpleDataSourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "SimpleDataSource" element
     */
    @Override
    public void setSimpleDataSourceArray(int i, java.lang.String simpleDataSource) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(simpleDataSource);
        }
    }

    /**
     * Sets (as xml) array of all "SimpleDataSource" element
     */
    @Override
    public void xsetSimpleDataSourceArray(org.apache.xmlbeans.XmlAnyURI[]simpleDataSourceArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(simpleDataSourceArray, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets (as xml) ith "SimpleDataSource" element
     */
    @Override
    public void xsetSimpleDataSourceArray(int i, org.apache.xmlbeans.XmlAnyURI simpleDataSource) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(simpleDataSource);
        }
    }

    /**
     * Inserts the value as the ith "SimpleDataSource" element
     */
    @Override
    public void insertSimpleDataSource(int i, java.lang.String simpleDataSource) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            target.setStringValue(simpleDataSource);
        }
    }

    /**
     * Appends the value as the last "SimpleDataSource" element
     */
    @Override
    public void addSimpleDataSource(java.lang.String simpleDataSource) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            target.setStringValue(simpleDataSource);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SimpleDataSource" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI insertNewSimpleDataSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SimpleDataSource" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI addNewSimpleDataSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "SimpleDataSource" element
     */
    @Override
    public void removeSimpleDataSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "DataStructure" elements
     */
    @Override
    public java.util.List<java.lang.String> getDataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDataStructureArray,
                this::setDataStructureArray,
                this::insertDataStructure,
                this::removeDataStructure,
                this::sizeOfDataStructureArray
            );
        }
    }

    /**
     * Gets array of all "DataStructure" elements
     */
    @Override
    public java.lang.String[] getDataStructureArray() {
        return getObjectArray(PROPERTY_QNAME[4], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "DataStructure" element
     */
    @Override
    public java.lang.String getDataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "DataStructure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType> xgetDataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDataStructureArray,
                this::xsetDataStructureArray,
                this::insertNewDataStructure,
                this::removeDataStructure,
                this::sizeOfDataStructureArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "DataStructure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType[] xgetDataStructureArray() {
        return xgetArray(PROPERTY_QNAME[4], org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "DataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType xgetDataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStructure" element
     */
    @Override
    public int sizeOfDataStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "DataStructure" element
     */
    @Override
    public void setDataStructureArray(int i, java.lang.String dataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataStructure);
        }
    }

    /**
     * Sets (as xml) array of all "DataStructure" element
     */
    @Override
    public void xsetDataStructureArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType[]dataStructureArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dataStructureArray, PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets (as xml) ith "DataStructure" element
     */
    @Override
    public void xsetDataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType dataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataStructure);
        }
    }

    /**
     * Inserts the value as the ith "DataStructure" element
     */
    @Override
    public void insertDataStructure(int i, java.lang.String dataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            target.setStringValue(dataStructure);
        }
    }

    /**
     * Appends the value as the last "DataStructure" element
     */
    @Override
    public void addDataStructure(java.lang.String dataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            target.setStringValue(dataStructure);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType insertNewDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType addNewDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataStructureReferenceType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStructure" element
     */
    @Override
    public void removeDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "QueryableDataSource" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType> getQueryableDataSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getQueryableDataSourceArray,
                this::setQueryableDataSourceArray,
                this::insertNewQueryableDataSource,
                this::removeQueryableDataSource,
                this::sizeOfQueryableDataSourceArray
            );
        }
    }

    /**
     * Gets array of all "QueryableDataSource" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType[] getQueryableDataSourceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType[0]);
    }

    /**
     * Gets ith "QueryableDataSource" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType getQueryableDataSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "QueryableDataSource" element
     */
    @Override
    public int sizeOfQueryableDataSourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "QueryableDataSource" element
     */
    @Override
    public void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType queryableDataSource) {
        generatedSetterHelperImpl(queryableDataSource, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryableDataSource" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType insertNewQueryableDataSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType addNewQueryableDataSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.QueryableDataSourceType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "QueryableDataSource" element
     */
    @Override
    public void removeQueryableDataSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "MetadataStructure" elements
     */
    @Override
    public java.util.List<java.lang.String> getMetadataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMetadataStructureArray,
                this::setMetadataStructureArray,
                this::insertMetadataStructure,
                this::removeMetadataStructure,
                this::sizeOfMetadataStructureArray
            );
        }
    }

    /**
     * Gets array of all "MetadataStructure" elements
     */
    @Override
    public java.lang.String[] getMetadataStructureArray() {
        return getObjectArray(PROPERTY_QNAME[6], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "MetadataStructure" element
     */
    @Override
    public java.lang.String getMetadataStructureArray(int i) {
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
     * Gets (as xml) a List of "MetadataStructure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType> xgetMetadataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMetadataStructureArray,
                this::xsetMetadataStructureArray,
                this::insertNewMetadataStructure,
                this::removeMetadataStructure,
                this::sizeOfMetadataStructureArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MetadataStructure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType[] xgetMetadataStructureArray() {
        return xgetArray(PROPERTY_QNAME[6], org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "MetadataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType xgetMetadataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataStructure" element
     */
    @Override
    public int sizeOfMetadataStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "MetadataStructure" element
     */
    @Override
    public void setMetadataStructureArray(int i, java.lang.String metadataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataStructure);
        }
    }

    /**
     * Sets (as xml) array of all "MetadataStructure" element
     */
    @Override
    public void xsetMetadataStructureArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType[]metadataStructureArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets (as xml) ith "MetadataStructure" element
     */
    @Override
    public void xsetMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType metadataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructure);
        }
    }

    /**
     * Inserts the value as the ith "MetadataStructure" element
     */
    @Override
    public void insertMetadataStructure(int i, java.lang.String metadataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            target.setStringValue(metadataStructure);
        }
    }

    /**
     * Appends the value as the last "MetadataStructure" element
     */
    @Override
    public void addMetadataStructure(java.lang.String metadataStructure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            target.setStringValue(metadataStructure);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType insertNewMetadataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType addNewMetadataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataStructureReferenceType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataStructure" element
     */
    @Override
    public void removeMetadataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "Dataflow" elements
     */
    @Override
    public java.util.List<java.lang.String> getDataflowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDataflowArray,
                this::setDataflowArray,
                this::insertDataflow,
                this::removeDataflow,
                this::sizeOfDataflowArray
            );
        }
    }

    /**
     * Gets array of all "Dataflow" elements
     */
    @Override
    public java.lang.String[] getDataflowArray() {
        return getObjectArray(PROPERTY_QNAME[7], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Dataflow" element
     */
    @Override
    public java.lang.String getDataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Dataflow" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType> xgetDataflowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDataflowArray,
                this::xsetDataflowArray,
                this::insertNewDataflow,
                this::removeDataflow,
                this::sizeOfDataflowArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Dataflow" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType[] xgetDataflowArray() {
        return xgetArray(PROPERTY_QNAME[7], org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType xgetDataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[7], i);
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
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets ith "Dataflow" element
     */
    @Override
    public void setDataflowArray(int i, java.lang.String dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataflow);
        }
    }

    /**
     * Sets (as xml) array of all "Dataflow" element
     */
    @Override
    public void xsetDataflowArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType[]dataflowArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dataflowArray, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets (as xml) ith "Dataflow" element
     */
    @Override
    public void xsetDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflow);
        }
    }

    /**
     * Inserts the value as the ith "Dataflow" element
     */
    @Override
    public void insertDataflow(int i, java.lang.String dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            target.setStringValue(dataflow);
        }
    }

    /**
     * Appends the value as the last "Dataflow" element
     */
    @Override
    public void addDataflow(java.lang.String dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            target.setStringValue(dataflow);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType insertNewDataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType addNewDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().add_element_user(PROPERTY_QNAME[7]);
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
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "Metadataflow" elements
     */
    @Override
    public java.util.List<java.lang.String> getMetadataflowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMetadataflowArray,
                this::setMetadataflowArray,
                this::insertMetadataflow,
                this::removeMetadataflow,
                this::sizeOfMetadataflowArray
            );
        }
    }

    /**
     * Gets array of all "Metadataflow" elements
     */
    @Override
    public java.lang.String[] getMetadataflowArray() {
        return getObjectArray(PROPERTY_QNAME[8], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Metadataflow" element
     */
    @Override
    public java.lang.String getMetadataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Metadataflow" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType> xgetMetadataflowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMetadataflowArray,
                this::xsetMetadataflowArray,
                this::insertNewMetadataflow,
                this::removeMetadataflow,
                this::sizeOfMetadataflowArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Metadataflow" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType[] xgetMetadataflowArray() {
        return xgetArray(PROPERTY_QNAME[8], org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType xgetMetadataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[8], i);
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
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets ith "Metadataflow" element
     */
    @Override
    public void setMetadataflowArray(int i, java.lang.String metadataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataflow);
        }
    }

    /**
     * Sets (as xml) array of all "Metadataflow" element
     */
    @Override
    public void xsetMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType[]metadataflowArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(metadataflowArray, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets (as xml) ith "Metadataflow" element
     */
    @Override
    public void xsetMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType metadataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflow);
        }
    }

    /**
     * Inserts the value as the ith "Metadataflow" element
     */
    @Override
    public void insertMetadataflow(int i, java.lang.String metadataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            target.setStringValue(metadataflow);
        }
    }

    /**
     * Appends the value as the last "Metadataflow" element
     */
    @Override
    public void addMetadataflow(java.lang.String metadataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            target.setStringValue(metadataflow);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType insertNewMetadataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType addNewMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType)get_store().add_element_user(PROPERTY_QNAME[8]);
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
            get_store().remove_element(PROPERTY_QNAME[8], i);
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
        return getObjectArray(PROPERTY_QNAME[9], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ProvisionAgreement" element
     */
    @Override
    public java.lang.String getProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], i);
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
        return xgetArray(PROPERTY_QNAME[9], org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "ProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType xgetProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[9], i);
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
            return get_store().count_elements(PROPERTY_QNAME[9]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], i);
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
            arraySetterHelper(provisionAgreementArray, PROPERTY_QNAME[9]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[9], i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[9], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[9]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().insert_element_user(PROPERTY_QNAME[9], i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROPERTY_QNAME[9]);
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
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "MetadataProvisionAgreement" elements
     */
    @Override
    public java.util.List<java.lang.String> getMetadataProvisionAgreementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMetadataProvisionAgreementArray,
                this::setMetadataProvisionAgreementArray,
                this::insertMetadataProvisionAgreement,
                this::removeMetadataProvisionAgreement,
                this::sizeOfMetadataProvisionAgreementArray
            );
        }
    }

    /**
     * Gets array of all "MetadataProvisionAgreement" elements
     */
    @Override
    public java.lang.String[] getMetadataProvisionAgreementArray() {
        return getObjectArray(PROPERTY_QNAME[10], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "MetadataProvisionAgreement" element
     */
    @Override
    public java.lang.String getMetadataProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "MetadataProvisionAgreement" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType> xgetMetadataProvisionAgreementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMetadataProvisionAgreementArray,
                this::xsetMetadataProvisionAgreementArray,
                this::insertNewMetadataProvisionAgreement,
                this::removeMetadataProvisionAgreement,
                this::sizeOfMetadataProvisionAgreementArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MetadataProvisionAgreement" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType[] xgetMetadataProvisionAgreementArray() {
        return xgetArray(PROPERTY_QNAME[10], org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "MetadataProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType xgetMetadataProvisionAgreementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[10], i);
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
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets ith "MetadataProvisionAgreement" element
     */
    @Override
    public void setMetadataProvisionAgreementArray(int i, java.lang.String metadataProvisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataProvisionAgreement);
        }
    }

    /**
     * Sets (as xml) array of all "MetadataProvisionAgreement" element
     */
    @Override
    public void xsetMetadataProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType[]metadataProvisionAgreementArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(metadataProvisionAgreementArray, PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets (as xml) ith "MetadataProvisionAgreement" element
     */
    @Override
    public void xsetMetadataProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType metadataProvisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataProvisionAgreement);
        }
    }

    /**
     * Inserts the value as the ith "MetadataProvisionAgreement" element
     */
    @Override
    public void insertMetadataProvisionAgreement(int i, java.lang.String metadataProvisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            target.setStringValue(metadataProvisionAgreement);
        }
    }

    /**
     * Appends the value as the last "MetadataProvisionAgreement" element
     */
    @Override
    public void addMetadataProvisionAgreement(java.lang.String metadataProvisionAgreement) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[10]);
            target.setStringValue(metadataProvisionAgreement);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType insertNewMetadataProvisionAgreement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataProvisionAgreement" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType addNewMetadataProvisionAgreement() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType)get_store().add_element_user(PROPERTY_QNAME[10]);
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
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }
}
