/*
 * XML Type:  ComputationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ComputationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ComputationType extends org.sdmx.resources.sdmxml.schemas.v30.common.AnnotableType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ComputationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "computationtype0cfdtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Description" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getDescriptionList();

    /**
     * Gets array of all "Description" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getDescriptionArray();

    /**
     * Gets ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getDescriptionArray(int i);

    /**
     * Returns number of "Description" element
     */
    int sizeOfDescriptionArray();

    /**
     * Sets ith "Description" element
     */
    void setDescriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType description);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewDescription(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewDescription();

    /**
     * Removes the ith "Description" element
     */
    void removeDescription(int i);

    /**
     * Gets the "localID" attribute
     */
    java.lang.String getLocalID();

    /**
     * Gets (as xml) the "localID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetLocalID();

    /**
     * True if has "localID" attribute
     */
    boolean isSetLocalID();

    /**
     * Sets the "localID" attribute
     */
    void setLocalID(java.lang.String localID);

    /**
     * Sets (as xml) the "localID" attribute
     */
    void xsetLocalID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType localID);

    /**
     * Unsets the "localID" attribute
     */
    void unsetLocalID();

    /**
     * Gets the "softwarePackage" attribute
     */
    java.lang.String getSoftwarePackage();

    /**
     * Gets (as xml) the "softwarePackage" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoftwarePackage();

    /**
     * True if has "softwarePackage" attribute
     */
    boolean isSetSoftwarePackage();

    /**
     * Sets the "softwarePackage" attribute
     */
    void setSoftwarePackage(java.lang.String softwarePackage);

    /**
     * Sets (as xml) the "softwarePackage" attribute
     */
    void xsetSoftwarePackage(org.apache.xmlbeans.XmlString softwarePackage);

    /**
     * Unsets the "softwarePackage" attribute
     */
    void unsetSoftwarePackage();

    /**
     * Gets the "softwareLanguage" attribute
     */
    java.lang.String getSoftwareLanguage();

    /**
     * Gets (as xml) the "softwareLanguage" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoftwareLanguage();

    /**
     * True if has "softwareLanguage" attribute
     */
    boolean isSetSoftwareLanguage();

    /**
     * Sets the "softwareLanguage" attribute
     */
    void setSoftwareLanguage(java.lang.String softwareLanguage);

    /**
     * Sets (as xml) the "softwareLanguage" attribute
     */
    void xsetSoftwareLanguage(org.apache.xmlbeans.XmlString softwareLanguage);

    /**
     * Unsets the "softwareLanguage" attribute
     */
    void unsetSoftwareLanguage();

    /**
     * Gets the "softwareVersion" attribute
     */
    java.lang.String getSoftwareVersion();

    /**
     * Gets (as xml) the "softwareVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoftwareVersion();

    /**
     * True if has "softwareVersion" attribute
     */
    boolean isSetSoftwareVersion();

    /**
     * Sets the "softwareVersion" attribute
     */
    void setSoftwareVersion(java.lang.String softwareVersion);

    /**
     * Sets (as xml) the "softwareVersion" attribute
     */
    void xsetSoftwareVersion(org.apache.xmlbeans.XmlString softwareVersion);

    /**
     * Unsets the "softwareVersion" attribute
     */
    void unsetSoftwareVersion();
}
