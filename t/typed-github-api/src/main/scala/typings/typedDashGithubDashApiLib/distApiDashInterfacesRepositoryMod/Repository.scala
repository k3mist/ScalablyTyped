package typings
package typedDashGithubDashApiLib.distApiDashInterfacesRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repository extends js.Object {
  var allow_merge_commit: scala.Boolean
  var allow_rebase_merge: scala.Boolean
  var allow_squash_merge: scala.Boolean
  var archive_url: java.lang.String
  var assignees_url: java.lang.String
  var blobs_url: java.lang.String
  var branches_url: java.lang.String
  var clone_url: java.lang.String
  var collaborators_url: java.lang.String
  var comments_url: java.lang.String
  var commits_url: java.lang.String
  var compare_url: java.lang.String
  var contents_url: java.lang.String
  var contributors_url: java.lang.String
  var created_at: stdLib.Date
  var default_branch: java.lang.String
  var deployments_url: java.lang.String
  var description: java.lang.String
  var downloads_url: java.lang.String
  var events_url: java.lang.String
  var fork: scala.Boolean
  var forks_count: scala.Double
  var forks_url: java.lang.String
  var full_name: java.lang.String
  var git_commits_url: java.lang.String
  var git_refs_url: java.lang.String
  var git_tags_url: java.lang.String
  var git_url: java.lang.String
  var has_downloads: scala.Boolean
  var has_issues: scala.Boolean
  var has_pages: scala.Boolean
  var has_wiki: scala.Boolean
  var homepage: java.lang.String
  var hooks_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var issue_comment_url: java.lang.String
  var issue_events_url: java.lang.String
  var issues_url: java.lang.String
  var keys_url: java.lang.String
  var labels_url: java.lang.String
  var language: java.lang.String | scala.Null
  var languages_url: java.lang.String
  var merges_url: java.lang.String
  var milestones_url: java.lang.String
  var mirror_url: java.lang.String
  var name: java.lang.String
  var network_count: scala.Double
  var notifications_url: java.lang.String
  var open_issues_count: scala.Double
  var owner: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  var permissions: typedDashGithubDashApiLib.Anon_Admin
  var `private`: scala.Boolean
  var pulls_url: java.lang.String
  var pushed_at: stdLib.Date
  var releases_url: java.lang.String
  var size: scala.Double
  var ssh_url: java.lang.String
  var stargazers_count: scala.Double
  var stargazers_url: java.lang.String
  var statuses_url: java.lang.String
  var subscribers_count: scala.Double
  var subscribers_url: java.lang.String
  var subscription_url: java.lang.String
  var svn_url: java.lang.String
  var tags_url: java.lang.String
  var teams_url: java.lang.String
  var topics: js.Array[java.lang.String]
  var trees_url: java.lang.String
  var updated_at: stdLib.Date
  var url: java.lang.String
  var watchers_count: scala.Double
}

object Repository {
  @scala.inline
  def apply(
    allow_merge_commit: scala.Boolean,
    allow_rebase_merge: scala.Boolean,
    allow_squash_merge: scala.Boolean,
    archive_url: java.lang.String,
    assignees_url: java.lang.String,
    blobs_url: java.lang.String,
    branches_url: java.lang.String,
    clone_url: java.lang.String,
    collaborators_url: java.lang.String,
    comments_url: java.lang.String,
    commits_url: java.lang.String,
    compare_url: java.lang.String,
    contents_url: java.lang.String,
    contributors_url: java.lang.String,
    created_at: stdLib.Date,
    default_branch: java.lang.String,
    deployments_url: java.lang.String,
    description: java.lang.String,
    downloads_url: java.lang.String,
    events_url: java.lang.String,
    fork: scala.Boolean,
    forks_count: scala.Double,
    forks_url: java.lang.String,
    full_name: java.lang.String,
    git_commits_url: java.lang.String,
    git_refs_url: java.lang.String,
    git_tags_url: java.lang.String,
    git_url: java.lang.String,
    has_downloads: scala.Boolean,
    has_issues: scala.Boolean,
    has_pages: scala.Boolean,
    has_wiki: scala.Boolean,
    homepage: java.lang.String,
    hooks_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    issue_comment_url: java.lang.String,
    issue_events_url: java.lang.String,
    issues_url: java.lang.String,
    keys_url: java.lang.String,
    labels_url: java.lang.String,
    languages_url: java.lang.String,
    merges_url: java.lang.String,
    milestones_url: java.lang.String,
    mirror_url: java.lang.String,
    name: java.lang.String,
    network_count: scala.Double,
    notifications_url: java.lang.String,
    open_issues_count: scala.Double,
    owner: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    permissions: typedDashGithubDashApiLib.Anon_Admin,
    `private`: scala.Boolean,
    pulls_url: java.lang.String,
    pushed_at: stdLib.Date,
    releases_url: java.lang.String,
    size: scala.Double,
    ssh_url: java.lang.String,
    stargazers_count: scala.Double,
    stargazers_url: java.lang.String,
    statuses_url: java.lang.String,
    subscribers_count: scala.Double,
    subscribers_url: java.lang.String,
    subscription_url: java.lang.String,
    svn_url: java.lang.String,
    tags_url: java.lang.String,
    teams_url: java.lang.String,
    topics: js.Array[java.lang.String],
    trees_url: java.lang.String,
    updated_at: stdLib.Date,
    url: java.lang.String,
    watchers_count: scala.Double,
    language: java.lang.String = null
  ): Repository = {
    val __obj = js.Dynamic.literal(allow_merge_commit = allow_merge_commit, allow_rebase_merge = allow_rebase_merge, allow_squash_merge = allow_squash_merge, archive_url = archive_url, assignees_url = assignees_url, blobs_url = blobs_url, branches_url = branches_url, clone_url = clone_url, collaborators_url = collaborators_url, comments_url = comments_url, commits_url = commits_url, compare_url = compare_url, contents_url = contents_url, contributors_url = contributors_url, created_at = created_at, default_branch = default_branch, deployments_url = deployments_url, description = description, downloads_url = downloads_url, events_url = events_url, fork = fork, forks_count = forks_count, forks_url = forks_url, full_name = full_name, git_commits_url = git_commits_url, git_refs_url = git_refs_url, git_tags_url = git_tags_url, git_url = git_url, has_downloads = has_downloads, has_issues = has_issues, has_pages = has_pages, has_wiki = has_wiki, homepage = homepage, hooks_url = hooks_url, html_url = html_url, id = id, issue_comment_url = issue_comment_url, issue_events_url = issue_events_url, issues_url = issues_url, keys_url = keys_url, labels_url = labels_url, languages_url = languages_url, merges_url = merges_url, milestones_url = milestones_url, mirror_url = mirror_url, name = name, network_count = network_count, notifications_url = notifications_url, open_issues_count = open_issues_count, owner = owner, permissions = permissions, `private` = `private`, pulls_url = pulls_url, pushed_at = pushed_at, releases_url = releases_url, size = size, ssh_url = ssh_url, stargazers_count = stargazers_count, stargazers_url = stargazers_url, statuses_url = statuses_url, subscribers_count = subscribers_count, subscribers_url = subscribers_url, subscription_url = subscription_url, svn_url = svn_url, tags_url = tags_url, teams_url = teams_url, topics = topics, trees_url = trees_url, updated_at = updated_at, url = url, watchers_count = watchers_count)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[Repository]
  }
}

