package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecScaleMod {
  type RangeBand = _RangeBand | RangeRaw
  type RangeRaw = js.Array[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ]
  type RangeScheme = _RangeScheme | RangeRaw
  type ScaleData = (DataRef with vegaDashTypingsLib.Anon_Sort) | (MultiDataRef with vegaDashTypingsLib.Anon_SortUnionSortField)
  type ScaleField = java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  type SortField = scala.Boolean | vegaDashTypingsLib.Anon_FieldOp
  type UnionSortField = scala.Boolean | vegaDashTypingsLib.Anon_CountOp
}
