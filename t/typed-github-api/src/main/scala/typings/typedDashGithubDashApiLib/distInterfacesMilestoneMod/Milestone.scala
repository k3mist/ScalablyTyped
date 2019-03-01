package typings
package typedDashGithubDashApiLib.distInterfacesMilestoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milestone extends js.Object {
  var closed: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var closedIssueCount: scala.Double
  var created: momentLib.momentMod.momentNs.Moment
  var creator: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary
  var description: java.lang.String
  var due: momentLib.momentMod.momentNs.Moment
  var htmlUri: java.lang.String
  var id: scala.Double
  var number: scala.Double
  var openIssueCount: scala.Double
  var state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed
  var title: java.lang.String
  var updated: momentLib.momentMod.momentNs.Moment
}

object Milestone {
  @scala.inline
  def apply(
    closedIssueCount: scala.Double,
    created: momentLib.momentMod.momentNs.Moment,
    creator: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary,
    description: java.lang.String,
    due: momentLib.momentMod.momentNs.Moment,
    htmlUri: java.lang.String,
    id: scala.Double,
    number: scala.Double,
    openIssueCount: scala.Double,
    state: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.open | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.closed,
    title: java.lang.String,
    updated: momentLib.momentMod.momentNs.Moment,
    closed: momentLib.momentMod.momentNs.Moment = null
  ): Milestone = {
    val __obj = js.Dynamic.literal(closedIssueCount = closedIssueCount, created = created, creator = creator, description = description, due = due, htmlUri = htmlUri, id = id, number = number, openIssueCount = openIssueCount, state = state.asInstanceOf[js.Any], title = title, updated = updated)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    __obj.asInstanceOf[Milestone]
  }
}

