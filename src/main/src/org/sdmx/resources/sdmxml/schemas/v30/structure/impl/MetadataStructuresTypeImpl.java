/*
 * XML Type:  MetadataStructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataStructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataStructuresTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType {
    private static final long serialVersionUID = 1L;

    public MetadataStructuresTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataStructure"),
    };


    /**
     * Gets a List of "MetadataStructure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType> getMetadataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataStructureArray,
                this::setMetadataStructureArray,
                this::insertNewMetadataStructure,
                this::removeMetadataStructure,
                this::sizeOfMetadataStructureArray
            );
        }
    }

    /**
     * Gets array of all "MetadataStructure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType[] getMetadataStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType[0]);
    }

    /**
     * Gets ith "MetadataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType getMetadataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MetadataStructure" element
     */
    @Override
    public void setMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType metadataStructure) {
        generatedSetterHelperImpl(metadataStructure, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType insertNewMetadataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType addNewMetadataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructureType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
