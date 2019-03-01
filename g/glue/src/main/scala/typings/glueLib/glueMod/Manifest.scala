package typings
package glueLib.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  var register: js.UndefOr[glueLib.Anon_Plugins] = js.undefined
  var server: hapiLib.hapiMod.ServerOptions
}

object Manifest {
  @scala.inline
  def apply(server: hapiLib.hapiMod.ServerOptions, register: glueLib.Anon_Plugins = null): Manifest = {
    val __obj = js.Dynamic.literal(server = server)
    if (register != null) __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[Manifest]
  }
}

