/*
 * XML Type:  DataConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class DataConstraintTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.DataConstraintBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataConstraintType {
    private static final long serialVersionUID = 1L;

    public DataConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataKeySet"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CubeRegion"),
    };


    /**
     * Gets a List of "DataKeySet" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType> getDataKeySetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataKeySetArray,
                this::setDataKeySetArray,
                this::insertNewDataKeySet,
                this::removeDataKeySet,
                this::sizeOfDataKeySetArray
            );
        }
    }

    /**
     * Gets array of all "DataKeySet" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType[] getDataKeySetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType[0]);
    }

    /**
     * Gets ith "DataKeySet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType getDataKeySetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataKeySet" element
     */
    @Override
    public int sizeOfDataKeySetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "DataKeySet" element
     */
    @Override
    public void setDataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType dataKeySet) {
        generatedSetterHelperImpl(dataKeySet, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKeySet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType insertNewDataKeySet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataKeySet" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType addNewDataKeySet() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataKeySetType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DataKeySet" element
     */
    @Override
    public void removeDataKeySet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "CubeRegion" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType> getCubeRegionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCubeRegionArray,
                this::setCubeRegionArray,
                this::insertNewCubeRegion,
                this::removeCubeRegion,
                this::sizeOfCubeRegionArray
            );
        }
    }

    /**
     * Gets array of all "CubeRegion" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType[] getCubeRegionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType[0]);
    }

    /**
     * Gets ith "CubeRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType getCubeRegionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CubeRegion" element
     */
    @Override
    public int sizeOfCubeRegionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "CubeRegion" element
     */
    @Override
    public void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType cubeRegion) {
        generatedSetterHelperImpl(cubeRegion, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType insertNewCubeRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType addNewCubeRegion() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CubeRegionType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "CubeRegion" element
     */
    @Override
    public void removeCubeRegion(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
