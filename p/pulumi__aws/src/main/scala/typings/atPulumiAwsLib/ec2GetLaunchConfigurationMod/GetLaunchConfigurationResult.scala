package typings
package atPulumiAwsLib.ec2GetLaunchConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchConfigurationResult extends js.Object {
  /**
    * Whether a Public IP address is associated with the instance.
    */
  val associatePublicIpAddress: scala.Boolean
  /**
    * The EBS Block Devices attached to the instance.
    */
  val ebsBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncrypted]
  /**
    * Whether the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: scala.Boolean
  /**
    * Whether Detailed Monitoring is Enabled.
    */
  val enableMonitoring: scala.Boolean
  /**
    * The Ephemeral volumes on the instance.
    */
  val ephemeralBlockDevices: js.Array[atPulumiAwsLib.Anon_DeviceName]
  /**
    * The IAM Instance Profile to associate with launched instances.
    */
  val iamInstanceProfile: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The EC2 Image ID of the instance.
    */
  val imageId: java.lang.String
  /**
    * The Instance Type of the instance to launch.
    */
  val instanceType: java.lang.String
  /**
    * The Key Name that should be used for the instance.
    */
  val keyName: java.lang.String
  /**
    * The Tenancy of the instance.
    */
  val placementTenancy: java.lang.String
  /**
    * The Root Block Device of the instance.
    */
  val rootBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSize]
  /**
    * A list of associated Security Group IDS.
    */
  val securityGroups: js.Array[java.lang.String]
  /**
    * The Price to use for reserving Spot instances.
    */
  val spotPrice: java.lang.String
  /**
    * The User Data of the instance.
    */
  val userData: java.lang.String
  /**
    * The ID of a ClassicLink-enabled VPC.
    */
  val vpcClassicLinkId: java.lang.String
  /**
    * The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
    */
  val vpcClassicLinkSecurityGroups: js.Array[java.lang.String]
}

object GetLaunchConfigurationResult {
  @scala.inline
  def apply(
    associatePublicIpAddress: scala.Boolean,
    ebsBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncrypted],
    ebsOptimized: scala.Boolean,
    enableMonitoring: scala.Boolean,
    ephemeralBlockDevices: js.Array[atPulumiAwsLib.Anon_DeviceName],
    iamInstanceProfile: java.lang.String,
    id: java.lang.String,
    imageId: java.lang.String,
    instanceType: java.lang.String,
    keyName: java.lang.String,
    placementTenancy: java.lang.String,
    rootBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSize],
    securityGroups: js.Array[java.lang.String],
    spotPrice: java.lang.String,
    userData: java.lang.String,
    vpcClassicLinkId: java.lang.String,
    vpcClassicLinkSecurityGroups: js.Array[java.lang.String]
  ): GetLaunchConfigurationResult = {
    val __obj = js.Dynamic.literal(associatePublicIpAddress = associatePublicIpAddress, ebsBlockDevices = ebsBlockDevices, ebsOptimized = ebsOptimized, enableMonitoring = enableMonitoring, ephemeralBlockDevices = ephemeralBlockDevices, iamInstanceProfile = iamInstanceProfile, id = id, imageId = imageId, instanceType = instanceType, keyName = keyName, placementTenancy = placementTenancy, rootBlockDevices = rootBlockDevices, securityGroups = securityGroups, spotPrice = spotPrice, userData = userData, vpcClassicLinkId = vpcClassicLinkId, vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups)
  
    __obj.asInstanceOf[GetLaunchConfigurationResult]
  }
}

