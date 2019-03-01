package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsWithinRangeOptions extends AllDocsOptions {
  /** High end of range, or low end if `descending` is `true`. */
  var endkey: DocumentKey
  /**
    * Include any documents identified by `endkey`.
    *
    * Defaults to `true`.
    */
  var inclusive_end: js.UndefOr[scala.Boolean] = js.undefined
  /** Low end of range, or high end if `descending` is `true`. */
  var startkey: DocumentKey
}

object AllDocsWithinRangeOptions {
  @scala.inline
  def apply(
    endkey: DocumentKey,
    startkey: DocumentKey,
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    descending: js.UndefOr[scala.Boolean] = js.undefined,
    fetch: pouchdbDashCoreLib.Fetch = null,
    include_docs: js.UndefOr[scala.Boolean] = js.undefined,
    inclusive_end: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null
  ): AllDocsWithinRangeOptions = {
    val __obj = js.Dynamic.literal(endkey = endkey, startkey = startkey)
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(include_docs)) __obj.updateDynamic("include_docs")(include_docs)
    if (!js.isUndefined(inclusive_end)) __obj.updateDynamic("inclusive_end")(inclusive_end)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsWithinRangeOptions]
  }
}

