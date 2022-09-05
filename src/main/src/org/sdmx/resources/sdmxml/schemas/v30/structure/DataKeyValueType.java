/*
 * XML Type:  DataKeyValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataKeyValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataKeyValueType extends org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyValueType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datakeyvaluetyped284type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Value" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType> getValueList();

    /**
     * Gets array of all "Value" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType[] getValueArray();

    /**
     * Gets ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType getValueArray(int i);

    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();

    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType value);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType insertNewValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleComponentValueType addNewValue();

    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);
}
