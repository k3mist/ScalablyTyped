package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointRegion extends js.Object {
  var endpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var region: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_EndpointRegion {
  @scala.inline
  def apply(
    endpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    region: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_EndpointRegion = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointRegion]
  }
}

