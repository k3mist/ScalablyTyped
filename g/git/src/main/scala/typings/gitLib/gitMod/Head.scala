package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Head")
@js.native
class Head protected () extends js.Object {
   // string or Commit or ...?
  def this(name: java.lang.String, commit: js.Any) = this()
  var commit: js.Any = js.native
  var name: java.lang.String = js.native
}

/* static members */
@JSImport("git", "Head")
@js.native
object Head extends js.Object {
  def current(repo: js.Any, callback: js.Function): scala.Unit = js.native
  def current(repo: js.Any, options: js.Any, callback: js.Function): scala.Unit = js.native
  def find_all(repo: js.Any, callback: js.Function): scala.Unit = js.native
  def find_all(repo: js.Any, options: js.Any, callback: js.Function): scala.Unit = js.native
}

