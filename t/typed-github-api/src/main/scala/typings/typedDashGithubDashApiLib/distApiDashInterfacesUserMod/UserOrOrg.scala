package typings
package typedDashGithubDashApiLib.distApiDashInterfacesUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOrOrg extends UserOrOrgSummary {
  var blog: java.lang.String
  var company: java.lang.String
  var created_at: stdLib.Date
  var email: java.lang.String
  var followers: scala.Double
  var following: scala.Double
  var location: java.lang.String
  var name: java.lang.String
  var public_gists: scala.Double
  var public_repos: scala.Double
  var updated_at: stdLib.Date
}

object UserOrOrg {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    blog: java.lang.String,
    company: java.lang.String,
    created_at: stdLib.Date,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    following: scala.Double,
    id: scala.Double,
    location: java.lang.String,
    login: java.lang.String,
    name: java.lang.String,
    public_gists: scala.Double,
    public_repos: scala.Double,
    repos_url: java.lang.String,
    `type`: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.User | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.Organization,
    updated_at: stdLib.Date,
    url: java.lang.String
  ): UserOrOrg = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, blog = blog, company = company, created_at = created_at, email = email, events_url = events_url, followers = followers, following = following, id = id, location = location, login = login, name = name, public_gists = public_gists, public_repos = public_repos, repos_url = repos_url, `type` = `type`.asInstanceOf[js.Any], updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[UserOrOrg]
  }
}

