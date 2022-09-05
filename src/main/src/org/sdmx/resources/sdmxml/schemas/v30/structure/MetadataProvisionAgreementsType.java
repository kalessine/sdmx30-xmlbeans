/*
 * XML Type:  MetadataProvisionAgreementsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataProvisionAgreementsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataProvisionAgreementsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataprovisionagreementstype9be5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MetadataProvisionAgreement" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType> getMetadataProvisionAgreementList();

    /**
     * Gets array of all "MetadataProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType[] getMetadataProvisionAgreementArray();

    /**
     * Gets ith "MetadataProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType getMetadataProvisionAgreementArray(int i);

    /**
     * Returns number of "MetadataProvisionAgreement" element
     */
    int sizeOfMetadataProvisionAgreementArray();

    /**
     * Sets ith "MetadataProvisionAgreement" element
     */
    void setMetadataProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType metadataProvisionAgreement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType insertNewMetadataProvisionAgreement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementType addNewMetadataProvisionAgreement();

    /**
     * Removes the ith "MetadataProvisionAgreement" element
     */
    void removeMetadataProvisionAgreement(int i);
}
