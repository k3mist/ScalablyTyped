package typings
package prosemirrorDashMenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dom[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var dom: stdLib.Node
  def update(p: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean
}

object Anon_Dom {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    dom: stdLib.Node,
    update: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S] => scala.Boolean
  ): Anon_Dom[S] = {
    val __obj = js.Dynamic.literal(dom = dom, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_Dom[S]]
  }
}

