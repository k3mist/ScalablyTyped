package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsResource extends js.Object {
  /** List the metadata for the dimensions available to this AdExchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
}

object DimensionsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
    ]
  ): DimensionsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[DimensionsResource]
  }
}

