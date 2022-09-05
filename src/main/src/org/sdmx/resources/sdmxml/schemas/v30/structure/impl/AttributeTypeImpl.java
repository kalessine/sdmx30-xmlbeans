/*
 * XML Type:  AttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class AttributeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.AttributeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType {
    private static final long serialVersionUID = 1L;

    public AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConceptRole"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AttributeRelationship"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MeasureRelationship"),
        new QName("", "usage"),
    };


    /**
     * Gets a List of "ConceptRole" elements
     */
    @Override
    public java.util.List<java.lang.String> getConceptRoleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getConceptRoleArray,
                this::setConceptRoleArray,
                this::insertConceptRole,
                this::removeConceptRole,
                this::sizeOfConceptRoleArray
            );
        }
    }

    /**
     * Gets array of all "ConceptRole" elements
     */
    @Override
    public java.lang.String[] getConceptRoleArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ConceptRole" element
     */
    @Override
    public java.lang.String getConceptRoleArray(int i) {
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
     * Gets (as xml) a List of "ConceptRole" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType> xgetConceptRoleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetConceptRoleArray,
                this::xsetConceptRoleArray,
                this::insertNewConceptRole,
                this::removeConceptRole,
                this::sizeOfConceptRoleArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ConceptRole" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[] xgetConceptRoleArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "ConceptRole" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType xgetConceptRoleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptRole" element
     */
    @Override
    public int sizeOfConceptRoleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ConceptRole" element
     */
    @Override
    public void setConceptRoleArray(int i, java.lang.String conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(conceptRole);
        }
    }

    /**
     * Sets (as xml) array of all "ConceptRole" element
     */
    @Override
    public void xsetConceptRoleArray(org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[]conceptRoleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(conceptRoleArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "ConceptRole" element
     */
    @Override
    public void xsetConceptRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptRole);
        }
    }

    /**
     * Inserts the value as the ith "ConceptRole" element
     */
    @Override
    public void insertConceptRole(int i, java.lang.String conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(conceptRole);
        }
    }

    /**
     * Appends the value as the last "ConceptRole" element
     */
    @Override
    public void addConceptRole(java.lang.String conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(conceptRole);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptRole" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType insertNewConceptRole(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptRole" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType addNewConceptRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptRole" element
     */
    @Override
    public void removeConceptRole(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "AttributeRelationship" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType getAttributeRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AttributeRelationship" element
     */
    @Override
    public void setAttributeRelationship(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType attributeRelationship) {
        generatedSetterHelperImpl(attributeRelationship, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AttributeRelationship" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType addNewAttributeRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeRelationshipType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "MeasureRelationship" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType getMeasureRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MeasureRelationship" element
     */
    @Override
    public boolean isSetMeasureRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "MeasureRelationship" element
     */
    @Override
    public void setMeasureRelationship(org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType measureRelationship) {
        generatedSetterHelperImpl(measureRelationship, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MeasureRelationship" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType addNewMeasureRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.MeasureRelationshipType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "MeasureRelationship" element
     */
    @Override
    public void unsetMeasureRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "usage" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType.Enum getUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "usage" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType xgetUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return target;
        }
    }

    /**
     * True if has "usage" attribute
     */
    @Override
    public boolean isSetUsage() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "usage" attribute
     */
    @Override
    public void setUsage(org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType.Enum usage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(usage);
        }
    }

    /**
     * Sets (as xml) the "usage" attribute
     */
    @Override
    public void xsetUsage(org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType usage) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.UsageType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(usage);
        }
    }

    /**
     * Unsets the "usage" attribute
     */
    @Override
    public void unsetUsage() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
