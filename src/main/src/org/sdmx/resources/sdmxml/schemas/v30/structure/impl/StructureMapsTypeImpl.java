/*
 * XML Type:  StructureMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class StructureMapsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapsType {
    private static final long serialVersionUID = 1L;

    public StructureMapsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "StructureMap"),
    };


    /**
     * Gets a List of "StructureMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType> getStructureMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStructureMapArray,
                this::setStructureMapArray,
                this::insertNewStructureMap,
                this::removeStructureMap,
                this::sizeOfStructureMapArray
            );
        }
    }

    /**
     * Gets array of all "StructureMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType[] getStructureMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType[0]);
    }

    /**
     * Gets ith "StructureMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType getStructureMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StructureMap" element
     */
    @Override
    public int sizeOfStructureMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "StructureMap" element
     */
    @Override
    public void setStructureMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType structureMap) {
        generatedSetterHelperImpl(structureMap, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType insertNewStructureMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StructureMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType addNewStructureMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructureMapType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "StructureMap" element
     */
    @Override
    public void removeStructureMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
