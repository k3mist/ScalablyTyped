package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter for [setContentInsets](Titanium.UI.TableView.setContentInsets) method.
  */
trait TableViewEdgeInsets extends js.Object {
  /**
  	 * Value specifying the bottom insets for the enclosing scroll view of the table.
  	 */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Value specifying the left insets for the enclosing scroll view of the table.
  	 */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Value specifying the right insets for the enclosing scroll view of the table.
  	 */
  var right: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Value specifying the top insets for the enclosing scroll view of the table.
  	 */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object TableViewEdgeInsets {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): TableViewEdgeInsets = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewEdgeInsets]
  }
}

