/*
 * XML Type:  SubmittedStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SubmittedStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface SubmittedStructureType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "submittedstructuretype25b0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MaintainableObject" element
     */
    java.lang.String getMaintainableObject();

    /**
     * Gets (as xml) the "MaintainableObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType xgetMaintainableObject();

    /**
     * Sets the "MaintainableObject" element
     */
    void setMaintainableObject(java.lang.String maintainableObject);

    /**
     * Sets (as xml) the "MaintainableObject" element
     */
    void xsetMaintainableObject(org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType maintainableObject);

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
