/*
 * XML Type:  ConceptType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ConceptType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "concepttypef91etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CoreRepresentation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation getCoreRepresentation();

    /**
     * True if has "CoreRepresentation" element
     */
    boolean isSetCoreRepresentation();

    /**
     * Sets the "CoreRepresentation" element
     */
    void setCoreRepresentation(org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation coreRepresentation);

    /**
     * Appends and returns a new empty "CoreRepresentation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation addNewCoreRepresentation();

    /**
     * Unsets the "CoreRepresentation" element
     */
    void unsetCoreRepresentation();

    /**
     * Gets the "ISOConceptReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType getISOConceptReference();

    /**
     * True if has "ISOConceptReference" element
     */
    boolean isSetISOConceptReference();

    /**
     * Sets the "ISOConceptReference" element
     */
    void setISOConceptReference(org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType isoConceptReference);

    /**
     * Appends and returns a new empty "ISOConceptReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType addNewISOConceptReference();

    /**
     * Unsets the "ISOConceptReference" element
     */
    void unsetISOConceptReference();
}
