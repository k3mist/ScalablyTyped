package typings
package atUirouterAngularjsLib.libDirectivesViewDirectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIViewAnimData extends js.Object {
  @JSName("$$animLeave")
  var $$animLeave: atUirouterAngularjsLib.Anon_Resolve
  @JSName("$animEnter")
  var $animEnter: js.Promise[_]
  @JSName("$animLeave")
  var $animLeave: js.Promise[_]
}

object UIViewAnimData {
  @scala.inline
  def apply(
    $$animLeave: atUirouterAngularjsLib.Anon_Resolve,
    $animEnter: js.Promise[_],
    $animLeave: js.Promise[_]
  ): UIViewAnimData = {
    val __obj = js.Dynamic.literal($$animLeave = $$animLeave, $animEnter = $animEnter, $animLeave = $animLeave)
  
    __obj.asInstanceOf[UIViewAnimData]
  }
}

