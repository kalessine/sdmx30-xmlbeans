/*
 * XML Type:  FooterMessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.footer.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML FooterMessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message/footer).
 *
 * This is a complex type.
 */
public class FooterMessageTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.CodedStatusMessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.footer.FooterMessageType {
    private static final long serialVersionUID = 1L;

    public FooterMessageTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "severity"),
    };


    /**
     * Gets the "severity" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType.Enum getSeverity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "severity" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType xgetSeverity() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "severity" attribute
     */
    @Override
    public boolean isSetSeverity() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "severity" attribute
     */
    @Override
    public void setSeverity(org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType.Enum severity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(severity);
        }
    }

    /**
     * Sets (as xml) the "severity" attribute
     */
    @Override
    public void xsetSeverity(org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType severity) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.message.footer.SeverityCodeType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(severity);
        }
    }

    /**
     * Unsets the "severity" attribute
     */
    @Override
    public void unsetSeverity() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
