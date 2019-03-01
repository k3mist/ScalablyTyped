package typings
package ejDotWebDotAllLib.ejNs.AccordionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIcon extends js.Object {
  /** This class name set to collapsing header.
    */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** This class name set to expanded (active) header.
    */
  var selectedHeader: js.UndefOr[java.lang.String] = js.undefined
}

object CustomIcon {
  @scala.inline
  def apply(header: java.lang.String = null, selectedHeader: java.lang.String = null): CustomIcon = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    if (selectedHeader != null) __obj.updateDynamic("selectedHeader")(selectedHeader)
    __obj.asInstanceOf[CustomIcon]
  }
}

