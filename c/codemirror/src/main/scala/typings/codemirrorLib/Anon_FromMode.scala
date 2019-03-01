package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromMode extends js.Object {
  var from: js.UndefOr[scala.Double] = js.undefined
  /** By default, the new document inherits the mode of the parent. This option can be set to a mode spec to give it a different mode. */
  var mode: js.Any
  /** When turned on, the linked copy will share an undo history with the original.
    Thus, something done in one of the two can be undone in the other, and vice versa. */
  var sharedHist: js.UndefOr[scala.Boolean] = js.undefined
  /** Can be given to make the new document a subview of the original. Subviews only show a given range of lines.
    Note that line coordinates inside the subview will be consistent with those of the parent,
    so that for example a subview starting at line 10 will refer to its first line as line 10, not 0. */
  var to: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FromMode {
  @scala.inline
  def apply(
    mode: js.Any,
    from: scala.Int | scala.Double = null,
    sharedHist: js.UndefOr[scala.Boolean] = js.undefined,
    to: scala.Int | scala.Double = null
  ): Anon_FromMode = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedHist)) __obj.updateDynamic("sharedHist")(sharedHist)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromMode]
  }
}

