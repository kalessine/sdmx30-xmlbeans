/*
 * XML Type:  EventSelectorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML EventSelectorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface EventSelectorType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.EventSelectorType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "eventselectortypef021type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "StructuralRepositoryEvents" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType> getStructuralRepositoryEventsList();

    /**
     * Gets array of all "StructuralRepositoryEvents" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType[] getStructuralRepositoryEventsArray();

    /**
     * Gets ith "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType getStructuralRepositoryEventsArray(int i);

    /**
     * Returns number of "StructuralRepositoryEvents" element
     */
    int sizeOfStructuralRepositoryEventsArray();

    /**
     * Sets ith "StructuralRepositoryEvents" element
     */
    void setStructuralRepositoryEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType structuralRepositoryEvents);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType insertNewStructuralRepositoryEvents(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType addNewStructuralRepositoryEvents();

    /**
     * Removes the ith "StructuralRepositoryEvents" element
     */
    void removeStructuralRepositoryEvents(int i);

    /**
     * Gets a List of "DataRegistrationEvents" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType> getDataRegistrationEventsList();

    /**
     * Gets array of all "DataRegistrationEvents" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType[] getDataRegistrationEventsArray();

    /**
     * Gets ith "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType getDataRegistrationEventsArray(int i);

    /**
     * Returns number of "DataRegistrationEvents" element
     */
    int sizeOfDataRegistrationEventsArray();

    /**
     * Sets ith "DataRegistrationEvents" element
     */
    void setDataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType dataRegistrationEvents);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType insertNewDataRegistrationEvents(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.DataRegistrationEventsType addNewDataRegistrationEvents();

    /**
     * Removes the ith "DataRegistrationEvents" element
     */
    void removeDataRegistrationEvents(int i);

    /**
     * Gets a List of "MetadataRegistrationEvents" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType> getMetadataRegistrationEventsList();

    /**
     * Gets array of all "MetadataRegistrationEvents" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType[] getMetadataRegistrationEventsArray();

    /**
     * Gets ith "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType getMetadataRegistrationEventsArray(int i);

    /**
     * Returns number of "MetadataRegistrationEvents" element
     */
    int sizeOfMetadataRegistrationEventsArray();

    /**
     * Sets ith "MetadataRegistrationEvents" element
     */
    void setMetadataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType metadataRegistrationEvents);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType insertNewMetadataRegistrationEvents(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.MetadataRegistrationEventsType addNewMetadataRegistrationEvents();

    /**
     * Removes the ith "MetadataRegistrationEvents" element
     */
    void removeMetadataRegistrationEvents(int i);
}
