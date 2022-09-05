/*
 * XML Type:  CodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CodelistsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistsType {
    private static final long serialVersionUID = 1L;

    public CodelistsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Codelist"),
    };


    /**
     * Gets a List of "Codelist" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType> getCodelistList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodelistArray,
                this::setCodelistArray,
                this::insertNewCodelist,
                this::removeCodelist,
                this::sizeOfCodelistArray
            );
        }
    }

    /**
     * Gets array of all "Codelist" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType[] getCodelistArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType[0]);
    }

    /**
     * Gets ith "Codelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType getCodelistArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Codelist" element
     */
    @Override
    public int sizeOfCodelistArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Codelist" element
     */
    @Override
    public void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType codelist) {
        generatedSetterHelperImpl(codelist, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType insertNewCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType addNewCodelist() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Codelist" element
     */
    @Override
    public void removeCodelist(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
