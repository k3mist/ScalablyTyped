package typings
package atPulumiAwsLib.gameliftFleetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetArgs extends js.Object {
  /**
    * ID of the Gamelift Build to be deployed on the fleet.
    */
  val buildId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Human-readable description of the fleet.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
    */
  val ec2InboundPermissions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FromPortIpRange]]
    ]
  ] = js.undefined
  /**
    * Name of an EC2 instance type. e.g. `t2.micro`
    */
  val ec2InstanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
    */
  val metricGroups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the fleet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
    */
  val newGameSessionProtectionPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
    */
  val resourceCreationLimitPolicy: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_NewGameSessionsPerCreatorPolicyPeriodInMinutes]
  ] = js.undefined
  /**
    * Instructions for launching server processes on each instance in the fleet. See below.
    */
  val runtimeConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_GameSessionActivationTimeoutSecondsMaxConcurrentGameSessionActivations
    ]
  ] = js.undefined
}

