/*
 * XML Type:  GeoCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GeoCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GeoCodelistTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GeoCodelistBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistType {
    private static final long serialVersionUID = 1L;

    public GeoCodelistTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "geoType"),
    };


    /**
     * Gets the "geoType" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType.Enum getGeoType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "geoType" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType xgetGeoType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "geoType" attribute
     */
    @Override
    public void setGeoType(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType.Enum geoType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(geoType);
        }
    }

    /**
     * Sets (as xml) the "geoType" attribute
     */
    @Override
    public void xsetGeoType(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType geoType) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(geoType);
        }
    }
}
