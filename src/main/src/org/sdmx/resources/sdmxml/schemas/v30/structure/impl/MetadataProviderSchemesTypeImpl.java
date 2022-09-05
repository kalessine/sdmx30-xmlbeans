/*
 * XML Type:  MetadataProviderSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataProviderSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataProviderSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType {
    private static final long serialVersionUID = 1L;

    public MetadataProviderSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProviderScheme"),
    };


    /**
     * Gets a List of "MetadataProviderScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType> getMetadataProviderSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataProviderSchemeArray,
                this::setMetadataProviderSchemeArray,
                this::insertNewMetadataProviderScheme,
                this::removeMetadataProviderScheme,
                this::sizeOfMetadataProviderSchemeArray
            );
        }
    }

    /**
     * Gets array of all "MetadataProviderScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType[] getMetadataProviderSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType[0]);
    }

    /**
     * Gets ith "MetadataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType getMetadataProviderSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataProviderScheme" element
     */
    @Override
    public int sizeOfMetadataProviderSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MetadataProviderScheme" element
     */
    @Override
    public void setMetadataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType metadataProviderScheme) {
        generatedSetterHelperImpl(metadataProviderScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType insertNewMetadataProviderScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataProviderScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType addNewMetadataProviderScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataProviderScheme" element
     */
    @Override
    public void removeMetadataProviderScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
