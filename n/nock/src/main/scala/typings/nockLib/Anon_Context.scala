package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: nockLib.nockMod.nockNs.NockBackContext
  def nockDone(): scala.Unit
}

object Anon_Context {
  @scala.inline
  def apply(context: nockLib.nockMod.nockNs.NockBackContext, nockDone: js.Function0[scala.Unit]): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, nockDone = nockDone)
  
    __obj.asInstanceOf[Anon_Context]
  }
}

