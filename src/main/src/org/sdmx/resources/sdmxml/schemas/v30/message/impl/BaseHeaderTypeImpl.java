/*
 * XML Type:  BaseHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML BaseHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a complex type.
 */
public class BaseHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.BaseHeaderType {
    private static final long serialVersionUID = 1L;

    public BaseHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "ID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Test"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Prepared"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Sender"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Receiver"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common", "Name"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Structure"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "DataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "MetadataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "DataSetAction"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "DataSetID"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Extracted"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "ReportingBegin"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "ReportingEnd"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "EmbargoDate"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Source"),
    };


    /**
     * Gets the "ID" element
     */
    @Override
    public java.lang.String getID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "ID" element
     */
    @Override
    public void setID(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "ID" element
     */
    @Override
    public void xsetID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType id) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(id);
        }
    }

    /**
     * Gets the "Test" element
     */
    @Override
    public boolean getTest() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "Test" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetTest() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "Test" element
     */
    @Override
    public void setTest(boolean test) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(test);
        }
    }

    /**
     * Sets (as xml) the "Test" element
     */
    @Override
    public void xsetTest(org.apache.xmlbeans.XmlBoolean test) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(test);
        }
    }

    /**
     * Gets the "Prepared" element
     */
    @Override
    public java.util.Calendar getPrepared() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "Prepared" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType xgetPrepared() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * Sets the "Prepared" element
     */
    @Override
    public void setPrepared(java.util.Calendar prepared) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setCalendarValue(prepared);
        }
    }

    /**
     * Sets (as xml) the "Prepared" element
     */
    @Override
    public void xsetPrepared(org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType prepared) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(prepared);
        }
    }

    /**
     * Gets the "Sender" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.SenderType getSender() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.SenderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.SenderType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Sender" element
     */
    @Override
    public void setSender(org.sdmx.resources.sdmxml.schemas.v30.message.SenderType sender) {
        generatedSetterHelperImpl(sender, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Sender" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.SenderType addNewSender() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.SenderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.SenderType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Gets a List of "Receiver" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.message.PartyType> getReceiverList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReceiverArray,
                this::setReceiverArray,
                this::insertNewReceiver,
                this::removeReceiver,
                this::sizeOfReceiverArray
            );
        }
    }

    /**
     * Gets array of all "Receiver" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType[] getReceiverArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.sdmx.resources.sdmxml.schemas.v30.message.PartyType[0]);
    }

    /**
     * Gets ith "Receiver" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType getReceiverArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.PartyType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Receiver" element
     */
    @Override
    public int sizeOfReceiverArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "Receiver" element
     */
    @Override
    public void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v30.message.PartyType receiver) {
        generatedSetterHelperImpl(receiver, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType insertNewReceiver(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.PartyType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.PartyType addNewReceiver() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.PartyType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "Receiver" element
     */
    @Override
    public void removeReceiver(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

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
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[5], i);
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
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "Name" element
     */
    @Override
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[5], i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[5]);
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
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "Structure" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType> getStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStructureArray,
                this::setStructureArray,
                this::insertNewStructure,
                this::removeStructure,
                this::sizeOfStructureArray
            );
        }
    }

    /**
     * Gets array of all "Structure" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType[] getStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType[0]);
    }

    /**
     * Gets ith "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType getStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Structure" element
     */
    @Override
    public int sizeOfStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "Structure" element
     */
    @Override
    public void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType structure) {
        generatedSetterHelperImpl(structure, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType insertNewStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType addNewStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.PayloadStructureType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "Structure" element
     */
    @Override
    public void removeStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets the "DataProvider" element
     */
    @Override
    public java.lang.String getDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType xgetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return target;
        }
    }

    /**
     * True if has "DataProvider" element
     */
    @Override
    public boolean isSetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "DataProvider" element
     */
    @Override
    public void setDataProvider(java.lang.String dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(dataProvider);
        }
    }

    /**
     * Sets (as xml) the "DataProvider" element
     */
    @Override
    public void xsetDataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType dataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.DataProviderReferenceType)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.set(dataProvider);
        }
    }

    /**
     * Unsets the "DataProvider" element
     */
    @Override
    public void unsetDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "MetadataProvider" element
     */
    @Override
    public java.lang.String getMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MetadataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType xgetMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return target;
        }
    }

    /**
     * True if has "MetadataProvider" element
     */
    @Override
    public boolean isSetMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "MetadataProvider" element
     */
    @Override
    public void setMetadataProvider(java.lang.String metadataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(metadataProvider);
        }
    }

    /**
     * Sets (as xml) the "MetadataProvider" element
     */
    @Override
    public void xsetMetadataProvider(org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType metadataProvider) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.MetadataProviderReferenceType)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.set(metadataProvider);
        }
    }

    /**
     * Unsets the "MetadataProvider" element
     */
    @Override
    public void unsetMetadataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "DataSetAction" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum getDataSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "DataSetAction" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ActionType xgetDataSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return target;
        }
    }

    /**
     * True if has "DataSetAction" element
     */
    @Override
    public boolean isSetDataSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "DataSetAction" element
     */
    @Override
    public void setDataSetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType.Enum dataSetAction) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.setEnumValue(dataSetAction);
        }
    }

    /**
     * Sets (as xml) the "DataSetAction" element
     */
    @Override
    public void xsetDataSetAction(org.sdmx.resources.sdmxml.schemas.v30.common.ActionType dataSetAction) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ActionType)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.set(dataSetAction);
        }
    }

    /**
     * Unsets the "DataSetAction" element
     */
    @Override
    public void unsetDataSetAction() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets a List of "DataSetID" elements
     */
    @Override
    public java.util.List<java.lang.String> getDataSetIDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDataSetIDArray,
                this::setDataSetIDArray,
                this::insertDataSetID,
                this::removeDataSetID,
                this::sizeOfDataSetIDArray
            );
        }
    }

    /**
     * Gets array of all "DataSetID" elements
     */
    @Override
    public java.lang.String[] getDataSetIDArray() {
        return getObjectArray(PROPERTY_QNAME[10], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "DataSetID" element
     */
    @Override
    public java.lang.String getDataSetIDArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "DataSetID" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.IDType> xgetDataSetIDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDataSetIDArray,
                this::xsetDataSetIDArray,
                this::insertNewDataSetID,
                this::removeDataSetID,
                this::sizeOfDataSetIDArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "DataSetID" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType[] xgetDataSetIDArray() {
        return xgetArray(PROPERTY_QNAME[10], org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]::new);
    }

    /**
     * Gets (as xml) ith "DataSetID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetDataSetIDArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataSetID" element
     */
    @Override
    public int sizeOfDataSetIDArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets ith "DataSetID" element
     */
    @Override
    public void setDataSetIDArray(int i, java.lang.String dataSetID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataSetID);
        }
    }

    /**
     * Sets (as xml) array of all "DataSetID" element
     */
    @Override
    public void xsetDataSetIDArray(org.sdmx.resources.sdmxml.schemas.v30.common.IDType[]dataSetIDArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dataSetIDArray, PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets (as xml) ith "DataSetID" element
     */
    @Override
    public void xsetDataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.IDType dataSetID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSetID);
        }
    }

    /**
     * Inserts the value as the ith "DataSetID" element
     */
    @Override
    public void insertDataSetID(int i, java.lang.String dataSetID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            target.setStringValue(dataSetID);
        }
    }

    /**
     * Appends the value as the last "DataSetID" element
     */
    @Override
    public void addDataSetID(java.lang.String dataSetID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[10]);
            target.setStringValue(dataSetID);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSetID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType insertNewDataSetID(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSetID" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType addNewDataSetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "DataSetID" element
     */
    @Override
    public void removeDataSetID(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets the "Extracted" element
     */
    @Override
    public java.util.Calendar getExtracted() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "Extracted" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetExtracted() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return target;
        }
    }

    /**
     * True if has "Extracted" element
     */
    @Override
    public boolean isSetExtracted() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]) != 0;
        }
    }

    /**
     * Sets the "Extracted" element
     */
    @Override
    public void setExtracted(java.util.Calendar extracted) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.setCalendarValue(extracted);
        }
    }

    /**
     * Sets (as xml) the "Extracted" element
     */
    @Override
    public void xsetExtracted(org.apache.xmlbeans.XmlDateTime extracted) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.set(extracted);
        }
    }

    /**
     * Unsets the "Extracted" element
     */
    @Override
    public void unsetExtracted() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], 0);
        }
    }

    /**
     * Gets the "ReportingBegin" element
     */
    @Override
    public java.lang.Object getReportingBegin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "ReportingBegin" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetReportingBegin() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return target;
        }
    }

    /**
     * True if has "ReportingBegin" element
     */
    @Override
    public boolean isSetReportingBegin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "ReportingBegin" element
     */
    @Override
    public void setReportingBegin(java.lang.Object reportingBegin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[12]);
            }
            target.setObjectValue(reportingBegin);
        }
    }

    /**
     * Sets (as xml) the "ReportingBegin" element
     */
    @Override
    public void xsetReportingBegin(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType reportingBegin) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().add_element_user(PROPERTY_QNAME[12]);
            }
            target.set(reportingBegin);
        }
    }

    /**
     * Unsets the "ReportingBegin" element
     */
    @Override
    public void unsetReportingBegin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }

    /**
     * Gets the "ReportingEnd" element
     */
    @Override
    public java.lang.Object getReportingEnd() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "ReportingEnd" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType xgetReportingEnd() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return target;
        }
    }

    /**
     * True if has "ReportingEnd" element
     */
    @Override
    public boolean isSetReportingEnd() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]) != 0;
        }
    }

    /**
     * Sets the "ReportingEnd" element
     */
    @Override
    public void setReportingEnd(java.lang.Object reportingEnd) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[13]);
            }
            target.setObjectValue(reportingEnd);
        }
    }

    /**
     * Sets (as xml) the "ReportingEnd" element
     */
    @Override
    public void xsetReportingEnd(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType reportingEnd) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationalTimePeriodType)get_store().add_element_user(PROPERTY_QNAME[13]);
            }
            target.set(reportingEnd);
        }
    }

    /**
     * Unsets the "ReportingEnd" element
     */
    @Override
    public void unsetReportingEnd() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], 0);
        }
    }

    /**
     * Gets the "EmbargoDate" element
     */
    @Override
    public java.util.Calendar getEmbargoDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "EmbargoDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetEmbargoDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            return target;
        }
    }

    /**
     * True if has "EmbargoDate" element
     */
    @Override
    public boolean isSetEmbargoDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]) != 0;
        }
    }

    /**
     * Sets the "EmbargoDate" element
     */
    @Override
    public void setEmbargoDate(java.util.Calendar embargoDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[14]);
            }
            target.setCalendarValue(embargoDate);
        }
    }

    /**
     * Sets (as xml) the "EmbargoDate" element
     */
    @Override
    public void xsetEmbargoDate(org.apache.xmlbeans.XmlDateTime embargoDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[14], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(PROPERTY_QNAME[14]);
            }
            target.set(embargoDate);
        }
    }

    /**
     * Unsets the "EmbargoDate" element
     */
    @Override
    public void unsetEmbargoDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], 0);
        }
    }

    /**
     * Gets a List of "Source" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSourceArray,
                this::setSourceArray,
                this::insertNewSource,
                this::removeSource,
                this::sizeOfSourceArray
            );
        }
    }

    /**
     * Gets array of all "Source" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getSourceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[15], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[15], i);
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
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets ith "Source" element
     */
    @Override
    public void setSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType source) {
        generatedSetterHelperImpl(source, PROPERTY_QNAME[15], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[15]);
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
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }
}
