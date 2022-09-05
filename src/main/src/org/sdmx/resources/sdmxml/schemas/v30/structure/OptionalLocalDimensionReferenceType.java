/*
 * XML Type:  OptionalLocalDimensionReferenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML OptionalLocalDimensionReferenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType.
 */
public interface OptionalLocalDimensionReferenceType extends org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.OptionalLocalDimensionReferenceType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "optionallocaldimensionreferencetype8586type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "optional" attribute
     */
    boolean getOptional();

    /**
     * Gets (as xml) the "optional" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOptional();

    /**
     * True if has "optional" attribute
     */
    boolean isSetOptional();

    /**
     * Sets the "optional" attribute
     */
    void setOptional(boolean optional);

    /**
     * Sets (as xml) the "optional" attribute
     */
    void xsetOptional(org.apache.xmlbeans.XmlBoolean optional);

    /**
     * Unsets the "optional" attribute
     */
    void unsetOptional();
}
