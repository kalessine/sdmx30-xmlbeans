/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmitStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmitStructureRequestType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submitstructurerequesttypea394type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "StructureLocation" element
     */
    java.lang.String getStructureLocation();

    /**
     * Gets (as xml) the "StructureLocation" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetStructureLocation();

    /**
     * True if has "StructureLocation" element
     */
    boolean isSetStructureLocation();

    /**
     * Sets the "StructureLocation" element
     */
    void setStructureLocation(java.lang.String structureLocation);

    /**
     * Sets (as xml) the "StructureLocation" element
     */
    void xsetStructureLocation(org.apache.xmlbeans.XmlAnyURI structureLocation);

    /**
     * Unsets the "StructureLocation" element
     */
    void unsetStructureLocation();

    /**
     * Gets the "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType getStructures();

    /**
     * True if has "Structures" element
     */
    boolean isSetStructures();

    /**
     * Sets the "Structures" element
     */
    void setStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType structures);

    /**
     * Appends and returns a new empty "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType addNewStructures();

    /**
     * Unsets the "Structures" element
     */
    void unsetStructures();

    /**
     * Gets a List of "SubmittedStructure" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType> getSubmittedStructureList();

    /**
     * Gets array of all "SubmittedStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType[] getSubmittedStructureArray();

    /**
     * Gets ith "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType getSubmittedStructureArray(int i);

    /**
     * Returns number of "SubmittedStructure" element
     */
    int sizeOfSubmittedStructureArray();

    /**
     * Sets ith "SubmittedStructure" element
     */
    void setSubmittedStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType submittedStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType insertNewSubmittedStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType addNewSubmittedStructure();

    /**
     * Removes the ith "SubmittedStructure" element
     */
    void removeSubmittedStructure(int i);

    /**
     * Gets the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction();

    /**
     * Gets (as xml) the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction();

    /**
     * True if has "action" attribute
     */
    boolean isSetAction();

    /**
     * Sets the "action" attribute
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action);

    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action);

    /**
     * Unsets the "action" attribute
     */
    void unsetAction();

    /**
     * Gets the "externalDependencies" attribute
     */
    boolean getExternalDependencies();

    /**
     * Gets (as xml) the "externalDependencies" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetExternalDependencies();

    /**
     * True if has "externalDependencies" attribute
     */
    boolean isSetExternalDependencies();

    /**
     * Sets the "externalDependencies" attribute
     */
    void setExternalDependencies(boolean externalDependencies);

    /**
     * Sets (as xml) the "externalDependencies" attribute
     */
    void xsetExternalDependencies(org.apache.xmlbeans.XmlBoolean externalDependencies);

    /**
     * Unsets the "externalDependencies" attribute
     */
    void unsetExternalDependencies();
}
