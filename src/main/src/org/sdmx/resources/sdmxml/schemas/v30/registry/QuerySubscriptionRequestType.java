/*
 * XML Type:  QuerySubscriptionRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QuerySubscriptionRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface QuerySubscriptionRequestType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.QuerySubscriptionRequestType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "querysubscriptionrequesttype9c1etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Organisation" element
     */
    java.lang.String getOrganisation();

    /**
     * Gets (as xml) the "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType xgetOrganisation();

    /**
     * Sets the "Organisation" element
     */
    void setOrganisation(java.lang.String organisation);

    /**
     * Sets (as xml) the "Organisation" element
     */
    void xsetOrganisation(org.sdmx.resources.sdmxml.schemas.v30.common.OrganisationReferenceType organisation);
}
