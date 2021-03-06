package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyRepeatOptions extends js.Object {
  /**
    * @description Should return the height of an item. The index is provided as an argument. This is important when rendering lists where the items have different height. The function is optional and if it isn't present the height of the first item will be automatically calculated and used for all other items.
    */
  var calculateItemHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * @description Function which recieves an index and the scope for the item. Can be used to configure values in the item scope.
    */
  var configureItemScope: js.UndefOr[scala.Double] = js.undefined
  /**
    * @description Should return the number of items in the list.
    */
  var countItems: js.UndefOr[scala.Double] = js.undefined
  /**
    * @description This function should return a `HTMLElement`. To help rendering the element, the current index and a template is supplied as arguments. The template is the initial content of the `<ons-lazy-repeat>` element.
    */
  var createItemContent: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * @description This function is used called when an item is removed from the DOM. The index and DOM element is provided as arguments. The function is optional but may be important in order to avoid memory leaks.
    */
  var destroyItem: js.UndefOr[java.lang.String] = js.undefined
}

object LazyRepeatOptions {
  @scala.inline
  def apply(
    calculateItemHeight: scala.Int | scala.Double = null,
    configureItemScope: scala.Int | scala.Double = null,
    countItems: scala.Int | scala.Double = null,
    createItemContent: stdLib.HTMLElement = null,
    destroyItem: java.lang.String = null
  ): LazyRepeatOptions = {
    val __obj = js.Dynamic.literal()
    if (calculateItemHeight != null) __obj.updateDynamic("calculateItemHeight")(calculateItemHeight.asInstanceOf[js.Any])
    if (configureItemScope != null) __obj.updateDynamic("configureItemScope")(configureItemScope.asInstanceOf[js.Any])
    if (countItems != null) __obj.updateDynamic("countItems")(countItems.asInstanceOf[js.Any])
    if (createItemContent != null) __obj.updateDynamic("createItemContent")(createItemContent)
    if (destroyItem != null) __obj.updateDynamic("destroyItem")(destroyItem)
    __obj.asInstanceOf[LazyRepeatOptions]
  }
}

