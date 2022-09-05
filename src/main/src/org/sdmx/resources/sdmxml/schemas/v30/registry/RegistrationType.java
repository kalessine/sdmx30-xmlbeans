/*
 * XML Type:  RegistrationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RegistrationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface RegistrationType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "registrationtypecccftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ProvisionAgreement" element
     */
    java.lang.String getProvisionAgreement();

    /**
     * Gets (as xml) the "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType xgetProvisionAgreement();

    /**
     * Sets the "ProvisionAgreement" element
     */
    void setProvisionAgreement(java.lang.String provisionAgreement);

    /**
     * Sets (as xml) the "ProvisionAgreement" element
     */
    void xsetProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType provisionAgreement);

    /**
     * Gets the "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.DataSourceType getDatasource();

    /**
     * Sets the "Datasource" element
     */
    void setDatasource(org.sdmx.resources.sdmxml.schemas.v30.registry.DataSourceType datasource);

    /**
     * Appends and returns a new empty "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.DataSourceType addNewDatasource();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "validFrom" attribute
     */
    java.util.Calendar getValidFrom();

    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidFrom();

    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();

    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.util.Calendar validFrom);

    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);

    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();

    /**
     * Gets the "validTo" attribute
     */
    java.util.Calendar getValidTo();

    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidTo();

    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();

    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.util.Calendar validTo);

    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);

    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();

    /**
     * Gets the "lastUpdated" attribute
     */
    java.util.Calendar getLastUpdated();

    /**
     * Gets (as xml) the "lastUpdated" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetLastUpdated();

    /**
     * True if has "lastUpdated" attribute
     */
    boolean isSetLastUpdated();

    /**
     * Sets the "lastUpdated" attribute
     */
    void setLastUpdated(java.util.Calendar lastUpdated);

    /**
     * Sets (as xml) the "lastUpdated" attribute
     */
    void xsetLastUpdated(org.apache.xmlbeans.XmlDateTime lastUpdated);

    /**
     * Unsets the "lastUpdated" attribute
     */
    void unsetLastUpdated();

    /**
     * Gets the "indexTimeSeries" attribute
     */
    boolean getIndexTimeSeries();

    /**
     * Gets (as xml) the "indexTimeSeries" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexTimeSeries();

    /**
     * True if has "indexTimeSeries" attribute
     */
    boolean isSetIndexTimeSeries();

    /**
     * Sets the "indexTimeSeries" attribute
     */
    void setIndexTimeSeries(boolean indexTimeSeries);

    /**
     * Sets (as xml) the "indexTimeSeries" attribute
     */
    void xsetIndexTimeSeries(org.apache.xmlbeans.XmlBoolean indexTimeSeries);

    /**
     * Unsets the "indexTimeSeries" attribute
     */
    void unsetIndexTimeSeries();

    /**
     * Gets the "indexDataSet" attribute
     */
    boolean getIndexDataSet();

    /**
     * Gets (as xml) the "indexDataSet" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexDataSet();

    /**
     * True if has "indexDataSet" attribute
     */
    boolean isSetIndexDataSet();

    /**
     * Sets the "indexDataSet" attribute
     */
    void setIndexDataSet(boolean indexDataSet);

    /**
     * Sets (as xml) the "indexDataSet" attribute
     */
    void xsetIndexDataSet(org.apache.xmlbeans.XmlBoolean indexDataSet);

    /**
     * Unsets the "indexDataSet" attribute
     */
    void unsetIndexDataSet();

    /**
     * Gets the "indexAttributes" attribute
     */
    boolean getIndexAttributes();

    /**
     * Gets (as xml) the "indexAttributes" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexAttributes();

    /**
     * True if has "indexAttributes" attribute
     */
    boolean isSetIndexAttributes();

    /**
     * Sets the "indexAttributes" attribute
     */
    void setIndexAttributes(boolean indexAttributes);

    /**
     * Sets (as xml) the "indexAttributes" attribute
     */
    void xsetIndexAttributes(org.apache.xmlbeans.XmlBoolean indexAttributes);

    /**
     * Unsets the "indexAttributes" attribute
     */
    void unsetIndexAttributes();

    /**
     * Gets the "indexReportingPeriod" attribute
     */
    boolean getIndexReportingPeriod();

    /**
     * Gets (as xml) the "indexReportingPeriod" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexReportingPeriod();

    /**
     * True if has "indexReportingPeriod" attribute
     */
    boolean isSetIndexReportingPeriod();

    /**
     * Sets the "indexReportingPeriod" attribute
     */
    void setIndexReportingPeriod(boolean indexReportingPeriod);

    /**
     * Sets (as xml) the "indexReportingPeriod" attribute
     */
    void xsetIndexReportingPeriod(org.apache.xmlbeans.XmlBoolean indexReportingPeriod);

    /**
     * Unsets the "indexReportingPeriod" attribute
     */
    void unsetIndexReportingPeriod();
}
