package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorNodeType extends js.Object {
  var className: java.lang.String
  var title: java.lang.String
  var value: java.lang.String
}

object JSONEditorNodeType {
  @scala.inline
  def apply(className: java.lang.String, title: java.lang.String, value: java.lang.String): JSONEditorNodeType = {
    val __obj = js.Dynamic.literal(className = className, title = title, value = value)
  
    __obj.asInstanceOf[JSONEditorNodeType]
  }
}

