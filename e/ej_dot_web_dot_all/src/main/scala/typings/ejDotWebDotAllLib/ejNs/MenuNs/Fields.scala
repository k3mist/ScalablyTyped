package typings
package ejDotWebDotAllLib.ejNs.MenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** It receives the child data for the inner level.
    */
  var child: js.UndefOr[js.Any] = js.undefined
  /** It receives datasource as Essential DataManager object and JSON object.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the HTML attributes to â€œLIâ€ item list.
    */
  var htmlAttribute: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the id to menu items list
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the image attribute to â€œimgâ€ tag inside items list.
    */
  var imageAttribute: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the image URL to â€œimgâ€ tag inside item list.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Adds custom attributes like &quot;target&quot; to the anchor tag of the menu items.
    */
  var linkAttribute: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the parent id of the table.
    */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** It receives query to retrieve data from the table (query is same as SQL).
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies the sprite CSS class to â€œLIâ€ item list.
    */
  var spriteCssClass: js.UndefOr[java.lang.String] = js.undefined
  /** It receives table name to execute query on the corresponding table.
    */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text of menu items list.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL to the anchor tag in menu item list.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    child: js.Any = null,
    dataSource: js.Any = null,
    htmlAttribute: java.lang.String = null,
    id: java.lang.String = null,
    imageAttribute: java.lang.String = null,
    imageUrl: java.lang.String = null,
    linkAttribute: java.lang.String = null,
    parentId: java.lang.String = null,
    query: js.Any = null,
    spriteCssClass: java.lang.String = null,
    tableName: java.lang.String = null,
    text: java.lang.String = null,
    url: java.lang.String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (htmlAttribute != null) __obj.updateDynamic("htmlAttribute")(htmlAttribute)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageAttribute != null) __obj.updateDynamic("imageAttribute")(imageAttribute)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (linkAttribute != null) __obj.updateDynamic("linkAttribute")(linkAttribute)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (query != null) __obj.updateDynamic("query")(query)
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Fields]
  }
}

