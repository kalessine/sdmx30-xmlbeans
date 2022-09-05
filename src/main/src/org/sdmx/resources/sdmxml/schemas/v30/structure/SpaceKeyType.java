/*
 * XML Type:  SpaceKeyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SpaceKeyType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface SpaceKeyType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.SpaceKeyType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "spacekeytype7661type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Key" elements
     */
    java.util.List<java.lang.String> getKeyList();

    /**
     * Gets array of all "Key" elements
     */
    java.lang.String[] getKeyArray();

    /**
     * Gets ith "Key" element
     */
    java.lang.String getKeyArray(int i);

    /**
     * Gets (as xml) a List of "Key" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType> xgetKeyList();

    /**
     * Gets (as xml) array of all "Key" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType[] xgetKeyArray();

    /**
     * Gets (as xml) ith "Key" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType xgetKeyArray(int i);

    /**
     * Returns number of "Key" element
     */
    int sizeOfKeyArray();

    /**
     * Sets ith "Key" element
     */
    void setKeyArray(int i, java.lang.String key);

    /**
     * Sets (as xml) array of all "Key" element
     */
    void xsetKeyArray(org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType[] keyArray);

    /**
     * Sets (as xml) ith "Key" element
     */
    void xsetKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType key);

    /**
     * Inserts the value as the ith "Key" element
     */
    void insertKey(int i, java.lang.String key);

    /**
     * Appends the value as the last "Key" element
     */
    void addKey(java.lang.String key);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType insertNewKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.SingleNCNameIDType addNewKey();

    /**
     * Removes the ith "Key" element
     */
    void removeKey(int i);
}
