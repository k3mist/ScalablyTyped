package typings
package ejDotWebDotAllLib.ejNs.DropDownListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Used to group the items.
    */
  var groupBy: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the HTML attributes such as ID, class, and styles for the item.
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the ID for the tag.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the image attributes such as height, width, styles, and so on.
    */
  var imageAttributes: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the imageURL for the image location.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the tag value to be selected initially.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the sprite CSS for the image tag.
    */
  var spriteCssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the table name for tag value or display text while rendering remote data.
    */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the text content for the tag.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the tag value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    groupBy: java.lang.String = null,
    htmlAttributes: js.Any = null,
    id: java.lang.String = null,
    imageAttributes: java.lang.String = null,
    imageUrl: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    spriteCssClass: java.lang.String = null,
    tableName: java.lang.String = null,
    text: java.lang.String = null,
    value: java.lang.String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageAttributes != null) __obj.updateDynamic("imageAttributes")(imageAttributes)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Fields]
  }
}

