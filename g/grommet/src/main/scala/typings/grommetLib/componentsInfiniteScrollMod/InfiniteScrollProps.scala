package typings
package grommetLib.componentsInfiniteScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var renderMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var scrollableAncestor: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | grommetLib.grommetLibStrings.window] = js.undefined
  var show: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object InfiniteScrollProps {
  @scala.inline
  def apply(
    children: js.Function1[/* repeated */ js.Any, _] = null,
    items: js.Array[_] = null,
    onMore: js.Function1[/* repeated */ js.Any, _] = null,
    renderMarker: js.Function1[/* repeated */ js.Any, _] = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    scrollableAncestor: reactLib.reactMod.ReactNs.ReactNode | grommetLib.grommetLibStrings.window = null,
    show: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (items != null) __obj.updateDynamic("items")(items)
    if (onMore != null) __obj.updateDynamic("onMore")(onMore)
    if (renderMarker != null) __obj.updateDynamic("renderMarker")(renderMarker)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (scrollableAncestor != null) __obj.updateDynamic("scrollableAncestor")(scrollableAncestor.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteScrollProps]
  }
}

