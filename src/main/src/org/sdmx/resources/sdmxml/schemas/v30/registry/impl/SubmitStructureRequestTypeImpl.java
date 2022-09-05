/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubmitStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class SubmitStructureRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.SubmitStructureRequestType {
    private static final long serialVersionUID = 1L;

    public SubmitStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "StructureLocation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Structures"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "SubmittedStructure"),
        new QName("", "action"),
        new QName("", "externalDependencies"),
    };


    /**
     * Gets the "StructureLocation" element
     */
    @Override
    public java.lang.String getStructureLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "StructureLocation" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetStructureLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "StructureLocation" element
     */
    @Override
    public boolean isSetStructureLocation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "StructureLocation" element
     */
    @Override
    public void setStructureLocation(java.lang.String structureLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(structureLocation);
        }
    }

    /**
     * Sets (as xml) the "StructureLocation" element
     */
    @Override
    public void xsetStructureLocation(org.apache.xmlbeans.XmlAnyURI structureLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(structureLocation);
        }
    }

    /**
     * Unsets the "StructureLocation" element
     */
    @Override
    public void unsetStructureLocation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Structures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType getStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Structures" element
     */
    @Override
    public boolean isSetStructures() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Structures" element
     */
    @Override
    public void setStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType structures) {
        generatedSetterHelperImpl(structures, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Structures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType addNewStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Structures" element
     */
    @Override
    public void unsetStructures() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "SubmittedStructure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType> getSubmittedStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubmittedStructureArray,
                this::setSubmittedStructureArray,
                this::insertNewSubmittedStructure,
                this::removeSubmittedStructure,
                this::sizeOfSubmittedStructureArray
            );
        }
    }

    /**
     * Gets array of all "SubmittedStructure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType[] getSubmittedStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType[0]);
    }

    /**
     * Gets ith "SubmittedStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType getSubmittedStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SubmittedStructure" element
     */
    @Override
    public int sizeOfSubmittedStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "SubmittedStructure" element
     */
    @Override
    public void setSubmittedStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType submittedStructure) {
        generatedSetterHelperImpl(submittedStructure, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmittedStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType insertNewSubmittedStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SubmittedStructure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType addNewSubmittedStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.SubmittedStructureType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "SubmittedStructure" element
     */
    @Override
    public void removeSubmittedStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "action" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_default_attribute_value(PROPERTY_QNAME[3]);
            }
            return target;
        }
    }

    /**
     * True if has "action" attribute
     */
    @Override
    public boolean isSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "action" attribute
     */
    @Override
    public void setAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum action) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(action);
        }
    }

    /**
     * Sets (as xml) the "action" attribute
     */
    @Override
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType action) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(action);
        }
    }

    /**
     * Unsets the "action" attribute
     */
    @Override
    public void unsetAction() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "externalDependencies" attribute
     */
    @Override
    public boolean getExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "externalDependencies" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return target;
        }
    }

    /**
     * True if has "externalDependencies" attribute
     */
    @Override
    public boolean isSetExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "externalDependencies" attribute
     */
    @Override
    public void setExternalDependencies(boolean externalDependencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setBooleanValue(externalDependencies);
        }
    }

    /**
     * Sets (as xml) the "externalDependencies" attribute
     */
    @Override
    public void xsetExternalDependencies(org.apache.xmlbeans.XmlBoolean externalDependencies) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(externalDependencies);
        }
    }

    /**
     * Unsets the "externalDependencies" attribute
     */
    @Override
    public void unsetExternalDependencies() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}
