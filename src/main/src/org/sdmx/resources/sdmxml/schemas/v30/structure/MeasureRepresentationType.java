/*
 * XML Type:  MeasureRepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MeasureRepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MeasureRepresentationType extends org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRepresentationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "measurerepresentationtype5041type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "maxOccurs" attribute
     */
    java.lang.Object getMaxOccurs();

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType xgetMaxOccurs();

    /**
     * True if has "maxOccurs" attribute
     */
    boolean isSetMaxOccurs();

    /**
     * Sets the "maxOccurs" attribute
     */
    void setMaxOccurs(java.lang.Object maxOccurs);

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    void xsetMaxOccurs(org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType maxOccurs);

    /**
     * Unsets the "maxOccurs" attribute
     */
    void unsetMaxOccurs();
}
