package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsLimit extends js.Object {
  var fields: js.UndefOr[meteorDashTypingsLib.meteorMongoMod.MongoNs.FieldSpecifier] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var reactive: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[meteorDashTypingsLib.meteorMongoMod.MongoNs.SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function] = js.undefined
}

object Anon_FieldsLimit {
  @scala.inline
  def apply(
    fields: meteorDashTypingsLib.meteorMongoMod.MongoNs.FieldSpecifier = null,
    limit: scala.Int | scala.Double = null,
    reactive: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null,
    sort: meteorDashTypingsLib.meteorMongoMod.MongoNs.SortSpecifier = null,
    transform: js.Function = null
  ): Anon_FieldsLimit = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_FieldsLimit]
  }
}

