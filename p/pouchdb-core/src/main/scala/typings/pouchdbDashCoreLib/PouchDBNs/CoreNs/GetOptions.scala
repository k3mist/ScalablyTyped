package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends Options {
  /** Include attachment data. */
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  /** Return attachment data as Blobs/Buffers, instead of as base64-encoded strings. */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /** Include list of conflicting leaf revisions. */
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  /** Forces retrieving latest “leaf” revision, no matter what rev was requested. */
  var latest: js.UndefOr[scala.Boolean] = js.undefined
  /** Specific revision to fetch */
  var rev: js.UndefOr[RevisionId] = js.undefined
  /** Include revision history of the document. */
  var revs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include a list of revisions of the document, and their
    * availability.
    */
  var revs_info: js.UndefOr[scala.Boolean] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(
    attachments: js.UndefOr[scala.Boolean] = js.undefined,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    conflicts: js.UndefOr[scala.Boolean] = js.undefined,
    fetch: pouchdbDashCoreLib.Fetch = null,
    latest: js.UndefOr[scala.Boolean] = js.undefined,
    rev: RevisionId = null,
    revs: js.UndefOr[scala.Boolean] = js.undefined,
    revs_info: js.UndefOr[scala.Boolean] = js.undefined
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachments)) __obj.updateDynamic("attachments")(attachments)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(conflicts)) __obj.updateDynamic("conflicts")(conflicts)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest)
    if (rev != null) __obj.updateDynamic("rev")(rev)
    if (!js.isUndefined(revs)) __obj.updateDynamic("revs")(revs)
    if (!js.isUndefined(revs_info)) __obj.updateDynamic("revs_info")(revs_info)
    __obj.asInstanceOf[GetOptions]
  }
}

