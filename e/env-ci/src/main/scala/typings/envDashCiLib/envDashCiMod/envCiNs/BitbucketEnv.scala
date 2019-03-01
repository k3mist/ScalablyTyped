package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitbucketEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.`Bitbucket Pipelines`
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.bitbucket
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object BitbucketEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    name: envDashCiLib.envDashCiLibStrings.`Bitbucket Pipelines`,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.bitbucket,
    slug: java.lang.String,
    tag: java.lang.String = null
  ): BitbucketEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, name = name, root = root, service = service, slug = slug)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BitbucketEnv]
  }
}

