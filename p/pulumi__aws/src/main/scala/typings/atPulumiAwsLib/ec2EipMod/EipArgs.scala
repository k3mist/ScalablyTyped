package typings
package atPulumiAwsLib.ec2EipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EipArgs extends js.Object {
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * EC2 instance ID.
    */
  val instance: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object EipArgs {
  @scala.inline
  def apply(
    associateWithPrivateIp: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    instance: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    networkInterface: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    publicIpv4Pool: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpc: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): EipArgs = {
    val __obj = js.Dynamic.literal()
    if (associateWithPrivateIp != null) __obj.updateDynamic("associateWithPrivateIp")(associateWithPrivateIp.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface.asInstanceOf[js.Any])
    if (publicIpv4Pool != null) __obj.updateDynamic("publicIpv4Pool")(publicIpv4Pool.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpc != null) __obj.updateDynamic("vpc")(vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[EipArgs]
  }
}

