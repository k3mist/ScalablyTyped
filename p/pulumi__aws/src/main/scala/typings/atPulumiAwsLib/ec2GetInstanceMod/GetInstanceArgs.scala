package typings
package atPulumiAwsLib.ec2GetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-instances in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `password_data` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the exact Instance ID with which to populate the data source.
    */
  val instanceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must
    * exactly match a pair on the desired Instance.
    */
  val instanceTags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetInstanceArgs {
  @scala.inline
  def apply(
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    getPasswordData: js.UndefOr[scala.Boolean] = js.undefined,
    instanceId: java.lang.String = null,
    instanceTags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetInstanceArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(getPasswordData)) __obj.updateDynamic("getPasswordData")(getPasswordData)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (instanceTags != null) __obj.updateDynamic("instanceTags")(instanceTags)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetInstanceArgs]
  }
}

