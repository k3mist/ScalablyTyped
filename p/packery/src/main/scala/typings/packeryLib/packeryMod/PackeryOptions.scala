package typings
package packeryLib.packeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackeryOptions extends js.Object {
  /**
    * [columnWidth The width of a column of a horizontal grid. When set, Packery will align item elements horizontally to this grid]
    * @type {number}
    */
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * [containerStyle CSS styles that are applied to the container element. To disable Packery from setting any CSS to the container element, set containerStyle: null]
    * @type {Object}
    */
  var containerStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * [gutter The space between item elements, both vertically and horizontally]
    * @type {number}
    */
  var gutter: js.UndefOr[scala.Double] = js.undefined
  /**
    * [isHorizontal Arranges items horizontally instead of vertically]
    * @type {boolean}
    */
  var isHorizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [isInitLayout Enables layout on initialization. Set this to false to disable layout on initialization, so you can use methods or add events before the initial layout]
    * @type {boolean}
    */
  var isInitLayout: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [isOriginLeft Controls the horizontal flow of the layout. By default, item elements start positioning at the left. Set to false for right-to-left layouts]
    * @type {boolean}
    */
  var isOriginLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [isOriginTop Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!]
    * @type {boolean}
    */
  var isOriginTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [isResizeBound Binds layout to window resizing]
    * @type {boolean}
    */
  var isResizeBound: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [itemSelector Specifies which child elements to be used as item elements. Setting itemSelector is always recommended. itemSelector is useful to exclude sizing elements]
    * @type {string}
    */
  var itemSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [percentPosition Will set item position in percent values, rather than pixel values. percentPosition works well with percent-width items, as items will not transition their position on resize]
    * @type {boolean}
    */
  var percentPosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [rowHeight Height of a row of a vertical grid. When set, Packery will align item elements vertically to this grid]
    * @type {number}
    */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * [stamp Specifies which elements are stamped within the layout. These are special layout elements which will not be laid out by Packery. Rather, Packery will layout item elements around stamped elements]
    * @type {string}
    */
  var stamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [transitionDuration The time duration of transitions for item elements]
    * @type {string}
    */
  var transitionDuration: js.UndefOr[java.lang.String] = js.undefined
}

object PackeryOptions {
  @scala.inline
  def apply(
    columnWidth: scala.Int | scala.Double = null,
    containerStyle: js.Object = null,
    gutter: scala.Int | scala.Double = null,
    isHorizontal: js.UndefOr[scala.Boolean] = js.undefined,
    isInitLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isOriginLeft: js.UndefOr[scala.Boolean] = js.undefined,
    isOriginTop: js.UndefOr[scala.Boolean] = js.undefined,
    isResizeBound: js.UndefOr[scala.Boolean] = js.undefined,
    itemSelector: java.lang.String = null,
    percentPosition: js.UndefOr[scala.Boolean] = js.undefined,
    rowHeight: scala.Int | scala.Double = null,
    stamp: java.lang.String = null,
    transitionDuration: java.lang.String = null
  ): PackeryOptions = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (!js.isUndefined(isHorizontal)) __obj.updateDynamic("isHorizontal")(isHorizontal)
    if (!js.isUndefined(isInitLayout)) __obj.updateDynamic("isInitLayout")(isInitLayout)
    if (!js.isUndefined(isOriginLeft)) __obj.updateDynamic("isOriginLeft")(isOriginLeft)
    if (!js.isUndefined(isOriginTop)) __obj.updateDynamic("isOriginTop")(isOriginTop)
    if (!js.isUndefined(isResizeBound)) __obj.updateDynamic("isResizeBound")(isResizeBound)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (!js.isUndefined(percentPosition)) __obj.updateDynamic("percentPosition")(percentPosition)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (stamp != null) __obj.updateDynamic("stamp")(stamp)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration)
    __obj.asInstanceOf[PackeryOptions]
  }
}

