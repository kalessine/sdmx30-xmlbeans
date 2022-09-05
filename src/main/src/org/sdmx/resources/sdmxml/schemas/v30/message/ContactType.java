/*
 * XML Type:  ContactType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.ContactType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ContactType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public interface ContactType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.message.ContactType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "contacttypeb22atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Name" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getNameList();

    /**
     * Gets array of all "Name" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getNameArray();

    /**
     * Gets ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getNameArray(int i);

    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();

    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewName();

    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);

    /**
     * Gets a List of "Department" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getDepartmentList();

    /**
     * Gets array of all "Department" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getDepartmentArray();

    /**
     * Gets ith "Department" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getDepartmentArray(int i);

    /**
     * Returns number of "Department" element
     */
    int sizeOfDepartmentArray();

    /**
     * Sets ith "Department" element
     */
    void setDepartmentArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType department);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Department" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewDepartment(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Department" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewDepartment();

    /**
     * Removes the ith "Department" element
     */
    void removeDepartment(int i);

    /**
     * Gets a List of "Role" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getRoleList();

    /**
     * Gets array of all "Role" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getRoleArray();

    /**
     * Gets ith "Role" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType getRoleArray(int i);

    /**
     * Returns number of "Role" element
     */
    int sizeOfRoleArray();

    /**
     * Sets ith "Role" element
     */
    void setRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType role);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Role" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewRole(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Role" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewRole();

    /**
     * Removes the ith "Role" element
     */
    void removeRole(int i);

    /**
     * Gets a List of "Telephone" elements
     */
    java.util.List<java.lang.String> getTelephoneList();

    /**
     * Gets array of all "Telephone" elements
     */
    java.lang.String[] getTelephoneArray();

    /**
     * Gets ith "Telephone" element
     */
    java.lang.String getTelephoneArray(int i);

    /**
     * Gets (as xml) a List of "Telephone" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetTelephoneList();

    /**
     * Gets (as xml) array of all "Telephone" elements
     */
    org.apache.xmlbeans.XmlString[] xgetTelephoneArray();

    /**
     * Gets (as xml) ith "Telephone" element
     */
    org.apache.xmlbeans.XmlString xgetTelephoneArray(int i);

    /**
     * Returns number of "Telephone" element
     */
    int sizeOfTelephoneArray();

    /**
     * Sets ith "Telephone" element
     */
    void setTelephoneArray(int i, java.lang.String telephone);

    /**
     * Sets (as xml) array of all "Telephone" element
     */
    void xsetTelephoneArray(org.apache.xmlbeans.XmlString[] telephoneArray);

    /**
     * Sets (as xml) ith "Telephone" element
     */
    void xsetTelephoneArray(int i, org.apache.xmlbeans.XmlString telephone);

    /**
     * Inserts the value as the ith "Telephone" element
     */
    void insertTelephone(int i, java.lang.String telephone);

    /**
     * Appends the value as the last "Telephone" element
     */
    void addTelephone(java.lang.String telephone);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Telephone" element
     */
    org.apache.xmlbeans.XmlString insertNewTelephone(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Telephone" element
     */
    org.apache.xmlbeans.XmlString addNewTelephone();

    /**
     * Removes the ith "Telephone" element
     */
    void removeTelephone(int i);

    /**
     * Gets a List of "Fax" elements
     */
    java.util.List<java.lang.String> getFaxList();

    /**
     * Gets array of all "Fax" elements
     */
    java.lang.String[] getFaxArray();

    /**
     * Gets ith "Fax" element
     */
    java.lang.String getFaxArray(int i);

    /**
     * Gets (as xml) a List of "Fax" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetFaxList();

    /**
     * Gets (as xml) array of all "Fax" elements
     */
    org.apache.xmlbeans.XmlString[] xgetFaxArray();

    /**
     * Gets (as xml) ith "Fax" element
     */
    org.apache.xmlbeans.XmlString xgetFaxArray(int i);

    /**
     * Returns number of "Fax" element
     */
    int sizeOfFaxArray();

    /**
     * Sets ith "Fax" element
     */
    void setFaxArray(int i, java.lang.String fax);

    /**
     * Sets (as xml) array of all "Fax" element
     */
    void xsetFaxArray(org.apache.xmlbeans.XmlString[] faxArray);

    /**
     * Sets (as xml) ith "Fax" element
     */
    void xsetFaxArray(int i, org.apache.xmlbeans.XmlString fax);

    /**
     * Inserts the value as the ith "Fax" element
     */
    void insertFax(int i, java.lang.String fax);

    /**
     * Appends the value as the last "Fax" element
     */
    void addFax(java.lang.String fax);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Fax" element
     */
    org.apache.xmlbeans.XmlString insertNewFax(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Fax" element
     */
    org.apache.xmlbeans.XmlString addNewFax();

    /**
     * Removes the ith "Fax" element
     */
    void removeFax(int i);

    /**
     * Gets a List of "X400" elements
     */
    java.util.List<java.lang.String> getX400List();

    /**
     * Gets array of all "X400" elements
     */
    java.lang.String[] getX400Array();

    /**
     * Gets ith "X400" element
     */
    java.lang.String getX400Array(int i);

    /**
     * Gets (as xml) a List of "X400" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetX400List();

    /**
     * Gets (as xml) array of all "X400" elements
     */
    org.apache.xmlbeans.XmlString[] xgetX400Array();

    /**
     * Gets (as xml) ith "X400" element
     */
    org.apache.xmlbeans.XmlString xgetX400Array(int i);

    /**
     * Returns number of "X400" element
     */
    int sizeOfX400Array();

    /**
     * Sets ith "X400" element
     */
    void setX400Array(int i, java.lang.String x400);

    /**
     * Sets (as xml) array of all "X400" element
     */
    void xsetX400Array(org.apache.xmlbeans.XmlString[] x400Array);

    /**
     * Sets (as xml) ith "X400" element
     */
    void xsetX400Array(int i, org.apache.xmlbeans.XmlString x400);

    /**
     * Inserts the value as the ith "X400" element
     */
    void insertX400(int i, java.lang.String x400);

    /**
     * Appends the value as the last "X400" element
     */
    void addX400(java.lang.String x400);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "X400" element
     */
    org.apache.xmlbeans.XmlString insertNewX400(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "X400" element
     */
    org.apache.xmlbeans.XmlString addNewX400();

    /**
     * Removes the ith "X400" element
     */
    void removeX400(int i);

    /**
     * Gets a List of "URI" elements
     */
    java.util.List<java.lang.String> getURIList();

    /**
     * Gets array of all "URI" elements
     */
    java.lang.String[] getURIArray();

    /**
     * Gets ith "URI" element
     */
    java.lang.String getURIArray(int i);

    /**
     * Gets (as xml) a List of "URI" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetURIList();

    /**
     * Gets (as xml) array of all "URI" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetURIArray();

    /**
     * Gets (as xml) ith "URI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetURIArray(int i);

    /**
     * Returns number of "URI" element
     */
    int sizeOfURIArray();

    /**
     * Sets ith "URI" element
     */
    void setURIArray(int i, java.lang.String uri);

    /**
     * Sets (as xml) array of all "URI" element
     */
    void xsetURIArray(org.apache.xmlbeans.XmlAnyURI[] uriArray);

    /**
     * Sets (as xml) ith "URI" element
     */
    void xsetURIArray(int i, org.apache.xmlbeans.XmlAnyURI uri);

    /**
     * Inserts the value as the ith "URI" element
     */
    void insertURI(int i, java.lang.String uri);

    /**
     * Appends the value as the last "URI" element
     */
    void addURI(java.lang.String uri);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "URI" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewURI(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "URI" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewURI();

    /**
     * Removes the ith "URI" element
     */
    void removeURI(int i);

    /**
     * Gets a List of "Email" elements
     */
    java.util.List<java.lang.String> getEmailList();

    /**
     * Gets array of all "Email" elements
     */
    java.lang.String[] getEmailArray();

    /**
     * Gets ith "Email" element
     */
    java.lang.String getEmailArray(int i);

    /**
     * Gets (as xml) a List of "Email" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetEmailList();

    /**
     * Gets (as xml) array of all "Email" elements
     */
    org.apache.xmlbeans.XmlString[] xgetEmailArray();

    /**
     * Gets (as xml) ith "Email" element
     */
    org.apache.xmlbeans.XmlString xgetEmailArray(int i);

    /**
     * Returns number of "Email" element
     */
    int sizeOfEmailArray();

    /**
     * Sets ith "Email" element
     */
    void setEmailArray(int i, java.lang.String email);

    /**
     * Sets (as xml) array of all "Email" element
     */
    void xsetEmailArray(org.apache.xmlbeans.XmlString[] emailArray);

    /**
     * Sets (as xml) ith "Email" element
     */
    void xsetEmailArray(int i, org.apache.xmlbeans.XmlString email);

    /**
     * Inserts the value as the ith "Email" element
     */
    void insertEmail(int i, java.lang.String email);

    /**
     * Appends the value as the last "Email" element
     */
    void addEmail(java.lang.String email);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Email" element
     */
    org.apache.xmlbeans.XmlString insertNewEmail(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Email" element
     */
    org.apache.xmlbeans.XmlString addNewEmail();

    /**
     * Removes the ith "Email" element
     */
    void removeEmail(int i);
}
