/*
 * An XML attribute type.
 * Localname: lang
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.w3.xml.x1998.namespace.LangAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.xml.x1998.namespace;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one lang(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public interface LangAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.w3.xml.x1998.namespace.LangAttribute> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "lange126attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();

    /**
     * Gets (as xml) the "lang" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLang();

    /**
     * True if has "lang" attribute
     */
    boolean isSetLang();

    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);

    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.apache.xmlbeans.XmlLanguage lang);

    /**
     * Unsets the "lang" attribute
     */
    void unsetLang();
}
