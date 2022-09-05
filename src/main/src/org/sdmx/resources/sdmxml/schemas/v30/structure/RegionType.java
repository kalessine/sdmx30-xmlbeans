/*
 * XML Type:  RegionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RegionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RegionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RegionType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RegionType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "regiontypec41ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "KeyValue" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType> getKeyValueList();

    /**
     * Gets array of all "KeyValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType[] getKeyValueArray();

    /**
     * Gets ith "KeyValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType getKeyValueArray(int i);

    /**
     * Returns number of "KeyValue" element
     */
    int sizeOfKeyValueArray();

    /**
     * Sets ith "KeyValue" element
     */
    void setKeyValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType keyValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType insertNewKeyValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType addNewKeyValue();

    /**
     * Removes the ith "KeyValue" element
     */
    void removeKeyValue(int i);

    /**
     * Gets a List of "Component" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType> getComponentList();

    /**
     * Gets array of all "Component" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType[] getComponentArray();

    /**
     * Gets ith "Component" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType getComponentArray(int i);

    /**
     * Returns number of "Component" element
     */
    int sizeOfComponentArray();

    /**
     * Sets ith "Component" element
     */
    void setComponentArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType component);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType insertNewComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberSelectionType addNewComponent();

    /**
     * Removes the ith "Component" element
     */
    void removeComponent(int i);

    /**
     * Gets the "include" attribute
     */
    boolean getInclude();

    /**
     * Gets (as xml) the "include" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInclude();

    /**
     * True if has "include" attribute
     */
    boolean isSetInclude();

    /**
     * Sets the "include" attribute
     */
    void setInclude(boolean include);

    /**
     * Sets (as xml) the "include" attribute
     */
    void xsetInclude(org.apache.xmlbeans.XmlBoolean include);

    /**
     * Unsets the "include" attribute
     */
    void unsetInclude();

    /**
     * Gets the "validFrom" attribute
     */
    java.lang.Object getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.lang.Object validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.lang.Object getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.lang.Object validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v30.common.StandardTimePeriodType validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
