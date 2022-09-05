/*
 * XML Type:  BaseDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.BaseDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML BaseDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface BaseDimensionType extends org.sdmx.resources.sdmxml.schemas.v30.structure.BaseDimensionBaseType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.BaseDimensionType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "basedimensiontype9b0btype");
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
     * Gets the "position" attribute
     */
    int getPosition();

    /**
     * Gets (as xml) the "position" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPosition();

    /**
     * True if has "position" attribute
     */
    boolean isSetPosition();

    /**
     * Sets the "position" attribute
     */
    void setPosition(int position);

    /**
     * Sets (as xml) the "position" attribute
     */
    void xsetPosition(org.apache.xmlbeans.XmlInt position);

    /**
     * Unsets the "position" attribute
     */
    void unsetPosition();
}
