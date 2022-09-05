/*
 * An XML document type.
 * Localname: Organisation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Organisation(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class OrganisationDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationDocument {
    private static final long serialVersionUID = 1L;

    public OrganisationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * Gets the "Organisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType getOrganisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Organisation" element
     */
    @Override
    public void setOrganisation(org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType organisation) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(organisation);
        }
    }

    /**
     * Appends and returns a new empty "Organisation" element
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
}
