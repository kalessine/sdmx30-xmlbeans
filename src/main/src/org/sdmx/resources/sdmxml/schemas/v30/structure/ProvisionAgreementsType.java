/*
 * XML Type:  ProvisionAgreementsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ProvisionAgreementsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ProvisionAgreementsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "provisionagreementstypea294type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "ProvisionAgreement" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType> getProvisionAgreementList();

    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType[] getProvisionAgreementArray();

    /**
     * Gets ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType getProvisionAgreementArray(int i);

    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();

    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType provisionAgreement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType insertNewProvisionAgreement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementType addNewProvisionAgreement();

    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);
}
