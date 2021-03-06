package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitSummary {
  var parents: js.Array[CommitRef]
}

object GitCommit {
  @scala.inline
  def apply(
    author: GitActor,
    committer: GitActor,
    loadAsync: () => js.Promise[Commit | scala.Null],
    loadGitAsync: () => js.Promise[GitCommit | scala.Null],
    message: java.lang.String,
    parents: js.Array[CommitRef],
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef,
    sha: java.lang.String
  ): GitCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), message = message, parents = parents, repository = repository, sha = sha)
  
    __obj.asInstanceOf[GitCommit]
  }
}

