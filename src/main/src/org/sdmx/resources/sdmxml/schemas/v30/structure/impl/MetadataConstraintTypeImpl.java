/*
 * XML Type:  MetadataConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataConstraintTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.MetadataConstraintBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType {
    private static final long serialVersionUID = 1L;

    public MetadataConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataTargetRegion"),
    };


    /**
     * Gets a List of "MetadataTargetRegion" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType> getMetadataTargetRegionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataTargetRegionArray,
                this::setMetadataTargetRegionArray,
                this::insertNewMetadataTargetRegion,
                this::removeMetadataTargetRegion,
                this::sizeOfMetadataTargetRegionArray
            );
        }
    }

    /**
     * Gets array of all "MetadataTargetRegion" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType[] getMetadataTargetRegionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType[0]);
    }

    /**
     * Gets ith "MetadataTargetRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType getMetadataTargetRegionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataTargetRegion" element
     */
    @Override
    public int sizeOfMetadataTargetRegionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MetadataTargetRegion" element
     */
    @Override
    public void setMetadataTargetRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType metadataTargetRegion) {
        generatedSetterHelperImpl(metadataTargetRegion, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType insertNewMetadataTargetRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType addNewMetadataTargetRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataTargetRegionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataTargetRegion" element
     */
    @Override
    public void removeMetadataTargetRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
