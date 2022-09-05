/*
 * XML Type:  RulesetSchemeBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RulesetSchemeBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RulesetSchemeBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "rulesetschemebasetype5c92type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Ruleset" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType> getRulesetList();

    /**
     * Gets array of all "Ruleset" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType[] getRulesetArray();

    /**
     * Gets ith "Ruleset" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType getRulesetArray(int i);

    /**
     * Returns number of "Ruleset" element
     */
    int sizeOfRulesetArray();

    /**
     * Sets ith "Ruleset" element
     */
    void setRulesetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType ruleset);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Ruleset" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType insertNewRuleset(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Ruleset" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType addNewRuleset();

    /**
     * Removes the ith "Ruleset" element
     */
    void removeRuleset(int i);
}
