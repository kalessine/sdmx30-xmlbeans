/*
 * XML Type:  OrganisationSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML OrganisationSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class OrganisationSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationSchemeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeType {
    private static final long serialVersionUID = 1L;

    public OrganisationSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Organisation"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConsumer"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Organisation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Agency"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationUnit"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataProvider"),
    }),
    };

    /**
     * Gets a List of "Organisation" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType> getOrganisationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOrganisationArray,
                this::setOrganisationArray,
                this::insertNewOrganisation,
                this::removeOrganisation,
                this::sizeOfOrganisationArray
            );
        }
    }

    /**
     * Gets array of all "Organisation" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType[] getOrganisationArray() {
        return getXmlObjectArray(PROPERTY_QSET[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType[0]);
    }

    /**
     * Gets ith "Organisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType getOrganisationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Organisation" element
     */
    @Override
    public int sizeOfOrganisationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QSET[0]);
        }
    }

    /**
     * Sets ith "Organisation" element
     */
    @Override
    public void setOrganisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType organisation) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisation);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Organisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType insertNewOrganisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType)get_store().insert_element_user(PROPERTY_QSET[0], PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Organisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType addNewOrganisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Organisation" element
     */
    @Override
    public void removeOrganisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QSET[0], i);
        }
    }
}
