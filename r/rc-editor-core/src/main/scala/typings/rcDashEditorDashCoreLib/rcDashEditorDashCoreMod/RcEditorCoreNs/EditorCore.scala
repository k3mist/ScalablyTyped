package typings
package rcDashEditorDashCoreLib.rcDashEditorDashCoreMod.RcEditorCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorCore extends js.Object {
  var context: js.Any
  var props: js.Any
  var refs: js.Any
  var state: js.Any
  def forceUpdate(): js.Any
  def render(): js.Any
  def setState(): js.Any
}

object EditorCore {
  @scala.inline
  def apply(
    context: js.Any,
    forceUpdate: js.Function0[js.Any],
    props: js.Any,
    refs: js.Any,
    render: js.Function0[js.Any],
    setState: js.Function0[js.Any],
    state: js.Any
  ): EditorCore = {
    val __obj = js.Dynamic.literal(context = context, forceUpdate = forceUpdate, props = props, refs = refs, render = render, setState = setState, state = state)
  
    __obj.asInstanceOf[EditorCore]
  }
}

