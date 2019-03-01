package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSourcesResource extends js.Object {
  /** List custom data sources to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[CustomDataSources]
}

object CustomDataSourcesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults, 
      gapiDotClientLib.gapiNs.clientNs.Request[CustomDataSources]
    ]
  ): CustomDataSourcesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[CustomDataSourcesResource]
  }
}

