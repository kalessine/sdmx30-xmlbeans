/*
 * XML Type:  CodeSelectionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CodeSelectionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface CodeSelectionType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.CodeSelectionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "codeselectiontypee795type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "MemberValue" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType> getMemberValueList();

    /**
     * Gets array of all "MemberValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType[] getMemberValueArray();

    /**
     * Gets ith "MemberValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType getMemberValueArray(int i);

    /**
     * Returns number of "MemberValue" element
     */
    int sizeOfMemberValueArray();

    /**
     * Sets ith "MemberValue" element
     */
    void setMemberValueArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType memberValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MemberValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType insertNewMemberValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MemberValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType addNewMemberValue();

    /**
     * Removes the ith "MemberValue" element
     */
    void removeMemberValue(int i);
}
