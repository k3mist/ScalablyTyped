package typings
package atAngularRouterLib.srcUtilsPreactivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/utils/preactivation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAllRouteGuards(
    future: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot,
    curr: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot,
    parentContexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts
  ): Checks = js.native
  def getCanActivateChild(p: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot): atAngularRouterLib.Anon_Guards | scala.Null = js.native
  def getToken(
    token: js.Any,
    snapshot: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    moduleInjector: atAngularCoreLib.atAngularCoreMod.Injector
  ): js.Any = js.native
}

