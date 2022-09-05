/*
 * XML Type:  DataKeySetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataKeySetType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataKeySetType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "datakeysettype5275type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Key" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType> getKeyList();

    /**
     * Gets array of all "Key" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType[] getKeyArray();

    /**
     * Gets ith "Key" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType getKeyArray(int i);

    /**
     * Returns number of "Key" element
     */
    int sizeOfKeyArray();

    /**
     * Sets ith "Key" element
     */
    void setKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType key);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType insertNewKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeyType addNewKey();

    /**
     * Removes the ith "Key" element
     */
    void removeKey(int i);

    /**
     * Gets the "isIncluded" attribute
     */
    boolean getIsIncluded();

    /**
     * Gets (as xml) the "isIncluded" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsIncluded();

    /**
     * Sets the "isIncluded" attribute
     */
    void setIsIncluded(boolean isIncluded);

    /**
     * Sets (as xml) the "isIncluded" attribute
     */
    void xsetIsIncluded(org.apache.xmlbeans.XmlBoolean isIncluded);
}
