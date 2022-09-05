/*
 * XML Type:  MetadataConstraintsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataConstraintsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataConstraintsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintsType {
    private static final long serialVersionUID = 1L;

    public MetadataConstraintsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataConstraint"),
    };


    /**
     * Gets a List of "MetadataConstraint" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType> getMetadataConstraintList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMetadataConstraintArray,
                this::setMetadataConstraintArray,
                this::insertNewMetadataConstraint,
                this::removeMetadataConstraint,
                this::sizeOfMetadataConstraintArray
            );
        }
    }

    /**
     * Gets array of all "MetadataConstraint" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType[] getMetadataConstraintArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType[0]);
    }

    /**
     * Gets ith "MetadataConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType getMetadataConstraintArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MetadataConstraint" element
     */
    @Override
    public int sizeOfMetadataConstraintArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MetadataConstraint" element
     */
    @Override
    public void setMetadataConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType metadataConstraint) {
        generatedSetterHelperImpl(metadataConstraint, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType insertNewMetadataConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataConstraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType addNewMetadataConstraint() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MetadataConstraint" element
     */
    @Override
    public void removeMetadataConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
