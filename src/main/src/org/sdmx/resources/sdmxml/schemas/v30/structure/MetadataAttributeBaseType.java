/*
 * XML Type:  MetadataAttributeBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataAttributeBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataAttributeBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributebasetype3b14type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptIdentity" element
     */
    java.lang.String getConceptIdentity();

    /**
     * Gets (as xml) the "ConceptIdentity" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType xgetConceptIdentity();

    /**
     * True if has "ConceptIdentity" element
     */
    boolean isSetConceptIdentity();

    /**
     * Sets the "ConceptIdentity" element
     */
    void setConceptIdentity(java.lang.String conceptIdentity);

    /**
     * Sets (as xml) the "ConceptIdentity" element
     */
    void xsetConceptIdentity(org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType conceptIdentity);

    /**
     * Unsets the "ConceptIdentity" element
     */
    void unsetConceptIdentity();
}
