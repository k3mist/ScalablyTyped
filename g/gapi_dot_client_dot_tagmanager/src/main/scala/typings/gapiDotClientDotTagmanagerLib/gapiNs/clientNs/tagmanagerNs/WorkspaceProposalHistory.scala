package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProposalHistory extends js.Object {
  /** A user or reviewer comment. */
  var comment: js.UndefOr[WorkspaceProposalHistoryComment] = js.undefined
  /** The party responsible for the change in history. */
  var createdBy: js.UndefOr[WorkspaceProposalUser] = js.undefined
  /** When this history event was added to the workspace proposal. */
  var createdTimestamp: js.UndefOr[Timestamp] = js.undefined
  /** A change in the proposal's status. */
  var statusChange: js.UndefOr[WorkspaceProposalHistoryStatusChange] = js.undefined
  /** The history type distinguishing between comments and status changes. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object WorkspaceProposalHistory {
  @scala.inline
  def apply(
    comment: WorkspaceProposalHistoryComment = null,
    createdBy: WorkspaceProposalUser = null,
    createdTimestamp: Timestamp = null,
    statusChange: WorkspaceProposalHistoryStatusChange = null,
    `type`: java.lang.String = null
  ): WorkspaceProposalHistory = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdTimestamp != null) __obj.updateDynamic("createdTimestamp")(createdTimestamp)
    if (statusChange != null) __obj.updateDynamic("statusChange")(statusChange)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkspaceProposalHistory]
  }
}

