/*
 * XML Type:  CategorisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategorisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CategorisationType extends org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "categorisationtype40f8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Source" element
     */
    java.lang.String getSource();

    /**
     * Gets (as xml) the "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType xgetSource();

    /**
     * True if has "Source" element
     */
    boolean isSetSource();

    /**
     * Sets the "Source" element
     */
    void setSource(java.lang.String source);

    /**
     * Sets (as xml) the "Source" element
     */
    void xsetSource(org.sdmx.resources.sdmxml.schemas.v30.common.UrnReferenceType source);

    /**
     * Unsets the "Source" element
     */
    void unsetSource();

    /**
     * Gets the "Target" element
     */
    java.lang.String getTarget();

    /**
     * Gets (as xml) the "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType xgetTarget();

    /**
     * True if has "Target" element
     */
    boolean isSetTarget();

    /**
     * Sets the "Target" element
     */
    void setTarget(java.lang.String target);

    /**
     * Sets (as xml) the "Target" element
     */
    void xsetTarget(org.sdmx.resources.sdmxml.schemas.v30.common.CategoryReferenceType target);

    /**
     * Unsets the "Target" element
     */
    void unsetTarget();
}
