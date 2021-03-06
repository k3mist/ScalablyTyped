package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def default[P](asyncModuleOrOptions: nextDashServerLib.dynamicMod.AsyncComponent[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  /**
    * Overloaded dynamic function.
    * https://github.com/zeit/next.js/blob/7.0.0/lib/dynamic.js#L55
    */
  def default[P](asyncModuleOrOptions: nextDashServerLib.dynamicMod.AsyncComponentLoader[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P](asyncModuleOrOptions: nextDashServerLib.dynamicMod.NextDynamicOptions[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P](
    asyncModule: nextDashServerLib.dynamicMod.AsyncComponentLoader[P],
    options: nextDashServerLib.dynamicMod.NextDynamicOptions[P]
  ): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P](
    asyncModule: nextDashServerLib.dynamicMod.AsyncComponent[P],
    options: nextDashServerLib.dynamicMod.NextDynamicOptions[P]
  ): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
}

