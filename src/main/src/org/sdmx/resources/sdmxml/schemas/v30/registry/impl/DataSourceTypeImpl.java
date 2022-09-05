/*
 * XML Type:  DataSourceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.DataSourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataSourceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class DataSourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.DataSourceType {
    private static final long serialVersionUID = 1L;

    public DataSourceTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SimpleDataSource"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "QueryableDataSource"),
    };


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
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "SimpleDataSource" element
     */
    @Override
    public java.lang.String getSimpleDataSourceArray(int i) {
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
        return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlAnyURI[]::new);
    }

    /**
     * Gets (as xml) ith "SimpleDataSource" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetSimpleDataSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            arraySetterHelper(simpleDataSourceArray, PROPERTY_QNAME[0]);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(PROPERTY_QNAME[0], i);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "QueryableDataSource" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType> getQueryableDataSourceList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType[] getQueryableDataSourceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType[0]);
    }

    /**
     * Gets ith "QueryableDataSource" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType getQueryableDataSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
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
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "QueryableDataSource" element
     */
    @Override
    public void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType queryableDataSource) {
        generatedSetterHelperImpl(queryableDataSource, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryableDataSource" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType insertNewQueryableDataSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType addNewQueryableDataSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.QueryableDataSourceType)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
