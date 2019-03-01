package typings
package atPulumiAwsLib.directconnectConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionArgs extends js.Object {
  /**
    * The bandwidth of the connection. Available values: 1Gbps, 10Gbps. Case sensitive.
    */
  val bandwidth: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The AWS Direct Connect location where the connection is located. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object ConnectionArgs {
  @scala.inline
  def apply(
    bandwidth: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    location: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ConnectionArgs = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionArgs]
  }
}

