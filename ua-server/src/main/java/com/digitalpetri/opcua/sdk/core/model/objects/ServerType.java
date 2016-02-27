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

package com.digitalpetri.opcua.sdk.core.model.objects;

import com.digitalpetri.opcua.sdk.core.model.variables.PropertyType;
import com.digitalpetri.opcua.sdk.core.model.variables.ServerStatusType;
import com.digitalpetri.opcua.sdk.server.model.Property;
import com.digitalpetri.opcua.stack.core.types.builtin.DateTime;
import com.digitalpetri.opcua.stack.core.types.builtin.NodeId;
import com.digitalpetri.opcua.stack.core.types.builtin.QualifiedName;
import com.digitalpetri.opcua.stack.core.types.builtin.unsigned.UByte;
import com.digitalpetri.opcua.stack.core.types.structured.ServerStatusDataType;

public interface ServerType extends BaseObjectType {

    Property<String[]> SERVER_ARRAY = new Property.BasicProperty<>(
            QualifiedName.parse("0:ServerArray"),
            NodeId.parse("ns=0;i=12"),
            1,
            String[].class
    );

    Property<String[]> NAMESPACE_ARRAY = new Property.BasicProperty<>(
            QualifiedName.parse("0:NamespaceArray"),
            NodeId.parse("ns=0;i=12"),
            1,
            String[].class
    );

    Property<UByte> SERVICE_LEVEL = new Property.BasicProperty<>(
            QualifiedName.parse("0:ServiceLevel"),
            NodeId.parse("ns=0;i=3"),
            -1,
            UByte.class
    );

    Property<Boolean> AUDITING = new Property.BasicProperty<>(
            QualifiedName.parse("0:Auditing"),
            NodeId.parse("ns=0;i=1"),
            -1,
            Boolean.class
    );

    Property<DateTime> ESTIMATED_RETURN_TIME = new Property.BasicProperty<>(
            QualifiedName.parse("0:EstimatedReturnTime"),
            NodeId.parse("ns=0;i=13"),
            -1,
            DateTime.class
    );

    String[] getServerArray();

    PropertyType getServerArrayNode();

    void setServerArray(String[] value);

    String[] getNamespaceArray();

    PropertyType getNamespaceArrayNode();

    void setNamespaceArray(String[] value);

    UByte getServiceLevel();

    PropertyType getServiceLevelNode();

    void setServiceLevel(UByte value);

    Boolean getAuditing();

    PropertyType getAuditingNode();

    void setAuditing(Boolean value);

    DateTime getEstimatedReturnTime();

    PropertyType getEstimatedReturnTimeNode();

    void setEstimatedReturnTime(DateTime value);

    ServerCapabilitiesType getServerCapabilitiesNode();

    ServerDiagnosticsType getServerDiagnosticsNode();

    VendorServerInfoType getVendorServerInfoNode();

    ServerRedundancyType getServerRedundancyNode();

    NamespacesType getNamespacesNode();

    ServerStatusDataType getServerStatus();

    ServerStatusType getServerStatusNode();

    void setServerStatus(ServerStatusDataType value);
}
