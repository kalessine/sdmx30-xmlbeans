/*
 * XML Type:  MeasureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MeasureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MeasureType extends org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "measuretype7414type");
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
