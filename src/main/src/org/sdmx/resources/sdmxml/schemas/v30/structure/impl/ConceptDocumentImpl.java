/*
 * An XML document type.
 * Localname: Concept
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Concept(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class ConceptDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptDocument {
    private static final long serialVersionUID = 1L;

    public ConceptDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Concept"),
    };


    /**
     * Gets the "Concept" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType getConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Concept" element
     */
    @Override
    public void setConcept(org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType concept) {
        generatedSetterHelperImpl(concept, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Concept" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType addNewConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
