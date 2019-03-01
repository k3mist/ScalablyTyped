package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMattersResponse extends js.Object {
  /** List of matters. */
  var matters: js.UndefOr[js.Array[Matter]] = js.undefined
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListMattersResponse {
  @scala.inline
  def apply(matters: js.Array[Matter] = null, nextPageToken: java.lang.String = null): ListMattersResponse = {
    val __obj = js.Dynamic.literal()
    if (matters != null) __obj.updateDynamic("matters")(matters)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListMattersResponse]
  }
}

