package typings
package atPulumiKubernetesLib.typesInputMod.pkgNs.versionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info contains versioning information. how we'll want to distribute that information.
  */
trait Info extends js.Object {
  var buildDate: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var compiler: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var gitCommit: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var gitTreeState: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var gitVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var goVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var major: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var minor: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var platform: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Info {
  @scala.inline
  def apply(
    buildDate: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    compiler: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    gitCommit: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    gitTreeState: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    gitVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    goVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    major: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    minor: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    platform: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Info = {
    val __obj = js.Dynamic.literal(buildDate = buildDate.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], gitCommit = gitCommit.asInstanceOf[js.Any], gitTreeState = gitTreeState.asInstanceOf[js.Any], gitVersion = gitVersion.asInstanceOf[js.Any], goVersion = goVersion.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Info]
  }
}

