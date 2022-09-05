/*
 * XML Type:  ProvisionAgreementType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ProvisionAgreementType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ProvisionAgreementType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "provisionagreementtypea85dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Dataflow" element
     */
    java.lang.String getDataflow();

    /**
     * Gets (as xml) the "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType xgetDataflow();

    /**
     * Sets the "Dataflow" element
     */
    void setDataflow(java.lang.String dataflow);

    /**
     * Sets (as xml) the "Dataflow" element
     */
    void xsetDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType dataflow);

    /**
     * Gets the "DataProvider" element
     */
    java.lang.String getDataProvider();

    /**
     * Gets (as xml) the "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType xgetDataProvider();

    /**
     * Sets the "DataProvider" element
     */
    void setDataProvider(java.lang.String dataProvider);

    /**
     * Sets (as xml) the "DataProvider" element
     */
    void xsetDataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType dataProvider);
}
