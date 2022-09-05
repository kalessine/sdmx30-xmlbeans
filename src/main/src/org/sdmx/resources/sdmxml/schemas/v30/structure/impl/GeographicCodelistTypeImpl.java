/*
 * XML Type:  GeographicCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GeographicCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GeographicCodelistTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GeoCodelistTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType {
    private static final long serialVersionUID = 1L;

    public GeographicCodelistTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoFeatureSetCode"),
        new QName("", "geoType"),
    };


    /**
     * Gets a List of "GeoFeatureSetCode" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType> getGeoFeatureSetCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeoFeatureSetCodeArray,
                this::setGeoFeatureSetCodeArray,
                this::insertNewGeoFeatureSetCode,
                this::removeGeoFeatureSetCode,
                this::sizeOfGeoFeatureSetCodeArray
            );
        }
    }

    /**
     * Gets array of all "GeoFeatureSetCode" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType[] getGeoFeatureSetCodeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType[0]);
    }

    /**
     * Gets ith "GeoFeatureSetCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType getGeoFeatureSetCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "GeoFeatureSetCode" element
     */
    @Override
    public int sizeOfGeoFeatureSetCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "GeoFeatureSetCode" element
     */
    @Override
    public void setGeoFeatureSetCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType geoFeatureSetCode) {
        generatedSetterHelperImpl(geoFeatureSetCode, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoFeatureSetCode" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType insertNewGeoFeatureSetCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoFeatureSetCodeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "GeoFeatureSetCode" element
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

    /**
     * Removes the ith "GeoFeatureSetCode" element
     */
    @Override
    public void removeGeoFeatureSetCode(int i) {
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
