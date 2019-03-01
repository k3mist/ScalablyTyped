package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentName extends js.Object {
  var comment: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_CommentName {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    comment: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_CommentName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentName]
  }
}

