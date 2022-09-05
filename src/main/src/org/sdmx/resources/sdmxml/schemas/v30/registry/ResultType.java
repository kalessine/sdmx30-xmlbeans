/*
 * XML Type:  ResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface ResultType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "resulttype7e2btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Registration" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType getRegistration();

    /**
     * Sets the "Registration" element
     */
    void setRegistration(org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType registration);

    /**
     * Appends and returns a new empty "Registration" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType addNewRegistration();

    /**
     * Gets a List of "Constraint" elements
     */
    java.util.List<java.lang.String> getConstraintList();

    /**
     * Gets array of all "Constraint" elements
     */
    java.lang.String[] getConstraintArray();

    /**
     * Gets ith "Constraint" element
     */
    java.lang.String getConstraintArray(int i);

    /**
     * Gets (as xml) a List of "Constraint" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType> xgetConstraintList();

    /**
     * Gets (as xml) array of all "Constraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType[] xgetConstraintArray();

    /**
     * Gets (as xml) ith "Constraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType xgetConstraintArray(int i);

    /**
     * Returns number of "Constraint" element
     */
    int sizeOfConstraintArray();

    /**
     * Sets ith "Constraint" element
     */
    void setConstraintArray(int i, java.lang.String constraint);

    /**
     * Sets (as xml) array of all "Constraint" element
     */
    void xsetConstraintArray(org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType[] constraintArray);

    /**
     * Sets (as xml) ith "Constraint" element
     */
    void xsetConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType constraint);

    /**
     * Inserts the value as the ith "Constraint" element
     */
    void insertConstraint(int i, java.lang.String constraint);

    /**
     * Appends the value as the last "Constraint" element
     */
    void addConstraint(java.lang.String constraint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Constraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType insertNewConstraint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Constraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType addNewConstraint();

    /**
     * Removes the ith "Constraint" element
     */
    void removeConstraint(int i);
}
