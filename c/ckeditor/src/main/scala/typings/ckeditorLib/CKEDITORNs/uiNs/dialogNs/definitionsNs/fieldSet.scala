package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fieldSet extends js.Object {
  var children: js.Array[_]
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object fieldSet {
  @scala.inline
  def apply(children: js.Array[_], label: java.lang.String = null): fieldSet = {
    val __obj = js.Dynamic.literal(children = children)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[fieldSet]
  }
}

