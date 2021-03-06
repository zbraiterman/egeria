/* SPDX-License-Identifier: Apache-2.0 */
package org.odpi.openmetadata.frameworks.connectors;

import org.odpi.openmetadata.frameworks.connectors.ffdc.ConnectionCheckedException;
import org.odpi.openmetadata.frameworks.connectors.ffdc.ConnectorCheckedException;
import org.odpi.openmetadata.frameworks.connectors.properties.ConnectionProperties;

/**
 * MockEmptyConnectorProvider is a badly behaved ConnectorProvider to force error paths in the
 * ConnectorBroker and ConnectorProviderBase.
 */
public class MockConnectorCheckedExceptionConnectorProvider extends ConnectorProviderBase
{

    /**
     * The constructor sets up the name of the connector class.
     */
    public MockConnectorCheckedExceptionConnectorProvider()
    {
        super();
    }



    /**
     * Creates a new instance of a connector based on the information in the supplied connection.
     *
     * @param connection   connection that should have all of the properties needed by the Connector Provider
     *                   to create a connector instance.
     * @return Connector   instance of the connector.
     * @throws ConnectionCheckedException if there are missing or invalid properties in the connection
     * @throws ConnectorCheckedException if there are issues instantiating or initializing the connector
     */
    @Override
    public Connector getConnector(ConnectionProperties connection) throws ConnectionCheckedException, ConnectorCheckedException
    {
        throw new ConnectorCheckedException(400,
                                            this.getClass().getName(),
                                            "getConnector",
                                            "Mock error message",
                                            "System Action",
                                            "UserAction");
    }
}