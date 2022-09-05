/*
 * XML Type:  ReportingTaxonomyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReportingTaxonomyType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ReportingTaxonomyType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemSchemeType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "reportingtaxonomytype1595type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ReportingCategory" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType> getReportingCategoryList();

    /**
     * Gets array of all "ReportingCategory" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType[] getReportingCategoryArray();

    /**
     * Gets ith "ReportingCategory" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType getReportingCategoryArray(int i);

    /**
     * Returns number of "ReportingCategory" element
     */
    int sizeOfReportingCategoryArray();

    /**
     * Sets ith "ReportingCategory" element
     */
    void setReportingCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType reportingCategory);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingCategory" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType insertNewReportingCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingCategory" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType addNewReportingCategory();

    /**
     * Removes the ith "ReportingCategory" element
     */
    void removeReportingCategory(int i);
}
