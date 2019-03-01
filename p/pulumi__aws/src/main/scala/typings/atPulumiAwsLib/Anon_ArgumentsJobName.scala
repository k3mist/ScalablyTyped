package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentsJobName extends js.Object {
  var arguments: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var jobName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var timeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_ArgumentsJobName {
  @scala.inline
  def apply(
    jobName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    arguments: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    timeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_ArgumentsJobName = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentsJobName]
  }
}

