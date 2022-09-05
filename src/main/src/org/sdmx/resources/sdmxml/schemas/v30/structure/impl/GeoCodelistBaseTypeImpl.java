/*
 * XML Type:  GeoCodelistBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GeoCodelistBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GeoCodelistBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.CodelistTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistBaseType {
    private static final long serialVersionUID = 1L;

    public GeoCodelistBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * Gets a List of "GeoRefCode" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType> getGeoRefCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoRefCodeArray,
                this::setGeoRefCodeArray,
                this::insertNewGeoRefCode,
                this::removeGeoRefCode,
                this::sizeOfGeoRefCodeArray
            );
        }
    }

    /**
     * Gets array of all "GeoRefCode" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType[] getGeoRefCodeArray() {
        return getXmlObjectArray(PROPERTY_QSET[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType[0]);
    }

    /**
     * Gets ith "GeoRefCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType getGeoRefCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "GeoRefCode" element
     */
    @Override
    public int sizeOfGeoRefCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QSET[0]);
        }
    }

    /**
     * Sets ith "GeoRefCode" element
     */
    @Override
    public void setGeoRefCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType geoRefCode) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(geoRefCode);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoRefCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType insertNewGeoRefCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoRefCodeType)get_store().insert_element_user(PROPERTY_QSET[0], PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoRefCode" element
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

    /**
     * Removes the ith "GeoRefCode" element
     */
    @Override
    public void removeGeoRefCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QSET[0], i);
        }
    }
}
