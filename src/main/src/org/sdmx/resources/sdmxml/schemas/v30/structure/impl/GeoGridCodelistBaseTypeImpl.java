/*
 * XML Type:  GeoGridCodelistBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GeoGridCodelistBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GeoGridCodelistBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GeoCodelistTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistBaseType {
    private static final long serialVersionUID = 1L;

    public GeoGridCodelistBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCode"),
        new QName("", "geoType"),
    };


    /**
     * Gets a List of "GeoGridCode" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType> getGeoGridCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoGridCodeArray,
                this::setGeoGridCodeArray,
                this::insertNewGeoGridCode,
                this::removeGeoGridCode,
                this::sizeOfGeoGridCodeArray
            );
        }
    }

    /**
     * Gets array of all "GeoGridCode" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType[] getGeoGridCodeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType[0]);
    }

    /**
     * Gets ith "GeoGridCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType getGeoGridCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "GeoGridCode" element
     */
    @Override
    public int sizeOfGeoGridCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "GeoGridCode" element
     */
    @Override
    public void setGeoGridCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType geoGridCode) {
        generatedSetterHelperImpl(geoGridCode, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoGridCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType insertNewGeoGridCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoGridCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType addNewGeoGridCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "GeoGridCode" element
     */
    @Override
    public void removeGeoGridCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "geoType" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType.Enum getGeoType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoCodelistTypeType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(geoType);
        }
    }
}
