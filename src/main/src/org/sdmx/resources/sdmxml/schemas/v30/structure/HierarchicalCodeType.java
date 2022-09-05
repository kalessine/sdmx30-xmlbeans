/*
 * XML Type:  HierarchicalCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML HierarchicalCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface HierarchicalCodeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "hierarchicalcodetypedafetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Code" element
     */
    java.lang.String getCode();

    /**
     * Gets (as xml) the "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType xgetCode();

    /**
     * Sets the "Code" element
     */
    void setCode(java.lang.String code);

    /**
     * Sets (as xml) the "Code" element
     */
    void xsetCode(org.sdmx.resources.sdmxml.schemas.v30.common.CodeReferenceType code);

    /**
     * Gets a List of "HierarchicalCode" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType> getHierarchicalCodeList();

    /**
     * Gets array of all "HierarchicalCode" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType[] getHierarchicalCodeArray();

    /**
     * Gets ith "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType getHierarchicalCodeArray(int i);

    /**
     * Returns number of "HierarchicalCode" element
     */
    int sizeOfHierarchicalCodeArray();

    /**
     * Sets ith "HierarchicalCode" element
     */
    void setHierarchicalCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType hierarchicalCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType insertNewHierarchicalCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchicalCodeType addNewHierarchicalCode();

    /**
     * Removes the ith "HierarchicalCode" element
     */
    void removeHierarchicalCode(int i);

    /**
     * Gets the "Level" element
     */
    java.lang.String getLevel();

    /**
     * Gets (as xml) the "Level" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetLevel();

    /**
     * True if has "Level" element
     */
    boolean isSetLevel();

    /**
     * Sets the "Level" element
     */
    void setLevel(java.lang.String level);

    /**
     * Sets (as xml) the "Level" element
     */
    void xsetLevel(org.sdmx.resources.sdmxml.schemas.v30.common.IDType level);

    /**
     * Unsets the "Level" element
     */
    void unsetLevel();

    /**
     * Gets the "validFrom" attribute
     */
    java.util.Calendar getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidFrom();

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
    void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);

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
    org.apache.xmlbeans.XmlDateTime xgetValidTo();

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
    void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
}
