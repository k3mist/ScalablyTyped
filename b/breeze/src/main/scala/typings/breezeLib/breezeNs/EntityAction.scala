package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAction
  extends breezeLib.breezeNs.coreNs.IEnum {
  var AcceptChanges: EntityActionSymbol
  var Attach: EntityActionSymbol
  var AttachOnImport: EntityActionSymbol
  var AttachOnQuery: EntityActionSymbol
  var Clear: EntityActionSymbol
  var Detach: EntityActionSymbol
  var EntityStateChange: EntityActionSymbol
  var MergeOnImport: EntityActionSymbol
  var MergeOnQuery: EntityActionSymbol
  var MergeOnSave: EntityActionSymbol
  var PropertyChange: EntityActionSymbol
  var RejectChanges: EntityActionSymbol
}

object EntityAction {
  @scala.inline
  def apply(
    AcceptChanges: EntityActionSymbol,
    Attach: EntityActionSymbol,
    AttachOnImport: EntityActionSymbol,
    AttachOnQuery: EntityActionSymbol,
    Clear: EntityActionSymbol,
    Detach: EntityActionSymbol,
    EntityStateChange: EntityActionSymbol,
    MergeOnImport: EntityActionSymbol,
    MergeOnQuery: EntityActionSymbol,
    MergeOnSave: EntityActionSymbol,
    PropertyChange: EntityActionSymbol,
    RejectChanges: EntityActionSymbol,
    contains: js.Function1[js.Any, scala.Boolean],
    fromName: js.Function1[java.lang.String, breezeLib.breezeNs.coreNs.EnumSymbol],
    getNames: js.Function0[js.Array[java.lang.String]],
    getSymbols: js.Function0[js.Array[breezeLib.breezeNs.coreNs.EnumSymbol]]
  ): EntityAction = {
    val __obj = js.Dynamic.literal(AcceptChanges = AcceptChanges, Attach = Attach, AttachOnImport = AttachOnImport, AttachOnQuery = AttachOnQuery, Clear = Clear, Detach = Detach, EntityStateChange = EntityStateChange, MergeOnImport = MergeOnImport, MergeOnQuery = MergeOnQuery, MergeOnSave = MergeOnSave, PropertyChange = PropertyChange, RejectChanges = RejectChanges, contains = contains, fromName = fromName, getNames = getNames, getSymbols = getSymbols)
  
    __obj.asInstanceOf[EntityAction]
  }
}

