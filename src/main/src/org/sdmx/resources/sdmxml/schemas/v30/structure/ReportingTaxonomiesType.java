/*
 * XML Type:  ReportingTaxonomiesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReportingTaxonomiesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ReportingTaxonomiesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "reportingtaxonomiestypec0b3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ReportingTaxonomy" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType> getReportingTaxonomyList();

    /**
     * Gets array of all "ReportingTaxonomy" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType[] getReportingTaxonomyArray();

    /**
     * Gets ith "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType getReportingTaxonomyArray(int i);

    /**
     * Returns number of "ReportingTaxonomy" element
     */
    int sizeOfReportingTaxonomyArray();

    /**
     * Sets ith "ReportingTaxonomy" element
     */
    void setReportingTaxonomyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType reportingTaxonomy);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType insertNewReportingTaxonomy(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType addNewReportingTaxonomy();

    /**
     * Removes the ith "ReportingTaxonomy" element
     */
    void removeReportingTaxonomy(int i);
}
