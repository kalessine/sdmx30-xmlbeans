/*
 * XML Type:  CustomTypeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CustomTypeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CustomTypeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "customtypetypec6f3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VtlScalarType" element
     */
    java.lang.String getVtlScalarType();

    /**
     * Gets (as xml) the "VtlScalarType" element
     */
    org.apache.xmlbeans.XmlString xgetVtlScalarType();

    /**
     * Sets the "VtlScalarType" element
     */
    void setVtlScalarType(java.lang.String vtlScalarType);

    /**
     * Sets (as xml) the "VtlScalarType" element
     */
    void xsetVtlScalarType(org.apache.xmlbeans.XmlString vtlScalarType);

    /**
     * Gets the "DataType" element
     */
    java.lang.String getDataType();

    /**
     * Gets (as xml) the "DataType" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType xgetDataType();

    /**
     * Sets the "DataType" element
     */
    void setDataType(java.lang.String dataType);

    /**
     * Sets (as xml) the "DataType" element
     */
    void xsetDataType(org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType dataType);

    /**
     * Gets the "VtlLiteralFormat" element
     */
    java.lang.String getVtlLiteralFormat();

    /**
     * Gets (as xml) the "VtlLiteralFormat" element
     */
    org.apache.xmlbeans.XmlString xgetVtlLiteralFormat();

    /**
     * True if has "VtlLiteralFormat" element
     */
    boolean isSetVtlLiteralFormat();

    /**
     * Sets the "VtlLiteralFormat" element
     */
    void setVtlLiteralFormat(java.lang.String vtlLiteralFormat);

    /**
     * Sets (as xml) the "VtlLiteralFormat" element
     */
    void xsetVtlLiteralFormat(org.apache.xmlbeans.XmlString vtlLiteralFormat);

    /**
     * Unsets the "VtlLiteralFormat" element
     */
    void unsetVtlLiteralFormat();

    /**
     * Gets the "OutputFormat" element
     */
    java.lang.String getOutputFormat();

    /**
     * Gets (as xml) the "OutputFormat" element
     */
    org.apache.xmlbeans.XmlString xgetOutputFormat();

    /**
     * True if has "OutputFormat" element
     */
    boolean isSetOutputFormat();

    /**
     * Sets the "OutputFormat" element
     */
    void setOutputFormat(java.lang.String outputFormat);

    /**
     * Sets (as xml) the "OutputFormat" element
     */
    void xsetOutputFormat(org.apache.xmlbeans.XmlString outputFormat);

    /**
     * Unsets the "OutputFormat" element
     */
    void unsetOutputFormat();

    /**
     * Gets the "NullValue" element
     */
    java.lang.String getNullValue();

    /**
     * Gets (as xml) the "NullValue" element
     */
    org.apache.xmlbeans.XmlString xgetNullValue();

    /**
     * True if has "NullValue" element
     */
    boolean isSetNullValue();

    /**
     * Sets the "NullValue" element
     */
    void setNullValue(java.lang.String nullValue);

    /**
     * Sets (as xml) the "NullValue" element
     */
    void xsetNullValue(org.apache.xmlbeans.XmlString nullValue);

    /**
     * Unsets the "NullValue" element
     */
    void unsetNullValue();
}
