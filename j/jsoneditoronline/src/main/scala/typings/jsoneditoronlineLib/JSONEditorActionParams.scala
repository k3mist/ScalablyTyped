package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorActionParams extends js.Object {
  @JSName("clone")
  var clone_FJSONEditorActionParams: js.UndefOr[JSONEditorNode] = js.undefined
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  var endParent: js.UndefOr[JSONEditorNode] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var newType: js.UndefOr[JSONEditorNodeType] = js.undefined
  var newValue: js.UndefOr[java.lang.String] = js.undefined
  var node: js.UndefOr[JSONEditorNode] = js.undefined
  var oldType: js.UndefOr[JSONEditorNodeType] = js.undefined
  var oldValue: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[JSONEditorNode] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var startParent: js.UndefOr[JSONEditorNode] = js.undefined
}

object JSONEditorActionParams {
  @scala.inline
  def apply(
    clone: JSONEditorNode = null,
    endIndex: scala.Int | scala.Double = null,
    endParent: JSONEditorNode = null,
    index: scala.Int | scala.Double = null,
    newType: JSONEditorNodeType = null,
    newValue: java.lang.String = null,
    node: JSONEditorNode = null,
    oldType: JSONEditorNodeType = null,
    oldValue: java.lang.String = null,
    parent: JSONEditorNode = null,
    startIndex: scala.Int | scala.Double = null,
    startParent: JSONEditorNode = null
  ): JSONEditorActionParams = {
    val __obj = js.Dynamic.literal()
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (endParent != null) __obj.updateDynamic("endParent")(endParent)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (newType != null) __obj.updateDynamic("newType")(newType)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (node != null) __obj.updateDynamic("node")(node)
    if (oldType != null) __obj.updateDynamic("oldType")(oldType)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (startParent != null) __obj.updateDynamic("startParent")(startParent)
    __obj.asInstanceOf[JSONEditorActionParams]
  }
}

