package typings
package atPulumiAwsLib.cfgRecorderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderArgs extends js.Object {
  /**
    * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Recording group - see below.
    */
  val recordingGroup: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllSupportedIncludeGlobalResourceTypes]
  ] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the IAM role.
    * used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account.
    * See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RecorderArgs {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    recordingGroup: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AllSupportedIncludeGlobalResourceTypes] = null
  ): RecorderArgs = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recordingGroup != null) __obj.updateDynamic("recordingGroup")(recordingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderArgs]
  }
}

