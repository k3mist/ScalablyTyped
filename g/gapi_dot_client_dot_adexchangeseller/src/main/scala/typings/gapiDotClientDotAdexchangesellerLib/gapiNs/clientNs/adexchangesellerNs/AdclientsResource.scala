package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdclientsResource extends js.Object {
  /** List all ad clients in this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[AdClients]
}

object AdclientsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AdClients]
    ]
  ): AdclientsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[AdclientsResource]
  }
}

