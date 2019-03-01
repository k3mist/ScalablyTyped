package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVariablesResponse extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** All GTM Variables of a GTM Container. */
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
}

object ListVariablesResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, variable: js.Array[Variable] = null): ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[ListVariablesResponse]
  }
}

