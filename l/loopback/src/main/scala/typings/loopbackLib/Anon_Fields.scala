package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.UndefOr[java.lang.String | js.Any | js.Array[_]] = js.undefined
  var include: js.UndefOr[java.lang.String | js.Any | js.Array[_]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[java.lang.String] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var where: js.UndefOr[js.Any] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(
    fields: java.lang.String | js.Any | js.Array[_] = null,
    include: java.lang.String | js.Any | js.Array[_] = null,
    limit: scala.Int | scala.Double = null,
    order: java.lang.String = null,
    skip: scala.Int | scala.Double = null,
    where: js.Any = null
  ): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[Anon_Fields]
  }
}

