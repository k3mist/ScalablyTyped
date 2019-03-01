package typings
package newDashGithubDashIssueDashUrlLib.newDashGithubDashIssueDashUrlMod.newGithubIssueUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepoOptions extends BaseOptions {
  /**
    * GitHub repo.
    */
  var repo: java.lang.String
  /**
    * GitHub username or organization.
    */
  var user: java.lang.String
}

object UserRepoOptions {
  @scala.inline
  def apply(
    repo: java.lang.String,
    user: java.lang.String,
    assignee: java.lang.String = null,
    body: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    milestone: java.lang.String = null,
    projects: js.Array[java.lang.String] = null,
    template: java.lang.String = null,
    title: java.lang.String = null
  ): UserRepoOptions = {
    val __obj = js.Dynamic.literal(repo = repo, user = user)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee)
    if (body != null) __obj.updateDynamic("body")(body)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (milestone != null) __obj.updateDynamic("milestone")(milestone)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (template != null) __obj.updateDynamic("template")(template)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UserRepoOptions]
  }
}

