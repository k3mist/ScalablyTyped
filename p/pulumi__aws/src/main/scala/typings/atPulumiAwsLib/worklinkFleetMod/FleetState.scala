package typings
package atPulumiAwsLib.worklinkFleetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetState extends js.Object {
  /**
    * The ARN of the created WorkLink Fleet.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  val auditStreamArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  val companyCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The time that the fleet was created.
    */
  val createdTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  val deviceCaCertificate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the fleet.
    */
  val displayName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
    */
  val identityProvider: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SamlMetadataType]] = js.undefined
  /**
    * The time that the fleet was last updated.
    */
  val lastUpdatedTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
    */
  val network: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInputString]
  ] = js.undefined
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
    */
  val optimizeForEndUserLocation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object FleetState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    auditStreamArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    companyCode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    createdTime: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    deviceCaCertificate: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    displayName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    identityProvider: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SamlMetadataType] = null,
    lastUpdatedTime: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    network: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInputString] = null,
    optimizeForEndUserLocation: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): FleetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (auditStreamArn != null) __obj.updateDynamic("auditStreamArn")(auditStreamArn.asInstanceOf[js.Any])
    if (companyCode != null) __obj.updateDynamic("companyCode")(companyCode.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (deviceCaCertificate != null) __obj.updateDynamic("deviceCaCertificate")(deviceCaCertificate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (identityProvider != null) __obj.updateDynamic("identityProvider")(identityProvider.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (optimizeForEndUserLocation != null) __obj.updateDynamic("optimizeForEndUserLocation")(optimizeForEndUserLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetState]
  }
}

