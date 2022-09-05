/*
 * XML Type:  CodelistExtensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CodelistExtensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CodelistExtensionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType {
    private static final long serialVersionUID = 1L;

    public CodelistExtensionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Codelist"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "InclusiveCodeSelection"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ExclusiveCodeSelection"),
        new QName("", "prefix"),
    };


    /**
     * Gets the "Codelist" element
     */
    @Override
    public java.lang.String getCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Codelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType xgetCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "Codelist" element
     */
    @Override
    public void setCodelist(java.lang.String codelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(codelist);
        }
    }

    /**
     * Sets (as xml) the "Codelist" element
     */
    @Override
    public void xsetCodelist(org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType codelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(codelist);
        }
    }

    /**
     * Gets the "InclusiveCodeSelection" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType getInclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "InclusiveCodeSelection" element
     */
    @Override
    public boolean isSetInclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "InclusiveCodeSelection" element
     */
    @Override
    public void setInclusiveCodeSelection(org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType inclusiveCodeSelection) {
        generatedSetterHelperImpl(inclusiveCodeSelection, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InclusiveCodeSelection" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType addNewInclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "InclusiveCodeSelection" element
     */
    @Override
    public void unsetInclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "ExclusiveCodeSelection" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType getExclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ExclusiveCodeSelection" element
     */
    @Override
    public boolean isSetExclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "ExclusiveCodeSelection" element
     */
    @Override
    public void setExclusiveCodeSelection(org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType exclusiveCodeSelection) {
        generatedSetterHelperImpl(exclusiveCodeSelection, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ExclusiveCodeSelection" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType addNewExclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "ExclusiveCodeSelection" element
     */
    @Override
    public void unsetExclusiveCodeSelection() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "prefix" attribute
     */
    @Override
    public java.lang.String getPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "prefix" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "prefix" attribute
     */
    @Override
    public boolean isSetPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "prefix" attribute
     */
    @Override
    public void setPrefix(java.lang.String prefix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(prefix);
        }
    }

    /**
     * Sets (as xml) the "prefix" attribute
     */
    @Override
    public void xsetPrefix(org.apache.xmlbeans.XmlString prefix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(prefix);
        }
    }

    /**
     * Unsets the "prefix" attribute
     */
    @Override
    public void unsetPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
