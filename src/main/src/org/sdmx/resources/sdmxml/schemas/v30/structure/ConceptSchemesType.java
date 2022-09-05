/*
 * XML Type:  ConceptSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ConceptSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "conceptschemestypecc0etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ConceptScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType> getConceptSchemeList();

    /**
     * Gets array of all "ConceptScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType[] getConceptSchemeArray();

    /**
     * Gets ith "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType getConceptSchemeArray(int i);

    /**
     * Returns number of "ConceptScheme" element
     */
    int sizeOfConceptSchemeArray();

    /**
     * Sets ith "ConceptScheme" element
     */
    void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType conceptScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType insertNewConceptScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType addNewConceptScheme();

    /**
     * Removes the ith "ConceptScheme" element
     */
    void removeConceptScheme(int i);
}
