/*
 * An XML document type.
 * Localname: MetadataProvider
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MetadataProvider(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class MetadataProviderDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderDocument {
    private static final long serialVersionUID = 1L;

    public MetadataProviderDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvider"),
    };


    /**
     * Gets the "MetadataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType getMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MetadataProvider" element
     */
    @Override
    public void setMetadataProvider(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType metadataProvider) {
        generatedSetterHelperImpl(metadataProvider, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType addNewMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
