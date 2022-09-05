/*
 * XML Type:  GroupType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GroupType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/data/structurespecific).
 *
 * This is a complex type.
 */
public interface GroupType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.GroupType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "grouptype1a3etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Comp" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType> getCompList();

    /**
     * Gets array of all "Comp" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType[] getCompArray();

    /**
     * Gets ith "Comp" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType getCompArray(int i);

    /**
     * Returns number of "Comp" element
     */
    int sizeOfCompArray();

    /**
     * Sets ith "Comp" element
     */
    void setCompArray(int i, org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType comp);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comp" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType insertNewComp(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Comp" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.data.structurespecific.CompType addNewComp();

    /**
     * Removes the ith "Comp" element
     */
    void removeComp(int i);

    /**
     * Gets the "Metadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType getMetadata();

    /**
     * True if has "Metadata" element
     */
    boolean isSetMetadata();

    /**
     * Sets the "Metadata" element
     */
    void setMetadata(org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType metadata);

    /**
     * Appends and returns a new empty "Metadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType addNewMetadata();

    /**
     * Unsets the "Metadata" element
     */
    void unsetMetadata();

    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.sdmx.resources.sdmxml.schemas.v30.common.IDType type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();
}
