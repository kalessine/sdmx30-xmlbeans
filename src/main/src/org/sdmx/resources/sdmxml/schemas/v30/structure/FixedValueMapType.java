/*
 * XML Type:  FixedValueMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FixedValueMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface FixedValueMapType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.FixedValueMapType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "fixedvaluemaptype9b35type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Source" element
     */
    java.lang.String getSource();

    /**
     * Gets (as xml) the "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSource();

    /**
     * True if has "Source" element
     */
    boolean isSetSource();

    /**
     * Sets the "Source" element
     */
    void setSource(java.lang.String source);

    /**
     * Sets (as xml) the "Source" element
     */
    void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.IDType source);

    /**
     * Unsets the "Source" element
     */
    void unsetSource();

    /**
     * Gets the "Target" element
     */
    java.lang.String getTarget();

    /**
     * Gets (as xml) the "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTarget();

    /**
     * True if has "Target" element
     */
    boolean isSetTarget();

    /**
     * Sets the "Target" element
     */
    void setTarget(java.lang.String target);

    /**
     * Sets (as xml) the "Target" element
     */
    void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.IDType target);

    /**
     * Unsets the "Target" element
     */
    void unsetTarget();

    /**
     * Gets a List of "Value" elements
     */
    java.util.List<java.lang.String> getValueList();

    /**
     * Gets array of all "Value" elements
     */
    java.lang.String[] getValueArray();

    /**
     * Gets ith "Value" element
     */
    java.lang.String getValueArray(int i);

    /**
     * Gets (as xml) a List of "Value" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetValueList();

    /**
     * Gets (as xml) array of all "Value" elements
     */
    org.apache.xmlbeans.XmlString[] xgetValueArray();

    /**
     * Gets (as xml) ith "Value" element
     */
    org.apache.xmlbeans.XmlString xgetValueArray(int i);

    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();

    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, java.lang.String value);

    /**
     * Sets (as xml) array of all "Value" element
     */
    void xsetValueArray(org.apache.xmlbeans.XmlString[] valueArray);

    /**
     * Sets (as xml) ith "Value" element
     */
    void xsetValueArray(int i, org.apache.xmlbeans.XmlString value);

    /**
     * Inserts the value as the ith "Value" element
     */
    void insertValue(int i, java.lang.String value);

    /**
     * Appends the value as the last "Value" element
     */
    void addValue(java.lang.String value);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.apache.xmlbeans.XmlString insertNewValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.apache.xmlbeans.XmlString addNewValue();

    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);
}
