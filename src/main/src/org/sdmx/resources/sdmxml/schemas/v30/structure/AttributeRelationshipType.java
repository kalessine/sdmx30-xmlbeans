/*
 * XML Type:  AttributeRelationshipType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AttributeRelationshipType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface AttributeRelationshipType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "attributerelationshiptypee56atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getDataflow();

    /**
     * True if has "Dataflow" element
     */
    boolean isSetDataflow();

    /**
     * Sets the "Dataflow" element
     */
    void setDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType dataflow);

    /**
     * Appends and returns a new empty "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewDataflow();

    /**
     * Unsets the "Dataflow" element
     */
    void unsetDataflow();

    /**
     * Gets a List of "Dimension" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType> getDimensionList();

    /**
     * Gets array of all "Dimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType[] getDimensionArray();

    /**
     * Gets ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType getDimensionArray(int i);

    /**
     * Returns number of "Dimension" element
     */
    int sizeOfDimensionArray();

    /**
     * Sets ith "Dimension" element
     */
    void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType dimension);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType insertNewDimension(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType addNewDimension();

    /**
     * Removes the ith "Dimension" element
     */
    void removeDimension(int i);

    /**
     * Gets the "Group" element
     */
    java.lang.String getGroup();

    /**
     * Gets (as xml) the "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetGroup();

    /**
     * True if has "Group" element
     */
    boolean isSetGroup();

    /**
     * Sets the "Group" element
     */
    void setGroup(java.lang.String group);

    /**
     * Sets (as xml) the "Group" element
     */
    void xsetGroup(org.sdmx.resources.sdmxml.schemas.v30.common.IDType group);

    /**
     * Unsets the "Group" element
     */
    void unsetGroup();

    /**
     * Gets the "Observation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getObservation();

    /**
     * True if has "Observation" element
     */
    boolean isSetObservation();

    /**
     * Sets the "Observation" element
     */
    void setObservation(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType observation);

    /**
     * Appends and returns a new empty "Observation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewObservation();

    /**
     * Unsets the "Observation" element
     */
    void unsetObservation();
}
