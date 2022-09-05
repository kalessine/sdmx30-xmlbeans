/*
 * An XML document type.
 * Localname: ReportingCategory
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ReportingCategory(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class ReportingCategoryDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryDocument {
    private static final long serialVersionUID = 1L;

    public ReportingCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingCategory"),
    };


    /**
     * Gets the "ReportingCategory" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType getReportingCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ReportingCategory" element
     */
    @Override
    public void setReportingCategory(org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType reportingCategory) {
        generatedSetterHelperImpl(reportingCategory, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReportingCategory" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType addNewReportingCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingCategoryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
