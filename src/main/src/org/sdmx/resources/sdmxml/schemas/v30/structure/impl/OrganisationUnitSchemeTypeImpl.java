/*
 * XML Type:  OrganisationUnitSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML OrganisationUnitSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class OrganisationUnitSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType {
    private static final long serialVersionUID = 1L;

    public OrganisationUnitSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationUnit"),
    };


    /**
     * Gets a List of "OrganisationUnit" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType> getOrganisationUnitList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOrganisationUnitArray,
                this::setOrganisationUnitArray,
                this::insertNewOrganisationUnit,
                this::removeOrganisationUnit,
                this::sizeOfOrganisationUnitArray
            );
        }
    }

    /**
     * Gets array of all "OrganisationUnit" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType[] getOrganisationUnitArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType[0]);
    }

    /**
     * Gets ith "OrganisationUnit" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType getOrganisationUnitArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "OrganisationUnit" element
     */
    @Override
    public int sizeOfOrganisationUnitArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "OrganisationUnit" element
     */
    @Override
    public void setOrganisationUnitArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType organisationUnit) {
        generatedSetterHelperImpl(organisationUnit, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnit" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType insertNewOrganisationUnit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnit" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType addNewOrganisationUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "OrganisationUnit" element
     */
    @Override
    public void removeOrganisationUnit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
