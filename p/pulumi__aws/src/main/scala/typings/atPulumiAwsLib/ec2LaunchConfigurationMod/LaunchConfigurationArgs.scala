package typings
package atPulumiAwsLib.ec2LaunchConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfigurationArgs extends js.Object {
  /**
    * Associate a public ip address with an instance in a VPC.
    */
  val associatePublicIpAddress: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDeviceSnapshotId]
      ]
    ]
  ] = js.undefined
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Enables/disables detailed monitoring. This is enabled by default.
    */
  val enableMonitoring: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeviceNameVirtualName]]
    ]
  ] = js.undefined
  /**
    * The name attribute of the IAM instance profile to associate
    * with launched instances.
    */
  val iamInstanceProfile: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iamMod.InstanceProfile]
  ] = js.undefined
  /**
    * The EC2 image ID to launch.
    */
  val imageId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The size of instance to launch.
    */
  val instanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The key name that should be used for the instance.
    */
  val keyName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the launch configuration. If you leave
    * this blank, Terraform will auto-generate a unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The tenancy of the instance. Valid values are
    * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
    * for more details
    */
  val placementTenancy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSizeVolumeTypeBoolean]
  ] = js.undefined
  /**
    * A list of associated security group IDS.
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The maximum price to use for reserving spot instances.
    */
  val spotPrice: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `user_data_base64` instead.
    */
  val userData: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Can be used instead of `user_data` to pass base64-encoded binary data directly. Use this instead of `user_data` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
    */
  val vpcClassicLinkId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
    */
  val vpcClassicLinkSecurityGroups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object LaunchConfigurationArgs {
  @scala.inline
  def apply(
    imageId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    instanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    associatePublicIpAddress: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    ebsBlockDevices: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDeviceSnapshotId]
      ]
    ] = null,
    ebsOptimized: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    enableMonitoring: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    ephemeralBlockDevices: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeviceNameVirtualName]]
    ] = null,
    iamInstanceProfile: atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.iamMod.InstanceProfile] = null,
    keyName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    placementTenancy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    rootBlockDevice: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSizeVolumeTypeBoolean] = null,
    securityGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    spotPrice: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    userData: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    userDataBase64: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vpcClassicLinkId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vpcClassicLinkSecurityGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): LaunchConfigurationArgs = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (associatePublicIpAddress != null) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (enableMonitoring != null) __obj.updateDynamic("enableMonitoring")(enableMonitoring.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (placementTenancy != null) __obj.updateDynamic("placementTenancy")(placementTenancy.asInstanceOf[js.Any])
    if (rootBlockDevice != null) __obj.updateDynamic("rootBlockDevice")(rootBlockDevice.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (spotPrice != null) __obj.updateDynamic("spotPrice")(spotPrice.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (userDataBase64 != null) __obj.updateDynamic("userDataBase64")(userDataBase64.asInstanceOf[js.Any])
    if (vpcClassicLinkId != null) __obj.updateDynamic("vpcClassicLinkId")(vpcClassicLinkId.asInstanceOf[js.Any])
    if (vpcClassicLinkSecurityGroups != null) __obj.updateDynamic("vpcClassicLinkSecurityGroups")(vpcClassicLinkSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationArgs]
  }
}

