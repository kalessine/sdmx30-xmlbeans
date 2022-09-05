/*
 * XML Type:  VtlDefinitionSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VtlDefinitionSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface VtlDefinitionSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "vtldefinitionschemetype829ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "vtlVersion" attribute
     */
    java.lang.String getVtlVersion();

    /**
     * Gets (as xml) the "vtlVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetVtlVersion();

    /**
     * Sets the "vtlVersion" attribute
     */
    void setVtlVersion(java.lang.String vtlVersion);

    /**
     * Sets (as xml) the "vtlVersion" attribute
     */
    void xsetVtlVersion(org.apache.xmlbeans.XmlString vtlVersion);
}
