/*
 * XML Type:  GenericMetadataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GenericMetadataType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class GenericMetadataTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType {
    private static final long serialVersionUID = 1L;

    public GenericMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "MetadataSet"),
    };


    /**
     * Gets a List of "MetadataSet" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType> getMetadataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataSetArray,
                this::setMetadataSetArray,
                this::insertNewMetadataSet,
                this::removeMetadataSet,
                this::sizeOfMetadataSetArray
            );
        }
    }

    /**
     * Gets array of all "MetadataSet" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType[] getMetadataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType[0]);
    }

    /**
     * Gets ith "MetadataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType getMetadataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MetadataSet" element
     */
    @Override
    public void setMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType metadataSet) {
        generatedSetterHelperImpl(metadataSet, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType insertNewMetadataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType addNewMetadataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
