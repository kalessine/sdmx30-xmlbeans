/*
 * XML Type:  GeographicCodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GeographicCodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GeographicCodelistsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType {
    private static final long serialVersionUID = 1L;

    public GeographicCodelistsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeographicCodelist"),
    };


    /**
     * Gets a List of "GeographicCodelist" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType> getGeographicCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGeographicCodelistArray,
                this::setGeographicCodelistArray,
                this::insertNewGeographicCodelist,
                this::removeGeographicCodelist,
                this::sizeOfGeographicCodelistArray
            );
        }
    }

    /**
     * Gets array of all "GeographicCodelist" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType[] getGeographicCodelistArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType[0]);
    }

    /**
     * Gets ith "GeographicCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType getGeographicCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "GeographicCodelist" element
     */
    @Override
    public int sizeOfGeographicCodelistArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "GeographicCodelist" element
     */
    @Override
    public void setGeographicCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType geographicCodelist) {
        generatedSetterHelperImpl(geographicCodelist, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeographicCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType insertNewGeographicCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "GeographicCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType addNewGeographicCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "GeographicCodelist" element
     */
    @Override
    public void removeGeographicCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
