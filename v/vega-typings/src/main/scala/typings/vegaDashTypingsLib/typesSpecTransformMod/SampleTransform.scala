package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SampleTransform extends _Transform {
  var size: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.sample
}

object SampleTransform {
  @scala.inline
  def apply(
    size: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.sample
  ): SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], `type` = `type`)
  
    __obj.asInstanceOf[SampleTransform]
  }
}

