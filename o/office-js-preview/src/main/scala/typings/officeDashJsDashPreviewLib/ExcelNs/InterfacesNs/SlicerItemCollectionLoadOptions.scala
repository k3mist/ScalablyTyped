package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the slicer item objects on the slicer.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait SlicerItemCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if the slicer item has data.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var hasData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the unique value representing the slicer item.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var key: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the value displayed on UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
}

object SlicerItemCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    hasData: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined
  ): SlicerItemCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(hasData)) __obj.updateDynamic("hasData")(hasData)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SlicerItemCollectionLoadOptions]
  }
}

