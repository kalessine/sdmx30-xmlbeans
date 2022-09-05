/*
 * An XML document type.
 * Localname: NamePersonalisation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one NamePersonalisation(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class NamePersonalisationDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationDocument {
    private static final long serialVersionUID = 1L;

    public NamePersonalisationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NamePersonalisation"),
    };


    /**
     * Gets the "NamePersonalisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType getNamePersonalisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "NamePersonalisation" element
     */
    @Override
    public void setNamePersonalisation(org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType namePersonalisation) {
        generatedSetterHelperImpl(namePersonalisation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "NamePersonalisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType addNewNamePersonalisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
