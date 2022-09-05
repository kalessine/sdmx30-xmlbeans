/*
 * XML Type:  DataConsumerSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataConsumerSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataConsumerSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType {
    private static final long serialVersionUID = 1L;

    public DataConsumerSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConsumerScheme"),
    };


    /**
     * Gets a List of "DataConsumerScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType> getDataConsumerSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataConsumerSchemeArray,
                this::setDataConsumerSchemeArray,
                this::insertNewDataConsumerScheme,
                this::removeDataConsumerScheme,
                this::sizeOfDataConsumerSchemeArray
            );
        }
    }

    /**
     * Gets array of all "DataConsumerScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType[] getDataConsumerSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType[0]);
    }

    /**
     * Gets ith "DataConsumerScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType getDataConsumerSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataConsumerScheme" element
     */
    @Override
    public int sizeOfDataConsumerSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "DataConsumerScheme" element
     */
    @Override
    public void setDataConsumerSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType dataConsumerScheme) {
        generatedSetterHelperImpl(dataConsumerScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsumerScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType insertNewDataConsumerScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsumerScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType addNewDataConsumerScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataConsumerScheme" element
     */
    @Override
    public void removeDataConsumerScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
