package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDataRequestColumn extends js.Object {
  var data: java.lang.String | scala.Double
  var name: java.lang.String
  var orderable: scala.Boolean
  var search: AjaxDataRequestSearch
  var searchable: scala.Boolean
}

object AjaxDataRequestColumn {
  @scala.inline
  def apply(
    data: java.lang.String | scala.Double,
    name: java.lang.String,
    orderable: scala.Boolean,
    search: AjaxDataRequestSearch,
    searchable: scala.Boolean
  ): AjaxDataRequestColumn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name, orderable = orderable, search = search, searchable = searchable)
  
    __obj.asInstanceOf[AjaxDataRequestColumn]
  }
}

