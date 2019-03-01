package typings
package atPulumiAwsLib.cfgRecorderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderState extends js.Object {
  /**
    * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Recording group - see below.
    */
  val recordingGroup: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllSupportedIncludeGlobalResourceTypes]
  ] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the IAM role.
    * used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account.
    * See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object RecorderState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    recordingGroup: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllSupportedIncludeGlobalResourceTypes] = null,
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): RecorderState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recordingGroup != null) __obj.updateDynamic("recordingGroup")(recordingGroup.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderState]
  }
}

