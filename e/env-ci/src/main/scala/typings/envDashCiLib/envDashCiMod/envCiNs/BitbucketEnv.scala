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

