package typings
package electronDashBuilderLib.electronDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", "Platform")
@js.native
class Platform protected ()
  extends appDashBuilderDashLibLib.appDashBuilderDashLibMod.Platform {
  def this(name: java.lang.String, buildConfigurationKey: java.lang.String, nodeName: nodeLib.NodeJSNs.Platform) = this()
}

/* static members */
@JSImport("electron-builder", "Platform")
@js.native
object Platform extends js.Object {
  var LINUX: appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  var MAC: appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  var WINDOWS: appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  def current(): appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  def fromString(name: java.lang.String): appDashBuilderDashLibLib.outCoreMod.Platform = js.native
}

