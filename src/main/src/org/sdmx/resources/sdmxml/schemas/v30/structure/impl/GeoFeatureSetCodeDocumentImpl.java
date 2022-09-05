/*
 * An XML document type.
 * Localname: GeoFeatureSetCode
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one GeoFeatureSetCode(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class GeoFeatureSetCodeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GeoRefCodeDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeDocument {
    private static final long serialVersionUID = 1L;

    public GeoFeatureSetCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoFeatureSetCode"),
    };


    /**
     * Gets the "GeoFeatureSetCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType getGeoFeatureSetCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "GeoFeatureSetCode" element
     */
    @Override
    public void setGeoFeatureSetCode(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType geoFeatureSetCode) {
        generatedSetterHelperImpl(geoFeatureSetCode, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "GeoFeatureSetCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType addNewGeoFeatureSetCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
