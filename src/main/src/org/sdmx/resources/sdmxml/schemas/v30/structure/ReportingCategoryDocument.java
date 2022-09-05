/*
 * An XML document type.
 * Localname: ReportingCategory
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ReportingCategory(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface ReportingCategoryDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "reportingcategory0c58doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ReportingCategory" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType getReportingCategory();

    /**
     * Sets the "ReportingCategory" element
     */
    void setReportingCategory(org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType reportingCategory);

    /**
     * Appends and returns a new empty "ReportingCategory" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType addNewReportingCategory();
}
