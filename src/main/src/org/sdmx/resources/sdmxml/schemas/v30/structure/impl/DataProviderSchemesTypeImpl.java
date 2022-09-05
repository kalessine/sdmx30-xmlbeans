/*
 * XML Type:  DataProviderSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataProviderSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataProviderSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType {
    private static final long serialVersionUID = 1L;

    public DataProviderSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataProviderScheme"),
    };


    /**
     * Gets a List of "DataProviderScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType> getDataProviderSchemeList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType[] getDataProviderSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType[0]);
    }

    /**
     * Gets ith "DataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType getDataProviderSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "DataProviderScheme" element
     */
    @Override
    public void setDataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType dataProviderScheme) {
        generatedSetterHelperImpl(dataProviderScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType insertNewDataProviderScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType addNewDataProviderScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
