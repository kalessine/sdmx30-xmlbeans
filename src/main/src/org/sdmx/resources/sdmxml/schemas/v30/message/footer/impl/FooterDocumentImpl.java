/*
 * An XML document type.
 * Localname: Footer
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.footer.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Footer(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer) element.
 *
 * This is a complex type.
 */
public class FooterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterDocument {
    private static final long serialVersionUID = 1L;

    public FooterDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer", "Footer"),
    };


    /**
     * Gets the "Footer" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType getFooter() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Footer" element
     */
    @Override
    public void setFooter(org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType footer) {
        generatedSetterHelperImpl(footer, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Footer" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType addNewFooter() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
