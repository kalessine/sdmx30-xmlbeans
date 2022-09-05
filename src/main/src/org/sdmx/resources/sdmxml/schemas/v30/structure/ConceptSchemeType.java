/*
 * XML Type:  ConceptSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ConceptSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "conceptschemetype67a3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Concept" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType> getConceptList();

    /**
     * Gets array of all "Concept" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType[] getConceptArray();

    /**
     * Gets ith "Concept" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType getConceptArray(int i);

    /**
     * Returns number of "Concept" element
     */
    int sizeOfConceptArray();

    /**
     * Sets ith "Concept" element
     */
    void setConceptArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType concept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType insertNewConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType addNewConcept();

    /**
     * Removes the ith "Concept" element
     */
    void removeConcept(int i);
}
