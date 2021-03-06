package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var dataOptions: js.UndefOr[js.Any] = js.undefined
  var desc: js.UndefOr[scala.Boolean] = js.undefined
  var joinData: js.UndefOr[js.Any] = js.undefined
  var leftJoinKey: js.UndefOr[js.Any] = js.undefined
  var mapFun: js.UndefOr[js.Any] = js.undefined
  var mapFunction: js.UndefOr[js.Any] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var reduceFunction: js.UndefOr[js.Any] = js.undefined
  var rightJoinKey: js.UndefOr[js.Any] = js.undefined
  var `type`: lokijsLib.lokijsLibStrings.find | lokijsLib.lokijsLibStrings.where | lokijsLib.lokijsLibStrings.simplesort | lokijsLib.lokijsLibStrings.compoundsort | lokijsLib.lokijsLibStrings.sort | lokijsLib.lokijsLibStrings.limit | lokijsLib.lokijsLibStrings.offset | lokijsLib.lokijsLibStrings.map | lokijsLib.lokijsLibStrings.eqJoin | lokijsLib.lokijsLibStrings.mapReduce | lokijsLib.lokijsLibStrings.update | lokijsLib.lokijsLibStrings.remove
  var value: js.UndefOr[js.Any] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    `type`: lokijsLib.lokijsLibStrings.find | lokijsLib.lokijsLibStrings.where | lokijsLib.lokijsLibStrings.simplesort | lokijsLib.lokijsLibStrings.compoundsort | lokijsLib.lokijsLibStrings.sort | lokijsLib.lokijsLibStrings.limit | lokijsLib.lokijsLibStrings.offset | lokijsLib.lokijsLibStrings.map | lokijsLib.lokijsLibStrings.eqJoin | lokijsLib.lokijsLibStrings.mapReduce | lokijsLib.lokijsLibStrings.update | lokijsLib.lokijsLibStrings.remove,
    dataOptions: js.Any = null,
    desc: js.UndefOr[scala.Boolean] = js.undefined,
    joinData: js.Any = null,
    leftJoinKey: js.Any = null,
    mapFun: js.Any = null,
    mapFunction: js.Any = null,
    property: java.lang.String = null,
    reduceFunction: js.Any = null,
    rightJoinKey: js.Any = null,
    value: js.Any = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dataOptions != null) __obj.updateDynamic("dataOptions")(dataOptions)
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (joinData != null) __obj.updateDynamic("joinData")(joinData)
    if (leftJoinKey != null) __obj.updateDynamic("leftJoinKey")(leftJoinKey)
    if (mapFun != null) __obj.updateDynamic("mapFun")(mapFun)
    if (mapFunction != null) __obj.updateDynamic("mapFunction")(mapFunction)
    if (property != null) __obj.updateDynamic("property")(property)
    if (reduceFunction != null) __obj.updateDynamic("reduceFunction")(reduceFunction)
    if (rightJoinKey != null) __obj.updateDynamic("rightJoinKey")(rightJoinKey)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Transform]
  }
}

