package typings
package envDashCiLib.envDashCiMod.envCiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppveyorEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: java.lang.String
  var build: java.lang.String
  var buildUrl: java.lang.String
  var commit: java.lang.String
  var isPr: scala.Boolean
  var job: java.lang.String
  var jobUrl: java.lang.String
  var name: envDashCiLib.envDashCiLibStrings.Appveyor
  var pr: js.UndefOr[java.lang.String] = js.undefined
  var prBranch: js.UndefOr[java.lang.String] = js.undefined
  var root: java.lang.String
  var service: envDashCiLib.envDashCiLibStrings.appveyor
  var slug: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object AppveyorEnv {
  @scala.inline
  def apply(
    branch: java.lang.String,
    build: java.lang.String,
    buildUrl: java.lang.String,
    commit: java.lang.String,
    isCi: envDashCiLib.envDashCiLibNumbers.`true`,
    isPr: scala.Boolean,
    job: java.lang.String,
    jobUrl: java.lang.String,
    name: envDashCiLib.envDashCiLibStrings.Appveyor,
    root: java.lang.String,
    service: envDashCiLib.envDashCiLibStrings.appveyor,
    slug: java.lang.String,
    pr: java.lang.String = null,
    prBranch: java.lang.String = null,
    tag: java.lang.String = null
  ): AppveyorEnv = {
    val __obj = js.Dynamic.literal(branch = branch, build = build, buildUrl = buildUrl, commit = commit, isCi = isCi, isPr = isPr, job = job, jobUrl = jobUrl, name = name, root = root, service = service, slug = slug)
    if (pr != null) __obj.updateDynamic("pr")(pr)
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[AppveyorEnv]
  }
}

