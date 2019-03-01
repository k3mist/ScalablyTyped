package typings
package atPulumiAwsLib.transferUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  /**
    * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
    */
  val homeDirectory: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. Since the IAM variable syntax matches Terraform's interpolation syntax, they must be escaped inside Terraform configuration strings (`$${Transfer:UserName}`).  These are evaluated on-the-fly when navigating the bucket.
    */
  val policy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
    */
  val role: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The name used for log in to your SFTP server.
    */
  val userName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object UserArgs {
  @scala.inline
  def apply(
    role: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    serverId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    userName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    homeDirectory: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    policy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): UserArgs = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    if (homeDirectory != null) __obj.updateDynamic("homeDirectory")(homeDirectory.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
}

