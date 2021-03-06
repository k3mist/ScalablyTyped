package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsReactiveSkip extends js.Object {
  var fields: js.UndefOr[meteorLib.mongoMod.MongoNs.FieldSpecifier] = js.undefined
  var reactive: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[meteorLib.mongoMod.MongoNs.SortSpecifier] = js.undefined
  var transform: js.UndefOr[js.Function | scala.Null] = js.undefined
}

object Anon_FieldsReactiveSkip {
  @scala.inline
  def apply(
    fields: meteorLib.mongoMod.MongoNs.FieldSpecifier = null,
    reactive: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null,
    sort: meteorLib.mongoMod.MongoNs.SortSpecifier = null,
    transform: js.Function = null
  ): Anon_FieldsReactiveSkip = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(reactive)) __obj.updateDynamic("reactive")(reactive)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_FieldsReactiveSkip]
  }
}

