package typings
package atAngularCompilerLib.srcAotLazyUnderscoreRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyRoute extends js.Object {
  var module: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol
  var referencedModule: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol
  var route: java.lang.String
}

object LazyRoute {
  @scala.inline
  def apply(
    module: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol,
    referencedModule: atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol,
    route: java.lang.String
  ): LazyRoute = {
    val __obj = js.Dynamic.literal(module = module, referencedModule = referencedModule, route = route)
  
    __obj.asInstanceOf[LazyRoute]
  }
}

