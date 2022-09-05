/*
 * XML Type:  CodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CodelistTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.CodelistBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistType {
    private static final long serialVersionUID = 1L;

    public CodelistTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CodelistExtension"),
    };


    /**
     * Gets a List of "CodelistExtension" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType> getCodelistExtensionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodelistExtensionArray,
                this::setCodelistExtensionArray,
                this::insertNewCodelistExtension,
                this::removeCodelistExtension,
                this::sizeOfCodelistExtensionArray
            );
        }
    }

    /**
     * Gets array of all "CodelistExtension" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType[] getCodelistExtensionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType[0]);
    }

    /**
     * Gets ith "CodelistExtension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType getCodelistExtensionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CodelistExtension" element
     */
    @Override
    public int sizeOfCodelistExtensionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "CodelistExtension" element
     */
    @Override
    public void setCodelistExtensionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType codelistExtension) {
        generatedSetterHelperImpl(codelistExtension, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodelistExtension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType insertNewCodelistExtension(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CodelistExtension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType addNewCodelistExtension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistExtensionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "CodelistExtension" element
     */
    @Override
    public void removeCodelistExtension(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
