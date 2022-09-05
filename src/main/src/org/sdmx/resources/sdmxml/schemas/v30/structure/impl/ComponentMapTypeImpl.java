/*
 * XML Type:  ComponentMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ComponentMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ComponentMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentMapType {
    private static final long serialVersionUID = 1L;

    public ComponentMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Source"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Target"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RepresentationMap"),
    };


    /**
     * Gets a List of "Source" elements
     */
    @Override
    public java.util.List<java.lang.String> getSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSourceArray,
                this::setSourceArray,
                this::insertSource,
                this::removeSource,
                this::sizeOfSourceArray
            );
        }
    }

    /**
     * Gets array of all "Source" elements
     */
    @Override
    public java.lang.String[] getSourceArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Source" element
     */
    @Override
    public java.lang.String getSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Source" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSourceArray,
                this::xsetSourceArray,
                this::insertNewSource,
                this::removeSource,
                this::sizeOfSourceArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Source" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetSourceArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]::new);
    }

    /**
     * Gets (as xml) ith "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Source" element
     */
    @Override
    public int sizeOfSourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Source" element
     */
    @Override
    public void setSourceArray(int i, java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(source);
        }
    }

    /**
     * Sets (as xml) array of all "Source" element
     */
    @Override
    public void xsetSourceArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]sourceArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(sourceArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "Source" element
     */
    @Override
    public void xsetSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType source) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }

    /**
     * Inserts the value as the ith "Source" element
     */
    @Override
    public void insertSource(int i, java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(source);
        }
    }

    /**
     * Appends the value as the last "Source" element
     */
    @Override
    public void addSource(java.lang.String source) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(source);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Source" element
     */
    @Override
    public void removeSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Target" elements
     */
    @Override
    public java.util.List<java.lang.String> getTargetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTargetArray,
                this::setTargetArray,
                this::insertTarget,
                this::removeTarget,
                this::sizeOfTargetArray
            );
        }
    }

    /**
     * Gets array of all "Target" elements
     */
    @Override
    public java.lang.String[] getTargetArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Target" element
     */
    @Override
    public java.lang.String getTargetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Target" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetTargetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTargetArray,
                this::xsetTargetArray,
                this::insertNewTarget,
                this::removeTarget,
                this::sizeOfTargetArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Target" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetTargetArray() {
        return xgetArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]::new);
    }

    /**
     * Gets (as xml) ith "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetTargetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Target" element
     */
    @Override
    public int sizeOfTargetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Target" element
     */
    @Override
    public void setTargetArray(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(targetValue);
        }
    }

    /**
     * Sets (as xml) array of all "Target" element
     */
    @Override
    public void xsetTargetArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]targetValueArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(targetValueArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "Target" element
     */
    @Override
    public void xsetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }

    /**
     * Inserts the value as the ith "Target" element
     */
    @Override
    public void insertTarget(int i, java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Appends the value as the last "Target" element
     */
    @Override
    public void addTarget(java.lang.String targetValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(targetValue);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewTarget(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Target" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewTarget() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Target" element
     */
    @Override
    public void removeTarget(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "RepresentationMap" element
     */
    @Override
    public java.lang.String getRepresentationMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "RepresentationMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType xgetRepresentationMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "RepresentationMap" element
     */
    @Override
    public boolean isSetRepresentationMap() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "RepresentationMap" element
     */
    @Override
    public void setRepresentationMap(java.lang.String representationMap) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(representationMap);
        }
    }

    /**
     * Sets (as xml) the "RepresentationMap" element
     */
    @Override
    public void xsetRepresentationMap(org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType representationMap) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.RepresentationMapReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(representationMap);
        }
    }

    /**
     * Unsets the "RepresentationMap" element
     */
    @Override
    public void unsetRepresentationMap() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}
