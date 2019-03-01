package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[T /* <: js.Object */] extends js.Object {
  var code: scala.Double
  var deduplicate: scala.Boolean
  var fields: js.Array[java.lang.String]
  var id: java.lang.String
  var isNewlyCreated: scala.Boolean
  var selectivityEstimate: scala.Double
  var sparse: scala.Boolean
  var `type`: IndexType
  var unique: scala.Boolean
}

object Index {
  @scala.inline
  def apply[T /* <: js.Object */](
    code: scala.Double,
    deduplicate: scala.Boolean,
    fields: js.Array[java.lang.String],
    id: java.lang.String,
    isNewlyCreated: scala.Boolean,
    selectivityEstimate: scala.Double,
    sparse: scala.Boolean,
    `type`: IndexType,
    unique: scala.Boolean
  ): Index[T] = {
    val __obj = js.Dynamic.literal(code = code, deduplicate = deduplicate, fields = fields, id = id, isNewlyCreated = isNewlyCreated, selectivityEstimate = selectivityEstimate, sparse = sparse, `type` = `type`, unique = unique)
  
    __obj.asInstanceOf[Index[T]]
  }
}

