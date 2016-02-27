/*
 * digitalpetri OPC-UA SDK
 *
 * Copyright (C) 2015 Kevin Herron
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.digitalpetri.opcua.sdk.server.model.objects;

import java.util.Optional;

import com.digitalpetri.opcua.sdk.core.model.objects.CertificateUpdatedAuditEventType;
import com.digitalpetri.opcua.sdk.core.nodes.VariableNode;
import com.digitalpetri.opcua.sdk.server.api.UaNodeManager;
import com.digitalpetri.opcua.sdk.server.model.variables.PropertyNode;
import com.digitalpetri.opcua.stack.core.types.builtin.LocalizedText;
import com.digitalpetri.opcua.stack.core.types.builtin.NodeId;
import com.digitalpetri.opcua.stack.core.types.builtin.QualifiedName;
import com.digitalpetri.opcua.stack.core.types.builtin.unsigned.UByte;
import com.digitalpetri.opcua.stack.core.types.builtin.unsigned.UInteger;

@com.digitalpetri.opcua.sdk.server.util.UaObjectNode(typeName = "0:CertificateUpdatedAuditEventType")
public class CertificateUpdatedAuditEventNode extends AuditUpdateMethodEventNode implements CertificateUpdatedAuditEventType {

    public CertificateUpdatedAuditEventNode(
            UaNodeManager nodeManager,
            NodeId nodeId,
            QualifiedName browseName,
            LocalizedText displayName,
            Optional<LocalizedText> description,
            Optional<UInteger> writeMask,
            Optional<UInteger> userWriteMask,
            UByte eventNotifier) {

        super(nodeManager, nodeId, browseName, displayName, description, writeMask, userWriteMask, eventNotifier);
    }

    @Override
    public NodeId getCertificateGroup() {
        Optional<NodeId> property = getProperty(CertificateUpdatedAuditEventType.CERTIFICATE_GROUP);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getCertificateGroupNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(CertificateUpdatedAuditEventType.CERTIFICATE_GROUP.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setCertificateGroup(NodeId value) {
        setProperty(CertificateUpdatedAuditEventType.CERTIFICATE_GROUP, value);
    }

    @Override
    public NodeId getCertificateType() {
        Optional<NodeId> property = getProperty(CertificateUpdatedAuditEventType.CERTIFICATE_TYPE);

        return property.orElse(null);
    }

    @Override
    public PropertyNode getCertificateTypeNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(CertificateUpdatedAuditEventType.CERTIFICATE_TYPE.getBrowseName());

        return propertyNode.map(n -> (PropertyNode) n).orElse(null);
    }

    @Override
    public void setCertificateType(NodeId value) {
        setProperty(CertificateUpdatedAuditEventType.CERTIFICATE_TYPE, value);
    }

}
