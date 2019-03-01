package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.ListView.prefetch> and <Titanium.UI.ListView.cancelprefetch> events.
  */
trait ListItemEventType extends js.Object {
  /**
  	 * The item ID bound to the list item that generated the event.
  	 */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Item index.
  	 */
  var itemIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * List section if the item is contained in a list section.
  	 */
  var section: js.UndefOr[titaniumLib.TitaniumNs.UINs.ListSection] = js.undefined
  /**
  	 * Section index.
  	 */
  var sectionIndex: js.UndefOr[scala.Double] = js.undefined
}

object ListItemEventType {
  @scala.inline
  def apply(
    itemId: java.lang.String = null,
    itemIndex: scala.Int | scala.Double = null,
    section: titaniumLib.TitaniumNs.UINs.ListSection = null,
    sectionIndex: scala.Int | scala.Double = null
  ): ListItemEventType = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section)
    if (sectionIndex != null) __obj.updateDynamic("sectionIndex")(sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemEventType]
  }
}

