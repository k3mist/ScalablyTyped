package typings
package atPulumiAwsLib.ec2CapacityReservationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapacityReservationArgs extends js.Object {
  /**
    * The Availability Zone in which to create the Capacity Reservation.
    */
  val availabilityZone: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
    */
  val endDate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
    */
  val endDateType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  val ephemeralStorage: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The number of instances for which to reserve capacity.
    */
  val instanceCount: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
    */
  val instanceMatchCriteria: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
    */
  val instancePlatform: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform]
  /**
    * The instance type for which to reserve capacity.
    */
  val instanceType: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.ec2InstanceTypeMod.InstanceType]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
    */
  val tenancy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.ec2TenancyMod.Tenancy]] = js.undefined
}

object CapacityReservationArgs {
  @scala.inline
  def apply(
    availabilityZone: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    instanceCount: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    instancePlatform: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.ec2InstancePlatformMod.InstancePlatform],
    instanceType: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.ec2InstanceTypeMod.InstanceType],
    ebsOptimized: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    endDate: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    endDateType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    ephemeralStorage: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    instanceMatchCriteria: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    tenancy: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.ec2TenancyMod.Tenancy] = null
  ): CapacityReservationArgs = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], instanceCount = instanceCount.asInstanceOf[js.Any], instancePlatform = instancePlatform.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (endDateType != null) __obj.updateDynamic("endDateType")(endDateType.asInstanceOf[js.Any])
    if (ephemeralStorage != null) __obj.updateDynamic("ephemeralStorage")(ephemeralStorage.asInstanceOf[js.Any])
    if (instanceMatchCriteria != null) __obj.updateDynamic("instanceMatchCriteria")(instanceMatchCriteria.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationArgs]
  }
}

