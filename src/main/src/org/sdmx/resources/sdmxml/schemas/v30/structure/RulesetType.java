/*
 * XML Type:  RulesetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RulesetType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RulesetType extends org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "rulesettype829ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RulesetDefinition" element
     */
    java.lang.String getRulesetDefinition();

    /**
     * Gets (as xml) the "RulesetDefinition" element
     */
    org.apache.xmlbeans.XmlString xgetRulesetDefinition();

    /**
     * Sets the "RulesetDefinition" element
     */
    void setRulesetDefinition(java.lang.String rulesetDefinition);

    /**
     * Sets (as xml) the "RulesetDefinition" element
     */
    void xsetRulesetDefinition(org.apache.xmlbeans.XmlString rulesetDefinition);

    /**
     * Gets the "rulesetType" attribute
     */
    java.lang.String getRulesetType();

    /**
     * Gets (as xml) the "rulesetType" attribute
     */
    org.apache.xmlbeans.XmlString xgetRulesetType();

    /**
     * Sets the "rulesetType" attribute
     */
    void setRulesetType(java.lang.String rulesetType);

    /**
     * Sets (as xml) the "rulesetType" attribute
     */
    void xsetRulesetType(org.apache.xmlbeans.XmlString rulesetType);

    /**
     * Gets the "rulesetScope" attribute
     */
    java.lang.String getRulesetScope();

    /**
     * Gets (as xml) the "rulesetScope" attribute
     */
    org.apache.xmlbeans.XmlString xgetRulesetScope();

    /**
     * Sets the "rulesetScope" attribute
     */
    void setRulesetScope(java.lang.String rulesetScope);

    /**
     * Sets (as xml) the "rulesetScope" attribute
     */
    void xsetRulesetScope(org.apache.xmlbeans.XmlString rulesetScope);
}
