package typings
package lolexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional methods that installed clock have.
  */
trait InstalledMethods extends js.Object {
  var methods: js.Array[FakeMethod]
  /**
    * Restores the original methods on the context that was passed to lolex.install,
    * or the native timers if no context was given.
    */
  def uninstall(): scala.Unit
}

object InstalledMethods {
  @scala.inline
  def apply(methods: js.Array[FakeMethod], uninstall: js.Function0[scala.Unit]): InstalledMethods = {
    val __obj = js.Dynamic.literal(methods = methods, uninstall = uninstall)
  
    __obj.asInstanceOf[InstalledMethods]
  }
}

