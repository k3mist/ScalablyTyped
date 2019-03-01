package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValuesResource extends js.Object {
  /** Retrieves list of report dimension values for a list of filters. */
  def query(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[DimensionValueList]
}

object DimensionValuesResource {
  @scala.inline
  def apply(
    query: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[DimensionValueList]
    ]
  ): DimensionValuesResource = {
    val __obj = js.Dynamic.literal(query = query)
  
    __obj.asInstanceOf[DimensionValuesResource]
  }
}

