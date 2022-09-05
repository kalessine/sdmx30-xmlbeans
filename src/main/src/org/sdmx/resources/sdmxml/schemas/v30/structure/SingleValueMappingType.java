/*
 * XML Type:  SingleValueMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SingleValueMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface SingleValueMappingType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.SingleValueMappingType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "singlevaluemappingtypeaa2dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SourceValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType getSourceValue();

    /**
     * Sets the "SourceValue" element
     */
    void setSourceValue(org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType sourceValue);

    /**
     * Appends and returns a new empty "SourceValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType addNewSourceValue();

    /**
     * Gets the "TargetValue" element
     */
    java.lang.String getTargetValue();

    /**
     * Gets (as xml) the "TargetValue" element
     */
    org.apache.xmlbeans.XmlString xgetTargetValue();

    /**
     * True if has "TargetValue" element
     */
    boolean isSetTargetValue();

    /**
     * Sets the "TargetValue" element
     */
    void setTargetValue(java.lang.String targetValue);

    /**
     * Sets (as xml) the "TargetValue" element
     */
    void xsetTargetValue(org.apache.xmlbeans.XmlString targetValue);

    /**
     * Unsets the "TargetValue" element
     */
    void unsetTargetValue();

    /**
     * Gets the "validFrom" attribute
     */
    java.util.Calendar getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.apache.xmlbeans.XmlDate xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.util.Calendar validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.apache.xmlbeans.XmlDate validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.util.Calendar getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.apache.xmlbeans.XmlDate xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.util.Calendar validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.apache.xmlbeans.XmlDate validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
