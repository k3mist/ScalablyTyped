package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowserSchemaModelFieldsName extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var parse: js.UndefOr[js.Function] = js.undefined
}

object EditorImageBrowserSchemaModelFieldsName {
  @scala.inline
  def apply(field: java.lang.String = null, parse: js.Function = null): EditorImageBrowserSchemaModelFieldsName = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[EditorImageBrowserSchemaModelFieldsName]
  }
}

