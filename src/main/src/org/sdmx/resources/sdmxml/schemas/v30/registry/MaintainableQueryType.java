/*
 * XML Type:  MaintainableQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MaintainableQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface MaintainableQueryType extends org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableQueryType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.MaintainableQueryType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "maintainablequerytype9097type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "agencyID" attribute
     */
    java.lang.String getAgencyID();

    /**
     * Gets (as xml) the "agencyID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType xgetAgencyID();

    /**
     * True if has "agencyID" attribute
     */
    boolean isSetAgencyID();

    /**
     * Sets the "agencyID" attribute
     */
    void setAgencyID(java.lang.String agencyID);

    /**
     * Sets (as xml) the "agencyID" attribute
     */
    void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType agencyID);

    /**
     * Unsets the "agencyID" attribute
     */
    void unsetAgencyID();
}
