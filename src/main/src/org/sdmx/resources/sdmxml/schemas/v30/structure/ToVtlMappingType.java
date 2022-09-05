/*
 * XML Type:  ToVtlMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ToVtlMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ToVtlMappingType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "tovtlmappingtype86c3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ToVtlSubSpace" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType getToVtlSubSpace();

    /**
     * True if has "ToVtlSubSpace" element
     */
    boolean isSetToVtlSubSpace();

    /**
     * Sets the "ToVtlSubSpace" element
     */
    void setToVtlSubSpace(org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType toVtlSubSpace);

    /**
     * Appends and returns a new empty "ToVtlSubSpace" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType addNewToVtlSubSpace();

    /**
     * Unsets the "ToVtlSubSpace" element
     */
    void unsetToVtlSubSpace();

    /**
     * Gets the "method" attribute
     */
    java.lang.String getMethod();

    /**
     * Gets (as xml) the "method" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingMethodType xgetMethod();

    /**
     * True if has "method" attribute
     */
    boolean isSetMethod();

    /**
     * Sets the "method" attribute
     */
    void setMethod(java.lang.String method);

    /**
     * Sets (as xml) the "method" attribute
     */
    void xsetMethod(org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingMethodType method);

    /**
     * Unsets the "method" attribute
     */
    void unsetMethod();
}
