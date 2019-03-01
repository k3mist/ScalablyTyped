package typings
package atPulumiAwsLib.ec2clientvpnEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointState extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActiveDirectoryIdRootCertificateChainArn]
  ] = js.undefined
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CloudwatchLogGroupCloudwatchLogStream]
  ] = js.undefined
  /**
    * Name of the repository.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  val dnsName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  val dnsServers: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN of the ACM server certificate.
    */
  val serverCertificateArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The current state of the Client VPN endpoint.
    */
  val status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The transport protocol to be used by the VPN session. Default value is `udp`.
    */
  val transportProtocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object EndpointState {
  @scala.inline
  def apply(
    authenticationOptions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActiveDirectoryIdRootCertificateChainArn] = null,
    clientCidrBlock: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    connectionLogOptions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CloudwatchLogGroupCloudwatchLogStream] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    dnsName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    dnsServers: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    serverCertificateArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    status: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    transportProtocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): EndpointState = {
    val __obj = js.Dynamic.literal()
    if (authenticationOptions != null) __obj.updateDynamic("authenticationOptions")(authenticationOptions.asInstanceOf[js.Any])
    if (clientCidrBlock != null) __obj.updateDynamic("clientCidrBlock")(clientCidrBlock.asInstanceOf[js.Any])
    if (connectionLogOptions != null) __obj.updateDynamic("connectionLogOptions")(connectionLogOptions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (dnsServers != null) __obj.updateDynamic("dnsServers")(dnsServers.asInstanceOf[js.Any])
    if (serverCertificateArn != null) __obj.updateDynamic("serverCertificateArn")(serverCertificateArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transportProtocol != null) __obj.updateDynamic("transportProtocol")(transportProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointState]
  }
}

