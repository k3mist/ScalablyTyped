package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnterDragLeaveDragOverDropParam0 extends js.Object {
  var dataTypes: java.lang.String | js.Array[java.lang.String]
  var dragEnter: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext, 
      scala.Unit
    ]
  ] = js.undefined
  var dragLeave: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext, 
      scala.Unit
    ]
  ] = js.undefined
  var dragOver: js.UndefOr[
    js.Function2[
      /* param0 */ stdLib.DragEvent, 
      /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext, 
      scala.Unit
    ]
  ] = js.undefined
  def drop(param0: stdLib.DragEvent, param1: atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext): scala.Unit
}

object Anon_DataTypesDragEnterDragLeaveDragOverDropParam0 {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String],
    drop: (stdLib.DragEvent, atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext) => scala.Unit,
    dragEnter: (/* param0 */ stdLib.DragEvent, /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext) => scala.Unit = null,
    dragLeave: (/* param0 */ stdLib.DragEvent, /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext) => scala.Unit = null,
    dragOver: (/* param0 */ stdLib.DragEvent, /* param1 */ atOracleOraclejetLib.ojtableMod.ojTableNs.DropRowContext) => scala.Unit = null
  ): Anon_DataTypesDragEnterDragLeaveDragOverDropParam0 = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drop = js.Any.fromFunction2(drop))
    if (dragEnter != null) __obj.updateDynamic("dragEnter")(js.Any.fromFunction2(dragEnter))
    if (dragLeave != null) __obj.updateDynamic("dragLeave")(js.Any.fromFunction2(dragLeave))
    if (dragOver != null) __obj.updateDynamic("dragOver")(js.Any.fromFunction2(dragOver))
    __obj.asInstanceOf[Anon_DataTypesDragEnterDragLeaveDragOverDropParam0]
  }
}

