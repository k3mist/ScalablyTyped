package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IngestEndpointsAnonPasswordUrl extends js.Object {
  var ingestEndpoints: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_PasswordUrl]]]
  ] = js.undefined
}

object Anon_IngestEndpointsAnonPasswordUrl {
  @scala.inline
  def apply(
    ingestEndpoints: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_PasswordUrl]]] = null
  ): Anon_IngestEndpointsAnonPasswordUrl = {
    val __obj = js.Dynamic.literal()
    if (ingestEndpoints != null) __obj.updateDynamic("ingestEndpoints")(ingestEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IngestEndpointsAnonPasswordUrl]
  }
}

