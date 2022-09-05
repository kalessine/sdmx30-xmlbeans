/*
 * XML Type:  RulesetSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RulesetSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class RulesetSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType {
    private static final long serialVersionUID = 1L;

    public RulesetSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RulesetScheme"),
    };


    /**
     * Gets a List of "RulesetScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType> getRulesetSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRulesetSchemeArray,
                this::setRulesetSchemeArray,
                this::insertNewRulesetScheme,
                this::removeRulesetScheme,
                this::sizeOfRulesetSchemeArray
            );
        }
    }

    /**
     * Gets array of all "RulesetScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType[] getRulesetSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType[0]);
    }

    /**
     * Gets ith "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType getRulesetSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RulesetScheme" element
     */
    @Override
    public int sizeOfRulesetSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "RulesetScheme" element
     */
    @Override
    public void setRulesetSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType rulesetScheme) {
        generatedSetterHelperImpl(rulesetScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType insertNewRulesetScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType addNewRulesetScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "RulesetScheme" element
     */
    @Override
    public void removeRulesetScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
