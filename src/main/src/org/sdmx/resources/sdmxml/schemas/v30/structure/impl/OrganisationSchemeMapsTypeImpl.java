/*
 * XML Type:  OrganisationSchemeMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML OrganisationSchemeMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class OrganisationSchemeMapsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType {
    private static final long serialVersionUID = 1L;

    public OrganisationSchemeMapsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationSchemeMap"),
    };


    /**
     * Gets a List of "OrganisationSchemeMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType> getOrganisationSchemeMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOrganisationSchemeMapArray,
                this::setOrganisationSchemeMapArray,
                this::insertNewOrganisationSchemeMap,
                this::removeOrganisationSchemeMap,
                this::sizeOfOrganisationSchemeMapArray
            );
        }
    }

    /**
     * Gets array of all "OrganisationSchemeMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType[] getOrganisationSchemeMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType[0]);
    }

    /**
     * Gets ith "OrganisationSchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType getOrganisationSchemeMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "OrganisationSchemeMap" element
     */
    @Override
    public int sizeOfOrganisationSchemeMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "OrganisationSchemeMap" element
     */
    @Override
    public void setOrganisationSchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType organisationSchemeMap) {
        generatedSetterHelperImpl(organisationSchemeMap, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationSchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType insertNewOrganisationSchemeMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationSchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType addNewOrganisationSchemeMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "OrganisationSchemeMap" element
     */
    @Override
    public void removeOrganisationSchemeMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
