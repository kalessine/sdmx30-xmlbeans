/*
 * XML Type:  MetadataflowsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataflowsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataflowsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType {
    private static final long serialVersionUID = 1L;

    public MetadataflowsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Metadataflow"),
    };


    /**
     * Gets a List of "Metadataflow" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType> getMetadataflowList() {
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
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType[] getMetadataflowArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType[0]);
    }

    /**
     * Gets ith "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType getMetadataflowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Metadataflow" element
     */
    @Override
    public void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType metadataflow) {
        generatedSetterHelperImpl(metadataflow, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType insertNewMetadataflow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType addNewMetadataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
