package typings
package atPulumiAwsLib.getRegionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegionResult extends js.Object {
  /**
    * `true` if the selected region is the one configured on the
    * provider, or `false` otherwise.
    */
  val current: scala.Boolean
  /**
    * The region's description in this format: "Location (Region name)".
    */
  val description: java.lang.String
  /**
    * The EC2 endpoint for the selected region.
    */
  val endpoint: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the selected region.
    */
  val name: java.lang.String
}

object GetRegionResult {
  @scala.inline
  def apply(
    current: scala.Boolean,
    description: java.lang.String,
    endpoint: java.lang.String,
    id: java.lang.String,
    name: java.lang.String
  ): GetRegionResult = {
    val __obj = js.Dynamic.literal(current = current, description = description, endpoint = endpoint, id = id, name = name)
  
    __obj.asInstanceOf[GetRegionResult]
  }
}

