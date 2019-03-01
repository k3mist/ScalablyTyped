package typings
package ejDotWebDotAllLib.ejNs.ResizableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Sets the offset of the resizing helper relative to the mouse cursor.
    * @Default {{ top: -1, left: -2 }}
    */
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  /** This event is triggered when the widget destroys.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Distance in pixels after mousedown the mouse must move before resizing should start. This option can be used to prevent unwanted drags when clicking on an element.
    * @Default {1}
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /** If specified, restricts resize start click to the specified element(s).
    * @Default {null}
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /** This event is triggered when resized.
    */
  var helper: js.UndefOr[js.Function1[/* e */ HelperEventArgs, scala.Unit]] = js.undefined
  /** Sets the max height till which an element has to be resized.
    * @Default {null}
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /** Sets the max width till which an element has to be resized.
    * @Default {null}
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** Sets the min Height below which an element cannot be resized.
    * @Default {10}
    */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /** Sets the min Width below which an element cannot be resized.
    * @Default {10}
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** Used to group sets of resizable items.
    * @Default {'default'}
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    cursorAt: js.Any = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    distance: scala.Int | scala.Double = null,
    handle: java.lang.String = null,
    helper: js.Function1[/* e */ HelperEventArgs, scala.Unit] = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    scope: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Model]
  }
}

