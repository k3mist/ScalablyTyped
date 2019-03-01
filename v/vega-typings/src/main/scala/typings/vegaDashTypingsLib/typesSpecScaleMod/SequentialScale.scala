package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequentialScale
  extends BaseScale
     with Scale {
  var clamp: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var nice: js.UndefOr[scala.Boolean | TimeInterval | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var range: RangeScheme
  @JSName("type")
  var type_SequentialScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.sequential
  var zero: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
}

object SequentialScale {
  @scala.inline
  def apply(
    name: java.lang.String,
    range: RangeScheme,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.sequential,
    clamp: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domain: (js.Array[
      scala.Null | java.lang.String | scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    ]) | ScaleData | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMax: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMid: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMin: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainRaw: js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    nice: scala.Boolean | TimeInterval | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    padding: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    reverse: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    round: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    zero: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): SequentialScale = {
    val __obj = js.Dynamic.literal(name = name, range = range.asInstanceOf[js.Any], `type` = `type`)
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequentialScale]
  }
}

