package typings
package reactDashInfiniteLib.reactDashInfiniteMod.InfiniteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteProps
  extends reactLib.reactMod.ReactNs.Props[reactDashInfiniteLib.reactDashInfiniteMod.Infinite] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var containerHeight: js.UndefOr[scala.Double] = js.undefined
  var displayBottomUpwards: js.UndefOr[scala.Boolean] = js.undefined
  var elementHeight: scala.Double | js.Array[scala.Double]
  var handleScroll: js.UndefOr[js.Function1[/* node */ reactLib.reactMod.ReactNs.ReactElement[_], scala.Unit]] = js.undefined
  var infiniteLoadBeginBottomOffset: js.UndefOr[scala.Double] = js.undefined
  var infiniteLoadBeginEdgeOffset: js.UndefOr[scala.Double] = js.undefined
  var isInfiniteLoading: js.UndefOr[scala.Boolean] = js.undefined
  var loadingSpinnerDelegate: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var onInfiniteLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preloadAdditionalHeight: js.UndefOr[scala.Double | js.Object] = js.undefined
  var preloadBatchSize: js.UndefOr[scala.Double | js.Object] = js.undefined
  var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[scala.Double] = js.undefined
  var useWindowAsScrollContainer: js.UndefOr[scala.Boolean] = js.undefined
}

object InfiniteProps {
  @scala.inline
  def apply(
    elementHeight: scala.Double | js.Array[scala.Double],
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    containerHeight: scala.Int | scala.Double = null,
    displayBottomUpwards: js.UndefOr[scala.Boolean] = js.undefined,
    handleScroll: js.Function1[/* node */ reactLib.reactMod.ReactNs.ReactElement[_], scala.Unit] = null,
    infiniteLoadBeginBottomOffset: scala.Int | scala.Double = null,
    infiniteLoadBeginEdgeOffset: scala.Int | scala.Double = null,
    isInfiniteLoading: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    loadingSpinnerDelegate: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    onInfiniteLoad: js.Function0[scala.Unit] = null,
    preloadAdditionalHeight: scala.Double | js.Object = null,
    preloadBatchSize: scala.Double | js.Object = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[reactDashInfiniteLib.reactDashInfiniteMod.Infinite] = null,
    timeScrollStateLastsForAfterUserScrolls: scala.Int | scala.Double = null,
    useWindowAsScrollContainer: js.UndefOr[scala.Boolean] = js.undefined
  ): InfiniteProps = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBottomUpwards)) __obj.updateDynamic("displayBottomUpwards")(displayBottomUpwards)
    if (handleScroll != null) __obj.updateDynamic("handleScroll")(handleScroll)
    if (infiniteLoadBeginBottomOffset != null) __obj.updateDynamic("infiniteLoadBeginBottomOffset")(infiniteLoadBeginBottomOffset.asInstanceOf[js.Any])
    if (infiniteLoadBeginEdgeOffset != null) __obj.updateDynamic("infiniteLoadBeginEdgeOffset")(infiniteLoadBeginEdgeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(isInfiniteLoading)) __obj.updateDynamic("isInfiniteLoading")(isInfiniteLoading)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (loadingSpinnerDelegate != null) __obj.updateDynamic("loadingSpinnerDelegate")(loadingSpinnerDelegate)
    if (onInfiniteLoad != null) __obj.updateDynamic("onInfiniteLoad")(onInfiniteLoad)
    if (preloadAdditionalHeight != null) __obj.updateDynamic("preloadAdditionalHeight")(preloadAdditionalHeight.asInstanceOf[js.Any])
    if (preloadBatchSize != null) __obj.updateDynamic("preloadBatchSize")(preloadBatchSize.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (timeScrollStateLastsForAfterUserScrolls != null) __obj.updateDynamic("timeScrollStateLastsForAfterUserScrolls")(timeScrollStateLastsForAfterUserScrolls.asInstanceOf[js.Any])
    if (!js.isUndefined(useWindowAsScrollContainer)) __obj.updateDynamic("useWindowAsScrollContainer")(useWindowAsScrollContainer)
    __obj.asInstanceOf[InfiniteProps]
  }
}

