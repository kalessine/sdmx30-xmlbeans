/*
 * XML Type:  CompType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CompType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific).
 *
 * This is a complex type.
 */
public interface CompType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "comptypeb1fctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Value" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ValueType> getValueList();

    /**
     * Gets array of all "Value" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ValueType[] getValueArray();

    /**
     * Gets ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ValueType getValueArray(int i);

    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();

    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ValueType value);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ValueType insertNewValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ValueType addNewValue();

    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType id);
}
