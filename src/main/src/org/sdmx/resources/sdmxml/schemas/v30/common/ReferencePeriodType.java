/*
 * XML Type:  ReferencePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReferencePeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface ReferencePeriodType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.ReferencePeriodType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "referenceperiodtype691ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "startTime" attribute
     */
    java.util.Calendar getStartTime();

    /**
     * Gets (as xml) the "startTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetStartTime();

    /**
     * Sets the "startTime" attribute
     */
    void setStartTime(java.util.Calendar startTime);

    /**
     * Sets (as xml) the "startTime" attribute
     */
    void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);

    /**
     * Gets the "endTime" attribute
     */
    java.util.Calendar getEndTime();

    /**
     * Gets (as xml) the "endTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetEndTime();

    /**
     * Sets the "endTime" attribute
     */
    void setEndTime(java.util.Calendar endTime);

    /**
     * Sets (as xml) the "endTime" attribute
     */
    void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime);
}
