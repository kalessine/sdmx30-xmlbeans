/*
 * XML Type:  ConceptSchemeMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptSchemeMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ConceptSchemeMapsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "conceptschememapstypee85atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ConceptSchemeMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType> getConceptSchemeMapList();

    /**
     * Gets array of all "ConceptSchemeMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType[] getConceptSchemeMapArray();

    /**
     * Gets ith "ConceptSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType getConceptSchemeMapArray(int i);

    /**
     * Returns number of "ConceptSchemeMap" element
     */
    int sizeOfConceptSchemeMapArray();

    /**
     * Sets ith "ConceptSchemeMap" element
     */
    void setConceptSchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType conceptSchemeMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType insertNewConceptSchemeMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType addNewConceptSchemeMap();

    /**
     * Removes the ith "ConceptSchemeMap" element
     */
    void removeConceptSchemeMap(int i);
}
