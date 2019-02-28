package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBin extends js.Object {
  /**
    * The number base to use for automatic bin determination (default is base 10).
    *
    * __Default value:__ `10`
    *
    */
  var base: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * Scale factors indicating allowable subdivisions. The default value is [5, 2], which indicates that for base 10 numbers (the default base), the method may consider dividing bin sizes by 5 and/or 2. For example, for an initial step size of 10, the method can check if bin sizes of 2 (= 10/5), 5 (= 10/2), or 1 (= 10/(5*2)) might also satisfy the given constraints.
    *
    * __Default value:__ `[5, 2]`
    *
    * @minItems 1
    */
  var divide: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  /**
    * Maximum number of bins.
    *
    * __Default value:__ `6` for `row`, `column` and `shape` channels; `10` for other channels
    *
    * @minimum 2
    */
  var maxbins: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * A minimum allowable step size (particularly useful for integer values).
    */
  var minstep: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * If true (the default), attempts to make the bin boundaries use human-friendly boundaries, such as multiples of ten.
    */
  var nice: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * An exact step size to use between bins.
    *
    * __Note:__ If provided, options such as maxbins will be ignored.
    */
  var step: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * An array of allowable step sizes to choose from.
    * @minItems 1
    */
  var steps: js.UndefOr[js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]] = js.undefined
}

