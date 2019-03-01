package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsList extends js.Object {
  /** The result that contains all resource views that meet the criteria. */
  var items: js.UndefOr[js.Array[ResourceView]] = js.undefined
  /** Type of resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A token used for pagination. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Server defined URL for this resource (output only). */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object ZoneViewsList {
  @scala.inline
  def apply(
    items: js.Array[ResourceView] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null
  ): ZoneViewsList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[ZoneViewsList]
  }
}

