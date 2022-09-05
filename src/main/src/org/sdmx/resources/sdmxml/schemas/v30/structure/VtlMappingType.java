/*
 * XML Type:  VtlMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VtlMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface VtlMappingType extends org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "vtlmappingtype4028type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Dataflow" element
     */
    java.lang.String getDataflow();

    /**
     * Gets (as xml) the "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType xgetDataflow();

    /**
     * True if has "Dataflow" element
     */
    boolean isSetDataflow();

    /**
     * Sets the "Dataflow" element
     */
    void setDataflow(java.lang.String dataflow);

    /**
     * Sets (as xml) the "Dataflow" element
     */
    void xsetDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType dataflow);

    /**
     * Unsets the "Dataflow" element
     */
    void unsetDataflow();

    /**
     * Gets the "GenericDataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getGenericDataflow();

    /**
     * True if has "GenericDataflow" element
     */
    boolean isSetGenericDataflow();

    /**
     * Sets the "GenericDataflow" element
     */
    void setGenericDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType genericDataflow);

    /**
     * Appends and returns a new empty "GenericDataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewGenericDataflow();

    /**
     * Unsets the "GenericDataflow" element
     */
    void unsetGenericDataflow();

    /**
     * Gets the "ToVtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType getToVtlMapping();

    /**
     * True if has "ToVtlMapping" element
     */
    boolean isSetToVtlMapping();

    /**
     * Sets the "ToVtlMapping" element
     */
    void setToVtlMapping(org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType toVtlMapping);

    /**
     * Appends and returns a new empty "ToVtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType addNewToVtlMapping();

    /**
     * Unsets the "ToVtlMapping" element
     */
    void unsetToVtlMapping();

    /**
     * Gets the "FromVtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType getFromVtlMapping();

    /**
     * True if has "FromVtlMapping" element
     */
    boolean isSetFromVtlMapping();

    /**
     * Sets the "FromVtlMapping" element
     */
    void setFromVtlMapping(org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType fromVtlMapping);

    /**
     * Appends and returns a new empty "FromVtlMapping" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType addNewFromVtlMapping();

    /**
     * Unsets the "FromVtlMapping" element
     */
    void unsetFromVtlMapping();

    /**
     * Gets the "Codelist" element
     */
    java.lang.String getCodelist();

    /**
     * Gets (as xml) the "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType xgetCodelist();

    /**
     * True if has "Codelist" element
     */
    boolean isSetCodelist();

    /**
     * Sets the "Codelist" element
     */
    void setCodelist(java.lang.String codelist);

    /**
     * Sets (as xml) the "Codelist" element
     */
    void xsetCodelist(org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType codelist);

    /**
     * Unsets the "Codelist" element
     */
    void unsetCodelist();

    /**
     * Gets the "Concept" element
     */
    java.lang.String getConcept();

    /**
     * Gets (as xml) the "Concept" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType xgetConcept();

    /**
     * True if has "Concept" element
     */
    boolean isSetConcept();

    /**
     * Sets the "Concept" element
     */
    void setConcept(java.lang.String concept);

    /**
     * Sets (as xml) the "Concept" element
     */
    void xsetConcept(org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType concept);

    /**
     * Unsets the "Concept" element
     */
    void unsetConcept();

    /**
     * Gets the "alias" attribute
     */
    java.lang.String getAlias();

    /**
     * Gets (as xml) the "alias" attribute
     */
    org.apache.xmlbeans.XmlString xgetAlias();

    /**
     * Sets the "alias" attribute
     */
    void setAlias(java.lang.String alias);

    /**
     * Sets (as xml) the "alias" attribute
     */
    void xsetAlias(org.apache.xmlbeans.XmlString alias);
}
