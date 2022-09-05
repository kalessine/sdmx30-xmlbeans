/*
 * XML Type:  MetadataAttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataAttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataAttributeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataattributetypeca23type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataAttribute" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType> getMetadataAttributeList();

    /**
     * Gets array of all "MetadataAttribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType[] getMetadataAttributeArray();

    /**
     * Gets ith "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType getMetadataAttributeArray(int i);

    /**
     * Returns number of "MetadataAttribute" element
     */
    int sizeOfMetadataAttributeArray();

    /**
     * Sets ith "MetadataAttribute" element
     */
    void setMetadataAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType metadataAttribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType insertNewMetadataAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataAttributeType addNewMetadataAttribute();

    /**
     * Removes the ith "MetadataAttribute" element
     */
    void removeMetadataAttribute(int i);

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

    /**
     * Gets the "isPresentational" attribute
     */
    boolean getIsPresentational();

    /**
     * Gets (as xml) the "isPresentational" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPresentational();

    /**
     * True if has "isPresentational" attribute
     */
    boolean isSetIsPresentational();

    /**
     * Sets the "isPresentational" attribute
     */
    void setIsPresentational(boolean isPresentational);

    /**
     * Sets (as xml) the "isPresentational" attribute
     */
    void xsetIsPresentational(org.apache.xmlbeans.XmlBoolean isPresentational);

    /**
     * Unsets the "isPresentational" attribute
     */
    void unsetIsPresentational();
}
