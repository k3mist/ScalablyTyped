package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /** A target specified by a set of document names. */
  var documents: js.UndefOr[DocumentsTarget] = js.undefined
  /** If the target should be removed once it is current and consistent. */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /** A target specified by a query. */
  var query: js.UndefOr[QueryTarget] = js.undefined
  /**
    * Start listening after a specific `read_time`.
    *
    * The client must know the state of matching documents at this time.
    */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A resume token from a prior TargetChange for an identical target.
    *
    * Using a resume token with a different target is unsupported and may fail.
    */
  var resumeToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A client provided target ID.
    *
    * If not set, the server will assign an ID for the target.
    *
    * Used for resuming a target without changing IDs. The IDs can either be
    * client-assigned or be server-assigned in a previous stream. All targets
    * with client provided IDs must be added before adding a target that needs
    * a server-assigned id.
    */
  var targetId: js.UndefOr[scala.Double] = js.undefined
}

object Target {
  @scala.inline
  def apply(
    documents: DocumentsTarget = null,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    query: QueryTarget = null,
    readTime: java.lang.String = null,
    resumeToken: java.lang.String = null,
    targetId: scala.Int | scala.Double = null
  ): Target = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (query != null) __obj.updateDynamic("query")(query)
    if (readTime != null) __obj.updateDynamic("readTime")(readTime)
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

