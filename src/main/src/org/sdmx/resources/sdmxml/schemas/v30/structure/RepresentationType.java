/*
 * XML Type:  RepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RepresentationType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "representationtyped4f5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType getTextFormat();

    /**
     * True if has "TextFormat" element
     */
    boolean isSetTextFormat();

    /**
     * Sets the "TextFormat" element
     */
    void setTextFormat(org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType textFormat);

    /**
     * Appends and returns a new empty "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.TextFormatType addNewTextFormat();

    /**
     * Unsets the "TextFormat" element
     */
    void unsetTextFormat();

    /**
     * Gets the "Enumeration" element
     */
    java.lang.String getEnumeration();

    /**
     * Gets (as xml) the "Enumeration" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType xgetEnumeration();

    /**
     * True if has "Enumeration" element
     */
    boolean isSetEnumeration();

    /**
     * Sets the "Enumeration" element
     */
    void setEnumeration(java.lang.String enumeration);

    /**
     * Sets (as xml) the "Enumeration" element
     */
    void xsetEnumeration(org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType enumeration);

    /**
     * Unsets the "Enumeration" element
     */
    void unsetEnumeration();

    /**
     * Gets the "EnumerationFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType getEnumerationFormat();

    /**
     * True if has "EnumerationFormat" element
     */
    boolean isSetEnumerationFormat();

    /**
     * Sets the "EnumerationFormat" element
     */
    void setEnumerationFormat(org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType enumerationFormat);

    /**
     * Appends and returns a new empty "EnumerationFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CodedTextFormatType addNewEnumerationFormat();

    /**
     * Unsets the "EnumerationFormat" element
     */
    void unsetEnumerationFormat();

    /**
     * Gets the "minOccurs" attribute
     */
    java.math.BigInteger getMinOccurs();

    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs();

    /**
     * True if has "minOccurs" attribute
     */
    boolean isSetMinOccurs();

    /**
     * Sets the "minOccurs" attribute
     */
    void setMinOccurs(java.math.BigInteger minOccurs);

    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs);

    /**
     * Unsets the "minOccurs" attribute
     */
    void unsetMinOccurs();

    /**
     * Gets the "maxOccurs" attribute
     */
    java.lang.Object getMaxOccurs();

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType xgetMaxOccurs();

    /**
     * True if has "maxOccurs" attribute
     */
    boolean isSetMaxOccurs();

    /**
     * Sets the "maxOccurs" attribute
     */
    void setMaxOccurs(java.lang.Object maxOccurs);

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    void xsetMaxOccurs(org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType maxOccurs);

    /**
     * Unsets the "maxOccurs" attribute
     */
    void unsetMaxOccurs();
}
