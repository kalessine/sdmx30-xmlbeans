/*
 * XML Type:  HierarchyAssociationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML HierarchyAssociationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface HierarchyAssociationType extends org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "hierarchyassociationtypef874type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LinkedHierarchy" element
     */
    java.lang.String getLinkedHierarchy();

    /**
     * Gets (as xml) the "LinkedHierarchy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType xgetLinkedHierarchy();

    /**
     * Sets the "LinkedHierarchy" element
     */
    void setLinkedHierarchy(java.lang.String linkedHierarchy);

    /**
     * Sets (as xml) the "LinkedHierarchy" element
     */
    void xsetLinkedHierarchy(org.sdmx.resources.sdmxml.schemas.v30.common.HierarchyReferenceType linkedHierarchy);

    /**
     * Gets the "LinkedObject" element
     */
    java.lang.String getLinkedObject();

    /**
     * Gets (as xml) the "LinkedObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetLinkedObject();

    /**
     * Sets the "LinkedObject" element
     */
    void setLinkedObject(java.lang.String linkedObject);

    /**
     * Sets (as xml) the "LinkedObject" element
     */
    void xsetLinkedObject(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType linkedObject);

    /**
     * Gets the "ContextObject" element
     */
    java.lang.String getContextObject();

    /**
     * Gets (as xml) the "ContextObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetContextObject();

    /**
     * True if has "ContextObject" element
     */
    boolean isSetContextObject();

    /**
     * Sets the "ContextObject" element
     */
    void setContextObject(java.lang.String contextObject);

    /**
     * Sets (as xml) the "ContextObject" element
     */
    void xsetContextObject(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType contextObject);

    /**
     * Unsets the "ContextObject" element
     */
    void unsetContextObject();
}
