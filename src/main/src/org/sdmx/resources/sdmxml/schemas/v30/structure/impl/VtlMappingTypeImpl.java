/*
 * XML Type:  VtlMappingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VtlMappingType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class VtlMappingTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.VtlMappingBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingType {
    private static final long serialVersionUID = 1L;

    public VtlMappingTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GenericDataflow"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ToVtlMapping"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "FromVtlMapping"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Codelist"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Concept"),
        new QName("", "alias"),
    };


    /**
     * Gets the "Dataflow" element
     */
    @Override
    public java.lang.String getDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Dataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType xgetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Dataflow" element
     */
    @Override
    public boolean isSetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Dataflow" element
     */
    @Override
    public void setDataflow(java.lang.String dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(dataflow);
        }
    }

    /**
     * Sets (as xml) the "Dataflow" element
     */
    @Override
    public void xsetDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType dataflow) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataflowReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(dataflow);
        }
    }

    /**
     * Unsets the "Dataflow" element
     */
    @Override
    public void unsetDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "GenericDataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getGenericDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "GenericDataflow" element
     */
    @Override
    public boolean isSetGenericDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "GenericDataflow" element
     */
    @Override
    public void setGenericDataflow(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType genericDataflow) {
        generatedSetterHelperImpl(genericDataflow, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "GenericDataflow" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewGenericDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "GenericDataflow" element
     */
    @Override
    public void unsetGenericDataflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "ToVtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType getToVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ToVtlMapping" element
     */
    @Override
    public boolean isSetToVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "ToVtlMapping" element
     */
    @Override
    public void setToVtlMapping(org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType toVtlMapping) {
        generatedSetterHelperImpl(toVtlMapping, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ToVtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType addNewToVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "ToVtlMapping" element
     */
    @Override
    public void unsetToVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "FromVtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType getFromVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "FromVtlMapping" element
     */
    @Override
    public boolean isSetFromVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "FromVtlMapping" element
     */
    @Override
    public void setFromVtlMapping(org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType fromVtlMapping) {
        generatedSetterHelperImpl(fromVtlMapping, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FromVtlMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType addNewFromVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.FromVtlMappingType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "FromVtlMapping" element
     */
    @Override
    public void unsetFromVtlMapping() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "Codelist" element
     */
    @Override
    public java.lang.String getCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "Codelist" element
     */
    @Override
    public boolean isSetCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CodelistReferenceType)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(codelist);
        }
    }

    /**
     * Unsets the "Codelist" element
     */
    @Override
    public void unsetCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "Concept" element
     */
    @Override
    public java.lang.String getConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Concept" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType xgetConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return target;
        }
    }

    /**
     * True if has "Concept" element
     */
    @Override
    public boolean isSetConcept() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "Concept" element
     */
    @Override
    public void setConcept(java.lang.String concept) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(concept);
        }
    }

    /**
     * Sets (as xml) the "Concept" element
     */
    @Override
    public void xsetConcept(org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType concept) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.set(concept);
        }
    }

    /**
     * Unsets the "Concept" element
     */
    @Override
    public void unsetConcept() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "alias" attribute
     */
    @Override
    public java.lang.String getAlias() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "alias" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAlias() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Sets the "alias" attribute
     */
    @Override
    public void setAlias(java.lang.String alias) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(alias);
        }
    }

    /**
     * Sets (as xml) the "alias" attribute
     */
    @Override
    public void xsetAlias(org.apache.xmlbeans.XmlString alias) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(alias);
        }
    }
}
