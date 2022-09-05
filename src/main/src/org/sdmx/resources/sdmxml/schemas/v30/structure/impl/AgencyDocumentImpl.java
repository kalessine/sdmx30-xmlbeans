/*
 * An XML document type.
 * Localname: Agency
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Agency(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class AgencyDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyDocument {
    private static final long serialVersionUID = 1L;

    public AgencyDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Agency"),
    };


    /**
     * Gets the "Agency" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType getAgency() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Agency" element
     */
    @Override
    public void setAgency(org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType agency) {
        generatedSetterHelperImpl(agency, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Agency" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType addNewAgency() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencyType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
