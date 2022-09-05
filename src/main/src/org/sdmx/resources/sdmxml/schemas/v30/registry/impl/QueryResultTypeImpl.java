/*
 * XML Type:  QueryResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML QueryResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class QueryResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.QueryResultType {
    private static final long serialVersionUID = 1L;

    public QueryResultTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "DataResult"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MetadataResult"),
        new QName("", "timeSeriesMatch"),
    };


    /**
     * Gets the "DataResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType getDataResult() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DataResult" element
     */
    @Override
    public boolean isSetDataResult() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "DataResult" element
     */
    @Override
    public void setDataResult(org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType dataResult) {
        generatedSetterHelperImpl(dataResult, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType addNewDataResult() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "DataResult" element
     */
    @Override
    public void unsetDataResult() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "MetadataResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType getMetadataResult() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MetadataResult" element
     */
    @Override
    public boolean isSetMetadataResult() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "MetadataResult" element
     */
    @Override
    public void setMetadataResult(org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType metadataResult) {
        generatedSetterHelperImpl(metadataResult, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataResult" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType addNewMetadataResult() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "MetadataResult" element
     */
    @Override
    public void unsetMetadataResult() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "timeSeriesMatch" attribute
     */
    @Override
    public boolean getTimeSeriesMatch() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "timeSeriesMatch" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetTimeSeriesMatch() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "timeSeriesMatch" attribute
     */
    @Override
    public void setTimeSeriesMatch(boolean timeSeriesMatch) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(timeSeriesMatch);
        }
    }

    /**
     * Sets (as xml) the "timeSeriesMatch" attribute
     */
    @Override
    public void xsetTimeSeriesMatch(org.apache.xmlbeans.XmlBoolean timeSeriesMatch) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(timeSeriesMatch);
        }
    }
}
