package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrDimDef extends js.Object {
  var qDef: java.lang.String
  var qLibraryId: java.lang.String
  var qSortBy: SortCriteria
}

object NxAttrDimDef {
  @scala.inline
  def apply(qDef: java.lang.String, qLibraryId: java.lang.String, qSortBy: SortCriteria): NxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef, qLibraryId = qLibraryId, qSortBy = qSortBy)
  
    __obj.asInstanceOf[NxAttrDimDef]
  }
}

