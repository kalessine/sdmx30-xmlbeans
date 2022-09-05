/*
 * XML Type:  RulesetSchemeBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RulesetSchemeBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class RulesetSchemeBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.VtlDefinitionSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeBaseType {
    private static final long serialVersionUID = 1L;

    public RulesetSchemeBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Ruleset"),
    };


    /**
     * Gets a List of "Ruleset" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType> getRulesetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRulesetArray,
                this::setRulesetArray,
                this::insertNewRuleset,
                this::removeRuleset,
                this::sizeOfRulesetArray
            );
        }
    }

    /**
     * Gets array of all "Ruleset" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType[] getRulesetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType[0]);
    }

    /**
     * Gets ith "Ruleset" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType getRulesetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Ruleset" element
     */
    @Override
    public int sizeOfRulesetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Ruleset" element
     */
    @Override
    public void setRulesetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType ruleset) {
        generatedSetterHelperImpl(ruleset, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Ruleset" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType insertNewRuleset(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Ruleset" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType addNewRuleset() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Ruleset" element
     */
    @Override
    public void removeRuleset(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
