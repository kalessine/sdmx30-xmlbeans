/*
 * An XML attribute type.
 * Localname: lang
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.w3.xml.x1998.namespace.LangAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.xml.x1998.namespace.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one lang(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public class LangAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.xml.x1998.namespace.LangAttribute {
    private static final long serialVersionUID = 1L;

    public LangAttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/XML/1998/namespace", "lang"),
    };


    /**
     * Gets the "lang" attribute
     */
    @Override
    public java.lang.String getLang() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "lang" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage xgetLang() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "lang" attribute
     */
    @Override
    public boolean isSetLang() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "lang" attribute
     */
    @Override
    public void setLang(java.lang.String lang) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(lang);
        }
    }

    /**
     * Sets (as xml) the "lang" attribute
     */
    @Override
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(lang);
        }
    }

    /**
     * Unsets the "lang" attribute
     */
    @Override
    public void unsetLang() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
