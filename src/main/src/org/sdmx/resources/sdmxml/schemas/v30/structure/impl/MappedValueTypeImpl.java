/*
 * XML Type:  MappedValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MappedValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType.
 */
public class MappedValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.sdmx.resources.sdmxml.schemas.v30.structure.MappedValueType {
    private static final long serialVersionUID = 1L;

    public MappedValueTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, true);
    }

    protected MappedValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "isRegEx"),
        new QName("", "startIndex"),
        new QName("", "endIndex"),
    };


    /**
     * Gets the "isRegEx" attribute
     */
    @Override
    public boolean getIsRegEx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isRegEx" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsRegEx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "isRegEx" attribute
     */
    @Override
    public boolean isSetIsRegEx() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "isRegEx" attribute
     */
    @Override
    public void setIsRegEx(boolean isRegEx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(isRegEx);
        }
    }

    /**
     * Sets (as xml) the "isRegEx" attribute
     */
    @Override
    public void xsetIsRegEx(org.apache.xmlbeans.XmlBoolean isRegEx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(isRegEx);
        }
    }

    /**
     * Unsets the "isRegEx" attribute
     */
    @Override
    public void unsetIsRegEx() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "startIndex" attribute
     */
    @Override
    public int getStartIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "startIndex" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetStartIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "startIndex" attribute
     */
    @Override
    public boolean isSetStartIndex() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "startIndex" attribute
     */
    @Override
    public void setStartIndex(int startIndex) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setIntValue(startIndex);
        }
    }

    /**
     * Sets (as xml) the "startIndex" attribute
     */
    @Override
    public void xsetStartIndex(org.apache.xmlbeans.XmlInt startIndex) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(startIndex);
        }
    }

    /**
     * Unsets the "startIndex" attribute
     */
    @Override
    public void unsetStartIndex() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "endIndex" attribute
     */
    @Override
    public int getEndIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "endIndex" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetEndIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "endIndex" attribute
     */
    @Override
    public boolean isSetEndIndex() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "endIndex" attribute
     */
    @Override
    public void setEndIndex(int endIndex) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setIntValue(endIndex);
        }
    }

    /**
     * Sets (as xml) the "endIndex" attribute
     */
    @Override
    public void xsetEndIndex(org.apache.xmlbeans.XmlInt endIndex) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(endIndex);
        }
    }

    /**
     * Unsets the "endIndex" attribute
     */
    @Override
    public void unsetEndIndex() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}
