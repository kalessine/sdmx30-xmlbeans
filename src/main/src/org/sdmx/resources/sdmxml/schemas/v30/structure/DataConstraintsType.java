/*
 * XML Type:  DataConstraintsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataConstraintsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface DataConstraintsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "dataconstraintstypee7e2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DataConstraint" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType> getDataConstraintList();

    /**
     * Gets array of all "DataConstraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType[] getDataConstraintArray();

    /**
     * Gets ith "DataConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType getDataConstraintArray(int i);

    /**
     * Returns number of "DataConstraint" element
     */
    int sizeOfDataConstraintArray();

    /**
     * Sets ith "DataConstraint" element
     */
    void setDataConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType dataConstraint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType insertNewDataConstraint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType addNewDataConstraint();

    /**
     * Removes the ith "DataConstraint" element
     */
    void removeDataConstraint(int i);
}
