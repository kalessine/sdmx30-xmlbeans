/*
 * XML Type:  AttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface AttributeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "attributetype8f92type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ConceptRole" elements
     */
    java.util.List<java.lang.String> getConceptRoleList();

    /**
     * Gets array of all "ConceptRole" elements
     */
    java.lang.String[] getConceptRoleArray();

    /**
     * Gets ith "ConceptRole" element
     */
    java.lang.String getConceptRoleArray(int i);

    /**
     * Gets (as xml) a List of "ConceptRole" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType> xgetConceptRoleList();

    /**
     * Gets (as xml) array of all "ConceptRole" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[] xgetConceptRoleArray();

    /**
     * Gets (as xml) ith "ConceptRole" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType xgetConceptRoleArray(int i);

    /**
     * Returns number of "ConceptRole" element
     */
    int sizeOfConceptRoleArray();

    /**
     * Sets ith "ConceptRole" element
     */
    void setConceptRoleArray(int i, java.lang.String conceptRole);

    /**
     * Sets (as xml) array of all "ConceptRole" element
     */
    void xsetConceptRoleArray(org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[] conceptRoleArray);

    /**
     * Sets (as xml) ith "ConceptRole" element
     */
    void xsetConceptRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType conceptRole);

    /**
     * Inserts the value as the ith "ConceptRole" element
     */
    void insertConceptRole(int i, java.lang.String conceptRole);

    /**
     * Appends the value as the last "ConceptRole" element
     */
    void addConceptRole(java.lang.String conceptRole);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptRole" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType insertNewConceptRole(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptRole" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType addNewConceptRole();

    /**
     * Removes the ith "ConceptRole" element
     */
    void removeConceptRole(int i);

    /**
     * Gets the "AttributeRelationship" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType getAttributeRelationship();

    /**
     * Sets the "AttributeRelationship" element
     */
    void setAttributeRelationship(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType attributeRelationship);

    /**
     * Appends and returns a new empty "AttributeRelationship" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType addNewAttributeRelationship();

    /**
     * Gets the "MeasureRelationship" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType getMeasureRelationship();

    /**
     * True if has "MeasureRelationship" element
     */
    boolean isSetMeasureRelationship();

    /**
     * Sets the "MeasureRelationship" element
     */
    void setMeasureRelationship(org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType measureRelationship);

    /**
     * Appends and returns a new empty "MeasureRelationship" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType addNewMeasureRelationship();

    /**
     * Unsets the "MeasureRelationship" element
     */
    void unsetMeasureRelationship();

    /**
     * Gets the "usage" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType.Enum getUsage();

    /**
     * Gets (as xml) the "usage" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType xgetUsage();

    /**
     * True if has "usage" attribute
     */
    boolean isSetUsage();

    /**
     * Sets the "usage" attribute
     */
    void setUsage(org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType.Enum usage);

    /**
     * Sets (as xml) the "usage" attribute
     */
    void xsetUsage(org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType usage);

    /**
     * Unsets the "usage" attribute
     */
    void unsetUsage();
}
