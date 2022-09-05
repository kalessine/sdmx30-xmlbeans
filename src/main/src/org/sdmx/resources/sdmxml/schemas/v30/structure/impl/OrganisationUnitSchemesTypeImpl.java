/*
 * XML Type:  OrganisationUnitSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML OrganisationUnitSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class OrganisationUnitSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType {
    private static final long serialVersionUID = 1L;

    public OrganisationUnitSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationUnitScheme"),
    };


    /**
     * Gets a List of "OrganisationUnitScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType> getOrganisationUnitSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOrganisationUnitSchemeArray,
                this::setOrganisationUnitSchemeArray,
                this::insertNewOrganisationUnitScheme,
                this::removeOrganisationUnitScheme,
                this::sizeOfOrganisationUnitSchemeArray
            );
        }
    }

    /**
     * Gets array of all "OrganisationUnitScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType[] getOrganisationUnitSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType[0]);
    }

    /**
     * Gets ith "OrganisationUnitScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType getOrganisationUnitSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "OrganisationUnitScheme" element
     */
    @Override
    public int sizeOfOrganisationUnitSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "OrganisationUnitScheme" element
     */
    @Override
    public void setOrganisationUnitSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType organisationUnitScheme) {
        generatedSetterHelperImpl(organisationUnitScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnitScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType insertNewOrganisationUnitScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnitScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType addNewOrganisationUnitScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "OrganisationUnitScheme" element
     */
    @Override
    public void removeOrganisationUnitScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
