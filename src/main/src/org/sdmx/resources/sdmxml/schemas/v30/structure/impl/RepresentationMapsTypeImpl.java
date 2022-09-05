/*
 * XML Type:  RepresentationMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RepresentationMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class RepresentationMapsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType {
    private static final long serialVersionUID = 1L;

    public RepresentationMapsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RepresentationMap"),
    };


    /**
     * Gets a List of "RepresentationMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType> getRepresentationMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRepresentationMapArray,
                this::setRepresentationMapArray,
                this::insertNewRepresentationMap,
                this::removeRepresentationMap,
                this::sizeOfRepresentationMapArray
            );
        }
    }

    /**
     * Gets array of all "RepresentationMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType[] getRepresentationMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType[0]);
    }

    /**
     * Gets ith "RepresentationMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType getRepresentationMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RepresentationMap" element
     */
    @Override
    public int sizeOfRepresentationMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "RepresentationMap" element
     */
    @Override
    public void setRepresentationMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType representationMap) {
        generatedSetterHelperImpl(representationMap, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentationMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType insertNewRepresentationMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentationMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType addNewRepresentationMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "RepresentationMap" element
     */
    @Override
    public void removeRepresentationMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
