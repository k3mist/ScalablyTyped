package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCallTypeParam extends js.Object {
  var editor: java.lang.String
  var field: java.lang.String
  var label: java.lang.String
}

object EventCallTypeParam {
  @scala.inline
  def apply(editor: java.lang.String, field: java.lang.String, label: java.lang.String): EventCallTypeParam = {
    val __obj = js.Dynamic.literal(editor = editor, field = field, label = label)
  
    __obj.asInstanceOf[EventCallTypeParam]
  }
}

