package typings
package angularDashUiDashSortableLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UISortableProperties[T] extends js.Object {
  /**
    * Holds the index of the drop target that the dragged item was dropped.
    */
  var dropindex: scala.Double
  /**
    * Holds the ui-sortable element that the dragged item was dropped on.
    */
  var droptarget: scala.Double
  /**
    * Holds the array that is specified by the `ng-model` attribute of the [`droptarget`](#droptarget) ui-sortable element.
    */
  var droptargetModel: js.Array[T]
  /**
    * Holds the original index of the item dragged.
    */
  var index: scala.Double
  /**
    * Holds the JavaScript object that is used as the model of the dragged item, as specified by the ng-repeat of the [`source`](#source) ui-sortable element and the item's [`index`](#index).
    */
  var model: T
  /**
    * Holds the model of the dragged item only when a sorting happens between two connected ui-sortable elements.
    * In other words: `'moved' in ui.item.sortable` will return false only when a sorting is withing the same ui-sortable element ([`source`](#source) equals to the [`droptarget`](#droptarget)).
    */
  var moved: js.UndefOr[T] = js.undefined
  /**
    * When sorting between two connected sortables, it will be set to true inside the `update` callback of the [`droptarget`](#droptarget).
    */
  var received: scala.Boolean
  /**
    * Holds the ui-sortable element that the dragged item originated from.
    */
  var source: angularLib.angularMod.angularNs.IAugmentedJQuery
  /**
    * Holds the array that is specified by the `ng-model` of the [`source`](#source) ui-sortable element.
    */
  var sourceModel: js.Array[T]
  /**
    * Can be called inside the `update` callback, in order to prevent/revert a sorting.
    * Should be used instead of the [jquery-ui-sortable cancel()](http://api.jqueryui.com/sortable/#method-cancel) method.
    */
  def cancel(): scala.Unit
  /**
    * Returns whether the current sorting is marked as canceled, by an earlier call to [`ui.item.sortable.cancel()`](#cancel).
    */
  def isCanceled(): scala.Boolean
  /**
    * Returns whether the [`helper`](http://api.jqueryui.com/sortable/#option-helper) element used for the current sorting, is one of the original ui-sortable list elements.
    */
  def isCustomHelperUsed(): scala.Boolean
}

object UISortableProperties {
  @scala.inline
  def apply[T](
    cancel: js.Function0[scala.Unit],
    dropindex: scala.Double,
    droptarget: scala.Double,
    droptargetModel: js.Array[T],
    index: scala.Double,
    isCanceled: js.Function0[scala.Boolean],
    isCustomHelperUsed: js.Function0[scala.Boolean],
    model: T,
    received: scala.Boolean,
    source: angularLib.angularMod.angularNs.IAugmentedJQuery,
    sourceModel: js.Array[T],
    moved: T = null
  ): UISortableProperties[T] = {
    val __obj = js.Dynamic.literal(cancel = cancel, dropindex = dropindex, droptarget = droptarget, droptargetModel = droptargetModel, index = index, isCanceled = isCanceled, isCustomHelperUsed = isCustomHelperUsed, model = model.asInstanceOf[js.Any], received = received, source = source, sourceModel = sourceModel)
    if (moved != null) __obj.updateDynamic("moved")(moved.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISortableProperties[T]]
  }
}

