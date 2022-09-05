/*
 * XML Type:  ReleaseCalendarType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReleaseCalendarType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ReleaseCalendarType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "releasecalendartype601btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Periodicity" element
     */
    java.lang.String getPeriodicity();

    /**
     * Gets (as xml) the "Periodicity" element
     */
    org.apache.xmlbeans.XmlString xgetPeriodicity();

    /**
     * Sets the "Periodicity" element
     */
    void setPeriodicity(java.lang.String periodicity);

    /**
     * Sets (as xml) the "Periodicity" element
     */
    void xsetPeriodicity(org.apache.xmlbeans.XmlString periodicity);

    /**
     * Gets the "Offset" element
     */
    java.lang.String getOffset();

    /**
     * Gets (as xml) the "Offset" element
     */
    org.apache.xmlbeans.XmlString xgetOffset();

    /**
     * Sets the "Offset" element
     */
    void setOffset(java.lang.String offset);

    /**
     * Sets (as xml) the "Offset" element
     */
    void xsetOffset(org.apache.xmlbeans.XmlString offset);

    /**
     * Gets the "Tolerance" element
     */
    java.lang.String getTolerance();

    /**
     * Gets (as xml) the "Tolerance" element
     */
    org.apache.xmlbeans.XmlString xgetTolerance();

    /**
     * Sets the "Tolerance" element
     */
    void setTolerance(java.lang.String tolerance);

    /**
     * Sets (as xml) the "Tolerance" element
     */
    void xsetTolerance(org.apache.xmlbeans.XmlString tolerance);
}
