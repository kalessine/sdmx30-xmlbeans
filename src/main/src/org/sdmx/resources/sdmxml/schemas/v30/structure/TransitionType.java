/*
 * XML Type:  TransitionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TransitionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TransitionType extends org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "transitiontype75fdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TargetStep" element
     */
    java.lang.String getTargetStep();

    /**
     * Gets (as xml) the "TargetStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType xgetTargetStep();

    /**
     * Sets the "TargetStep" element
     */
    void setTargetStep(java.lang.String targetStep);

    /**
     * Sets (as xml) the "TargetStep" element
     */
    void xsetTargetStep(org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType targetStep);

    /**
     * Gets a List of "Condition" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getConditionList();

    /**
     * Gets array of all "Condition" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getConditionArray();

    /**
     * Gets ith "Condition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getConditionArray(int i);

    /**
     * Returns number of "Condition" element
     */
    int sizeOfConditionArray();

    /**
     * Sets ith "Condition" element
     */
    void setConditionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType condition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Condition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewCondition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Condition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewCondition();

    /**
     * Removes the ith "Condition" element
     */
    void removeCondition(int i);

    /**
     * Gets the "localID" attribute
     */
    java.lang.String getLocalID();

    /**
     * Gets (as xml) the "localID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetLocalID();

    /**
     * True if has "localID" attribute
     */
    boolean isSetLocalID();

    /**
     * Sets the "localID" attribute
     */
    void setLocalID(java.lang.String localID);

    /**
     * Sets (as xml) the "localID" attribute
     */
    void xsetLocalID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType localID);

    /**
     * Unsets the "localID" attribute
     */
    void unsetLocalID();
}
