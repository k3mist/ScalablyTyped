package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentExecutionsLaunchPath extends js.Object {
  var concurrentExecutions: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var launchPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var parameters: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ConcurrentExecutionsLaunchPath {
  @scala.inline
  def apply(
    concurrentExecutions: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    launchPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    parameters: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ConcurrentExecutionsLaunchPath = {
    val __obj = js.Dynamic.literal(concurrentExecutions = concurrentExecutions.asInstanceOf[js.Any], launchPath = launchPath.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConcurrentExecutionsLaunchPath]
  }
}

