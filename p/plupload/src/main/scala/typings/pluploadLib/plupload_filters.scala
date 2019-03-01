package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_filters extends js.Object {
  var max_file_size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mime_types: js.UndefOr[js.Array[plupload_filters_mime_types]] = js.undefined
  var prevent_duplicates: js.UndefOr[scala.Boolean] = js.undefined
}

object plupload_filters {
  @scala.inline
  def apply(
    max_file_size: scala.Double | java.lang.String = null,
    mime_types: js.Array[plupload_filters_mime_types] = null,
    prevent_duplicates: js.UndefOr[scala.Boolean] = js.undefined
  ): plupload_filters = {
    val __obj = js.Dynamic.literal()
    if (max_file_size != null) __obj.updateDynamic("max_file_size")(max_file_size.asInstanceOf[js.Any])
    if (mime_types != null) __obj.updateDynamic("mime_types")(mime_types)
    if (!js.isUndefined(prevent_duplicates)) __obj.updateDynamic("prevent_duplicates")(prevent_duplicates)
    __obj.asInstanceOf[plupload_filters]
  }
}

