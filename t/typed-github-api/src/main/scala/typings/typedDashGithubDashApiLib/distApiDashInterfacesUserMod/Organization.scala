package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserOrOrg because var conflicts: avatar_url, events_url, id, login, repos_url, `type`, url. Inlined name, company, blog, location, email, public_repos, public_gists, followers, following, created_at, updated_at */ trait Organization extends OrganizationSummary {
  var blog: java.lang.String
  var company: java.lang.String
  var created_at: stdLib.Date
  var email: java.lang.String
  var followers: scala.Double
  var following: scala.Double
  var has_organization_projects: scala.Boolean
  var has_repository_projects: scala.Boolean
  var html_url: java.lang.String
  var location: java.lang.String
  var name: java.lang.String
  var public_gists: scala.Double
  var public_repos: scala.Double
  var updated_at: stdLib.Date
}

object Organization {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    blog: java.lang.String,
    company: java.lang.String,
    created_at: stdLib.Date,
    description: java.lang.String,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    following: scala.Double,
    has_organization_projects: scala.Boolean,
    has_repository_projects: scala.Boolean,
    hooks_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    issues_url: java.lang.String,
    location: java.lang.String,
    login: java.lang.String,
    members_url: java.lang.String,
    name: java.lang.String,
    public_gists: scala.Double,
    public_members_url: java.lang.String,
    public_repos: scala.Double,
    repos_url: java.lang.String,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization,
    updated_at: stdLib.Date,
    url: java.lang.String
  ): Organization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, blog = blog, company = company, created_at = created_at, description = description, email = email, events_url = events_url, followers = followers, following = following, has_organization_projects = has_organization_projects, has_repository_projects = has_repository_projects, hooks_url = hooks_url, html_url = html_url, id = id, issues_url = issues_url, location = location, login = login, members_url = members_url, name = name, public_gists = public_gists, public_members_url = public_members_url, public_repos = public_repos, repos_url = repos_url, `type` = `type`, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[Organization]
  }
}

