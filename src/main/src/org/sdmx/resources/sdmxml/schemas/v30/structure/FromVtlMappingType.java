/*
 * XML Type:  FromVtlMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FromVtlMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface FromVtlMappingType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "fromvtlmappingtype0af2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "FromVtlSuperSpace" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType getFromVtlSuperSpace();

    /**
     * True if has "FromVtlSuperSpace" element
     */
    boolean isSetFromVtlSuperSpace();

    /**
     * Sets the "FromVtlSuperSpace" element
     */
    void setFromVtlSuperSpace(org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType fromVtlSuperSpace);

    /**
     * Appends and returns a new empty "FromVtlSuperSpace" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType addNewFromVtlSuperSpace();

    /**
     * Unsets the "FromVtlSuperSpace" element
     */
    void unsetFromVtlSuperSpace();

    /**
     * Gets the "method" attribute
     */
    java.lang.String getMethod();

    /**
     * Gets (as xml) the "method" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType xgetMethod();

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
    void xsetMethod(org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingMethodType method);

    /**
     * Unsets the "method" attribute
     */
    void unsetMethod();
}
