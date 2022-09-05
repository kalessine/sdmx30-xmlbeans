/*
 * XML Type:  ISOConceptReferenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ISOConceptReferenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ISOConceptReferenceType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "isoconceptreferencetype7c9etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptAgency" element
     */
    java.lang.String getConceptAgency();

    /**
     * Gets (as xml) the "ConceptAgency" element
     */
    org.apache.xmlbeans.XmlString xgetConceptAgency();

    /**
     * Sets the "ConceptAgency" element
     */
    void setConceptAgency(java.lang.String conceptAgency);

    /**
     * Sets (as xml) the "ConceptAgency" element
     */
    void xsetConceptAgency(org.apache.xmlbeans.XmlString conceptAgency);

    /**
     * Gets the "ConceptSchemeID" element
     */
    java.lang.String getConceptSchemeID();

    /**
     * Gets (as xml) the "ConceptSchemeID" element
     */
    org.apache.xmlbeans.XmlString xgetConceptSchemeID();

    /**
     * Sets the "ConceptSchemeID" element
     */
    void setConceptSchemeID(java.lang.String conceptSchemeID);

    /**
     * Sets (as xml) the "ConceptSchemeID" element
     */
    void xsetConceptSchemeID(org.apache.xmlbeans.XmlString conceptSchemeID);

    /**
     * Gets the "ConceptID" element
     */
    java.lang.String getConceptID();

    /**
     * Gets (as xml) the "ConceptID" element
     */
    org.apache.xmlbeans.XmlString xgetConceptID();

    /**
     * Sets the "ConceptID" element
     */
    void setConceptID(java.lang.String conceptID);

    /**
     * Sets (as xml) the "ConceptID" element
     */
    void xsetConceptID(org.apache.xmlbeans.XmlString conceptID);
}
