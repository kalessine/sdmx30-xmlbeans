/*
 * XML Type:  MaintainableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MaintainableType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public interface MaintainableType extends org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableBaseType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "maintainabletype9dd1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "agencyID" attribute
     */
    java.lang.String getAgencyID();

    /**
     * Gets (as xml) the "agencyID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType xgetAgencyID();

    /**
     * Sets the "agencyID" attribute
     */
    void setAgencyID(java.lang.String agencyID);

    /**
     * Sets (as xml) the "agencyID" attribute
     */
    void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v30.common.NestedNCNameIDType agencyID);

    /**
     * Gets the "isExternalReference" attribute
     */
    boolean getIsExternalReference();

    /**
     * Gets (as xml) the "isExternalReference" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsExternalReference();

    /**
     * True if has "isExternalReference" attribute
     */
    boolean isSetIsExternalReference();

    /**
     * Sets the "isExternalReference" attribute
     */
    void setIsExternalReference(boolean isExternalReference);

    /**
     * Sets (as xml) the "isExternalReference" attribute
     */
    void xsetIsExternalReference(org.apache.xmlbeans.XmlBoolean isExternalReference);

    /**
     * Unsets the "isExternalReference" attribute
     */
    void unsetIsExternalReference();

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
