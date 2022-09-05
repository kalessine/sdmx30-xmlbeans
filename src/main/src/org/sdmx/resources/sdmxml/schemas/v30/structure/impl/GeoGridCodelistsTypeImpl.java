/*
 * XML Type:  GeoGridCodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GeoGridCodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GeoGridCodelistsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType {
    private static final long serialVersionUID = 1L;

    public GeoGridCodelistsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCodelist"),
    };


    /**
     * Gets a List of "GeoGridCodelist" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType> getGeoGridCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoGridCodelistArray,
                this::setGeoGridCodelistArray,
                this::insertNewGeoGridCodelist,
                this::removeGeoGridCodelist,
                this::sizeOfGeoGridCodelistArray
            );
        }
    }

    /**
     * Gets array of all "GeoGridCodelist" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType[] getGeoGridCodelistArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType[0]);
    }

    /**
     * Gets ith "GeoGridCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType getGeoGridCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "GeoGridCodelist" element
     */
    @Override
    public int sizeOfGeoGridCodelistArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "GeoGridCodelist" element
     */
    @Override
    public void setGeoGridCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType geoGridCodelist) {
        generatedSetterHelperImpl(geoGridCodelist, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoGridCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType insertNewGeoGridCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoGridCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType addNewGeoGridCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "GeoGridCodelist" element
     */
    @Override
    public void removeGeoGridCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
