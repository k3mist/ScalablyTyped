package typings
package d3DashSelectionDashMultiLib.d3DashSelectionDashMultiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueMap[T /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      scala.Double | java.lang.String | scala.Boolean | scala.Null | (d3DashSelectionLib.d3DashSelectionMod.ValueFn[T, Datum, scala.Double | java.lang.String | scala.Boolean | scala.Null])
    ]

object ValueMap {
  @scala.inline
  def apply[T /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      scala.Double | java.lang.String | scala.Boolean | scala.Null | (d3DashSelectionLib.d3DashSelectionMod.ValueFn[T, Datum, scala.Double | java.lang.String | scala.Boolean | scala.Null])
    ] = null
  ): ValueMap[T, Datum] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValueMap[T, Datum]]
  }
}

