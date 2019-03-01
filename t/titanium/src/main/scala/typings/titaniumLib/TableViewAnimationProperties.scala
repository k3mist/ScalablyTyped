package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object for specifying the animation properties to use when inserting or deleting rows, or scrolling the table.
  */
trait TableViewAnimationProperties extends js.Object {
  /**
  	 * Whether this table change should be animated. Ignored if any `animationStyle` value is specified.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Type of animation to use for row insertions and deletions.
  	 */
  var animationStyle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies what position to scroll the selected row to.
  	 */
  var position: js.UndefOr[scala.Double] = js.undefined
}

object TableViewAnimationProperties {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationStyle: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null
  ): TableViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationStyle != null) __obj.updateDynamic("animationStyle")(animationStyle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewAnimationProperties]
  }
}

