package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectTransform extends _Transform {
  var sort: vegaDashTypingsLib.typesSpecMarkMod.Compare
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.collect
}

object CollectTransform {
  @scala.inline
  def apply(
    sort: vegaDashTypingsLib.typesSpecMarkMod.Compare,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.collect
  ): CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort, `type` = `type`)
  
    __obj.asInstanceOf[CollectTransform]
  }
}

