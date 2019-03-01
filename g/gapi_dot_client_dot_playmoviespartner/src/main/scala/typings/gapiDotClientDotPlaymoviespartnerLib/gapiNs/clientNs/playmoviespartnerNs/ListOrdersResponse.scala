package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrdersResponse extends js.Object {
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** List of Orders that match the request criteria. */
  var orders: js.UndefOr[js.Array[Order]] = js.undefined
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

object ListOrdersResponse {
  @scala.inline
  def apply(
    nextPageToken: java.lang.String = null,
    orders: js.Array[Order] = null,
    totalSize: scala.Int | scala.Double = null
  ): ListOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (orders != null) __obj.updateDynamic("orders")(orders)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrdersResponse]
  }
}

