/*
 * An XML document type.
 * Localname: OrganisationUnit
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one OrganisationUnit(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitDocument {
    private static final long serialVersionUID = 1L;

    public OrganisationUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationUnit"),
    };


    /**
     * Gets the "OrganisationUnit" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType getOrganisationUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "OrganisationUnit" element
     */
    @Override
    public void setOrganisationUnit(org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitType organisationUnit) {
        generatedSetterHelperImpl(organisationUnit, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "OrganisationUnit" element
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
}
