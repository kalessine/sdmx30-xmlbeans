/*
 * XML Type:  CodelistExtensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodelistExtensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CodelistExtensionType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "codelistextensiontype166atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Codelist" element
     */
    java.lang.String getCodelist();

    /**
     * Gets (as xml) the "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType xgetCodelist();

    /**
     * Sets the "Codelist" element
     */
    void setCodelist(java.lang.String codelist);

    /**
     * Sets (as xml) the "Codelist" element
     */
    void xsetCodelist(org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType codelist);

    /**
     * Gets the "InclusiveCodeSelection" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType getInclusiveCodeSelection();

    /**
     * True if has "InclusiveCodeSelection" element
     */
    boolean isSetInclusiveCodeSelection();

    /**
     * Sets the "InclusiveCodeSelection" element
     */
    void setInclusiveCodeSelection(org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType inclusiveCodeSelection);

    /**
     * Appends and returns a new empty "InclusiveCodeSelection" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType addNewInclusiveCodeSelection();

    /**
     * Unsets the "InclusiveCodeSelection" element
     */
    void unsetInclusiveCodeSelection();

    /**
     * Gets the "ExclusiveCodeSelection" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType getExclusiveCodeSelection();

    /**
     * True if has "ExclusiveCodeSelection" element
     */
    boolean isSetExclusiveCodeSelection();

    /**
     * Sets the "ExclusiveCodeSelection" element
     */
    void setExclusiveCodeSelection(org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType exclusiveCodeSelection);

    /**
     * Appends and returns a new empty "ExclusiveCodeSelection" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType addNewExclusiveCodeSelection();

    /**
     * Unsets the "ExclusiveCodeSelection" element
     */
    void unsetExclusiveCodeSelection();

    /**
     * Gets the "prefix" attribute
     */
    java.lang.String getPrefix();

    /**
     * Gets (as xml) the "prefix" attribute
     */
    org.apache.xmlbeans.XmlString xgetPrefix();

    /**
     * True if has "prefix" attribute
     */
    boolean isSetPrefix();

    /**
     * Sets the "prefix" attribute
     */
    void setPrefix(java.lang.String prefix);

    /**
     * Sets (as xml) the "prefix" attribute
     */
    void xsetPrefix(org.apache.xmlbeans.XmlString prefix);

    /**
     * Unsets the "prefix" attribute
     */
    void unsetPrefix();
}
