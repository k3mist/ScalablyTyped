package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeshakingOptions extends js.Object {
  var propertyReadSideEffects: scala.Boolean
  var pureExternalModules: scala.Boolean
}

object TreeshakingOptions {
  @scala.inline
  def apply(propertyReadSideEffects: scala.Boolean, pureExternalModules: scala.Boolean): TreeshakingOptions = {
    val __obj = js.Dynamic.literal(propertyReadSideEffects = propertyReadSideEffects, pureExternalModules = pureExternalModules)
  
    __obj.asInstanceOf[TreeshakingOptions]
  }
}

