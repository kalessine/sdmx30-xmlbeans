/*
 * XML Type:  RulesetSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RulesetSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RulesetSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "rulesetschemetype5aa1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VtlMappingScheme" element
     */
    java.lang.String getVtlMappingScheme();

    /**
     * Gets (as xml) the "VtlMappingScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType xgetVtlMappingScheme();

    /**
     * True if has "VtlMappingScheme" element
     */
    boolean isSetVtlMappingScheme();

    /**
     * Sets the "VtlMappingScheme" element
     */
    void setVtlMappingScheme(java.lang.String vtlMappingScheme);

    /**
     * Sets (as xml) the "VtlMappingScheme" element
     */
    void xsetVtlMappingScheme(org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType vtlMappingScheme);

    /**
     * Unsets the "VtlMappingScheme" element
     */
    void unsetVtlMappingScheme();
}
