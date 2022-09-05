/*
 * XML Type:  RepresentationMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RepresentationMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class RepresentationMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.RepresentationMapBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationMapType {
    private static final long serialVersionUID = 1L;

    public RepresentationMapTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "SourceCodelist"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "SourceDataType"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TargetCodelist"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TargetDataType"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RepresentationMapping"),
    };


    /**
     * Gets a List of "SourceCodelist" elements
     */
    @Override
    public java.util.List<java.lang.String> getSourceCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSourceCodelistArray,
                this::setSourceCodelistArray,
                this::insertSourceCodelist,
                this::removeSourceCodelist,
                this::sizeOfSourceCodelistArray
            );
        }
    }

    /**
     * Gets array of all "SourceCodelist" elements
     */
    @Override
    public java.lang.String[] getSourceCodelistArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "SourceCodelist" element
     */
    @Override
    public java.lang.String getSourceCodelistArray(int i) {
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
     * Gets (as xml) a List of "SourceCodelist" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType> xgetSourceCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSourceCodelistArray,
                this::xsetSourceCodelistArray,
                this::insertNewSourceCodelist,
                this::removeSourceCodelist,
                this::sizeOfSourceCodelistArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "SourceCodelist" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[] xgetSourceCodelistArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "SourceCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType xgetSourceCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SourceCodelist" element
     */
    @Override
    public int sizeOfSourceCodelistArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "SourceCodelist" element
     */
    @Override
    public void setSourceCodelistArray(int i, java.lang.String sourceCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(sourceCodelist);
        }
    }

    /**
     * Sets (as xml) array of all "SourceCodelist" element
     */
    @Override
    public void xsetSourceCodelistArray(org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[]sourceCodelistArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(sourceCodelistArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "SourceCodelist" element
     */
    @Override
    public void xsetSourceCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType sourceCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(sourceCodelist);
        }
    }

    /**
     * Inserts the value as the ith "SourceCodelist" element
     */
    @Override
    public void insertSourceCodelist(int i, java.lang.String sourceCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(sourceCodelist);
        }
    }

    /**
     * Appends the value as the last "SourceCodelist" element
     */
    @Override
    public void addSourceCodelist(java.lang.String sourceCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(sourceCodelist);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SourceCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType insertNewSourceCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SourceCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType addNewSourceCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "SourceCodelist" element
     */
    @Override
    public void removeSourceCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "SourceDataType" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum> getSourceDataTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSourceDataTypeArray,
                this::setSourceDataTypeArray,
                this::insertSourceDataType,
                this::removeSourceDataType,
                this::sizeOfSourceDataTypeArray
            );
        }
    }

    /**
     * Gets array of all "SourceDataType" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum[] getSourceDataTypeArray() {
        return getEnumArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum[]::new);
    }

    /**
     * Gets ith "SourceDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getSourceDataTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "SourceDataType" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType> xgetSourceDataTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSourceDataTypeArray,
                this::xsetSourceDataTypeArray,
                this::insertNewSourceDataType,
                this::removeSourceDataType,
                this::sizeOfSourceDataTypeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "SourceDataType" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType[] xgetSourceDataTypeArray() {
        return xgetArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.DataType[]::new);
    }

    /**
     * Gets (as xml) ith "SourceDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetSourceDataTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SourceDataType" element
     */
    @Override
    public int sizeOfSourceDataTypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "SourceDataType" element
     */
    @Override
    public void setSourceDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum sourceDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(sourceDataType);
        }
    }

    /**
     * Sets (as xml) array of all "SourceDataType" element
     */
    @Override
    public void xsetSourceDataTypeArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataType[]sourceDataTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(sourceDataTypeArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "SourceDataType" element
     */
    @Override
    public void xsetSourceDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType sourceDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(sourceDataType);
        }
    }

    /**
     * Inserts the value as the ith "SourceDataType" element
     */
    @Override
    public void insertSourceDataType(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum sourceDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setEnumValue(sourceDataType);
        }
    }

    /**
     * Appends the value as the last "SourceDataType" element
     */
    @Override
    public void addSourceDataType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum sourceDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setEnumValue(sourceDataType);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SourceDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType insertNewSourceDataType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SourceDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType addNewSourceDataType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "SourceDataType" element
     */
    @Override
    public void removeSourceDataType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "TargetCodelist" elements
     */
    @Override
    public java.util.List<java.lang.String> getTargetCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTargetCodelistArray,
                this::setTargetCodelistArray,
                this::insertTargetCodelist,
                this::removeTargetCodelist,
                this::sizeOfTargetCodelistArray
            );
        }
    }

    /**
     * Gets array of all "TargetCodelist" elements
     */
    @Override
    public java.lang.String[] getTargetCodelistArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "TargetCodelist" element
     */
    @Override
    public java.lang.String getTargetCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "TargetCodelist" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType> xgetTargetCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTargetCodelistArray,
                this::xsetTargetCodelistArray,
                this::insertNewTargetCodelist,
                this::removeTargetCodelist,
                this::sizeOfTargetCodelistArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "TargetCodelist" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[] xgetTargetCodelistArray() {
        return xgetArray(PROPERTY_QNAME[2], org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "TargetCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType xgetTargetCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TargetCodelist" element
     */
    @Override
    public int sizeOfTargetCodelistArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "TargetCodelist" element
     */
    @Override
    public void setTargetCodelistArray(int i, java.lang.String targetCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(targetCodelist);
        }
    }

    /**
     * Sets (as xml) array of all "TargetCodelist" element
     */
    @Override
    public void xsetTargetCodelistArray(org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType[]targetCodelistArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(targetCodelistArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "TargetCodelist" element
     */
    @Override
    public void xsetTargetCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType targetCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetCodelist);
        }
    }

    /**
     * Inserts the value as the ith "TargetCodelist" element
     */
    @Override
    public void insertTargetCodelist(int i, java.lang.String targetCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(targetCodelist);
        }
    }

    /**
     * Appends the value as the last "TargetCodelist" element
     */
    @Override
    public void addTargetCodelist(java.lang.String targetCodelist) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(targetCodelist);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType insertNewTargetCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TargetCodelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType addNewTargetCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnyCodelistReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "TargetCodelist" element
     */
    @Override
    public void removeTargetCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "TargetDataType" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum> getTargetDataTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTargetDataTypeArray,
                this::setTargetDataTypeArray,
                this::insertTargetDataType,
                this::removeTargetDataType,
                this::sizeOfTargetDataTypeArray
            );
        }
    }

    /**
     * Gets array of all "TargetDataType" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum[] getTargetDataTypeArray() {
        return getEnumArray(PROPERTY_QNAME[3], org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum[]::new);
    }

    /**
     * Gets ith "TargetDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum getTargetDataTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "TargetDataType" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.DataType> xgetTargetDataTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTargetDataTypeArray,
                this::xsetTargetDataTypeArray,
                this::insertNewTargetDataType,
                this::removeTargetDataType,
                this::sizeOfTargetDataTypeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "TargetDataType" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType[] xgetTargetDataTypeArray() {
        return xgetArray(PROPERTY_QNAME[3], org.sdmx.resources.sdmxml.schemas.v30.common.DataType[]::new);
    }

    /**
     * Gets (as xml) ith "TargetDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType xgetTargetDataTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TargetDataType" element
     */
    @Override
    public int sizeOfTargetDataTypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "TargetDataType" element
     */
    @Override
    public void setTargetDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum targetDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(targetDataType);
        }
    }

    /**
     * Sets (as xml) array of all "TargetDataType" element
     */
    @Override
    public void xsetTargetDataTypeArray(org.sdmx.resources.sdmxml.schemas.v30.common.DataType[]targetDataTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(targetDataTypeArray, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets (as xml) ith "TargetDataType" element
     */
    @Override
    public void xsetTargetDataTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType targetDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetDataType);
        }
    }

    /**
     * Inserts the value as the ith "TargetDataType" element
     */
    @Override
    public void insertTargetDataType(int i, org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum targetDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            target.setEnumValue(targetDataType);
        }
    }

    /**
     * Appends the value as the last "TargetDataType" element
     */
    @Override
    public void addTargetDataType(org.sdmx.resources.sdmxml.schemas.v30.common.DataType.Enum targetDataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            target.setEnumValue(targetDataType);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType insertNewTargetDataType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TargetDataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataType addNewTargetDataType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "TargetDataType" element
     */
    @Override
    public void removeTargetDataType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "RepresentationMapping" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType> getRepresentationMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRepresentationMappingArray,
                this::setRepresentationMappingArray,
                this::insertNewRepresentationMapping,
                this::removeRepresentationMapping,
                this::sizeOfRepresentationMappingArray
            );
        }
    }

    /**
     * Gets array of all "RepresentationMapping" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType[] getRepresentationMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType[0]);
    }

    /**
     * Gets ith "RepresentationMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType getRepresentationMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RepresentationMapping" element
     */
    @Override
    public int sizeOfRepresentationMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "RepresentationMapping" element
     */
    @Override
    public void setRepresentationMappingArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType representationMapping) {
        generatedSetterHelperImpl(representationMapping, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentationMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType insertNewRepresentationMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentationMapping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType addNewRepresentationMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueMappingType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "RepresentationMapping" element
     */
    @Override
    public void removeRepresentationMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }
}
