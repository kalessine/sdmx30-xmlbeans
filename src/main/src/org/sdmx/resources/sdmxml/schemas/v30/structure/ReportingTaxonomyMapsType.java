/*
 * XML Type:  ReportingTaxonomyMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReportingTaxonomyMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ReportingTaxonomyMapsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "reportingtaxonomymapstype4d4ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ReportingTaxonomyMap" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType> getReportingTaxonomyMapList();

    /**
     * Gets array of all "ReportingTaxonomyMap" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType[] getReportingTaxonomyMapArray();

    /**
     * Gets ith "ReportingTaxonomyMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType getReportingTaxonomyMapArray(int i);

    /**
     * Returns number of "ReportingTaxonomyMap" element
     */
    int sizeOfReportingTaxonomyMapArray();

    /**
     * Sets ith "ReportingTaxonomyMap" element
     */
    void setReportingTaxonomyMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType reportingTaxonomyMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomyMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType insertNewReportingTaxonomyMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomyMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapType addNewReportingTaxonomyMap();

    /**
     * Removes the ith "ReportingTaxonomyMap" element
     */
    void removeReportingTaxonomyMap(int i);
}
