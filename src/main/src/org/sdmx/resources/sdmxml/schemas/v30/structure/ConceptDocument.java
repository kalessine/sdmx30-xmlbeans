/*
 * An XML document type.
 * Localname: Concept
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Concept(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface ConceptDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "conceptc834doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Concept" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType getConcept();

    /**
     * Sets the "Concept" element
     */
    void setConcept(org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType concept);

    /**
     * Appends and returns a new empty "Concept" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType addNewConcept();
}
