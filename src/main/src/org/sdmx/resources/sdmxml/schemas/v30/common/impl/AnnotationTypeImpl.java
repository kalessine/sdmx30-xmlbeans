/*
 * XML Type:  AnnotationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AnnotationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public class AnnotationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationType {
    private static final long serialVersionUID = 1L;

    public AnnotationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "AnnotationTitle"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "AnnotationType"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "AnnotationURL"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "AnnotationText"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "AnnotationValue"),
        new QName("", "id"),
    };


    /**
     * Gets the "AnnotationTitle" element
     */
    @Override
    public java.lang.String getAnnotationTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "AnnotationTitle" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAnnotationTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "AnnotationTitle" element
     */
    @Override
    public boolean isSetAnnotationTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "AnnotationTitle" element
     */
    @Override
    public void setAnnotationTitle(java.lang.String annotationTitle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(annotationTitle);
        }
    }

    /**
     * Sets (as xml) the "AnnotationTitle" element
     */
    @Override
    public void xsetAnnotationTitle(org.apache.xmlbeans.XmlString annotationTitle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(annotationTitle);
        }
    }

    /**
     * Unsets the "AnnotationTitle" element
     */
    @Override
    public void unsetAnnotationTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "AnnotationType" element
     */
    @Override
    public java.lang.String getAnnotationType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "AnnotationType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAnnotationType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "AnnotationType" element
     */
    @Override
    public boolean isSetAnnotationType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "AnnotationType" element
     */
    @Override
    public void setAnnotationType(java.lang.String annotationType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(annotationType);
        }
    }

    /**
     * Sets (as xml) the "AnnotationType" element
     */
    @Override
    public void xsetAnnotationType(org.apache.xmlbeans.XmlString annotationType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(annotationType);
        }
    }

    /**
     * Unsets the "AnnotationType" element
     */
    @Override
    public void unsetAnnotationType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "AnnotationURL" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType> getAnnotationURLList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAnnotationURLArray,
                this::setAnnotationURLArray,
                this::insertNewAnnotationURL,
                this::removeAnnotationURL,
                this::sizeOfAnnotationURLArray
            );
        }
    }

    /**
     * Gets array of all "AnnotationURL" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType[] getAnnotationURLArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType[0]);
    }

    /**
     * Gets ith "AnnotationURL" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType getAnnotationURLArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AnnotationURL" element
     */
    @Override
    public int sizeOfAnnotationURLArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "AnnotationURL" element
     */
    @Override
    public void setAnnotationURLArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType annotationURL) {
        generatedSetterHelperImpl(annotationURL, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AnnotationURL" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType insertNewAnnotationURL(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AnnotationURL" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType addNewAnnotationURL() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.AnnotationURLType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "AnnotationURL" element
     */
    @Override
    public void removeAnnotationURL(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "AnnotationText" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getAnnotationTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAnnotationTextArray,
                this::setAnnotationTextArray,
                this::insertNewAnnotationText,
                this::removeAnnotationText,
                this::sizeOfAnnotationTextArray
            );
        }
    }

    /**
     * Gets array of all "AnnotationText" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getAnnotationTextArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "AnnotationText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getAnnotationTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AnnotationText" element
     */
    @Override
    public int sizeOfAnnotationTextArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "AnnotationText" element
     */
    @Override
    public void setAnnotationTextArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType annotationText) {
        generatedSetterHelperImpl(annotationText, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AnnotationText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewAnnotationText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AnnotationText" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewAnnotationText() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "AnnotationText" element
     */
    @Override
    public void removeAnnotationText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "AnnotationValue" element
     */
    @Override
    public java.lang.String getAnnotationValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "AnnotationValue" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAnnotationValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "AnnotationValue" element
     */
    @Override
    public boolean isSetAnnotationValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "AnnotationValue" element
     */
    @Override
    public void setAnnotationValue(java.lang.String annotationValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(annotationValue);
        }
    }

    /**
     * Sets (as xml) the "AnnotationValue" element
     */
    @Override
    public void xsetAnnotationValue(org.apache.xmlbeans.XmlString annotationValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(annotationValue);
        }
    }

    /**
     * Unsets the "AnnotationValue" element
     */
    @Override
    public void unsetAnnotationValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    @Override
    public boolean isSetId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.apache.xmlbeans.XmlString id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    @Override
    public void unsetId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }
}
