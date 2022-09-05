/*
 * XML Type:  EventSelectorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML EventSelectorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class EventSelectorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType {
    private static final long serialVersionUID = 1L;

    public EventSelectorTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StructuralRepositoryEvents"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "DataRegistrationEvents"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "MetadataRegistrationEvents"),
    };


    /**
     * Gets a List of "StructuralRepositoryEvents" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType> getStructuralRepositoryEventsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStructuralRepositoryEventsArray,
                this::setStructuralRepositoryEventsArray,
                this::insertNewStructuralRepositoryEvents,
                this::removeStructuralRepositoryEvents,
                this::sizeOfStructuralRepositoryEventsArray
            );
        }
    }

    /**
     * Gets array of all "StructuralRepositoryEvents" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType[] getStructuralRepositoryEventsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType[0]);
    }

    /**
     * Gets ith "StructuralRepositoryEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType getStructuralRepositoryEventsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StructuralRepositoryEvents" element
     */
    @Override
    public int sizeOfStructuralRepositoryEventsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "StructuralRepositoryEvents" element
     */
    @Override
    public void setStructuralRepositoryEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType structuralRepositoryEvents) {
        generatedSetterHelperImpl(structuralRepositoryEvents, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralRepositoryEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType insertNewStructuralRepositoryEvents(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralRepositoryEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType addNewStructuralRepositoryEvents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "StructuralRepositoryEvents" element
     */
    @Override
    public void removeStructuralRepositoryEvents(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "DataRegistrationEvents" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType> getDataRegistrationEventsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataRegistrationEventsArray,
                this::setDataRegistrationEventsArray,
                this::insertNewDataRegistrationEvents,
                this::removeDataRegistrationEvents,
                this::sizeOfDataRegistrationEventsArray
            );
        }
    }

    /**
     * Gets array of all "DataRegistrationEvents" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType[] getDataRegistrationEventsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType[0]);
    }

    /**
     * Gets ith "DataRegistrationEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType getDataRegistrationEventsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataRegistrationEvents" element
     */
    @Override
    public int sizeOfDataRegistrationEventsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "DataRegistrationEvents" element
     */
    @Override
    public void setDataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType dataRegistrationEvents) {
        generatedSetterHelperImpl(dataRegistrationEvents, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataRegistrationEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType insertNewDataRegistrationEvents(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataRegistrationEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType addNewDataRegistrationEvents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "DataRegistrationEvents" element
     */
    @Override
    public void removeDataRegistrationEvents(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "MetadataRegistrationEvents" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType> getMetadataRegistrationEventsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataRegistrationEventsArray,
                this::setMetadataRegistrationEventsArray,
                this::insertNewMetadataRegistrationEvents,
                this::removeMetadataRegistrationEvents,
                this::sizeOfMetadataRegistrationEventsArray
            );
        }
    }

    /**
     * Gets array of all "MetadataRegistrationEvents" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType[] getMetadataRegistrationEventsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType[0]);
    }

    /**
     * Gets ith "MetadataRegistrationEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType getMetadataRegistrationEventsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataRegistrationEvents" element
     */
    @Override
    public int sizeOfMetadataRegistrationEventsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "MetadataRegistrationEvents" element
     */
    @Override
    public void setMetadataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType metadataRegistrationEvents) {
        generatedSetterHelperImpl(metadataRegistrationEvents, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataRegistrationEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType insertNewMetadataRegistrationEvents(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataRegistrationEvents" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType addNewMetadataRegistrationEvents() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataRegistrationEvents" element
     */
    @Override
    public void removeMetadataRegistrationEvents(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }
}
