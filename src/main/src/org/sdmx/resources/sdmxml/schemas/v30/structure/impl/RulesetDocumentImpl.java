/*
 * An XML document type.
 * Localname: Ruleset
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Ruleset(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class RulesetDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetDocument {
    private static final long serialVersionUID = 1L;

    public RulesetDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Ruleset"),
    };


    /**
     * Gets the "Ruleset" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType getRuleset() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Ruleset" element
     */
    @Override
    public void setRuleset(org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetType ruleset) {
        generatedSetterHelperImpl(ruleset, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Ruleset" element
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
}
