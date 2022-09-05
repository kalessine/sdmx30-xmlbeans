/*
 * An XML document type.
 * Localname: GeoRefCode
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one GeoRefCode(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class GeoRefCodeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.CodeDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeDocument {
    private static final long serialVersionUID = 1L;

    public GeoRefCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoRefCode"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoFeatureSetCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoRefCode"),
    }),
    };

    /**
     * Gets the "GeoRefCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType getGeoRefCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "GeoRefCode" element
     */
    @Override
    public void setGeoRefCode(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType geoRefCode) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(geoRefCode);
        }
    }

    /**
     * Appends and returns a new empty "GeoRefCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType addNewGeoRefCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
