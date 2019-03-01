package typings
package atPulumiAwsLib.ec2NetworkInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceArgs extends js.Object {
  /**
    * Block to define the attachment of the ENI. Documented below.
    */
  val attachments: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AttachmentIdDeviceIndexInstance]
      ]
    ]
  ] = js.undefined
  /**
    * A description for the network interface.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val privateIp: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * List of private IPs to assign to the ENI.
    */
  val privateIps: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Number of private IPs to assign to the ENI.
    */
  val privateIpsCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * List of security group IDs to assign to the ENI.
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Whether to enable source destination checking for the ENI. Default true.
    */
  val sourceDestCheck: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Subnet ID to create the ENI in.
    */
  val subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object NetworkInterfaceArgs {
  @scala.inline
  def apply(
    subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    attachments: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AttachmentIdDeviceIndexInstance]
      ]
    ] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    privateIp: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    privateIps: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    privateIpsCount: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    securityGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    sourceDestCheck: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): NetworkInterfaceArgs = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (privateIps != null) __obj.updateDynamic("privateIps")(privateIps.asInstanceOf[js.Any])
    if (privateIpsCount != null) __obj.updateDynamic("privateIpsCount")(privateIpsCount.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (sourceDestCheck != null) __obj.updateDynamic("sourceDestCheck")(sourceDestCheck.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceArgs]
  }
}

