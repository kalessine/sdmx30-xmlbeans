/*
 * XML Type:  ValidityPeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValidityPeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface ValidityPeriodType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.ValidityPeriodType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "validityperiodtypebcf5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "StartDate" element
     */
    java.util.Calendar getStartDate();

    /**
     * Gets (as xml) the "StartDate" element
     */
    org.apache.xmlbeans.XmlDate xgetStartDate();

    /**
     * Sets the "StartDate" element
     */
    void setStartDate(java.util.Calendar startDate);

    /**
     * Sets (as xml) the "StartDate" element
     */
    void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);

    /**
     * Gets the "EndDate" element
     */
    java.util.Calendar getEndDate();

    /**
     * Gets (as xml) the "EndDate" element
     */
    org.apache.xmlbeans.XmlDate xgetEndDate();

    /**
     * Sets the "EndDate" element
     */
    void setEndDate(java.util.Calendar endDate);

    /**
     * Sets (as xml) the "EndDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
}
