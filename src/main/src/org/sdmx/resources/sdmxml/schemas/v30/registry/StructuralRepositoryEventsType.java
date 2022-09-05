/*
 * XML Type:  StructuralRepositoryEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructuralRepositoryEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public interface StructuralRepositoryEventsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.StructuralRepositoryEventsType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "structuralrepositoryeventstypef068type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "AgencyID" elements
     */
    java.util.List<java.lang.String> getAgencyIDList();

    /**
     * Gets array of all "AgencyID" elements
     */
    java.lang.String[] getAgencyIDArray();

    /**
     * Gets ith "AgencyID" element
     */
    java.lang.String getAgencyIDArray(int i);

    /**
     * Gets (as xml) a List of "AgencyID" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType> xgetAgencyIDList();

    /**
     * Gets (as xml) array of all "AgencyID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType[] xgetAgencyIDArray();

    /**
     * Gets (as xml) ith "AgencyID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType xgetAgencyIDArray(int i);

    /**
     * Returns number of "AgencyID" element
     */
    int sizeOfAgencyIDArray();

    /**
     * Sets ith "AgencyID" element
     */
    void setAgencyIDArray(int i, java.lang.String agencyID);

    /**
     * Sets (as xml) array of all "AgencyID" element
     */
    void xsetAgencyIDArray(org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType[] agencyIDArray);

    /**
     * Sets (as xml) ith "AgencyID" element
     */
    void xsetAgencyIDArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType agencyID);

    /**
     * Inserts the value as the ith "AgencyID" element
     */
    void insertAgencyID(int i, java.lang.String agencyID);

    /**
     * Appends the value as the last "AgencyID" element
     */
    void addAgencyID(java.lang.String agencyID);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType insertNewAgencyID(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyID" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.NestedIDQueryType addNewAgencyID();

    /**
     * Removes the ith "AgencyID" element
     */
    void removeAgencyID(int i);

    /**
     * Gets the "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType getAllEvents();

    /**
     * True if has "AllEvents" element
     */
    boolean isSetAllEvents();

    /**
     * Sets the "AllEvents" element
     */
    void setAllEvents(org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType allEvents);

    /**
     * Appends and returns a new empty "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.EmptyType addNewAllEvents();

    /**
     * Unsets the "AllEvents" element
     */
    void unsetAllEvents();

    /**
     * Gets a List of "AgencyScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getAgencySchemeList();

    /**
     * Gets array of all "AgencyScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getAgencySchemeArray();

    /**
     * Gets ith "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getAgencySchemeArray(int i);

    /**
     * Returns number of "AgencyScheme" element
     */
    int sizeOfAgencySchemeArray();

    /**
     * Sets ith "AgencyScheme" element
     */
    void setAgencySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType agencyScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewAgencyScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewAgencyScheme();

    /**
     * Removes the ith "AgencyScheme" element
     */
    void removeAgencyScheme(int i);

    /**
     * Gets a List of "DataConsmerScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getDataConsmerSchemeList();

    /**
     * Gets array of all "DataConsmerScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getDataConsmerSchemeArray();

    /**
     * Gets ith "DataConsmerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getDataConsmerSchemeArray(int i);

    /**
     * Returns number of "DataConsmerScheme" element
     */
    int sizeOfDataConsmerSchemeArray();

    /**
     * Sets ith "DataConsmerScheme" element
     */
    void setDataConsmerSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType dataConsmerScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsmerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewDataConsmerScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsmerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewDataConsmerScheme();

    /**
     * Removes the ith "DataConsmerScheme" element
     */
    void removeDataConsmerScheme(int i);

    /**
     * Gets a List of "DataProviderScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getDataProviderSchemeList();

    /**
     * Gets array of all "DataProviderScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getDataProviderSchemeArray();

    /**
     * Gets ith "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getDataProviderSchemeArray(int i);

    /**
     * Returns number of "DataProviderScheme" element
     */
    int sizeOfDataProviderSchemeArray();

    /**
     * Sets ith "DataProviderScheme" element
     */
    void setDataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType dataProviderScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewDataProviderScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewDataProviderScheme();

    /**
     * Removes the ith "DataProviderScheme" element
     */
    void removeDataProviderScheme(int i);

    /**
     * Gets a List of "OrganisationUnitScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getOrganisationUnitSchemeList();

    /**
     * Gets array of all "OrganisationUnitScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getOrganisationUnitSchemeArray();

    /**
     * Gets ith "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getOrganisationUnitSchemeArray(int i);

    /**
     * Returns number of "OrganisationUnitScheme" element
     */
    int sizeOfOrganisationUnitSchemeArray();

    /**
     * Sets ith "OrganisationUnitScheme" element
     */
    void setOrganisationUnitSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType organisationUnitScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewOrganisationUnitScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewOrganisationUnitScheme();

    /**
     * Removes the ith "OrganisationUnitScheme" element
     */
    void removeOrganisationUnitScheme(int i);

    /**
     * Gets a List of "Dataflow" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getDataflowList();

    /**
     * Gets array of all "Dataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getDataflowArray();

    /**
     * Gets ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getDataflowArray(int i);

    /**
     * Returns number of "Dataflow" element
     */
    int sizeOfDataflowArray();

    /**
     * Sets ith "Dataflow" element
     */
    void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType dataflow);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewDataflow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewDataflow();

    /**
     * Removes the ith "Dataflow" element
     */
    void removeDataflow(int i);

    /**
     * Gets a List of "Metadataflow" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getMetadataflowList();

    /**
     * Gets array of all "Metadataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getMetadataflowArray();

    /**
     * Gets ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getMetadataflowArray(int i);

    /**
     * Returns number of "Metadataflow" element
     */
    int sizeOfMetadataflowArray();

    /**
     * Sets ith "Metadataflow" element
     */
    void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType metadataflow);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewMetadataflow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewMetadataflow();

    /**
     * Removes the ith "Metadataflow" element
     */
    void removeMetadataflow(int i);

    /**
     * Gets a List of "CategoryScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getCategorySchemeList();

    /**
     * Gets array of all "CategoryScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getCategorySchemeArray();

    /**
     * Gets ith "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getCategorySchemeArray(int i);

    /**
     * Returns number of "CategoryScheme" element
     */
    int sizeOfCategorySchemeArray();

    /**
     * Sets ith "CategoryScheme" element
     */
    void setCategorySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType categoryScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewCategoryScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewCategoryScheme();

    /**
     * Removes the ith "CategoryScheme" element
     */
    void removeCategoryScheme(int i);

    /**
     * Gets a List of "Categorisation" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType> getCategorisationList();

    /**
     * Gets array of all "Categorisation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType[] getCategorisationArray();

    /**
     * Gets ith "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType getCategorisationArray(int i);

    /**
     * Returns number of "Categorisation" element
     */
    int sizeOfCategorisationArray();

    /**
     * Sets ith "Categorisation" element
     */
    void setCategorisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType categorisation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType insertNewCategorisation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.IdentifiableObjectEventType addNewCategorisation();

    /**
     * Removes the ith "Categorisation" element
     */
    void removeCategorisation(int i);

    /**
     * Gets a List of "Codelist" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getCodelistList();

    /**
     * Gets array of all "Codelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getCodelistArray();

    /**
     * Gets ith "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getCodelistArray(int i);

    /**
     * Returns number of "Codelist" element
     */
    int sizeOfCodelistArray();

    /**
     * Sets ith "Codelist" element
     */
    void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType codelist);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewCodelist(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewCodelist();

    /**
     * Removes the ith "Codelist" element
     */
    void removeCodelist(int i);

    /**
     * Gets a List of "HierarchicalCodelist" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getHierarchicalCodelistList();

    /**
     * Gets array of all "HierarchicalCodelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getHierarchicalCodelistArray();

    /**
     * Gets ith "HierarchicalCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getHierarchicalCodelistArray(int i);

    /**
     * Returns number of "HierarchicalCodelist" element
     */
    int sizeOfHierarchicalCodelistArray();

    /**
     * Sets ith "HierarchicalCodelist" element
     */
    void setHierarchicalCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType hierarchicalCodelist);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewHierarchicalCodelist(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewHierarchicalCodelist();

    /**
     * Removes the ith "HierarchicalCodelist" element
     */
    void removeHierarchicalCodelist(int i);

    /**
     * Gets a List of "ConceptScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getConceptSchemeList();

    /**
     * Gets array of all "ConceptScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getConceptSchemeArray();

    /**
     * Gets ith "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getConceptSchemeArray(int i);

    /**
     * Returns number of "ConceptScheme" element
     */
    int sizeOfConceptSchemeArray();

    /**
     * Sets ith "ConceptScheme" element
     */
    void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType conceptScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewConceptScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewConceptScheme();

    /**
     * Removes the ith "ConceptScheme" element
     */
    void removeConceptScheme(int i);

    /**
     * Gets a List of "MetadataStructureDefinition" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getMetadataStructureDefinitionList();

    /**
     * Gets array of all "MetadataStructureDefinition" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getMetadataStructureDefinitionArray();

    /**
     * Gets ith "MetadataStructureDefinition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getMetadataStructureDefinitionArray(int i);

    /**
     * Returns number of "MetadataStructureDefinition" element
     */
    int sizeOfMetadataStructureDefinitionArray();

    /**
     * Sets ith "MetadataStructureDefinition" element
     */
    void setMetadataStructureDefinitionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType metadataStructureDefinition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewMetadataStructureDefinition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinition" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewMetadataStructureDefinition();

    /**
     * Removes the ith "MetadataStructureDefinition" element
     */
    void removeMetadataStructureDefinition(int i);

    /**
     * Gets a List of "KeyFamily" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getKeyFamilyList();

    /**
     * Gets array of all "KeyFamily" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getKeyFamilyArray();

    /**
     * Gets ith "KeyFamily" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getKeyFamilyArray(int i);

    /**
     * Returns number of "KeyFamily" element
     */
    int sizeOfKeyFamilyArray();

    /**
     * Sets ith "KeyFamily" element
     */
    void setKeyFamilyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType keyFamily);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamily" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewKeyFamily(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamily" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewKeyFamily();

    /**
     * Removes the ith "KeyFamily" element
     */
    void removeKeyFamily(int i);

    /**
     * Gets a List of "StructureSet" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getStructureSetList();

    /**
     * Gets array of all "StructureSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getStructureSetArray();

    /**
     * Gets ith "StructureSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getStructureSetArray(int i);

    /**
     * Returns number of "StructureSet" element
     */
    int sizeOfStructureSetArray();

    /**
     * Sets ith "StructureSet" element
     */
    void setStructureSetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType structureSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewStructureSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewStructureSet();

    /**
     * Removes the ith "StructureSet" element
     */
    void removeStructureSet(int i);

    /**
     * Gets a List of "ReportingTaxonomy" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getReportingTaxonomyList();

    /**
     * Gets array of all "ReportingTaxonomy" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getReportingTaxonomyArray();

    /**
     * Gets ith "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getReportingTaxonomyArray(int i);

    /**
     * Returns number of "ReportingTaxonomy" element
     */
    int sizeOfReportingTaxonomyArray();

    /**
     * Sets ith "ReportingTaxonomy" element
     */
    void setReportingTaxonomyArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType reportingTaxonomy);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewReportingTaxonomy(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewReportingTaxonomy();

    /**
     * Removes the ith "ReportingTaxonomy" element
     */
    void removeReportingTaxonomy(int i);

    /**
     * Gets a List of "Process" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getProcessList();

    /**
     * Gets array of all "Process" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getProcessArray();

    /**
     * Gets ith "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getProcessArray(int i);

    /**
     * Returns number of "Process" element
     */
    int sizeOfProcessArray();

    /**
     * Sets ith "Process" element
     */
    void setProcessArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType process);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewProcess(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewProcess();

    /**
     * Removes the ith "Process" element
     */
    void removeProcess(int i);

    /**
     * Gets a List of "AttachmentConstraint" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getAttachmentConstraintList();

    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getAttachmentConstraintArray();

    /**
     * Gets ith "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getAttachmentConstraintArray(int i);

    /**
     * Returns number of "AttachmentConstraint" element
     */
    int sizeOfAttachmentConstraintArray();

    /**
     * Sets ith "AttachmentConstraint" element
     */
    void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType attachmentConstraint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewAttachmentConstraint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewAttachmentConstraint();

    /**
     * Removes the ith "AttachmentConstraint" element
     */
    void removeAttachmentConstraint(int i);

    /**
     * Gets a List of "ContentConstraint" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getContentConstraintList();

    /**
     * Gets array of all "ContentConstraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getContentConstraintArray();

    /**
     * Gets ith "ContentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getContentConstraintArray(int i);

    /**
     * Returns number of "ContentConstraint" element
     */
    int sizeOfContentConstraintArray();

    /**
     * Sets ith "ContentConstraint" element
     */
    void setContentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType contentConstraint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewContentConstraint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ContentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewContentConstraint();

    /**
     * Removes the ith "ContentConstraint" element
     */
    void removeContentConstraint(int i);

    /**
     * Gets a List of "ProvisionAgreement" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getProvisionAgreementList();

    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getProvisionAgreementArray();

    /**
     * Gets ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getProvisionAgreementArray(int i);

    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();

    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType provisionAgreement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewProvisionAgreement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewProvisionAgreement();

    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);

    /**
     * Gets a List of "TransformationScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getTransformationSchemeList();

    /**
     * Gets array of all "TransformationScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getTransformationSchemeArray();

    /**
     * Gets ith "TransformationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getTransformationSchemeArray(int i);

    /**
     * Returns number of "TransformationScheme" element
     */
    int sizeOfTransformationSchemeArray();

    /**
     * Sets ith "TransformationScheme" element
     */
    void setTransformationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType transformationScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TransformationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewTransformationScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "TransformationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewTransformationScheme();

    /**
     * Removes the ith "TransformationScheme" element
     */
    void removeTransformationScheme(int i);

    /**
     * Gets a List of "NameAliasScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getNameAliasSchemeList();

    /**
     * Gets array of all "NameAliasScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getNameAliasSchemeArray();

    /**
     * Gets ith "NameAliasScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getNameAliasSchemeArray(int i);

    /**
     * Returns number of "NameAliasScheme" element
     */
    int sizeOfNameAliasSchemeArray();

    /**
     * Sets ith "NameAliasScheme" element
     */
    void setNameAliasSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType nameAliasScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameAliasScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewNameAliasScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "NameAliasScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewNameAliasScheme();

    /**
     * Removes the ith "NameAliasScheme" element
     */
    void removeNameAliasScheme(int i);

    /**
     * Gets a List of "NamePersonalisationScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getNamePersonalisationSchemeList();

    /**
     * Gets array of all "NamePersonalisationScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getNamePersonalisationSchemeArray();

    /**
     * Gets ith "NamePersonalisationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getNamePersonalisationSchemeArray(int i);

    /**
     * Returns number of "NamePersonalisationScheme" element
     */
    int sizeOfNamePersonalisationSchemeArray();

    /**
     * Sets ith "NamePersonalisationScheme" element
     */
    void setNamePersonalisationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType namePersonalisationScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NamePersonalisationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewNamePersonalisationScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "NamePersonalisationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewNamePersonalisationScheme();

    /**
     * Removes the ith "NamePersonalisationScheme" element
     */
    void removeNamePersonalisationScheme(int i);

    /**
     * Gets a List of "RulesetScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getRulesetSchemeList();

    /**
     * Gets array of all "RulesetScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getRulesetSchemeArray();

    /**
     * Gets ith "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getRulesetSchemeArray(int i);

    /**
     * Returns number of "RulesetScheme" element
     */
    int sizeOfRulesetSchemeArray();

    /**
     * Sets ith "RulesetScheme" element
     */
    void setRulesetSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType rulesetScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewRulesetScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewRulesetScheme();

    /**
     * Removes the ith "RulesetScheme" element
     */
    void removeRulesetScheme(int i);

    /**
     * Gets a List of "UserDefinedOperatorScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType> getUserDefinedOperatorSchemeList();

    /**
     * Gets array of all "UserDefinedOperatorScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType[] getUserDefinedOperatorSchemeArray();

    /**
     * Gets ith "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType getUserDefinedOperatorSchemeArray(int i);

    /**
     * Returns number of "UserDefinedOperatorScheme" element
     */
    int sizeOfUserDefinedOperatorSchemeArray();

    /**
     * Sets ith "UserDefinedOperatorScheme" element
     */
    void setUserDefinedOperatorSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType userDefinedOperatorScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType insertNewUserDefinedOperatorScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.registry.VersionableObjectEventType addNewUserDefinedOperatorScheme();

    /**
     * Removes the ith "UserDefinedOperatorScheme" element
     */
    void removeUserDefinedOperatorScheme(int i);

    /**
     * Gets the "TYPE" attribute
     */
    java.lang.String getTYPE();

    /**
     * Gets (as xml) the "TYPE" attribute
     */
    org.apache.xmlbeans.XmlString xgetTYPE();

    /**
     * True if has "TYPE" attribute
     */
    boolean isSetTYPE();

    /**
     * Sets the "TYPE" attribute
     */
    void setTYPE(java.lang.String type);

    /**
     * Sets (as xml) the "TYPE" attribute
     */
    void xsetTYPE(org.apache.xmlbeans.XmlString type);

    /**
     * Unsets the "TYPE" attribute
     */
    void unsetTYPE();
}
