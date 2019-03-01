package typings
package atPulumiAwsLib.ec2GetSubnetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubnetArgs extends js.Object {
  /**
    * The availability zone where the
    * subnet must reside.
    */
  val availabilityZone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the Availability Zone for the subnet.
    */
  val availabilityZoneId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cidr block of the desired subnet.
    */
  val cidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean constraint for whether the desired
    * subnet must be the default subnet for its associated availability zone.
    */
  val defaultForAz: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The id of the specific subnet to retrieve.
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Ipv6 cidr block of the desired subnet
    */
  val ipv6CidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state that the desired subnet must have.
    */
  val state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired subnet.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The id of the VPC that the desired subnet belongs to.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

object GetSubnetArgs {
  @scala.inline
  def apply(
    availabilityZone: java.lang.String = null,
    availabilityZoneId: java.lang.String = null,
    cidrBlock: java.lang.String = null,
    defaultForAz: js.UndefOr[scala.Boolean] = js.undefined,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    id: java.lang.String = null,
    ipv6CidrBlock: java.lang.String = null,
    state: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    vpcId: java.lang.String = null
  ): GetSubnetArgs = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (availabilityZoneId != null) __obj.updateDynamic("availabilityZoneId")(availabilityZoneId)
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (!js.isUndefined(defaultForAz)) __obj.updateDynamic("defaultForAz")(defaultForAz)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetSubnetArgs]
  }
}

