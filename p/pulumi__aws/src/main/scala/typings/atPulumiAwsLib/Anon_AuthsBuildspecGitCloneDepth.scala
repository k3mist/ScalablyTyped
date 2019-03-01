package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthsBuildspecGitCloneDepth extends js.Object {
  var auths: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceType]]]
  ] = js.undefined
  var buildspec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var gitCloneDepth: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var insecureSsl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var location: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var reportBuildStatus: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var sourceIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_AuthsBuildspecGitCloneDepth {
  @scala.inline
  def apply(
    sourceIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    auths: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceType]]] = null,
    buildspec: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    gitCloneDepth: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    insecureSsl: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    location: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    reportBuildStatus: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_AuthsBuildspecGitCloneDepth = {
    val __obj = js.Dynamic.literal(sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
    if (auths != null) __obj.updateDynamic("auths")(auths.asInstanceOf[js.Any])
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec.asInstanceOf[js.Any])
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (insecureSsl != null) __obj.updateDynamic("insecureSsl")(insecureSsl.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (reportBuildStatus != null) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthsBuildspecGitCloneDepth]
  }
}

