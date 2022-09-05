/*
 * XML Type:  ContactType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ContactType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ContactTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ContactType {
    private static final long serialVersionUID = 1L;

    public ContactTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Name"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Department"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Role"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Telephone"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Fax"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "X400"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "URI"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Email"),
        new QName("", "id"),
    };


    /**
     * Gets a List of "Name" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameArray,
                this::setNameArray,
                this::insertNewName,
                this::removeName,
                this::sizeOfNameArray
            );
        }
    }

    /**
     * Gets array of all "Name" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Name" element
     */
    @Override
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Name" element
     */
    @Override
    public void removeName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Department" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getDepartmentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDepartmentArray,
                this::setDepartmentArray,
                this::insertNewDepartment,
                this::removeDepartment,
                this::sizeOfDepartmentArray
            );
        }
    }

    /**
     * Gets array of all "Department" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getDepartmentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Department" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getDepartmentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Department" element
     */
    @Override
    public int sizeOfDepartmentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Department" element
     */
    @Override
    public void setDepartmentArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType department) {
        generatedSetterHelperImpl(department, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Department" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewDepartment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Department" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewDepartment() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Department" element
     */
    @Override
    public void removeDepartment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "Role" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getRoleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRoleArray,
                this::setRoleArray,
                this::insertNewRole,
                this::removeRole,
                this::sizeOfRoleArray
            );
        }
    }

    /**
     * Gets array of all "Role" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getRoleArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Role" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getRoleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Role" element
     */
    @Override
    public int sizeOfRoleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "Role" element
     */
    @Override
    public void setRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType role) {
        generatedSetterHelperImpl(role, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Role" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewRole(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Role" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "Role" element
     */
    @Override
    public void removeRole(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "Telephone" elements
     */
    @Override
    public java.util.List<java.lang.String> getTelephoneList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTelephoneArray,
                this::setTelephoneArray,
                this::insertTelephone,
                this::removeTelephone,
                this::sizeOfTelephoneArray
            );
        }
    }

    /**
     * Gets array of all "Telephone" elements
     */
    @Override
    public java.lang.String[] getTelephoneArray() {
        return getObjectArray(PROPERTY_QNAME[3], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Telephone" element
     */
    @Override
    public java.lang.String getTelephoneArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Telephone" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetTelephoneList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTelephoneArray,
                this::xsetTelephoneArray,
                this::insertNewTelephone,
                this::removeTelephone,
                this::sizeOfTelephoneArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Telephone" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetTelephoneArray() {
        return xgetArray(PROPERTY_QNAME[3], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "Telephone" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTelephoneArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Telephone" element
     */
    @Override
    public int sizeOfTelephoneArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "Telephone" element
     */
    @Override
    public void setTelephoneArray(int i, java.lang.String telephone) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(telephone);
        }
    }

    /**
     * Sets (as xml) array of all "Telephone" element
     */
    @Override
    public void xsetTelephoneArray(org.apache.xmlbeans.XmlString[]telephoneArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(telephoneArray, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets (as xml) ith "Telephone" element
     */
    @Override
    public void xsetTelephoneArray(int i, org.apache.xmlbeans.XmlString telephone) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephone);
        }
    }

    /**
     * Inserts the value as the ith "Telephone" element
     */
    @Override
    public void insertTelephone(int i, java.lang.String telephone) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            target.setStringValue(telephone);
        }
    }

    /**
     * Appends the value as the last "Telephone" element
     */
    @Override
    public void addTelephone(java.lang.String telephone) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            target.setStringValue(telephone);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Telephone" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewTelephone(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Telephone" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewTelephone() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "Telephone" element
     */
    @Override
    public void removeTelephone(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "Fax" elements
     */
    @Override
    public java.util.List<java.lang.String> getFaxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFaxArray,
                this::setFaxArray,
                this::insertFax,
                this::removeFax,
                this::sizeOfFaxArray
            );
        }
    }

    /**
     * Gets array of all "Fax" elements
     */
    @Override
    public java.lang.String[] getFaxArray() {
        return getObjectArray(PROPERTY_QNAME[4], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Fax" element
     */
    @Override
    public java.lang.String getFaxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Fax" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFaxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFaxArray,
                this::xsetFaxArray,
                this::insertNewFax,
                this::removeFax,
                this::sizeOfFaxArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Fax" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetFaxArray() {
        return xgetArray(PROPERTY_QNAME[4], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "Fax" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFaxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Fax" element
     */
    @Override
    public int sizeOfFaxArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "Fax" element
     */
    @Override
    public void setFaxArray(int i, java.lang.String fax) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fax);
        }
    }

    /**
     * Sets (as xml) array of all "Fax" element
     */
    @Override
    public void xsetFaxArray(org.apache.xmlbeans.XmlString[]faxArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(faxArray, PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets (as xml) ith "Fax" element
     */
    @Override
    public void xsetFaxArray(int i, org.apache.xmlbeans.XmlString fax) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(fax);
        }
    }

    /**
     * Inserts the value as the ith "Fax" element
     */
    @Override
    public void insertFax(int i, java.lang.String fax) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            target.setStringValue(fax);
        }
    }

    /**
     * Appends the value as the last "Fax" element
     */
    @Override
    public void addFax(java.lang.String fax) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            target.setStringValue(fax);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Fax" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewFax(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Fax" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewFax() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "Fax" element
     */
    @Override
    public void removeFax(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "X400" elements
     */
    @Override
    public java.util.List<java.lang.String> getX400List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getX400Array,
                this::setX400Array,
                this::insertX400,
                this::removeX400,
                this::sizeOfX400Array
            );
        }
    }

    /**
     * Gets array of all "X400" elements
     */
    @Override
    public java.lang.String[] getX400Array() {
        return getObjectArray(PROPERTY_QNAME[5], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "X400" element
     */
    @Override
    public java.lang.String getX400Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "X400" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetX400List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetX400Array,
                this::xsetX400Array,
                this::insertNewX400,
                this::removeX400,
                this::sizeOfX400Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "X400" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetX400Array() {
        return xgetArray(PROPERTY_QNAME[5], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "X400" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetX400Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "X400" element
     */
    @Override
    public int sizeOfX400Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "X400" element
     */
    @Override
    public void setX400Array(int i, java.lang.String x400) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(x400);
        }
    }

    /**
     * Sets (as xml) array of all "X400" element
     */
    @Override
    public void xsetX400Array(org.apache.xmlbeans.XmlString[]x400Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(x400Array, PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets (as xml) ith "X400" element
     */
    @Override
    public void xsetX400Array(int i, org.apache.xmlbeans.XmlString x400) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(x400);
        }
    }

    /**
     * Inserts the value as the ith "X400" element
     */
    @Override
    public void insertX400(int i, java.lang.String x400) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            target.setStringValue(x400);
        }
    }

    /**
     * Appends the value as the last "X400" element
     */
    @Override
    public void addX400(java.lang.String x400) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            target.setStringValue(x400);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "X400" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewX400(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "X400" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewX400() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "X400" element
     */
    @Override
    public void removeX400(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "URI" elements
     */
    @Override
    public java.util.List<java.lang.String> getURIList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getURIArray,
                this::setURIArray,
                this::insertURI,
                this::removeURI,
                this::sizeOfURIArray
            );
        }
    }

    /**
     * Gets array of all "URI" elements
     */
    @Override
    public java.lang.String[] getURIArray() {
        return getObjectArray(PROPERTY_QNAME[6], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "URI" element
     */
    @Override
    public java.lang.String getURIArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "URI" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetURIList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetURIArray,
                this::xsetURIArray,
                this::insertNewURI,
                this::removeURI,
                this::sizeOfURIArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "URI" elements
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI[] xgetURIArray() {
        return xgetArray(PROPERTY_QNAME[6], org.apache.xmlbeans.XmlAnyURI[]::new);
    }

    /**
     * Gets (as xml) ith "URI" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetURIArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "URI" element
     */
    @Override
    public int sizeOfURIArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "URI" element
     */
    @Override
    public void setURIArray(int i, java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(uri);
        }
    }

    /**
     * Sets (as xml) array of all "URI" element
     */
    @Override
    public void xsetURIArray(org.apache.xmlbeans.XmlAnyURI[]uriArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(uriArray, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets (as xml) ith "URI" element
     */
    @Override
    public void xsetURIArray(int i, org.apache.xmlbeans.XmlAnyURI uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(uri);
        }
    }

    /**
     * Inserts the value as the ith "URI" element
     */
    @Override
    public void insertURI(int i, java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            target.setStringValue(uri);
        }
    }

    /**
     * Appends the value as the last "URI" element
     */
    @Override
    public void addURI(java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            target.setStringValue(uri);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "URI" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI insertNewURI(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "URI" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI addNewURI() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "URI" element
     */
    @Override
    public void removeURI(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "Email" elements
     */
    @Override
    public java.util.List<java.lang.String> getEmailList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getEmailArray,
                this::setEmailArray,
                this::insertEmail,
                this::removeEmail,
                this::sizeOfEmailArray
            );
        }
    }

    /**
     * Gets array of all "Email" elements
     */
    @Override
    public java.lang.String[] getEmailArray() {
        return getObjectArray(PROPERTY_QNAME[7], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Email" element
     */
    @Override
    public java.lang.String getEmailArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Email" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetEmailList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetEmailArray,
                this::xsetEmailArray,
                this::insertNewEmail,
                this::removeEmail,
                this::sizeOfEmailArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Email" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetEmailArray() {
        return xgetArray(PROPERTY_QNAME[7], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "Email" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetEmailArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Email" element
     */
    @Override
    public int sizeOfEmailArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets ith "Email" element
     */
    @Override
    public void setEmailArray(int i, java.lang.String email) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(email);
        }
    }

    /**
     * Sets (as xml) array of all "Email" element
     */
    @Override
    public void xsetEmailArray(org.apache.xmlbeans.XmlString[]emailArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(emailArray, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets (as xml) ith "Email" element
     */
    @Override
    public void xsetEmailArray(int i, org.apache.xmlbeans.XmlString email) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(email);
        }
    }

    /**
     * Inserts the value as the ith "Email" element
     */
    @Override
    public void insertEmail(int i, java.lang.String email) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            target.setStringValue(email);
        }
    }

    /**
     * Appends the value as the last "Email" element
     */
    @Override
    public void addEmail(java.lang.String email) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            target.setStringValue(email);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Email" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewEmail(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Email" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "Email" element
     */
    @Override
    public void removeEmail(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[8]);
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
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }
}
