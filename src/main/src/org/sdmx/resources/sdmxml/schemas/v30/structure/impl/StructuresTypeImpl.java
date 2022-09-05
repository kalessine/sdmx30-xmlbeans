/*
 * XML Type:  StructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class StructuresTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType {
    private static final long serialVersionUID = 1L;

    public StructuresTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AgencySchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Categorisations"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CategorySchemeMaps"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CategorySchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Codelists"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConceptSchemeMaps"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConceptSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CustomTypeSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConstraints"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConsumerSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dataflows"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataProviderSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataStructures"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeographicCodelists"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCodelists"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Hierarchies"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "HierarchyAssociations"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataConstraints"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Metadataflows"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProviderSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvisionAgreements"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataStructures"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NamePersonalisationSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationSchemeMaps"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationUnitSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Processes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ProvisionAgreements"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingTaxonomies"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingTaxonomyMaps"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RepresentationMaps"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RulesetSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "StructureMaps"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TransformationSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "UserDefinedOperatorSchemes"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ValueLists"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMappingSchemes"),
    };


    /**
     * Gets the "AgencySchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType getAgencySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "AgencySchemes" element
     */
    @Override
    public boolean isSetAgencySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "AgencySchemes" element
     */
    @Override
    public void setAgencySchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType agencySchemes) {
        generatedSetterHelperImpl(agencySchemes, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AgencySchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType addNewAgencySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AgencySchemesType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "AgencySchemes" element
     */
    @Override
    public void unsetAgencySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Categorisations" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType getCategorisations() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Categorisations" element
     */
    @Override
    public boolean isSetCategorisations() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Categorisations" element
     */
    @Override
    public void setCategorisations(org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType categorisations) {
        generatedSetterHelperImpl(categorisations, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Categorisations" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType addNewCategorisations() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Categorisations" element
     */
    @Override
    public void unsetCategorisations() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "CategorySchemeMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType getCategorySchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CategorySchemeMaps" element
     */
    @Override
    public boolean isSetCategorySchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "CategorySchemeMaps" element
     */
    @Override
    public void setCategorySchemeMaps(org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType categorySchemeMaps) {
        generatedSetterHelperImpl(categorySchemeMaps, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CategorySchemeMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType addNewCategorySchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "CategorySchemeMaps" element
     */
    @Override
    public void unsetCategorySchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "CategorySchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType getCategorySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CategorySchemes" element
     */
    @Override
    public boolean isSetCategorySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "CategorySchemes" element
     */
    @Override
    public void setCategorySchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType categorySchemes) {
        generatedSetterHelperImpl(categorySchemes, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CategorySchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType addNewCategorySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "CategorySchemes" element
     */
    @Override
    public void unsetCategorySchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "Codelists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType getCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Codelists" element
     */
    @Override
    public boolean isSetCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "Codelists" element
     */
    @Override
    public void setCodelists(org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType codelists) {
        generatedSetterHelperImpl(codelists, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Codelists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType addNewCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "Codelists" element
     */
    @Override
    public void unsetCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "ConceptSchemeMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType getConceptSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ConceptSchemeMaps" element
     */
    @Override
    public boolean isSetConceptSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "ConceptSchemeMaps" element
     */
    @Override
    public void setConceptSchemeMaps(org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType conceptSchemeMaps) {
        generatedSetterHelperImpl(conceptSchemeMaps, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptSchemeMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType addNewConceptSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "ConceptSchemeMaps" element
     */
    @Override
    public void unsetConceptSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "ConceptSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType getConceptSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ConceptSchemes" element
     */
    @Override
    public boolean isSetConceptSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "ConceptSchemes" element
     */
    @Override
    public void setConceptSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType conceptSchemes) {
        generatedSetterHelperImpl(conceptSchemes, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType addNewConceptSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "ConceptSchemes" element
     */
    @Override
    public void unsetConceptSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "CustomTypeSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType getCustomTypeSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CustomTypeSchemes" element
     */
    @Override
    public boolean isSetCustomTypeSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "CustomTypeSchemes" element
     */
    @Override
    public void setCustomTypeSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType customTypeSchemes) {
        generatedSetterHelperImpl(customTypeSchemes, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CustomTypeSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType addNewCustomTypeSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeSchemesType)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "CustomTypeSchemes" element
     */
    @Override
    public void unsetCustomTypeSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "DataConstraints" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType getDataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DataConstraints" element
     */
    @Override
    public boolean isSetDataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "DataConstraints" element
     */
    @Override
    public void setDataConstraints(org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType dataConstraints) {
        generatedSetterHelperImpl(dataConstraints, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataConstraints" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType addNewDataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintsType)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "DataConstraints" element
     */
    @Override
    public void unsetDataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "DataConsumerSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType getDataConsumerSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DataConsumerSchemes" element
     */
    @Override
    public boolean isSetDataConsumerSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "DataConsumerSchemes" element
     */
    @Override
    public void setDataConsumerSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType dataConsumerSchemes) {
        generatedSetterHelperImpl(dataConsumerSchemes, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataConsumerSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType addNewDataConsumerSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerSchemesType)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "DataConsumerSchemes" element
     */
    @Override
    public void unsetDataConsumerSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets the "Dataflows" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType getDataflows() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Dataflows" element
     */
    @Override
    public boolean isSetDataflows() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "Dataflows" element
     */
    @Override
    public void setDataflows(org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType dataflows) {
        generatedSetterHelperImpl(dataflows, PROPERTY_QNAME[10], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Dataflows" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType addNewDataflows() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataflowsType)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Unsets the "Dataflows" element
     */
    @Override
    public void unsetDataflows() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }

    /**
     * Gets the "DataProviderSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType getDataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DataProviderSchemes" element
     */
    @Override
    public boolean isSetDataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]) != 0;
        }
    }

    /**
     * Sets the "DataProviderSchemes" element
     */
    @Override
    public void setDataProviderSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType dataProviderSchemes) {
        generatedSetterHelperImpl(dataProviderSchemes, PROPERTY_QNAME[11], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataProviderSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType addNewDataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderSchemesType)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Unsets the "DataProviderSchemes" element
     */
    @Override
    public void unsetDataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], 0);
        }
    }

    /**
     * Gets the "DataStructures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType getDataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DataStructures" element
     */
    @Override
    public boolean isSetDataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "DataStructures" element
     */
    @Override
    public void setDataStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType dataStructures) {
        generatedSetterHelperImpl(dataStructures, PROPERTY_QNAME[12], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataStructures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType addNewDataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataStructuresType)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Unsets the "DataStructures" element
     */
    @Override
    public void unsetDataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }

    /**
     * Gets the "GeographicCodelists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType getGeographicCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "GeographicCodelists" element
     */
    @Override
    public boolean isSetGeographicCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]) != 0;
        }
    }

    /**
     * Sets the "GeographicCodelists" element
     */
    @Override
    public void setGeographicCodelists(org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType geographicCodelists) {
        generatedSetterHelperImpl(geographicCodelists, PROPERTY_QNAME[13], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "GeographicCodelists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType addNewGeographicCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeographicCodelistsType)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Unsets the "GeographicCodelists" element
     */
    @Override
    public void unsetGeographicCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], 0);
        }
    }

    /**
     * Gets the "GeoGridCodelists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType getGeoGridCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "GeoGridCodelists" element
     */
    @Override
    public boolean isSetGeoGridCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]) != 0;
        }
    }

    /**
     * Sets the "GeoGridCodelists" element
     */
    @Override
    public void setGeoGridCodelists(org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType geoGridCodelists) {
        generatedSetterHelperImpl(geoGridCodelists, PROPERTY_QNAME[14], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "GeoGridCodelists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType addNewGeoGridCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GeoGridCodelistsType)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Unsets the "GeoGridCodelists" element
     */
    @Override
    public void unsetGeoGridCodelists() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], 0);
        }
    }

    /**
     * Gets the "Hierarchies" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType getHierarchies() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Hierarchies" element
     */
    @Override
    public boolean isSetHierarchies() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]) != 0;
        }
    }

    /**
     * Sets the "Hierarchies" element
     */
    @Override
    public void setHierarchies(org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType hierarchies) {
        generatedSetterHelperImpl(hierarchies, PROPERTY_QNAME[15], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Hierarchies" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType addNewHierarchies() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchiesType)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Unsets the "Hierarchies" element
     */
    @Override
    public void unsetHierarchies() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], 0);
        }
    }

    /**
     * Gets the "HierarchyAssociations" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType getHierarchyAssociations() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType)get_store().find_element_user(PROPERTY_QNAME[16], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "HierarchyAssociations" element
     */
    @Override
    public boolean isSetHierarchyAssociations() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]) != 0;
        }
    }

    /**
     * Sets the "HierarchyAssociations" element
     */
    @Override
    public void setHierarchyAssociations(org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType hierarchyAssociations) {
        generatedSetterHelperImpl(hierarchyAssociations, PROPERTY_QNAME[16], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HierarchyAssociations" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType addNewHierarchyAssociations() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.HierarchyAssociationsType)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Unsets the "HierarchyAssociations" element
     */
    @Override
    public void unsetHierarchyAssociations() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], 0);
        }
    }

    /**
     * Gets the "MetadataConstraints" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType getMetadataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType)get_store().find_element_user(PROPERTY_QNAME[17], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MetadataConstraints" element
     */
    @Override
    public boolean isSetMetadataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]) != 0;
        }
    }

    /**
     * Sets the "MetadataConstraints" element
     */
    @Override
    public void setMetadataConstraints(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType metadataConstraints) {
        generatedSetterHelperImpl(metadataConstraints, PROPERTY_QNAME[17], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataConstraints" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType addNewMetadataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Unsets the "MetadataConstraints" element
     */
    @Override
    public void unsetMetadataConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], 0);
        }
    }

    /**
     * Gets the "Metadataflows" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType getMetadataflows() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Metadataflows" element
     */
    @Override
    public boolean isSetMetadataflows() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]) != 0;
        }
    }

    /**
     * Sets the "Metadataflows" element
     */
    @Override
    public void setMetadataflows(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType metadataflows) {
        generatedSetterHelperImpl(metadataflows, PROPERTY_QNAME[18], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Metadataflows" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType addNewMetadataflows() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataflowsType)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Unsets the "Metadataflows" element
     */
    @Override
    public void unsetMetadataflows() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], 0);
        }
    }

    /**
     * Gets the "MetadataProviderSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType getMetadataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType)get_store().find_element_user(PROPERTY_QNAME[19], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MetadataProviderSchemes" element
     */
    @Override
    public boolean isSetMetadataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]) != 0;
        }
    }

    /**
     * Sets the "MetadataProviderSchemes" element
     */
    @Override
    public void setMetadataProviderSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType metadataProviderSchemes) {
        generatedSetterHelperImpl(metadataProviderSchemes, PROPERTY_QNAME[19], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataProviderSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType addNewMetadataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProviderSchemesType)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Unsets the "MetadataProviderSchemes" element
     */
    @Override
    public void unsetMetadataProviderSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], 0);
        }
    }

    /**
     * Gets the "MetadataProvisionAgreements" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType getMetadataProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType)get_store().find_element_user(PROPERTY_QNAME[20], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MetadataProvisionAgreements" element
     */
    @Override
    public boolean isSetMetadataProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[20]) != 0;
        }
    }

    /**
     * Sets the "MetadataProvisionAgreements" element
     */
    @Override
    public void setMetadataProvisionAgreements(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType metadataProvisionAgreements) {
        generatedSetterHelperImpl(metadataProvisionAgreements, PROPERTY_QNAME[20], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataProvisionAgreements" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType addNewMetadataProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataProvisionAgreementsType)get_store().add_element_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Unsets the "MetadataProvisionAgreements" element
     */
    @Override
    public void unsetMetadataProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[20], 0);
        }
    }

    /**
     * Gets the "MetadataStructures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType getMetadataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType)get_store().find_element_user(PROPERTY_QNAME[21], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MetadataStructures" element
     */
    @Override
    public boolean isSetMetadataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[21]) != 0;
        }
    }

    /**
     * Sets the "MetadataStructures" element
     */
    @Override
    public void setMetadataStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType metadataStructures) {
        generatedSetterHelperImpl(metadataStructures, PROPERTY_QNAME[21], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MetadataStructures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType addNewMetadataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataStructuresType)get_store().add_element_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * Unsets the "MetadataStructures" element
     */
    @Override
    public void unsetMetadataStructures() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[21], 0);
        }
    }

    /**
     * Gets the "NamePersonalisationSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType getNamePersonalisationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType)get_store().find_element_user(PROPERTY_QNAME[22], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "NamePersonalisationSchemes" element
     */
    @Override
    public boolean isSetNamePersonalisationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[22]) != 0;
        }
    }

    /**
     * Sets the "NamePersonalisationSchemes" element
     */
    @Override
    public void setNamePersonalisationSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType namePersonalisationSchemes) {
        generatedSetterHelperImpl(namePersonalisationSchemes, PROPERTY_QNAME[22], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "NamePersonalisationSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType addNewNamePersonalisationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType)get_store().add_element_user(PROPERTY_QNAME[22]);
            return target;
        }
    }

    /**
     * Unsets the "NamePersonalisationSchemes" element
     */
    @Override
    public void unsetNamePersonalisationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[22], 0);
        }
    }

    /**
     * Gets the "OrganisationSchemeMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType getOrganisationSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType)get_store().find_element_user(PROPERTY_QNAME[23], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "OrganisationSchemeMaps" element
     */
    @Override
    public boolean isSetOrganisationSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[23]) != 0;
        }
    }

    /**
     * Sets the "OrganisationSchemeMaps" element
     */
    @Override
    public void setOrganisationSchemeMaps(org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType organisationSchemeMaps) {
        generatedSetterHelperImpl(organisationSchemeMaps, PROPERTY_QNAME[23], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "OrganisationSchemeMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType addNewOrganisationSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationSchemeMapsType)get_store().add_element_user(PROPERTY_QNAME[23]);
            return target;
        }
    }

    /**
     * Unsets the "OrganisationSchemeMaps" element
     */
    @Override
    public void unsetOrganisationSchemeMaps() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[23], 0);
        }
    }

    /**
     * Gets the "OrganisationUnitSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType getOrganisationUnitSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType)get_store().find_element_user(PROPERTY_QNAME[24], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "OrganisationUnitSchemes" element
     */
    @Override
    public boolean isSetOrganisationUnitSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[24]) != 0;
        }
    }

    /**
     * Sets the "OrganisationUnitSchemes" element
     */
    @Override
    public void setOrganisationUnitSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType organisationUnitSchemes) {
        generatedSetterHelperImpl(organisationUnitSchemes, PROPERTY_QNAME[24], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "OrganisationUnitSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType addNewOrganisationUnitSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.OrganisationUnitSchemesType)get_store().add_element_user(PROPERTY_QNAME[24]);
            return target;
        }
    }

    /**
     * Unsets the "OrganisationUnitSchemes" element
     */
    @Override
    public void unsetOrganisationUnitSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[24], 0);
        }
    }

    /**
     * Gets the "Processes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType getProcesses() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType)get_store().find_element_user(PROPERTY_QNAME[25], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Processes" element
     */
    @Override
    public boolean isSetProcesses() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[25]) != 0;
        }
    }

    /**
     * Sets the "Processes" element
     */
    @Override
    public void setProcesses(org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType processes) {
        generatedSetterHelperImpl(processes, PROPERTY_QNAME[25], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Processes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType addNewProcesses() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProcessesType)get_store().add_element_user(PROPERTY_QNAME[25]);
            return target;
        }
    }

    /**
     * Unsets the "Processes" element
     */
    @Override
    public void unsetProcesses() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[25], 0);
        }
    }

    /**
     * Gets the "ProvisionAgreements" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType getProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType)get_store().find_element_user(PROPERTY_QNAME[26], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ProvisionAgreements" element
     */
    @Override
    public boolean isSetProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[26]) != 0;
        }
    }

    /**
     * Sets the "ProvisionAgreements" element
     */
    @Override
    public void setProvisionAgreements(org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType provisionAgreements) {
        generatedSetterHelperImpl(provisionAgreements, PROPERTY_QNAME[26], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProvisionAgreements" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType addNewProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ProvisionAgreementsType)get_store().add_element_user(PROPERTY_QNAME[26]);
            return target;
        }
    }

    /**
     * Unsets the "ProvisionAgreements" element
     */
    @Override
    public void unsetProvisionAgreements() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[26], 0);
        }
    }

    /**
     * Gets the "ReportingTaxonomies" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType getReportingTaxonomies() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType)get_store().find_element_user(PROPERTY_QNAME[27], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ReportingTaxonomies" element
     */
    @Override
    public boolean isSetReportingTaxonomies() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[27]) != 0;
        }
    }

    /**
     * Sets the "ReportingTaxonomies" element
     */
    @Override
    public void setReportingTaxonomies(org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType reportingTaxonomies) {
        generatedSetterHelperImpl(reportingTaxonomies, PROPERTY_QNAME[27], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReportingTaxonomies" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType addNewReportingTaxonomies() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomiesType)get_store().add_element_user(PROPERTY_QNAME[27]);
            return target;
        }
    }

    /**
     * Unsets the "ReportingTaxonomies" element
     */
    @Override
    public void unsetReportingTaxonomies() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[27], 0);
        }
    }

    /**
     * Gets the "ReportingTaxonomyMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType getReportingTaxonomyMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType)get_store().find_element_user(PROPERTY_QNAME[28], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ReportingTaxonomyMaps" element
     */
    @Override
    public boolean isSetReportingTaxonomyMaps() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[28]) != 0;
        }
    }

    /**
     * Sets the "ReportingTaxonomyMaps" element
     */
    @Override
    public void setReportingTaxonomyMaps(org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType reportingTaxonomyMaps) {
        generatedSetterHelperImpl(reportingTaxonomyMaps, PROPERTY_QNAME[28], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReportingTaxonomyMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType addNewReportingTaxonomyMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReportingTaxonomyMapsType)get_store().add_element_user(PROPERTY_QNAME[28]);
            return target;
        }
    }

    /**
     * Unsets the "ReportingTaxonomyMaps" element
     */
    @Override
    public void unsetReportingTaxonomyMaps() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[28], 0);
        }
    }

    /**
     * Gets the "RepresentationMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType getRepresentationMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType)get_store().find_element_user(PROPERTY_QNAME[29], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "RepresentationMaps" element
     */
    @Override
    public boolean isSetRepresentationMaps() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[29]) != 0;
        }
    }

    /**
     * Sets the "RepresentationMaps" element
     */
    @Override
    public void setRepresentationMaps(org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType representationMaps) {
        generatedSetterHelperImpl(representationMaps, PROPERTY_QNAME[29], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RepresentationMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType addNewRepresentationMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapsType)get_store().add_element_user(PROPERTY_QNAME[29]);
            return target;
        }
    }

    /**
     * Unsets the "RepresentationMaps" element
     */
    @Override
    public void unsetRepresentationMaps() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[29], 0);
        }
    }

    /**
     * Gets the "RulesetSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType getRulesetSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType)get_store().find_element_user(PROPERTY_QNAME[30], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "RulesetSchemes" element
     */
    @Override
    public boolean isSetRulesetSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[30]) != 0;
        }
    }

    /**
     * Sets the "RulesetSchemes" element
     */
    @Override
    public void setRulesetSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType rulesetSchemes) {
        generatedSetterHelperImpl(rulesetSchemes, PROPERTY_QNAME[30], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RulesetSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType addNewRulesetSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType)get_store().add_element_user(PROPERTY_QNAME[30]);
            return target;
        }
    }

    /**
     * Unsets the "RulesetSchemes" element
     */
    @Override
    public void unsetRulesetSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[30], 0);
        }
    }

    /**
     * Gets the "StructureMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType getStructureMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType)get_store().find_element_user(PROPERTY_QNAME[31], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "StructureMaps" element
     */
    @Override
    public boolean isSetStructureMaps() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[31]) != 0;
        }
    }

    /**
     * Sets the "StructureMaps" element
     */
    @Override
    public void setStructureMaps(org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType structureMaps) {
        generatedSetterHelperImpl(structureMaps, PROPERTY_QNAME[31], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StructureMaps" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType addNewStructureMaps() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType)get_store().add_element_user(PROPERTY_QNAME[31]);
            return target;
        }
    }

    /**
     * Unsets the "StructureMaps" element
     */
    @Override
    public void unsetStructureMaps() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[31], 0);
        }
    }

    /**
     * Gets the "TransformationSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType getTransformationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType)get_store().find_element_user(PROPERTY_QNAME[32], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "TransformationSchemes" element
     */
    @Override
    public boolean isSetTransformationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[32]) != 0;
        }
    }

    /**
     * Sets the "TransformationSchemes" element
     */
    @Override
    public void setTransformationSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType transformationSchemes) {
        generatedSetterHelperImpl(transformationSchemes, PROPERTY_QNAME[32], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TransformationSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType addNewTransformationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemesType)get_store().add_element_user(PROPERTY_QNAME[32]);
            return target;
        }
    }

    /**
     * Unsets the "TransformationSchemes" element
     */
    @Override
    public void unsetTransformationSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[32], 0);
        }
    }

    /**
     * Gets the "UserDefinedOperatorSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType getUserDefinedOperatorSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType)get_store().find_element_user(PROPERTY_QNAME[33], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "UserDefinedOperatorSchemes" element
     */
    @Override
    public boolean isSetUserDefinedOperatorSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[33]) != 0;
        }
    }

    /**
     * Sets the "UserDefinedOperatorSchemes" element
     */
    @Override
    public void setUserDefinedOperatorSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType userDefinedOperatorSchemes) {
        generatedSetterHelperImpl(userDefinedOperatorSchemes, PROPERTY_QNAME[33], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "UserDefinedOperatorSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType addNewUserDefinedOperatorSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType)get_store().add_element_user(PROPERTY_QNAME[33]);
            return target;
        }
    }

    /**
     * Unsets the "UserDefinedOperatorSchemes" element
     */
    @Override
    public void unsetUserDefinedOperatorSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[33], 0);
        }
    }

    /**
     * Gets the "ValueLists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType getValueLists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType)get_store().find_element_user(PROPERTY_QNAME[34], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ValueLists" element
     */
    @Override
    public boolean isSetValueLists() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[34]) != 0;
        }
    }

    /**
     * Sets the "ValueLists" element
     */
    @Override
    public void setValueLists(org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType valueLists) {
        generatedSetterHelperImpl(valueLists, PROPERTY_QNAME[34], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ValueLists" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType addNewValueLists() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListsType)get_store().add_element_user(PROPERTY_QNAME[34]);
            return target;
        }
    }

    /**
     * Unsets the "ValueLists" element
     */
    @Override
    public void unsetValueLists() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[34], 0);
        }
    }

    /**
     * Gets the "VtlMappingSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType getVtlMappingSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType)get_store().find_element_user(PROPERTY_QNAME[35], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "VtlMappingSchemes" element
     */
    @Override
    public boolean isSetVtlMappingSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[35]) != 0;
        }
    }

    /**
     * Sets the "VtlMappingSchemes" element
     */
    @Override
    public void setVtlMappingSchemes(org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType vtlMappingSchemes) {
        generatedSetterHelperImpl(vtlMappingSchemes, PROPERTY_QNAME[35], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VtlMappingSchemes" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType addNewVtlMappingSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.VtlMappingSchemesType)get_store().add_element_user(PROPERTY_QNAME[35]);
            return target;
        }
    }

    /**
     * Unsets the "VtlMappingSchemes" element
     */
    @Override
    public void unsetVtlMappingSchemes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[35], 0);
        }
    }
}
