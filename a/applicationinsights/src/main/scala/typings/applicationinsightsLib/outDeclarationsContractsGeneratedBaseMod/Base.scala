package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  /**
    * Name of item (B section) if any. If telemetry data is derived straight from this, this should be null.
    */
  var baseType: java.lang.String
}

object Base {
  @scala.inline
  def apply(baseType: java.lang.String): Base = {
    val __obj = js.Dynamic.literal(baseType = baseType)
  
    __obj.asInstanceOf[Base]
  }
}

