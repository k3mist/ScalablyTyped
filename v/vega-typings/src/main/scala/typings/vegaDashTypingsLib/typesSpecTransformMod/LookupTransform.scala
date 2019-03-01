package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupTransform extends _Transform {
  var as: js.UndefOr[
    (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var fields: js.Array[java.lang.String]
  var from: java.lang.String
  var key: java.lang.String
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.lookup
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LookupTransform {
  @scala.inline
  def apply(
    fields: js.Array[java.lang.String],
    from: java.lang.String,
    key: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.lookup,
    as: (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    default: js.Any = null,
    values: js.Array[java.lang.String] = null
  ): LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields, from = from, key = key, `type` = `type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[LookupTransform]
  }
}

