package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  /** List of models. */
  var items: js.UndefOr[js.Array[Insert2]] = js.undefined
  /** What kind of resource this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to fetch the next page, if one exists. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object List {
  @scala.inline
  def apply(
    items: js.Array[Insert2] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null
  ): List = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[List]
  }
}

