/*
 * XML Type:  PayloadStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PayloadStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface PayloadStructureType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "payloadstructuretypef031type");
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
     * True if has "ProvisionAgreement" element
     */
    boolean isSetProvisionAgreement();

    /**
     * Sets the "ProvisionAgreement" element
     */
    void setProvisionAgreement(java.lang.String provisionAgreement);

    /**
     * Sets (as xml) the "ProvisionAgreement" element
     */
    void xsetProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v30.common.ProvisionAgreementReferenceType provisionAgreement);

    /**
     * Unsets the "ProvisionAgreement" element
     */
    void unsetProvisionAgreement();

    /**
     * Gets the "StructureUsage" element
     */
    java.lang.String getStructureUsage();

    /**
     * Gets (as xml) the "StructureUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType xgetStructureUsage();

    /**
     * True if has "StructureUsage" element
     */
    boolean isSetStructureUsage();

    /**
     * Sets the "StructureUsage" element
     */
    void setStructureUsage(java.lang.String structureUsage);

    /**
     * Sets (as xml) the "StructureUsage" element
     */
    void xsetStructureUsage(org.sdmx.resources.sdmxml.schemas.v30.common.StructureUsageReferenceType structureUsage);

    /**
     * Unsets the "StructureUsage" element
     */
    void unsetStructureUsage();

    /**
     * Gets the "Structure" element
     */
    java.lang.String getStructure();

    /**
     * Gets (as xml) the "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType xgetStructure();

    /**
     * True if has "Structure" element
     */
    boolean isSetStructure();

    /**
     * Sets the "Structure" element
     */
    void setStructure(java.lang.String structure);

    /**
     * Sets (as xml) the "Structure" element
     */
    void xsetStructure(org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType structure);

    /**
     * Unsets the "Structure" element
     */
    void unsetStructure();

    /**
     * Gets the "structureID" attribute
     */
    java.lang.String getStructureID();

    /**
     * Gets (as xml) the "structureID" attribute
     */
    org.apache.xmlbeans.XmlID xgetStructureID();

    /**
     * Sets the "structureID" attribute
     */
    void setStructureID(java.lang.String structureID);

    /**
     * Sets (as xml) the "structureID" attribute
     */
    void xsetStructureID(org.apache.xmlbeans.XmlID structureID);

    /**
     * Gets the "schemaURL" attribute
     */
    java.lang.String getSchemaURL();

    /**
     * Gets (as xml) the "schemaURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetSchemaURL();

    /**
     * True if has "schemaURL" attribute
     */
    boolean isSetSchemaURL();

    /**
     * Sets the "schemaURL" attribute
     */
    void setSchemaURL(java.lang.String schemaURL);

    /**
     * Sets (as xml) the "schemaURL" attribute
     */
    void xsetSchemaURL(org.apache.xmlbeans.XmlAnyURI schemaURL);

    /**
     * Unsets the "schemaURL" attribute
     */
    void unsetSchemaURL();

    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();

    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();

    /**
     * True if has "namespace" attribute
     */
    boolean isSetNamespace();

    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);

    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);

    /**
     * Unsets the "namespace" attribute
     */
    void unsetNamespace();

    /**
     * Gets the "dimensionAtObservation" attribute
     */
    java.lang.String getDimensionAtObservation();

    /**
     * Gets (as xml) the "dimensionAtObservation" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType xgetDimensionAtObservation();

    /**
     * True if has "dimensionAtObservation" attribute
     */
    boolean isSetDimensionAtObservation();

    /**
     * Sets the "dimensionAtObservation" attribute
     */
    void setDimensionAtObservation(java.lang.String dimensionAtObservation);

    /**
     * Sets (as xml) the "dimensionAtObservation" attribute
     */
    void xsetDimensionAtObservation(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType dimensionAtObservation);

    /**
     * Unsets the "dimensionAtObservation" attribute
     */
    void unsetDimensionAtObservation();

    /**
     * Gets the "explicitMeasures" attribute
     */
    boolean getExplicitMeasures();

    /**
     * Gets (as xml) the "explicitMeasures" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetExplicitMeasures();

    /**
     * True if has "explicitMeasures" attribute
     */
    boolean isSetExplicitMeasures();

    /**
     * Sets the "explicitMeasures" attribute
     */
    void setExplicitMeasures(boolean explicitMeasures);

    /**
     * Sets (as xml) the "explicitMeasures" attribute
     */
    void xsetExplicitMeasures(org.apache.xmlbeans.XmlBoolean explicitMeasures);

    /**
     * Unsets the "explicitMeasures" attribute
     */
    void unsetExplicitMeasures();

    /**
     * Gets the "serviceURL" attribute
     */
    java.lang.String getServiceURL();

    /**
     * Gets (as xml) the "serviceURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetServiceURL();

    /**
     * True if has "serviceURL" attribute
     */
    boolean isSetServiceURL();

    /**
     * Sets the "serviceURL" attribute
     */
    void setServiceURL(java.lang.String serviceURL);

    /**
     * Sets (as xml) the "serviceURL" attribute
     */
    void xsetServiceURL(org.apache.xmlbeans.XmlAnyURI serviceURL);

    /**
     * Unsets the "serviceURL" attribute
     */
    void unsetServiceURL();

    /**
     * Gets the "structureURL" attribute
     */
    java.lang.String getStructureURL();

    /**
     * Gets (as xml) the "structureURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetStructureURL();

    /**
     * True if has "structureURL" attribute
     */
    boolean isSetStructureURL();

    /**
     * Sets the "structureURL" attribute
     */
    void setStructureURL(java.lang.String structureURL);

    /**
     * Sets (as xml) the "structureURL" attribute
     */
    void xsetStructureURL(org.apache.xmlbeans.XmlAnyURI structureURL);

    /**
     * Unsets the "structureURL" attribute
     */
    void unsetStructureURL();
}
