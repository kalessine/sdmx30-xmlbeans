/*
 * XML Type:  MetadataSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.metadata.generic;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/metadata/generic).
 *
 * This is a complex type.
 */
public interface MetadataSetType extends org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.MetadataSetType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadatasettype15c1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MetadataProvisionAgreement" element
     */
    java.lang.String getMetadataProvisionAgreement();

    /**
     * Gets (as xml) the "MetadataProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType xgetMetadataProvisionAgreement();

    /**
     * True if has "MetadataProvisionAgreement" element
     */
    boolean isSetMetadataProvisionAgreement();

    /**
     * Sets the "MetadataProvisionAgreement" element
     */
    void setMetadataProvisionAgreement(java.lang.String metadataProvisionAgreement);

    /**
     * Sets (as xml) the "MetadataProvisionAgreement" element
     */
    void xsetMetadataProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProvisionAgreementReferenceType metadataProvisionAgreement);

    /**
     * Unsets the "MetadataProvisionAgreement" element
     */
    void unsetMetadataProvisionAgreement();

    /**
     * Gets the "Metadataflow" element
     */
    java.lang.String getMetadataflow();

    /**
     * Gets (as xml) the "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType xgetMetadataflow();

    /**
     * True if has "Metadataflow" element
     */
    boolean isSetMetadataflow();

    /**
     * Sets the "Metadataflow" element
     */
    void setMetadataflow(java.lang.String metadataflow);

    /**
     * Sets (as xml) the "Metadataflow" element
     */
    void xsetMetadataflow(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataflowReferenceType metadataflow);

    /**
     * Unsets the "Metadataflow" element
     */
    void unsetMetadataflow();

    /**
     * Gets a List of "Target" elements
     */
    java.util.List<java.lang.String> getTargetList();

    /**
     * Gets array of all "Target" elements
     */
    java.lang.String[] getTargetArray();

    /**
     * Gets ith "Target" element
     */
    java.lang.String getTargetArray(int i);

    /**
     * Gets (as xml) a List of "Target" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType> xgetTargetList();

    /**
     * Gets (as xml) array of all "Target" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType[] xgetTargetArray();

    /**
     * Gets (as xml) ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType xgetTargetArray(int i);

    /**
     * Returns number of "Target" element
     */
    int sizeOfTargetArray();

    /**
     * Sets ith "Target" element
     */
    void setTargetArray(int i, java.lang.String target);

    /**
     * Sets (as xml) array of all "Target" element
     */
    void xsetTargetArray(org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType[] targetArray);

    /**
     * Sets (as xml) ith "Target" element
     */
    void xsetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType target);

    /**
     * Inserts the value as the ith "Target" element
     */
    void insertTarget(int i, java.lang.String target);

    /**
     * Appends the value as the last "Target" element
     */
    void addTarget(java.lang.String target);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType insertNewTarget(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Target" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.WildcardUrnType addNewTarget();

    /**
     * Removes the ith "Target" element
     */
    void removeTarget(int i);

    /**
     * Gets a List of "Attribute" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType> getAttributeList();

    /**
     * Gets array of all "Attribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType[] getAttributeArray();

    /**
     * Gets ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType getAttributeArray(int i);

    /**
     * Returns number of "Attribute" element
     */
    int sizeOfAttributeArray();

    /**
     * Sets ith "Attribute" element
     */
    void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType attribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType insertNewAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.metadata.generic.AttributeType addNewAttribute();

    /**
     * Removes the ith "Attribute" element
     */
    void removeAttribute(int i);

    /**
     * Gets the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction();

    /**
     * Gets (as xml) the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction();

    /**
     * True if has "action" attribute
     */
    boolean isSetAction();

    /**
     * Sets the "action" attribute
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action);

    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action);

    /**
     * Unsets the "action" attribute
     */
    void unsetAction();

    /**
     * Gets the "reportingBeginDate" attribute
     */
    java.util.Calendar getReportingBeginDate();

    /**
     * Gets (as xml) the "reportingBeginDate" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingBeginDate();

    /**
     * True if has "reportingBeginDate" attribute
     */
    boolean isSetReportingBeginDate();

    /**
     * Sets the "reportingBeginDate" attribute
     */
    void setReportingBeginDate(java.util.Calendar reportingBeginDate);

    /**
     * Sets (as xml) the "reportingBeginDate" attribute
     */
    void xsetReportingBeginDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingBeginDate);

    /**
     * Unsets the "reportingBeginDate" attribute
     */
    void unsetReportingBeginDate();

    /**
     * Gets the "reportingEndDate" attribute
     */
    java.util.Calendar getReportingEndDate();

    /**
     * Gets (as xml) the "reportingEndDate" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType xgetReportingEndDate();

    /**
     * True if has "reportingEndDate" attribute
     */
    boolean isSetReportingEndDate();

    /**
     * Sets the "reportingEndDate" attribute
     */
    void setReportingEndDate(java.util.Calendar reportingEndDate);

    /**
     * Sets (as xml) the "reportingEndDate" attribute
     */
    void xsetReportingEndDate(org.sdmx.resources.sdmxml.schemas.v30.common.BasicTimePeriodType reportingEndDate);

    /**
     * Unsets the "reportingEndDate" attribute
     */
    void unsetReportingEndDate();

    /**
     * Gets the "publicationYear" attribute
     */
    java.util.Calendar getPublicationYear();

    /**
     * Gets (as xml) the "publicationYear" attribute
     */
    org.apache.xmlbeans.XmlGYear xgetPublicationYear();

    /**
     * True if has "publicationYear" attribute
     */
    boolean isSetPublicationYear();

    /**
     * Sets the "publicationYear" attribute
     */
    void setPublicationYear(java.util.Calendar publicationYear);

    /**
     * Sets (as xml) the "publicationYear" attribute
     */
    void xsetPublicationYear(org.apache.xmlbeans.XmlGYear publicationYear);

    /**
     * Unsets the "publicationYear" attribute
     */
    void unsetPublicationYear();

    /**
     * Gets the "publicationPeriod" attribute
     */
    java.lang.Object getPublicationPeriod();

    /**
     * Gets (as xml) the "publicationPeriod" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetPublicationPeriod();

    /**
     * True if has "publicationPeriod" attribute
     */
    boolean isSetPublicationPeriod();

    /**
     * Sets the "publicationPeriod" attribute
     */
    void setPublicationPeriod(java.lang.Object publicationPeriod);

    /**
     * Sets (as xml) the "publicationPeriod" attribute
     */
    void xsetPublicationPeriod(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType publicationPeriod);

    /**
     * Unsets the "publicationPeriod" attribute
     */
    void unsetPublicationPeriod();
}
