/*
 * XML Type:  VersionQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VersionQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.common.LegacyVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionReferenceType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.WildcardType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.WildCardValueType
 */
public class VersionQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType, org.sdmx.resources.sdmxml.schemas.v30.common.WildcardVersionType, org.sdmx.resources.sdmxml.schemas.v30.common.WildCardValueType {
    private static final long serialVersionUID = 1L;

    public VersionQueryTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected VersionQueryTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
